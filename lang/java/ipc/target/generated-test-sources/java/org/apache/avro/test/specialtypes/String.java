/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */
package org.apache.avro.test.specialtypes;

import org.apache.avro.generic.GenericArray;
import org.apache.avro.specific.SpecificData;
import org.apache.avro.util.Utf8;
import org.apache.avro.message.BinaryMessageEncoder;
import org.apache.avro.message.BinaryMessageDecoder;
import org.apache.avro.message.SchemaStore;
import java.util.Optional;
@org.apache.avro.specific.AvroGenerated
public class String extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = -845724404748119767L;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"String\",\"namespace\":\"org.apache.avro.test.specialtypes\",\"fields\":[{\"name\":\"value\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }

  private static SpecificData MODEL$ = new SpecificData();

  private static final BinaryMessageEncoder<String> ENCODER =
      new BinaryMessageEncoder<String>(MODEL$, SCHEMA$);

  private static final BinaryMessageDecoder<String> DECODER =
      new BinaryMessageDecoder<String>(MODEL$, SCHEMA$);

  /**
   * Return the BinaryMessageEncoder instance used by this class.
   * @return the message encoder used by this class
   */
  public static BinaryMessageEncoder<String> getEncoder() {
    return ENCODER;
  }

  /**
   * Return the BinaryMessageDecoder instance used by this class.
   * @return the message decoder used by this class
   */
  public static BinaryMessageDecoder<String> getDecoder() {
    return DECODER;
  }

  /**
   * Create a new BinaryMessageDecoder instance for this class that uses the specified {@link SchemaStore}.
   * @param resolver a {@link SchemaStore} used to find schemas by fingerprint
   * @return a BinaryMessageDecoder instance for this class backed by the given SchemaStore
   */
  public static BinaryMessageDecoder<String> createDecoder(SchemaStore resolver) {
    return new BinaryMessageDecoder<String>(MODEL$, SCHEMA$, resolver);
  }

  /**
   * Serializes this String to a ByteBuffer.
   * @return a buffer holding the serialized data for this instance
   * @throws java.io.IOException if this instance could not be serialized
   */
  public java.nio.ByteBuffer toByteBuffer() throws java.io.IOException {
    return ENCODER.encode(this);
  }

  /**
   * Deserializes a String from a ByteBuffer.
   * @param b a byte buffer holding serialized data for an instance of this class
   * @return a String instance decoded from the given buffer
   * @throws java.io.IOException if the given bytes could not be deserialized into an instance of this class
   */
  public static String fromByteBuffer(
      java.nio.ByteBuffer b) throws java.io.IOException {
    return DECODER.decode(b);
  }

   private java.lang.String value;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public String() {}

  /**
   * All-args constructor.
   * @param value The new value for value
   */
  public String(java.lang.String value) {
    this.value = value;
  }

  public org.apache.avro.specific.SpecificData getSpecificData() { return MODEL$; }
  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return value;
    default: throw new IndexOutOfBoundsException("Invalid index: " + field$);
    }
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: value = value$ != null ? value$.toString() : null; break;
    default: throw new IndexOutOfBoundsException("Invalid index: " + field$);
    }
  }

  /**
   * Gets the value of the 'value' field.
   * @return The value of the 'value' field.
   */
  public java.lang.String getValue() {
    return value;
  }

  /**
   * Gets the value of the 'value' field as an Optional&lt;java.lang.String&gt;.
   * @return The value wrapped in an Optional&lt;java.lang.String&gt;.
   */
  public Optional<java.lang.String> getOptionalValue() {
    return Optional.<java.lang.String>ofNullable(value);
  }

  /**
   * Sets the value of the 'value' field.
   * @param value the value to set.
   */
  public void setValue(java.lang.String value) {
    this.value = value;
  }

  /**
   * Creates a new String RecordBuilder.
   * @return A new String RecordBuilder
   */
  public static org.apache.avro.test.specialtypes.String.Builder newBuilder() {
    return new org.apache.avro.test.specialtypes.String.Builder();
  }

  /**
   * Creates a new String RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new String RecordBuilder
   */
  public static org.apache.avro.test.specialtypes.String.Builder newBuilder(org.apache.avro.test.specialtypes.String.Builder other) {
    if (other == null) {
      return new org.apache.avro.test.specialtypes.String.Builder();
    } else {
      return new org.apache.avro.test.specialtypes.String.Builder(other);
    }
  }

  /**
   * Creates a new String RecordBuilder by copying an existing String instance.
   * @param other The existing instance to copy.
   * @return A new String RecordBuilder
   */
  public static org.apache.avro.test.specialtypes.String.Builder newBuilder(org.apache.avro.test.specialtypes.String other) {
    if (other == null) {
      return new org.apache.avro.test.specialtypes.String.Builder();
    } else {
      return new org.apache.avro.test.specialtypes.String.Builder(other);
    }
  }

  /**
   * RecordBuilder for String instances.
   */
  @org.apache.avro.specific.AvroGenerated
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<String>
    implements org.apache.avro.data.RecordBuilder<String> {

    private java.lang.String value;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(org.apache.avro.test.specialtypes.String.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.value)) {
        this.value = data().deepCopy(fields()[0].schema(), other.value);
        fieldSetFlags()[0] = other.fieldSetFlags()[0];
      }
    }

    /**
     * Creates a Builder by copying an existing String instance
     * @param other The existing instance to copy.
     */
    private Builder(org.apache.avro.test.specialtypes.String other) {
      super(SCHEMA$);
      if (isValidValue(fields()[0], other.value)) {
        this.value = data().deepCopy(fields()[0].schema(), other.value);
        fieldSetFlags()[0] = true;
      }
    }

    /**
      * Gets the value of the 'value' field.
      * @return The value.
      */
    public java.lang.String getValue() {
      return value;
    }

    /**
      * Gets the value of the 'value' field as an Optional&lt;java.lang.String&gt;.
      * @return The value wrapped in an Optional&lt;java.lang.String&gt;.
      */
    public Optional<java.lang.String> getOptionalValue() {
      return Optional.<java.lang.String>ofNullable(value);
    }

    /**
      * Sets the value of the 'value' field.
      * @param value The value of 'value'.
      * @return This builder.
      */
    public org.apache.avro.test.specialtypes.String.Builder setValue(java.lang.String value) {
      validate(fields()[0], value);
      this.value = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'value' field has been set.
      * @return True if the 'value' field has been set, false otherwise.
      */
    public boolean hasValue() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'value' field.
      * @return This builder.
      */
    public org.apache.avro.test.specialtypes.String.Builder clearValue() {
      value = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    public String build() {
      try {
        String record = new String();
        record.value = fieldSetFlags()[0] ? this.value : (java.lang.String) defaultValue(fields()[0]);
        return record;
      } catch (org.apache.avro.AvroMissingFieldException e) {
        throw e;
      } catch (java.lang.Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumWriter<String>
    WRITER$ = (org.apache.avro.io.DatumWriter<String>)MODEL$.createDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumReader<String>
    READER$ = (org.apache.avro.io.DatumReader<String>)MODEL$.createDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

  @Override protected boolean hasCustomCoders() { return true; }

  @Override public void customEncode(org.apache.avro.io.Encoder out)
    throws java.io.IOException
  {
    out.writeString(this.value);

  }

  @Override public void customDecode(org.apache.avro.io.ResolvingDecoder in)
    throws java.io.IOException
  {
    org.apache.avro.Schema.Field[] fieldOrder = in.readFieldOrderIfDiff();
    if (fieldOrder == null) {
      this.value = in.readString();

    } else {
      for (int i = 0; i < 1; i++) {
        switch (fieldOrder[i].pos()) {
        case 0:
          this.value = in.readString();
          break;

        default:
          throw new java.io.IOException("Corrupt ResolvingDecoder.");
        }
      }
    }
  }
}










