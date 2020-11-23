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
public class Variables extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = -1022069162639045722L;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"Variables\",\"namespace\":\"org.apache.avro.test.specialtypes\",\"fields\":[{\"name\":\"this\",\"type\":{\"type\":\"record\",\"name\":\"One\",\"fields\":[{\"name\":\"this\",\"type\":{\"type\":\"enum\",\"name\":\"Enum\",\"symbols\":[\"builder\",\"Builder\",\"builderBuider\",\"value\",\"this\"]}}]}},{\"name\":\"Boolean\",\"type\":\"One\"},{\"name\":\"Integer\",\"type\":\"One\"},{\"name\":\"Long\",\"type\":\"One\"},{\"name\":\"Float\",\"type\":\"One\"},{\"name\":\"String\",\"type\":\"One\"}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }

  private static SpecificData MODEL$ = new SpecificData();

  private static final BinaryMessageEncoder<Variables> ENCODER =
      new BinaryMessageEncoder<Variables>(MODEL$, SCHEMA$);

  private static final BinaryMessageDecoder<Variables> DECODER =
      new BinaryMessageDecoder<Variables>(MODEL$, SCHEMA$);

  /**
   * Return the BinaryMessageEncoder instance used by this class.
   * @return the message encoder used by this class
   */
  public static BinaryMessageEncoder<Variables> getEncoder() {
    return ENCODER;
  }

  /**
   * Return the BinaryMessageDecoder instance used by this class.
   * @return the message decoder used by this class
   */
  public static BinaryMessageDecoder<Variables> getDecoder() {
    return DECODER;
  }

  /**
   * Create a new BinaryMessageDecoder instance for this class that uses the specified {@link SchemaStore}.
   * @param resolver a {@link SchemaStore} used to find schemas by fingerprint
   * @return a BinaryMessageDecoder instance for this class backed by the given SchemaStore
   */
  public static BinaryMessageDecoder<Variables> createDecoder(SchemaStore resolver) {
    return new BinaryMessageDecoder<Variables>(MODEL$, SCHEMA$, resolver);
  }

  /**
   * Serializes this Variables to a ByteBuffer.
   * @return a buffer holding the serialized data for this instance
   * @throws java.io.IOException if this instance could not be serialized
   */
  public java.nio.ByteBuffer toByteBuffer() throws java.io.IOException {
    return ENCODER.encode(this);
  }

  /**
   * Deserializes a Variables from a ByteBuffer.
   * @param b a byte buffer holding serialized data for an instance of this class
   * @return a Variables instance decoded from the given buffer
   * @throws java.io.IOException if the given bytes could not be deserialized into an instance of this class
   */
  public static Variables fromByteBuffer(
      java.nio.ByteBuffer b) throws java.io.IOException {
    return DECODER.decode(b);
  }

   private org.apache.avro.test.specialtypes.One this$;
   private org.apache.avro.test.specialtypes.One Boolean;
   private org.apache.avro.test.specialtypes.One Integer;
   private org.apache.avro.test.specialtypes.One Long;
   private org.apache.avro.test.specialtypes.One Float;
   private org.apache.avro.test.specialtypes.One String;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public Variables() {}

  /**
   * All-args constructor.
   * @param this$ The new value for this
   * @param Boolean The new value for Boolean
   * @param Integer The new value for Integer
   * @param Long The new value for Long
   * @param Float The new value for Float
   * @param String The new value for String
   */
  public Variables(org.apache.avro.test.specialtypes.One this$, org.apache.avro.test.specialtypes.One Boolean, org.apache.avro.test.specialtypes.One Integer, org.apache.avro.test.specialtypes.One Long, org.apache.avro.test.specialtypes.One Float, org.apache.avro.test.specialtypes.One String) {
    this.this$ = this$;
    this.Boolean = Boolean;
    this.Integer = Integer;
    this.Long = Long;
    this.Float = Float;
    this.String = String;
  }

  public org.apache.avro.specific.SpecificData getSpecificData() { return MODEL$; }
  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return this$;
    case 1: return Boolean;
    case 2: return Integer;
    case 3: return Long;
    case 4: return Float;
    case 5: return String;
    default: throw new IndexOutOfBoundsException("Invalid index: " + field$);
    }
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: this$ = (org.apache.avro.test.specialtypes.One)value$; break;
    case 1: Boolean = (org.apache.avro.test.specialtypes.One)value$; break;
    case 2: Integer = (org.apache.avro.test.specialtypes.One)value$; break;
    case 3: Long = (org.apache.avro.test.specialtypes.One)value$; break;
    case 4: Float = (org.apache.avro.test.specialtypes.One)value$; break;
    case 5: String = (org.apache.avro.test.specialtypes.One)value$; break;
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
   * Gets the value of the 'Boolean' field.
   * @return The value of the 'Boolean' field.
   */
  public org.apache.avro.test.specialtypes.One getBoolean$() {
    return Boolean;
  }

  /**
   * Gets the value of the 'Boolean' field as an Optional&lt;org.apache.avro.test.specialtypes.One&gt;.
   * @return The value wrapped in an Optional&lt;org.apache.avro.test.specialtypes.One&gt;.
   */
  public Optional<org.apache.avro.test.specialtypes.One> getOptionalBoolean$() {
    return Optional.<org.apache.avro.test.specialtypes.One>ofNullable(Boolean);
  }

  /**
   * Sets the value of the 'Boolean' field.
   * @param value the value to set.
   */
  public void setBoolean$(org.apache.avro.test.specialtypes.One value) {
    this.Boolean = value;
  }

  /**
   * Gets the value of the 'Integer' field.
   * @return The value of the 'Integer' field.
   */
  public org.apache.avro.test.specialtypes.One getInteger() {
    return Integer;
  }

  /**
   * Gets the value of the 'Integer' field as an Optional&lt;org.apache.avro.test.specialtypes.One&gt;.
   * @return The value wrapped in an Optional&lt;org.apache.avro.test.specialtypes.One&gt;.
   */
  public Optional<org.apache.avro.test.specialtypes.One> getOptionalInteger() {
    return Optional.<org.apache.avro.test.specialtypes.One>ofNullable(Integer);
  }

  /**
   * Sets the value of the 'Integer' field.
   * @param value the value to set.
   */
  public void setInteger(org.apache.avro.test.specialtypes.One value) {
    this.Integer = value;
  }

  /**
   * Gets the value of the 'Long' field.
   * @return The value of the 'Long' field.
   */
  public org.apache.avro.test.specialtypes.One getLong$() {
    return Long;
  }

  /**
   * Gets the value of the 'Long' field as an Optional&lt;org.apache.avro.test.specialtypes.One&gt;.
   * @return The value wrapped in an Optional&lt;org.apache.avro.test.specialtypes.One&gt;.
   */
  public Optional<org.apache.avro.test.specialtypes.One> getOptionalLong$() {
    return Optional.<org.apache.avro.test.specialtypes.One>ofNullable(Long);
  }

  /**
   * Sets the value of the 'Long' field.
   * @param value the value to set.
   */
  public void setLong$(org.apache.avro.test.specialtypes.One value) {
    this.Long = value;
  }

  /**
   * Gets the value of the 'Float' field.
   * @return The value of the 'Float' field.
   */
  public org.apache.avro.test.specialtypes.One getFloat$() {
    return Float;
  }

  /**
   * Gets the value of the 'Float' field as an Optional&lt;org.apache.avro.test.specialtypes.One&gt;.
   * @return The value wrapped in an Optional&lt;org.apache.avro.test.specialtypes.One&gt;.
   */
  public Optional<org.apache.avro.test.specialtypes.One> getOptionalFloat$() {
    return Optional.<org.apache.avro.test.specialtypes.One>ofNullable(Float);
  }

  /**
   * Sets the value of the 'Float' field.
   * @param value the value to set.
   */
  public void setFloat$(org.apache.avro.test.specialtypes.One value) {
    this.Float = value;
  }

  /**
   * Gets the value of the 'String' field.
   * @return The value of the 'String' field.
   */
  public org.apache.avro.test.specialtypes.One getString() {
    return String;
  }

  /**
   * Gets the value of the 'String' field as an Optional&lt;org.apache.avro.test.specialtypes.One&gt;.
   * @return The value wrapped in an Optional&lt;org.apache.avro.test.specialtypes.One&gt;.
   */
  public Optional<org.apache.avro.test.specialtypes.One> getOptionalString() {
    return Optional.<org.apache.avro.test.specialtypes.One>ofNullable(String);
  }

  /**
   * Sets the value of the 'String' field.
   * @param value the value to set.
   */
  public void setString(org.apache.avro.test.specialtypes.One value) {
    this.String = value;
  }

  /**
   * Creates a new Variables RecordBuilder.
   * @return A new Variables RecordBuilder
   */
  public static org.apache.avro.test.specialtypes.Variables.Builder newBuilder() {
    return new org.apache.avro.test.specialtypes.Variables.Builder();
  }

  /**
   * Creates a new Variables RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new Variables RecordBuilder
   */
  public static org.apache.avro.test.specialtypes.Variables.Builder newBuilder(org.apache.avro.test.specialtypes.Variables.Builder other) {
    if (other == null) {
      return new org.apache.avro.test.specialtypes.Variables.Builder();
    } else {
      return new org.apache.avro.test.specialtypes.Variables.Builder(other);
    }
  }

  /**
   * Creates a new Variables RecordBuilder by copying an existing Variables instance.
   * @param other The existing instance to copy.
   * @return A new Variables RecordBuilder
   */
  public static org.apache.avro.test.specialtypes.Variables.Builder newBuilder(org.apache.avro.test.specialtypes.Variables other) {
    if (other == null) {
      return new org.apache.avro.test.specialtypes.Variables.Builder();
    } else {
      return new org.apache.avro.test.specialtypes.Variables.Builder(other);
    }
  }

  /**
   * RecordBuilder for Variables instances.
   */
  @org.apache.avro.specific.AvroGenerated
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<Variables>
    implements org.apache.avro.data.RecordBuilder<Variables> {

    private org.apache.avro.test.specialtypes.One this$;
    private org.apache.avro.test.specialtypes.One.Builder this$Builder;
    private org.apache.avro.test.specialtypes.One Boolean;
    private org.apache.avro.test.specialtypes.One.Builder BooleanBuilder;
    private org.apache.avro.test.specialtypes.One Integer;
    private org.apache.avro.test.specialtypes.One.Builder IntegerBuilder;
    private org.apache.avro.test.specialtypes.One Long;
    private org.apache.avro.test.specialtypes.One.Builder LongBuilder;
    private org.apache.avro.test.specialtypes.One Float;
    private org.apache.avro.test.specialtypes.One.Builder FloatBuilder;
    private org.apache.avro.test.specialtypes.One String;
    private org.apache.avro.test.specialtypes.One.Builder StringBuilder;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(org.apache.avro.test.specialtypes.Variables.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.this$)) {
        this.this$ = data().deepCopy(fields()[0].schema(), other.this$);
        fieldSetFlags()[0] = other.fieldSetFlags()[0];
      }
      if (other.hasThis$Builder()) {
        this.this$Builder = org.apache.avro.test.specialtypes.One.newBuilder(other.getThis$Builder());
      }
      if (isValidValue(fields()[1], other.Boolean)) {
        this.Boolean = data().deepCopy(fields()[1].schema(), other.Boolean);
        fieldSetFlags()[1] = other.fieldSetFlags()[1];
      }
      if (other.hasBoolean$Builder()) {
        this.BooleanBuilder = org.apache.avro.test.specialtypes.One.newBuilder(other.getBoolean$Builder());
      }
      if (isValidValue(fields()[2], other.Integer)) {
        this.Integer = data().deepCopy(fields()[2].schema(), other.Integer);
        fieldSetFlags()[2] = other.fieldSetFlags()[2];
      }
      if (other.hasIntegerBuilder()) {
        this.IntegerBuilder = org.apache.avro.test.specialtypes.One.newBuilder(other.getIntegerBuilder());
      }
      if (isValidValue(fields()[3], other.Long)) {
        this.Long = data().deepCopy(fields()[3].schema(), other.Long);
        fieldSetFlags()[3] = other.fieldSetFlags()[3];
      }
      if (other.hasLong$Builder()) {
        this.LongBuilder = org.apache.avro.test.specialtypes.One.newBuilder(other.getLong$Builder());
      }
      if (isValidValue(fields()[4], other.Float)) {
        this.Float = data().deepCopy(fields()[4].schema(), other.Float);
        fieldSetFlags()[4] = other.fieldSetFlags()[4];
      }
      if (other.hasFloat$Builder()) {
        this.FloatBuilder = org.apache.avro.test.specialtypes.One.newBuilder(other.getFloat$Builder());
      }
      if (isValidValue(fields()[5], other.String)) {
        this.String = data().deepCopy(fields()[5].schema(), other.String);
        fieldSetFlags()[5] = other.fieldSetFlags()[5];
      }
      if (other.hasStringBuilder()) {
        this.StringBuilder = org.apache.avro.test.specialtypes.One.newBuilder(other.getStringBuilder());
      }
    }

    /**
     * Creates a Builder by copying an existing Variables instance
     * @param other The existing instance to copy.
     */
    private Builder(org.apache.avro.test.specialtypes.Variables other) {
      super(SCHEMA$);
      if (isValidValue(fields()[0], other.this$)) {
        this.this$ = data().deepCopy(fields()[0].schema(), other.this$);
        fieldSetFlags()[0] = true;
      }
      this.this$Builder = null;
      if (isValidValue(fields()[1], other.Boolean)) {
        this.Boolean = data().deepCopy(fields()[1].schema(), other.Boolean);
        fieldSetFlags()[1] = true;
      }
      this.BooleanBuilder = null;
      if (isValidValue(fields()[2], other.Integer)) {
        this.Integer = data().deepCopy(fields()[2].schema(), other.Integer);
        fieldSetFlags()[2] = true;
      }
      this.IntegerBuilder = null;
      if (isValidValue(fields()[3], other.Long)) {
        this.Long = data().deepCopy(fields()[3].schema(), other.Long);
        fieldSetFlags()[3] = true;
      }
      this.LongBuilder = null;
      if (isValidValue(fields()[4], other.Float)) {
        this.Float = data().deepCopy(fields()[4].schema(), other.Float);
        fieldSetFlags()[4] = true;
      }
      this.FloatBuilder = null;
      if (isValidValue(fields()[5], other.String)) {
        this.String = data().deepCopy(fields()[5].schema(), other.String);
        fieldSetFlags()[5] = true;
      }
      this.StringBuilder = null;
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
    public org.apache.avro.test.specialtypes.Variables.Builder setThis$(org.apache.avro.test.specialtypes.One value) {
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
    public org.apache.avro.test.specialtypes.Variables.Builder setThis$Builder(org.apache.avro.test.specialtypes.One.Builder value) {
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
    public org.apache.avro.test.specialtypes.Variables.Builder clearThis$() {
      this$ = null;
      this$Builder = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
      * Gets the value of the 'Boolean' field.
      * @return The value.
      */
    public org.apache.avro.test.specialtypes.One getBoolean$() {
      return Boolean;
    }

    /**
      * Gets the value of the 'Boolean' field as an Optional&lt;org.apache.avro.test.specialtypes.One&gt;.
      * @return The value wrapped in an Optional&lt;org.apache.avro.test.specialtypes.One&gt;.
      */
    public Optional<org.apache.avro.test.specialtypes.One> getOptionalBoolean$() {
      return Optional.<org.apache.avro.test.specialtypes.One>ofNullable(Boolean);
    }

    /**
      * Sets the value of the 'Boolean' field.
      * @param value The value of 'Boolean'.
      * @return This builder.
      */
    public org.apache.avro.test.specialtypes.Variables.Builder setBoolean$(org.apache.avro.test.specialtypes.One value) {
      validate(fields()[1], value);
      this.BooleanBuilder = null;
      this.Boolean = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'Boolean' field has been set.
      * @return True if the 'Boolean' field has been set, false otherwise.
      */
    public boolean hasBoolean$() {
      return fieldSetFlags()[1];
    }

    /**
     * Gets the Builder instance for the 'Boolean' field and creates one if it doesn't exist yet.
     * @return This builder.
     */
    public org.apache.avro.test.specialtypes.One.Builder getBoolean$Builder() {
      if (BooleanBuilder == null) {
        if (hasBoolean$()) {
          setBoolean$Builder(org.apache.avro.test.specialtypes.One.newBuilder(Boolean));
        } else {
          setBoolean$Builder(org.apache.avro.test.specialtypes.One.newBuilder());
        }
      }
      return BooleanBuilder;
    }

    /**
     * Sets the Builder instance for the 'Boolean' field
     * @param value The builder instance that must be set.
     * @return This builder.
     */
    public org.apache.avro.test.specialtypes.Variables.Builder setBoolean$Builder(org.apache.avro.test.specialtypes.One.Builder value) {
      clearBoolean$();
      BooleanBuilder = value;
      return this;
    }

    /**
     * Checks whether the 'Boolean' field has an active Builder instance
     * @return True if the 'Boolean' field has an active Builder instance
     */
    public boolean hasBoolean$Builder() {
      return BooleanBuilder != null;
    }

    /**
      * Clears the value of the 'Boolean' field.
      * @return This builder.
      */
    public org.apache.avro.test.specialtypes.Variables.Builder clearBoolean$() {
      Boolean = null;
      BooleanBuilder = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /**
      * Gets the value of the 'Integer' field.
      * @return The value.
      */
    public org.apache.avro.test.specialtypes.One getInteger() {
      return Integer;
    }

    /**
      * Gets the value of the 'Integer' field as an Optional&lt;org.apache.avro.test.specialtypes.One&gt;.
      * @return The value wrapped in an Optional&lt;org.apache.avro.test.specialtypes.One&gt;.
      */
    public Optional<org.apache.avro.test.specialtypes.One> getOptionalInteger() {
      return Optional.<org.apache.avro.test.specialtypes.One>ofNullable(Integer);
    }

    /**
      * Sets the value of the 'Integer' field.
      * @param value The value of 'Integer'.
      * @return This builder.
      */
    public org.apache.avro.test.specialtypes.Variables.Builder setInteger(org.apache.avro.test.specialtypes.One value) {
      validate(fields()[2], value);
      this.IntegerBuilder = null;
      this.Integer = value;
      fieldSetFlags()[2] = true;
      return this;
    }

    /**
      * Checks whether the 'Integer' field has been set.
      * @return True if the 'Integer' field has been set, false otherwise.
      */
    public boolean hasInteger() {
      return fieldSetFlags()[2];
    }

    /**
     * Gets the Builder instance for the 'Integer' field and creates one if it doesn't exist yet.
     * @return This builder.
     */
    public org.apache.avro.test.specialtypes.One.Builder getIntegerBuilder() {
      if (IntegerBuilder == null) {
        if (hasInteger()) {
          setIntegerBuilder(org.apache.avro.test.specialtypes.One.newBuilder(Integer));
        } else {
          setIntegerBuilder(org.apache.avro.test.specialtypes.One.newBuilder());
        }
      }
      return IntegerBuilder;
    }

    /**
     * Sets the Builder instance for the 'Integer' field
     * @param value The builder instance that must be set.
     * @return This builder.
     */
    public org.apache.avro.test.specialtypes.Variables.Builder setIntegerBuilder(org.apache.avro.test.specialtypes.One.Builder value) {
      clearInteger();
      IntegerBuilder = value;
      return this;
    }

    /**
     * Checks whether the 'Integer' field has an active Builder instance
     * @return True if the 'Integer' field has an active Builder instance
     */
    public boolean hasIntegerBuilder() {
      return IntegerBuilder != null;
    }

    /**
      * Clears the value of the 'Integer' field.
      * @return This builder.
      */
    public org.apache.avro.test.specialtypes.Variables.Builder clearInteger() {
      Integer = null;
      IntegerBuilder = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    /**
      * Gets the value of the 'Long' field.
      * @return The value.
      */
    public org.apache.avro.test.specialtypes.One getLong$() {
      return Long;
    }

    /**
      * Gets the value of the 'Long' field as an Optional&lt;org.apache.avro.test.specialtypes.One&gt;.
      * @return The value wrapped in an Optional&lt;org.apache.avro.test.specialtypes.One&gt;.
      */
    public Optional<org.apache.avro.test.specialtypes.One> getOptionalLong$() {
      return Optional.<org.apache.avro.test.specialtypes.One>ofNullable(Long);
    }

    /**
      * Sets the value of the 'Long' field.
      * @param value The value of 'Long'.
      * @return This builder.
      */
    public org.apache.avro.test.specialtypes.Variables.Builder setLong$(org.apache.avro.test.specialtypes.One value) {
      validate(fields()[3], value);
      this.LongBuilder = null;
      this.Long = value;
      fieldSetFlags()[3] = true;
      return this;
    }

    /**
      * Checks whether the 'Long' field has been set.
      * @return True if the 'Long' field has been set, false otherwise.
      */
    public boolean hasLong$() {
      return fieldSetFlags()[3];
    }

    /**
     * Gets the Builder instance for the 'Long' field and creates one if it doesn't exist yet.
     * @return This builder.
     */
    public org.apache.avro.test.specialtypes.One.Builder getLong$Builder() {
      if (LongBuilder == null) {
        if (hasLong$()) {
          setLong$Builder(org.apache.avro.test.specialtypes.One.newBuilder(Long));
        } else {
          setLong$Builder(org.apache.avro.test.specialtypes.One.newBuilder());
        }
      }
      return LongBuilder;
    }

    /**
     * Sets the Builder instance for the 'Long' field
     * @param value The builder instance that must be set.
     * @return This builder.
     */
    public org.apache.avro.test.specialtypes.Variables.Builder setLong$Builder(org.apache.avro.test.specialtypes.One.Builder value) {
      clearLong$();
      LongBuilder = value;
      return this;
    }

    /**
     * Checks whether the 'Long' field has an active Builder instance
     * @return True if the 'Long' field has an active Builder instance
     */
    public boolean hasLong$Builder() {
      return LongBuilder != null;
    }

    /**
      * Clears the value of the 'Long' field.
      * @return This builder.
      */
    public org.apache.avro.test.specialtypes.Variables.Builder clearLong$() {
      Long = null;
      LongBuilder = null;
      fieldSetFlags()[3] = false;
      return this;
    }

    /**
      * Gets the value of the 'Float' field.
      * @return The value.
      */
    public org.apache.avro.test.specialtypes.One getFloat$() {
      return Float;
    }

    /**
      * Gets the value of the 'Float' field as an Optional&lt;org.apache.avro.test.specialtypes.One&gt;.
      * @return The value wrapped in an Optional&lt;org.apache.avro.test.specialtypes.One&gt;.
      */
    public Optional<org.apache.avro.test.specialtypes.One> getOptionalFloat$() {
      return Optional.<org.apache.avro.test.specialtypes.One>ofNullable(Float);
    }

    /**
      * Sets the value of the 'Float' field.
      * @param value The value of 'Float'.
      * @return This builder.
      */
    public org.apache.avro.test.specialtypes.Variables.Builder setFloat$(org.apache.avro.test.specialtypes.One value) {
      validate(fields()[4], value);
      this.FloatBuilder = null;
      this.Float = value;
      fieldSetFlags()[4] = true;
      return this;
    }

    /**
      * Checks whether the 'Float' field has been set.
      * @return True if the 'Float' field has been set, false otherwise.
      */
    public boolean hasFloat$() {
      return fieldSetFlags()[4];
    }

    /**
     * Gets the Builder instance for the 'Float' field and creates one if it doesn't exist yet.
     * @return This builder.
     */
    public org.apache.avro.test.specialtypes.One.Builder getFloat$Builder() {
      if (FloatBuilder == null) {
        if (hasFloat$()) {
          setFloat$Builder(org.apache.avro.test.specialtypes.One.newBuilder(Float));
        } else {
          setFloat$Builder(org.apache.avro.test.specialtypes.One.newBuilder());
        }
      }
      return FloatBuilder;
    }

    /**
     * Sets the Builder instance for the 'Float' field
     * @param value The builder instance that must be set.
     * @return This builder.
     */
    public org.apache.avro.test.specialtypes.Variables.Builder setFloat$Builder(org.apache.avro.test.specialtypes.One.Builder value) {
      clearFloat$();
      FloatBuilder = value;
      return this;
    }

    /**
     * Checks whether the 'Float' field has an active Builder instance
     * @return True if the 'Float' field has an active Builder instance
     */
    public boolean hasFloat$Builder() {
      return FloatBuilder != null;
    }

    /**
      * Clears the value of the 'Float' field.
      * @return This builder.
      */
    public org.apache.avro.test.specialtypes.Variables.Builder clearFloat$() {
      Float = null;
      FloatBuilder = null;
      fieldSetFlags()[4] = false;
      return this;
    }

    /**
      * Gets the value of the 'String' field.
      * @return The value.
      */
    public org.apache.avro.test.specialtypes.One getString() {
      return String;
    }

    /**
      * Gets the value of the 'String' field as an Optional&lt;org.apache.avro.test.specialtypes.One&gt;.
      * @return The value wrapped in an Optional&lt;org.apache.avro.test.specialtypes.One&gt;.
      */
    public Optional<org.apache.avro.test.specialtypes.One> getOptionalString() {
      return Optional.<org.apache.avro.test.specialtypes.One>ofNullable(String);
    }

    /**
      * Sets the value of the 'String' field.
      * @param value The value of 'String'.
      * @return This builder.
      */
    public org.apache.avro.test.specialtypes.Variables.Builder setString(org.apache.avro.test.specialtypes.One value) {
      validate(fields()[5], value);
      this.StringBuilder = null;
      this.String = value;
      fieldSetFlags()[5] = true;
      return this;
    }

    /**
      * Checks whether the 'String' field has been set.
      * @return True if the 'String' field has been set, false otherwise.
      */
    public boolean hasString() {
      return fieldSetFlags()[5];
    }

    /**
     * Gets the Builder instance for the 'String' field and creates one if it doesn't exist yet.
     * @return This builder.
     */
    public org.apache.avro.test.specialtypes.One.Builder getStringBuilder() {
      if (StringBuilder == null) {
        if (hasString()) {
          setStringBuilder(org.apache.avro.test.specialtypes.One.newBuilder(String));
        } else {
          setStringBuilder(org.apache.avro.test.specialtypes.One.newBuilder());
        }
      }
      return StringBuilder;
    }

    /**
     * Sets the Builder instance for the 'String' field
     * @param value The builder instance that must be set.
     * @return This builder.
     */
    public org.apache.avro.test.specialtypes.Variables.Builder setStringBuilder(org.apache.avro.test.specialtypes.One.Builder value) {
      clearString();
      StringBuilder = value;
      return this;
    }

    /**
     * Checks whether the 'String' field has an active Builder instance
     * @return True if the 'String' field has an active Builder instance
     */
    public boolean hasStringBuilder() {
      return StringBuilder != null;
    }

    /**
      * Clears the value of the 'String' field.
      * @return This builder.
      */
    public org.apache.avro.test.specialtypes.Variables.Builder clearString() {
      String = null;
      StringBuilder = null;
      fieldSetFlags()[5] = false;
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    public Variables build() {
      try {
        Variables record = new Variables();
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
        if (BooleanBuilder != null) {
          try {
            record.Boolean = this.BooleanBuilder.build();
          } catch (org.apache.avro.AvroMissingFieldException e) {
            e.addParentField(record.getSchema().getField("Boolean"));
            throw e;
          }
        } else {
          record.Boolean = fieldSetFlags()[1] ? this.Boolean : (org.apache.avro.test.specialtypes.One) defaultValue(fields()[1]);
        }
        if (IntegerBuilder != null) {
          try {
            record.Integer = this.IntegerBuilder.build();
          } catch (org.apache.avro.AvroMissingFieldException e) {
            e.addParentField(record.getSchema().getField("Integer"));
            throw e;
          }
        } else {
          record.Integer = fieldSetFlags()[2] ? this.Integer : (org.apache.avro.test.specialtypes.One) defaultValue(fields()[2]);
        }
        if (LongBuilder != null) {
          try {
            record.Long = this.LongBuilder.build();
          } catch (org.apache.avro.AvroMissingFieldException e) {
            e.addParentField(record.getSchema().getField("Long"));
            throw e;
          }
        } else {
          record.Long = fieldSetFlags()[3] ? this.Long : (org.apache.avro.test.specialtypes.One) defaultValue(fields()[3]);
        }
        if (FloatBuilder != null) {
          try {
            record.Float = this.FloatBuilder.build();
          } catch (org.apache.avro.AvroMissingFieldException e) {
            e.addParentField(record.getSchema().getField("Float"));
            throw e;
          }
        } else {
          record.Float = fieldSetFlags()[4] ? this.Float : (org.apache.avro.test.specialtypes.One) defaultValue(fields()[4]);
        }
        if (StringBuilder != null) {
          try {
            record.String = this.StringBuilder.build();
          } catch (org.apache.avro.AvroMissingFieldException e) {
            e.addParentField(record.getSchema().getField("String"));
            throw e;
          }
        } else {
          record.String = fieldSetFlags()[5] ? this.String : (org.apache.avro.test.specialtypes.One) defaultValue(fields()[5]);
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
  private static final org.apache.avro.io.DatumWriter<Variables>
    WRITER$ = (org.apache.avro.io.DatumWriter<Variables>)MODEL$.createDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumReader<Variables>
    READER$ = (org.apache.avro.io.DatumReader<Variables>)MODEL$.createDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

  @Override protected boolean hasCustomCoders() { return true; }

  @Override public void customEncode(org.apache.avro.io.Encoder out)
    throws java.io.IOException
  {
    this.this$.customEncode(out);

    this.Boolean.customEncode(out);

    this.Integer.customEncode(out);

    this.Long.customEncode(out);

    this.Float.customEncode(out);

    this.String.customEncode(out);

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

      if (this.Boolean == null) {
        this.Boolean = new org.apache.avro.test.specialtypes.One();
      }
      this.Boolean.customDecode(in);

      if (this.Integer == null) {
        this.Integer = new org.apache.avro.test.specialtypes.One();
      }
      this.Integer.customDecode(in);

      if (this.Long == null) {
        this.Long = new org.apache.avro.test.specialtypes.One();
      }
      this.Long.customDecode(in);

      if (this.Float == null) {
        this.Float = new org.apache.avro.test.specialtypes.One();
      }
      this.Float.customDecode(in);

      if (this.String == null) {
        this.String = new org.apache.avro.test.specialtypes.One();
      }
      this.String.customDecode(in);

    } else {
      for (int i = 0; i < 6; i++) {
        switch (fieldOrder[i].pos()) {
        case 0:
          if (this.this$ == null) {
            this.this$ = new org.apache.avro.test.specialtypes.One();
          }
          this.this$.customDecode(in);
          break;

        case 1:
          if (this.Boolean == null) {
            this.Boolean = new org.apache.avro.test.specialtypes.One();
          }
          this.Boolean.customDecode(in);
          break;

        case 2:
          if (this.Integer == null) {
            this.Integer = new org.apache.avro.test.specialtypes.One();
          }
          this.Integer.customDecode(in);
          break;

        case 3:
          if (this.Long == null) {
            this.Long = new org.apache.avro.test.specialtypes.One();
          }
          this.Long.customDecode(in);
          break;

        case 4:
          if (this.Float == null) {
            this.Float = new org.apache.avro.test.specialtypes.One();
          }
          this.Float.customDecode(in);
          break;

        case 5:
          if (this.String == null) {
            this.String = new org.apache.avro.test.specialtypes.One();
          }
          this.String.customDecode(in);
          break;

        default:
          throw new java.io.IOException("Corrupt ResolvingDecoder.");
        }
      }
    }
  }
}










