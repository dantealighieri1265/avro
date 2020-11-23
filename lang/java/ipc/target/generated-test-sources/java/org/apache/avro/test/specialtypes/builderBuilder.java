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
public class builderBuilder extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = 4677105455021157074L;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"builderBuilder\",\"namespace\":\"org.apache.avro.test.specialtypes\",\"fields\":[{\"name\":\"this\",\"type\":{\"type\":\"record\",\"name\":\"One\",\"fields\":[{\"name\":\"this\",\"type\":{\"type\":\"enum\",\"name\":\"Enum\",\"symbols\":[\"builder\",\"Builder\",\"builderBuider\",\"value\",\"this\"]}}]}},{\"name\":\"that\",\"type\":{\"type\":\"record\",\"name\":\"Two\",\"fields\":[{\"name\":\"this\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"String\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}}]}}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }

  private static SpecificData MODEL$ = new SpecificData();

  private static final BinaryMessageEncoder<builderBuilder> ENCODER =
      new BinaryMessageEncoder<builderBuilder>(MODEL$, SCHEMA$);

  private static final BinaryMessageDecoder<builderBuilder> DECODER =
      new BinaryMessageDecoder<builderBuilder>(MODEL$, SCHEMA$);

  /**
   * Return the BinaryMessageEncoder instance used by this class.
   * @return the message encoder used by this class
   */
  public static BinaryMessageEncoder<builderBuilder> getEncoder() {
    return ENCODER;
  }

  /**
   * Return the BinaryMessageDecoder instance used by this class.
   * @return the message decoder used by this class
   */
  public static BinaryMessageDecoder<builderBuilder> getDecoder() {
    return DECODER;
  }

  /**
   * Create a new BinaryMessageDecoder instance for this class that uses the specified {@link SchemaStore}.
   * @param resolver a {@link SchemaStore} used to find schemas by fingerprint
   * @return a BinaryMessageDecoder instance for this class backed by the given SchemaStore
   */
  public static BinaryMessageDecoder<builderBuilder> createDecoder(SchemaStore resolver) {
    return new BinaryMessageDecoder<builderBuilder>(MODEL$, SCHEMA$, resolver);
  }

  /**
   * Serializes this builderBuilder to a ByteBuffer.
   * @return a buffer holding the serialized data for this instance
   * @throws java.io.IOException if this instance could not be serialized
   */
  public java.nio.ByteBuffer toByteBuffer() throws java.io.IOException {
    return ENCODER.encode(this);
  }

  /**
   * Deserializes a builderBuilder from a ByteBuffer.
   * @param b a byte buffer holding serialized data for an instance of this class
   * @return a builderBuilder instance decoded from the given buffer
   * @throws java.io.IOException if the given bytes could not be deserialized into an instance of this class
   */
  public static builderBuilder fromByteBuffer(
      java.nio.ByteBuffer b) throws java.io.IOException {
    return DECODER.decode(b);
  }

   private org.apache.avro.test.specialtypes.One this$;
   private org.apache.avro.test.specialtypes.Two that;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public builderBuilder() {}

  /**
   * All-args constructor.
   * @param this$ The new value for this
   * @param that The new value for that
   */
  public builderBuilder(org.apache.avro.test.specialtypes.One this$, org.apache.avro.test.specialtypes.Two that) {
    this.this$ = this$;
    this.that = that;
  }

  public org.apache.avro.specific.SpecificData getSpecificData() { return MODEL$; }
  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return this$;
    case 1: return that;
    default: throw new IndexOutOfBoundsException("Invalid index: " + field$);
    }
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: this$ = (org.apache.avro.test.specialtypes.One)value$; break;
    case 1: that = (org.apache.avro.test.specialtypes.Two)value$; break;
    default: throw new IndexOutOfBoundsException("Invalid index: " + field$);
    }
  }

  /**
   * Gets the value of the 'this$' field.
   * @return The value of the 'this$' field.
   */
  public org.apache.avro.test.specialtypes.One getThis$() {
    return this$;
  }

  /**
   * Gets the value of the 'this$' field as an Optional&lt;org.apache.avro.test.specialtypes.One&gt;.
   * @return The value wrapped in an Optional&lt;org.apache.avro.test.specialtypes.One&gt;.
   */
  public Optional<org.apache.avro.test.specialtypes.One> getOptionalThis$() {
    return Optional.<org.apache.avro.test.specialtypes.One>ofNullable(this$);
  }

  /**
   * Sets the value of the 'this$' field.
   * @param value the value to set.
   */
  public void setThis$(org.apache.avro.test.specialtypes.One value) {
    this.this$ = value;
  }

  /**
   * Gets the value of the 'that' field.
   * @return The value of the 'that' field.
   */
  public org.apache.avro.test.specialtypes.Two getThat() {
    return that;
  }

  /**
   * Gets the value of the 'that' field as an Optional&lt;org.apache.avro.test.specialtypes.Two&gt;.
   * @return The value wrapped in an Optional&lt;org.apache.avro.test.specialtypes.Two&gt;.
   */
  public Optional<org.apache.avro.test.specialtypes.Two> getOptionalThat() {
    return Optional.<org.apache.avro.test.specialtypes.Two>ofNullable(that);
  }

  /**
   * Sets the value of the 'that' field.
   * @param value the value to set.
   */
  public void setThat(org.apache.avro.test.specialtypes.Two value) {
    this.that = value;
  }

  /**
   * Creates a new builderBuilder RecordBuilder.
   * @return A new builderBuilder RecordBuilder
   */
  public static org.apache.avro.test.specialtypes.builderBuilder.Builder newBuilder() {
    return new org.apache.avro.test.specialtypes.builderBuilder.Builder();
  }

  /**
   * Creates a new builderBuilder RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new builderBuilder RecordBuilder
   */
  public static org.apache.avro.test.specialtypes.builderBuilder.Builder newBuilder(org.apache.avro.test.specialtypes.builderBuilder.Builder other) {
    if (other == null) {
      return new org.apache.avro.test.specialtypes.builderBuilder.Builder();
    } else {
      return new org.apache.avro.test.specialtypes.builderBuilder.Builder(other);
    }
  }

  /**
   * Creates a new builderBuilder RecordBuilder by copying an existing builderBuilder instance.
   * @param other The existing instance to copy.
   * @return A new builderBuilder RecordBuilder
   */
  public static org.apache.avro.test.specialtypes.builderBuilder.Builder newBuilder(org.apache.avro.test.specialtypes.builderBuilder other) {
    if (other == null) {
      return new org.apache.avro.test.specialtypes.builderBuilder.Builder();
    } else {
      return new org.apache.avro.test.specialtypes.builderBuilder.Builder(other);
    }
  }

  /**
   * RecordBuilder for builderBuilder instances.
   */
  @org.apache.avro.specific.AvroGenerated
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<builderBuilder>
    implements org.apache.avro.data.RecordBuilder<builderBuilder> {

    private org.apache.avro.test.specialtypes.One this$;
    private org.apache.avro.test.specialtypes.One.Builder this$Builder;
    private org.apache.avro.test.specialtypes.Two that;
    private org.apache.avro.test.specialtypes.Two.Builder thatBuilder;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(org.apache.avro.test.specialtypes.builderBuilder.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.this$)) {
        this.this$ = data().deepCopy(fields()[0].schema(), other.this$);
        fieldSetFlags()[0] = other.fieldSetFlags()[0];
      }
      if (other.hasThis$Builder()) {
        this.this$Builder = org.apache.avro.test.specialtypes.One.newBuilder(other.getThis$Builder());
      }
      if (isValidValue(fields()[1], other.that)) {
        this.that = data().deepCopy(fields()[1].schema(), other.that);
        fieldSetFlags()[1] = other.fieldSetFlags()[1];
      }
      if (other.hasThatBuilder()) {
        this.thatBuilder = org.apache.avro.test.specialtypes.Two.newBuilder(other.getThatBuilder());
      }
    }

    /**
     * Creates a Builder by copying an existing builderBuilder instance
     * @param other The existing instance to copy.
     */
    private Builder(org.apache.avro.test.specialtypes.builderBuilder other) {
      super(SCHEMA$);
      if (isValidValue(fields()[0], other.this$)) {
        this.this$ = data().deepCopy(fields()[0].schema(), other.this$);
        fieldSetFlags()[0] = true;
      }
      this.this$Builder = null;
      if (isValidValue(fields()[1], other.that)) {
        this.that = data().deepCopy(fields()[1].schema(), other.that);
        fieldSetFlags()[1] = true;
      }
      this.thatBuilder = null;
    }

    /**
      * Gets the value of the 'this$' field.
      * @return The value.
      */
    public org.apache.avro.test.specialtypes.One getThis$() {
      return this$;
    }

    /**
      * Gets the value of the 'this$' field as an Optional&lt;org.apache.avro.test.specialtypes.One&gt;.
      * @return The value wrapped in an Optional&lt;org.apache.avro.test.specialtypes.One&gt;.
      */
    public Optional<org.apache.avro.test.specialtypes.One> getOptionalThis$() {
      return Optional.<org.apache.avro.test.specialtypes.One>ofNullable(this$);
    }

    /**
      * Sets the value of the 'this$' field.
      * @param value The value of 'this$'.
      * @return This builder.
      */
    public org.apache.avro.test.specialtypes.builderBuilder.Builder setThis$(org.apache.avro.test.specialtypes.One value) {
      validate(fields()[0], value);
      this.this$Builder = null;
      this.this$ = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'this$' field has been set.
      * @return True if the 'this$' field has been set, false otherwise.
      */
    public boolean hasThis$() {
      return fieldSetFlags()[0];
    }

    /**
     * Gets the Builder instance for the 'this$' field and creates one if it doesn't exist yet.
     * @return This builder.
     */
    public org.apache.avro.test.specialtypes.One.Builder getThis$Builder() {
      if (this$Builder == null) {
        if (hasThis$()) {
          setThis$Builder(org.apache.avro.test.specialtypes.One.newBuilder(this$));
        } else {
          setThis$Builder(org.apache.avro.test.specialtypes.One.newBuilder());
        }
      }
      return this$Builder;
    }

    /**
     * Sets the Builder instance for the 'this$' field
     * @param value The builder instance that must be set.
     * @return This builder.
     */
    public org.apache.avro.test.specialtypes.builderBuilder.Builder setThis$Builder(org.apache.avro.test.specialtypes.One.Builder value) {
      clearThis$();
      this$Builder = value;
      return this;
    }

    /**
     * Checks whether the 'this$' field has an active Builder instance
     * @return True if the 'this$' field has an active Builder instance
     */
    public boolean hasThis$Builder() {
      return this$Builder != null;
    }

    /**
      * Clears the value of the 'this$' field.
      * @return This builder.
      */
    public org.apache.avro.test.specialtypes.builderBuilder.Builder clearThis$() {
      this$ = null;
      this$Builder = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
      * Gets the value of the 'that' field.
      * @return The value.
      */
    public org.apache.avro.test.specialtypes.Two getThat() {
      return that;
    }

    /**
      * Gets the value of the 'that' field as an Optional&lt;org.apache.avro.test.specialtypes.Two&gt;.
      * @return The value wrapped in an Optional&lt;org.apache.avro.test.specialtypes.Two&gt;.
      */
    public Optional<org.apache.avro.test.specialtypes.Two> getOptionalThat() {
      return Optional.<org.apache.avro.test.specialtypes.Two>ofNullable(that);
    }

    /**
      * Sets the value of the 'that' field.
      * @param value The value of 'that'.
      * @return This builder.
      */
    public org.apache.avro.test.specialtypes.builderBuilder.Builder setThat(org.apache.avro.test.specialtypes.Two value) {
      validate(fields()[1], value);
      this.thatBuilder = null;
      this.that = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'that' field has been set.
      * @return True if the 'that' field has been set, false otherwise.
      */
    public boolean hasThat() {
      return fieldSetFlags()[1];
    }

    /**
     * Gets the Builder instance for the 'that' field and creates one if it doesn't exist yet.
     * @return This builder.
     */
    public org.apache.avro.test.specialtypes.Two.Builder getThatBuilder() {
      if (thatBuilder == null) {
        if (hasThat()) {
          setThatBuilder(org.apache.avro.test.specialtypes.Two.newBuilder(that));
        } else {
          setThatBuilder(org.apache.avro.test.specialtypes.Two.newBuilder());
        }
      }
      return thatBuilder;
    }

    /**
     * Sets the Builder instance for the 'that' field
     * @param value The builder instance that must be set.
     * @return This builder.
     */
    public org.apache.avro.test.specialtypes.builderBuilder.Builder setThatBuilder(org.apache.avro.test.specialtypes.Two.Builder value) {
      clearThat();
      thatBuilder = value;
      return this;
    }

    /**
     * Checks whether the 'that' field has an active Builder instance
     * @return True if the 'that' field has an active Builder instance
     */
    public boolean hasThatBuilder() {
      return thatBuilder != null;
    }

    /**
      * Clears the value of the 'that' field.
      * @return This builder.
      */
    public org.apache.avro.test.specialtypes.builderBuilder.Builder clearThat() {
      that = null;
      thatBuilder = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    public builderBuilder build() {
      try {
        builderBuilder record = new builderBuilder();
        if (this$Builder != null) {
          try {
            record.this$ = this.this$Builder.build();
          } catch (org.apache.avro.AvroMissingFieldException e) {
            e.addParentField(record.getSchema().getField("this$"));
            throw e;
          }
        } else {
          record.this$ = fieldSetFlags()[0] ? this.this$ : (org.apache.avro.test.specialtypes.One) defaultValue(fields()[0]);
        }
        if (thatBuilder != null) {
          try {
            record.that = this.thatBuilder.build();
          } catch (org.apache.avro.AvroMissingFieldException e) {
            e.addParentField(record.getSchema().getField("that"));
            throw e;
          }
        } else {
          record.that = fieldSetFlags()[1] ? this.that : (org.apache.avro.test.specialtypes.Two) defaultValue(fields()[1]);
        }
        return record;
      } catch (org.apache.avro.AvroMissingFieldException e) {
        throw e;
      } catch (java.lang.Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumWriter<builderBuilder>
    WRITER$ = (org.apache.avro.io.DatumWriter<builderBuilder>)MODEL$.createDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumReader<builderBuilder>
    READER$ = (org.apache.avro.io.DatumReader<builderBuilder>)MODEL$.createDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

  @Override protected boolean hasCustomCoders() { return true; }

  @Override public void customEncode(org.apache.avro.io.Encoder out)
    throws java.io.IOException
  {
    this.this$.customEncode(out);

    this.that.customEncode(out);

  }

  @Override public void customDecode(org.apache.avro.io.ResolvingDecoder in)
    throws java.io.IOException
  {
    org.apache.avro.Schema.Field[] fieldOrder = in.readFieldOrderIfDiff();
    if (fieldOrder == null) {
      if (this.this$ == null) {
        this.this$ = new org.apache.avro.test.specialtypes.One();
      }
      this.this$.customDecode(in);

      if (this.that == null) {
        this.that = new org.apache.avro.test.specialtypes.Two();
      }
      this.that.customDecode(in);

    } else {
      for (int i = 0; i < 2; i++) {
        switch (fieldOrder[i].pos()) {
        case 0:
          if (this.this$ == null) {
            this.this$ = new org.apache.avro.test.specialtypes.One();
          }
          this.this$.customDecode(in);
          break;

        case 1:
          if (this.that == null) {
            this.that = new org.apache.avro.test.specialtypes.Two();
          }
          this.that.customDecode(in);
          break;

        default:
          throw new java.io.IOException("Corrupt ResolvingDecoder.");
        }
      }
    }
  }
}










