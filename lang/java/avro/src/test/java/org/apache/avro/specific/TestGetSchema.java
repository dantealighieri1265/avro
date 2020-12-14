package org.apache.avro.specific;

import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.ParameterizedType;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

import org.apache.avro.AvroRuntimeException;
import org.apache.avro.AvroTypeException;
import org.apache.avro.Schema;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class TestGetSchema {

  private java.lang.reflect.Type classType;
  private Object result;
  Collection<String> array = new LinkedList<String>();
  Map<String, String> map = new HashMap<>();
  Map<Integer, Integer> mapInt = new HashMap<>();

  @Parameterized.Parameters
  public static Collection<Object[]> GetSchemaParameters() throws Exception {
	  Field mapField = TestGetSchema.class.getDeclaredField("map");
	  java.lang.reflect.Type mapType = (ParameterizedType) mapField.getGenericType();
	  Field mapIntField = TestGetSchema.class.getDeclaredField("mapInt");
	  java.lang.reflect.Type mapIntType = (ParameterizedType) mapIntField.getGenericType();
	  Field arrayField = TestGetSchema.class.getDeclaredField("array");
	  java.lang.reflect.Type arrayType  = (ParameterizedType) arrayField.getGenericType();
    return Arrays.asList(new Object[][] { 
      
      // Suite minimale
      {null, AvroTypeException.class},
      {Integer.class, Schema.Type.INT},
      {Boolean.class, Schema.Type.BOOLEAN}, 
      {Void.class, Schema.Type.NULL}, 
      {Long.class, Schema.Type.LONG}, 
      {Float.class, Schema.Type.FLOAT}, 
      {Double.class, Schema.Type.DOUBLE}, 
      {ByteBuffer.class, Schema.Type.BYTES}, 
      {String.class, Schema.Type.STRING}, 
      {mapType, Schema.Type.MAP}, 
      {arrayType, Schema.Type.ARRAY},
      {Exception.class, AvroRuntimeException.class},

      // Coverage
      {Integer.TYPE, Schema.Type.INT},
      {Long.TYPE, Schema.Type.LONG},
      {Float.TYPE, Schema.Type.FLOAT},
      {Double.TYPE, Schema.Type.DOUBLE},
      {Boolean.TYPE, Schema.Type.BOOLEAN},
      {Void.TYPE, Schema.Type.NULL},
      {mapIntType, AvroTypeException.class},
      
    	});
  }

  public TestGetSchema(java.lang.reflect.Type classType, Object result) {
    this.classType = classType;
    this.result = result;
  }


  @Test
  public void testGetSchema() throws IOException, NoSuchFieldException, SecurityException { 
    
    try {
    	Assert.assertEquals(result, SpecificData.get().getSchema(classType).getType());
    } catch (Exception e) {
    	Assert.assertEquals(result, e.getClass());
    }

  }

}
