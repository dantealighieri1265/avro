package org.apache.avro.generic;

import static org.junit.Assert.*;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import org.apache.avro.Schema;
import org.apache.avro.Schema.Field;
import org.apache.avro.Schema.Type;
import org.apache.avro.generic.GenericData.EnumSymbol;
import org.apache.avro.generic.entity.DeepCopyTestEntity;
import org.apache.avro.generic.entity.TestEntity;
import org.apache.avro.reflect.ReflectData;
import org.apache.avro.util.Utf8;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.mockito.Mockito;

@RunWith(Parameterized.class)
public class TestDeepCopy<T> {

	private DeepCopyTestEntity<T> entity;
	private T expectedValue;
	private static GenericData genericData = new GenericData();
	static TestEntity user = new TestEntity(0, 0);
    static Schema schema = ReflectData.get().getSchema(user.getClass());
	static GenericRecord avroRecord = new GenericData.Record(schema);
	public enum TestEnum{
		FIRST, SECOND
	}
	static TestEnum enum_ = TestEnum.FIRST;

	@Parameterized.Parameters
	public static Collection<Object[]> DeepCopyParameters() throws Exception {
		Integer integer = Integer.valueOf(0);
		Float float_ = Float.valueOf(0);
		Long long_ = Long.valueOf(0);
		Double double_ = Double.valueOf(0);
		List<Integer> array = new ArrayList<Integer>();
		array.add(0);
		ByteBuffer buffer = ByteBuffer.allocate(4);
		buffer.put("test".getBytes());
		HashMap<Utf8, Utf8> map = new HashMap<>();
		map.put(new Utf8("TestKey"), new Utf8("TestValue"));
		List<Schema.Field> l = new ArrayList<Schema.Field>();
		l.add(new Schema.Field("int", Schema.create(Type.INT)));

		
		
		return Arrays.asList(new Object[][] {

			// Suite minimale
			{ new DeepCopyTestEntity<>(Schema.Type.INT, integer), integer}, 
			{ new DeepCopyTestEntity<>(Schema.Type.INT, null), null},
			{ new DeepCopyTestEntity<>(Schema.Type.STRING, integer), new Utf8(String.valueOf(integer))}, 
			{ new DeepCopyTestEntity<>(Schema.Type.FLOAT, float_), float_},
			{ new DeepCopyTestEntity<>(Schema.Type.BOOLEAN, true), true},
			{ new DeepCopyTestEntity<>(Schema.Type.LONG, long_), long_},
			{ new DeepCopyTestEntity<>(Schema.Type.DOUBLE, double_), double_},
			{ new DeepCopyTestEntity<>(Schema.Type.NULL, double_), null},
			{ new DeepCopyTestEntity<>(Schema.Type.ARRAY, array), array},
			{ new DeepCopyTestEntity<>(Schema.Type.BYTES, buffer), buffer},
			{ new DeepCopyTestEntity<>(Schema.Type.ENUM, enum_), null},// expected value in constructor
			{ new DeepCopyTestEntity<>(Schema.Type.FIXED, null), null},// value & expected value in constructor
			{ new DeepCopyTestEntity<>(Schema.Type.MAP, map), map},
			{ new DeepCopyTestEntity<>(Schema.Type.RECORD, avroRecord), avroRecord},
			{ new DeepCopyTestEntity<>(Schema.Type.UNION, integer), integer},
		});
	}
	
	@SuppressWarnings("unchecked")
	public TestDeepCopy(DeepCopyTestEntity<T> entity, T expectedValue) {
		Schema schema = null;
		if(entity.getType() == Type.ARRAY) {
			schema = Schema.createArray(Schema.create(Type.INT));
		}else if (entity.getType() == Type.ENUM) {
			List<String> val = new ArrayList<String>();
			val.add("test"); 
			schema = Schema.createEnum("SpecificData", "", "org.apache.avro.specific", val);
			EnumSymbol es = new EnumSymbol(schema, (Object)enum_);// create a EnumSymbol by Java enumeration
			expectedValue = (T) es;
		}else if(entity.getType() == Type.FIXED){
			schema = Schema.createFixed("SpecificData", "", "org.apache.avro.specific", 10);
			GenericFixed fixed = (GenericFixed) genericData.createFixed(null, "testGeneric".getBytes(), schema);
			entity.setValue((T) fixed);
			expectedValue = (T) fixed;
		}else if(entity.getType() == Type.MAP) {
			schema = Schema.createMap(Schema.create(Type.INT));
		}else if(entity.getType() == Type.RECORD) {
			genericData = Mockito.spy(genericData);
			List<Schema.Field> l = new ArrayList<Schema.Field>();
			l.add(new Schema.Field("field1", Schema.create(Type.INT)));
			l.add(new Schema.Field("field2", Schema.create(Type.INT)));
			schema = Schema.createRecord("TestEntity", "", "org.apache.avro.generic.entity", false, l);
		}else if(entity.getType() == Type.UNION){ 
			List<Schema> val = new ArrayList<Schema>();
			val.add(Schema.create(Type.INT)); 
			schema = Schema.createUnion(val);
		}else {
			schema = Schema.create(entity.getType());
		}
		entity.setSchema(schema);
		this.entity = entity;
		this.expectedValue = expectedValue;
	}
	
	@Test
	public void test() {
		assertEquals(expectedValue, genericData.deepCopy(entity.getSchema(), entity.getValue()));
		if(entity.getType() == Type.RECORD) {// mutation killing on setField
			Object newRecord = genericData.newRecord(null, entity.getSchema());
			Object oldState = genericData.getRecordState(avroRecord, entity.getSchema());
			for (Field f : entity.getSchema().getFields()) {
		        int pos = f.pos();
		        String name = f.name();
		        Object newValue = genericData.deepCopy(f.schema(), genericData.getField(avroRecord, name, pos, oldState));
		        Mockito.verify(genericData).setField(newRecord, name, pos, newValue);
			}
		}
	}
}
