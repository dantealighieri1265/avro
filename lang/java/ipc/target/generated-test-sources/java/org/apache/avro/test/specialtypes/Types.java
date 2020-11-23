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
public class Types extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = -5741698648114364064L;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"Types\",\"namespace\":\"org.apache.avro.test.specialtypes\",\"fields\":[{\"name\":\"one\",\"type\":{\"type\":\"enum\",\"name\":\"Boolean\",\"symbols\":[\"Yes\",\"No\"]}},{\"name\":\"two\",\"type\":{\"type\":\"record\",\"name\":\"builder\",\"fields\":[{\"name\":\"this\",\"type\":{\"type\":\"record\",\"name\":\"One\",\"fields\":[{\"name\":\"this\",\"type\":{\"type\":\"enum\",\"name\":\"Enum\",\"symbols\":[\"builder\",\"Builder\",\"builderBuider\",\"value\",\"this\"]}}]}},{\"name\":\"builder\",\"type\":{\"type\":\"record\",\"name\":\"Two\",\"fields\":[{\"name\":\"this\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"String\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}}]}}]}},{\"name\":\"three\",\"type\":{\"type\":\"record\",\"name\":\"Builder\",\"fields\":[{\"name\":\"this\",\"type\":\"One\"},{\"name\":\"that\",\"type\":\"Two\"}]}},{\"name\":\"four\",\"type\":{\"type\":\"record\",\"name\":\"builderBuilder\",\"fields\":[{\"name\":\"this\",\"type\":\"One\"},{\"name\":\"that\",\"type\":\"Two\"}]}},{\"name\":\"five\",\"type\":{\"type\":\"record\",\"name\":\"String\",\"fields\":[{\"name\":\"value\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}}]}},{\"name\":\"six\",\"type\":{\"type\":\"record\",\"name\":\"value\",\"fields\":[{\"name\":\"this\",\"type\":\"One\"},{\"name\":\"that\",\"type\":\"Two\"}]}}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }

  private static SpecificData MODEL$ = new SpecificData();

  private static final BinaryMessageEncoder<Types> ENCODER =
      new BinaryMessageEncoder<Types>(MODEL$, SCHEMA$);

  private static final BinaryMessageDecoder<Types> DECODER =
      new BinaryMessageDecoder<Types>(MODEL$, SCHEMA$);

  /**
   * Return the BinaryMessageEncoder instance used by this class.
   * @return the message encoder used by this class
   */
  public static BinaryMessageEncoder<Types> getEncoder() {
    return ENCODER;
  }

  /**
   * Return the BinaryMessageDecoder instance used by this class.
   * @return the message decoder used by this class
   */
  public static BinaryMessageDecoder<Types> getDecoder() {
    return DECODER;
  }

  /**
   * Create a new BinaryMessageDecoder instance for this class that uses the specified {@link SchemaStore}.
   * @param resolver a {@link SchemaStore} used to find schemas by fingerprint
   * @return a BinaryMessageDecoder instance for this class backed by the given SchemaStore
   */
  public static BinaryMessageDecoder<Types> createDecoder(SchemaStore resolver) {
    return new BinaryMessageDecoder<Types>(MODEL$, SCHEMA$, resolver);
  }

  /**
   * Serializes this Types to a ByteBuffer.
   * @return a buffer holding the serialized data for this instance
   * @throws java.io.IOException if this instance could not be serialized
   */
  public java.nio.ByteBuffer toByteBuffer() throws java.io.IOException {
    return ENCODER.encode(this);
  }

  /**
   * Deserializes a Types from a ByteBuffer.
   * @param b a byte buffer holding serialized data for an instance of this class
   * @return a Types instance decoded from the given buffer
   * @throws java.io.IOException if the given bytes could not be deserialized into an instance of this class
   */
  public static Types fromByteBuffer(
      java.nio.ByteBuffer b) throws java.io.IOException {
    return DECODER.decode(b);
  }

   private org.apache.avro.test.specialtypes.Boolean one;
   private org.apache.avro.test.specialtypes.builder two;
   private org.apache.avro.test.specialtypes.Builder$ three;
   private org.apache.avro.test.specialtypes.builderBuilder four;
   private org.apache.avro.test.specialtypes.String five;
   private org.apache.avro.test.specialtypes.value six;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public Types() {}

  /**
   * All-args constructor.
   * @param one The new value for one
   * @param two The new value for two
   * @param three The new value for three
   * @param four The new value for four
   * @param five The new value for five
   * @param six The new value for six
   */
  public Types(org.apache.avro.test.specialtypes.Boolean one, org.apache.avro.test.specialtypes.builder two, org.apache.avro.test.specialtypes.Builder$ three, org.apache.avro.test.specialtypes.builderBuilder four, org.apache.avro.test.specialtypes.String five, org.apache.avro.test.specialtypes.value six) {
    this.one = one;
    this.two = two;
    this.three = three;
    this.four = four;
    this.five = five;
    this.six = six;
  }

  public org.apache.avro.specific.SpecificData getSpecificData() { return MODEL$; }
  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return one;
    case 1: return two;
    case 2: return three;
    case 3: return four;
    case 4: return five;
    case 5: return six;
    default: throw new IndexOutOfBoundsException("Invalid index: " + field$);
    }
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: one = (org.apache.avro.test.specialtypes.Boolean)value$; break;
    case 1: two = (org.apache.avro.test.specialtypes.builder)value$; break;
    case 2: three = (org.apache.avro.test.specialtypes.Builder$)value$; break;
    case 3: four = (org.apache.avro.test.specialtypes.builderBuilder)value$; break;
    case 4: five = (org.apache.avro.test.specialtypes.String)value$; break;
    case 5: six = (org.apache.avro.test.specialtypes.value)value$; break;
    default: throw new IndexOutOfBoundsException("Invalid index: " + field$);
    }
  }

  /**
   * Gets the value of the 'one' field.
   * @return The value of the 'one' field.
   */
  public org.apache.avro.test.specialtypes.Boolean getOne() {
    return one;
  }

  /**
   * Gets the value of the 'one' field as an Optional&lt;org.apache.avro.test.specialtypes.Boolean&gt;.
   * @return The value wrapped in an Optional&lt;org.apache.avro.test.specialtypes.Boolean&gt;.
   */
  public Optional<org.apache.avro.test.specialtypes.Boolean> getOptionalOne() {
    return Optional.<org.apache.avro.test.specialtypes.Boolean>ofNullable(one);
  }

  /**
   * Sets the value of the 'one' field.
   * @param value the value to set.
   */
  public void setOne(org.apache.avro.test.specialtypes.Boolean value) {
    this.one = value;
  }

  /**
   * Gets the value of the 'two' field.
   * @return The value of the 'two' field.
   */
  public org.apache.avro.test.specialtypes.builder getTwo() {
    return two;
  }

  /**
   * Gets the value of the 'two' field as an Optional&lt;org.apache.avro.test.specialtypes.builder&gt;.
   * @return The value wrapped in an Optional&lt;org.apache.avro.test.specialtypes.builder&gt;.
   */
  public Optional<org.apache.avro.test.specialtypes.builder> getOptionalTwo() {
    return Optional.<org.apache.avro.test.specialtypes.builder>ofNullable(two);
  }

  /**
   * Sets the value of the 'two' field.
   * @param value the value to set.
   */
  public void setTwo(org.apache.avro.test.specialtypes.builder value) {
    this.two = value;
  }

  /**
   * Gets the value of the 'three' field.
   * @return The value of the 'three' field.
   */
  public org.apache.avro.test.specialtypes.Builder$ getThree() {
    return three;
  }

  /**
   * Gets the value of the 'three' field as an Optional&lt;org.apache.avro.test.specialtypes.Builder$&gt;.
   * @return The value wrapped in an Optional&lt;org.apache.avro.test.specialtypes.Builder$&gt;.
   */
  public Optional<org.apache.avro.test.specialtypes.Builder$> getOptionalThree() {
    return Optional.<org.apache.avro.test.specialtypes.Builder$>ofNullable(three);
  }

  /**
   * Sets the value of the 'three' field.
   * @param value the value to set.
   */
  public void setThree(org.apache.avro.test.specialtypes.Builder$ value) {
    this.three = value;
  }

  /**
   * Gets the value of the 'four' field.
   * @return The value of the 'four' field.
   */
  public org.apache.avro.test.specialtypes.builderBuilder getFour() {
    return four;
  }

  /**
   * Gets the value of the 'four' field as an Optional&lt;org.apache.avro.test.specialtypes.builderBuilder&gt;.
   * @return The value wrapped in an Optional&lt;org.apache.avro.test.specialtypes.builderBuilder&gt;.
   */
  public Optional<org.apache.avro.test.specialtypes.builderBuilder> getOptionalFour() {
    return Optional.<org.apache.avro.test.specialtypes.builderBuilder>ofNullable(four);
  }

  /**
   * Sets the value of the 'four' field.
   * @param value the value to set.
   */
  public void setFour(org.apache.avro.test.specialtypes.builderBuilder value) {
    this.four = value;
  }

  /**
   * Gets the value of the 'five' field.
   * @return The value of the 'five' field.
   */
  public org.apache.avro.test.specialtypes.String getFive() {
    return five;
  }

  /**
   * Gets the value of the 'five' field as an Optional&lt;org.apache.avro.test.specialtypes.String&gt;.
   * @return The value wrapped in an Optional&lt;org.apache.avro.test.specialtypes.String&gt;.
   */
  public Optional<org.apache.avro.test.specialtypes.String> getOptionalFive() {
    return Optional.<org.apache.avro.test.specialtypes.String>ofNullable(five);
  }

  /**
   * Sets the value of the 'five' field.
   * @param value the value to set.
   */
  public void setFive(org.apache.avro.test.specialtypes.String value) {
    this.five = value;
  }

  /**
   * Gets the value of the 'six' field.
   * @return The value of the 'six' field.
   */
  public org.apache.avro.test.specialtypes.value getSix() {
    return six;
  }

  /**
   * Gets the value of the 'six' field as an Optional&lt;org.apache.avro.test.specialtypes.value&gt;.
   * @return The value wrapped in an Optional&lt;org.apache.avro.test.specialtypes.value&gt;.
   */
  public Optional<org.apache.avro.test.specialtypes.value> getOptionalSix() {
    return Optional.<org.apache.avro.test.specialtypes.value>ofNullable(six);
  }

  /**
   * Sets the value of the 'six' field.
   * @param value the value to set.
   */
  public void setSix(org.apache.avro.test.specialtypes.value value) {
    this.six = value;
  }

  /**
   * Creates a new Types RecordBuilder.
   * @return A new Types RecordBuilder
   */
  public static org.apache.avro.test.specialtypes.Types.Builder newBuilder() {
    return new org.apache.avro.test.specialtypes.Types.Builder();
  }

  /**
   * Creates a new Types RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new Types RecordBuilder
   */
  public static org.apache.avro.test.specialtypes.Types.Builder newBuilder(org.apache.avro.test.specialtypes.Types.Builder other) {
    if (other == null) {
      return new org.apache.avro.test.specialtypes.Types.Builder();
    } else {
      return new org.apache.avro.test.specialtypes.Types.Builder(other);
    }
  }

  /**
   * Creates a new Types RecordBuilder by copying an existing Types instance.
   * @param other The existing instance to copy.
   * @return A new Types RecordBuilder
   */
  public static org.apache.avro.test.specialtypes.Types.Builder newBuilder(org.apache.avro.test.specialtypes.Types other) {
    if (other == null) {
      return new org.apache.avro.test.specialtypes.Types.Builder();
    } else {
      return new org.apache.avro.test.specialtypes.Types.Builder(other);
    }
  }

  /**
   * RecordBuilder for Types instances.
   */
  @org.apache.avro.specific.AvroGenerated
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<Types>
    implements org.apache.avro.data.RecordBuilder<Types> {

    private org.apache.avro.test.specialtypes.Boolean one;
    private org.apache.avro.test.specialtypes.builder two;
    private org.apache.avro.test.specialtypes.builder.Builder twoBuilder;
    private org.apache.avro.test.specialtypes.Builder$ three;
    private org.apache.avro.test.specialtypes.Builder$.Builder threeBuilder;
    private org.apache.avro.test.specialtypes.builderBuilder four;
    private org.apache.avro.test.specialtypes.builderBuilder.Builder fourBuilder;
    private org.apache.avro.test.specialtypes.String five;
    private org.apache.avro.test.specialtypes.String.Builder fiveBuilder;
    private org.apache.avro.test.specialtypes.value six;
    private org.apache.avro.test.specialtypes.value.Builder sixBuilder;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(org.apache.avro.test.specialtypes.Types.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.one)) {
        this.one = data().deepCopy(fields()[0].schema(), other.one);
        fieldSetFlags()[0] = other.fieldSetFlags()[0];
      }
      if (isValidValue(fields()[1], other.two)) {
        this.two = data().deepCopy(fields()[1].schema(), other.two);
        fieldSetFlags()[1] = other.fieldSetFlags()[1];
      }
      if (other.hasTwoBuilder()) {
        this.twoBuilder = org.apache.avro.test.specialtypes.builder.newBuilder(other.getTwoBuilder());
      }
      if (isValidValue(fields()[2], other.three)) {
        this.three = data().deepCopy(fields()[2].schema(), other.three);
        fieldSetFlags()[2] = other.fieldSetFlags()[2];
      }
      if (other.hasThreeBuilder()) {
        this.threeBuilder = org.apache.avro.test.specialtypes.Builder$.newBuilder(other.getThreeBuilder());
      }
      if (isValidValue(fields()[3], other.four)) {
        this.four = data().deepCopy(fields()[3].schema(), other.four);
        fieldSetFlags()[3] = other.fieldSetFlags()[3];
      }
      if (other.hasFourBuilder()) {
        this.fourBuilder = org.apache.avro.test.specialtypes.builderBuilder.newBuilder(other.getFourBuilder());
      }
      if (isValidValue(fields()[4], other.five)) {
        this.five = data().deepCopy(fields()[4].schema(), other.five);
        fieldSetFlags()[4] = other.fieldSetFlags()[4];
      }
      if (other.hasFiveBuilder()) {
        this.fiveBuilder = org.apache.avro.test.specialtypes.String.newBuilder(other.getFiveBuilder());
      }
      if (isValidValue(fields()[5], other.six)) {
        this.six = data().deepCopy(fields()[5].schema(), other.six);
        fieldSetFlags()[5] = other.fieldSetFlags()[5];
      }
      if (other.hasSixBuilder()) {
        this.sixBuilder = org.apache.avro.test.specialtypes.value.newBuilder(other.getSixBuilder());
      }
    }

    /**
     * Creates a Builder by copying an existing Types instance
     * @param other The existing instance to copy.
     */
    private Builder(org.apache.avro.test.specialtypes.Types other) {
      super(SCHEMA$);
      if (isValidValue(fields()[0], other.one)) {
        this.one = data().deepCopy(fields()[0].schema(), other.one);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.two)) {
        this.two = data().deepCopy(fields()[1].schema(), other.two);
        fieldSetFlags()[1] = true;
      }
      this.twoBuilder = null;
      if (isValidValue(fields()[2], other.three)) {
        this.three = data().deepCopy(fields()[2].schema(), other.three);
        fieldSetFlags()[2] = true;
      }
      this.threeBuilder = null;
      if (isValidValue(fields()[3], other.four)) {
        this.four = data().deepCopy(fields()[3].schema(), other.four);
        fieldSetFlags()[3] = true;
      }
      this.fourBuilder = null;
      if (isValidValue(fields()[4], other.five)) {
        this.five = data().deepCopy(fields()[4].schema(), other.five);
        fieldSetFlags()[4] = true;
      }
      this.fiveBuilder = null;
      if (isValidValue(fields()[5], other.six)) {
        this.six = data().deepCopy(fields()[5].schema(), other.six);
        fieldSetFlags()[5] = true;
      }
      this.sixBuilder = null;
    }

    /**
      * Gets the value of the 'one' field.
      * @return The value.
      */
    public org.apache.avro.test.specialtypes.Boolean getOne() {
      return one;
    }

    /**
      * Gets the value of the 'one' field as an Optional&lt;org.apache.avro.test.specialtypes.Boolean&gt;.
      * @return The value wrapped in an Optional&lt;org.apache.avro.test.specialtypes.Boolean&gt;.
      */
    public Optional<org.apache.avro.test.specialtypes.Boolean> getOptionalOne() {
      return Optional.<org.apache.avro.test.specialtypes.Boolean>ofNullable(one);
    }

    /**
      * Sets the value of the 'one' field.
      * @param value The value of 'one'.
      * @return This builder.
      */
    public org.apache.avro.test.specialtypes.Types.Builder setOne(org.apache.avro.test.specialtypes.Boolean value) {
      validate(fields()[0], value);
      this.one = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'one' field has been set.
      * @return True if the 'one' field has been set, false otherwise.
      */
    public boolean hasOne() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'one' field.
      * @return This builder.
      */
    public org.apache.avro.test.specialtypes.Types.Builder clearOne() {
      one = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
      * Gets the value of the 'two' field.
      * @return The value.
      */
    public org.apache.avro.test.specialtypes.builder getTwo() {
      return two;
    }

    /**
      * Gets the value of the 'two' field as an Optional&lt;org.apache.avro.test.specialtypes.builder&gt;.
      * @return The value wrapped in an Optional&lt;org.apache.avro.test.specialtypes.builder&gt;.
      */
    public Optional<org.apache.avro.test.specialtypes.builder> getOptionalTwo() {
      return Optional.<org.apache.avro.test.specialtypes.builder>ofNullable(two);
    }

    /**
      * Sets the value of the 'two' field.
      * @param value The value of 'two'.
      * @return This builder.
      */
    public org.apache.avro.test.specialtypes.Types.Builder setTwo(org.apache.avro.test.specialtypes.builder value) {
      validate(fields()[1], value);
      this.twoBuilder = null;
      this.two = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'two' field has been set.
      * @return True if the 'two' field has been set, false otherwise.
      */
    public boolean hasTwo() {
      return fieldSetFlags()[1];
    }

    /**
     * Gets the Builder instance for the 'two' field and creates one if it doesn't exist yet.
     * @return This builder.
     */
    public org.apache.avro.test.specialtypes.builder.Builder getTwoBuilder() {
      if (twoBuilder == null) {
        if (hasTwo()) {
          setTwoBuilder(org.apache.avro.test.specialtypes.builder.newBuilder(two));
        } else {
          setTwoBuilder(org.apache.avro.test.specialtypes.builder.newBuilder());
        }
      }
      return twoBuilder;
    }

    /**
     * Sets the Builder instance for the 'two' field
     * @param value The builder instance that must be set.
     * @return This builder.
     */
    public org.apache.avro.test.specialtypes.Types.Builder setTwoBuilder(org.apache.avro.test.specialtypes.builder.Builder value) {
      clearTwo();
      twoBuilder = value;
      return this;
    }

    /**
     * Checks whether the 'two' field has an active Builder instance
     * @return True if the 'two' field has an active Builder instance
     */
    public boolean hasTwoBuilder() {
      return twoBuilder != null;
    }

    /**
      * Clears the value of the 'two' field.
      * @return This builder.
      */
    public org.apache.avro.test.specialtypes.Types.Builder clearTwo() {
      two = null;
      twoBuilder = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /**
      * Gets the value of the 'three' field.
      * @return The value.
      */
    public org.apache.avro.test.specialtypes.Builder$ getThree() {
      return three;
    }

    /**
      * Gets the value of the 'three' field as an Optional&lt;org.apache.avro.test.specialtypes.Builder$&gt;.
      * @return The value wrapped in an Optional&lt;org.apache.avro.test.specialtypes.Builder$&gt;.
      */
    public Optional<org.apache.avro.test.specialtypes.Builder$> getOptionalThree() {
      return Optional.<org.apache.avro.test.specialtypes.Builder$>ofNullable(three);
    }

    /**
      * Sets the value of the 'three' field.
      * @param value The value of 'three'.
      * @return This builder.
      */
    public org.apache.avro.test.specialtypes.Types.Builder setThree(org.apache.avro.test.specialtypes.Builder$ value) {
      validate(fields()[2], value);
      this.threeBuilder = null;
      this.three = value;
      fieldSetFlags()[2] = true;
      return this;
    }

    /**
      * Checks whether the 'three' field has been set.
      * @return True if the 'three' field has been set, false otherwise.
      */
    public boolean hasThree() {
      return fieldSetFlags()[2];
    }

    /**
     * Gets the Builder instance for the 'three' field and creates one if it doesn't exist yet.
     * @return This builder.
     */
    public org.apache.avro.test.specialtypes.Builder$.Builder getThreeBuilder() {
      if (threeBuilder == null) {
        if (hasThree()) {
          setThreeBuilder(org.apache.avro.test.specialtypes.Builder$.newBuilder(three));
        } else {
          setThreeBuilder(org.apache.avro.test.specialtypes.Builder$.newBuilder());
        }
      }
      return threeBuilder;
    }

    /**
     * Sets the Builder instance for the 'three' field
     * @param value The builder instance that must be set.
     * @return This builder.
     */
    public org.apache.avro.test.specialtypes.Types.Builder setThreeBuilder(org.apache.avro.test.specialtypes.Builder$.Builder value) {
      clearThree();
      threeBuilder = value;
      return this;
    }

    /**
     * Checks whether the 'three' field has an active Builder instance
     * @return True if the 'three' field has an active Builder instance
     */
    public boolean hasThreeBuilder() {
      return threeBuilder != null;
    }

    /**
      * Clears the value of the 'three' field.
      * @return This builder.
      */
    public org.apache.avro.test.specialtypes.Types.Builder clearThree() {
      three = null;
      threeBuilder = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    /**
      * Gets the value of the 'four' field.
      * @return The value.
      */
    public org.apache.avro.test.specialtypes.builderBuilder getFour() {
      return four;
    }

    /**
      * Gets the value of the 'four' field as an Optional&lt;org.apache.avro.test.specialtypes.builderBuilder&gt;.
      * @return The value wrapped in an Optional&lt;org.apache.avro.test.specialtypes.builderBuilder&gt;.
      */
    public Optional<org.apache.avro.test.specialtypes.builderBuilder> getOptionalFour() {
      return Optional.<org.apache.avro.test.specialtypes.builderBuilder>ofNullable(four);
    }

    /**
      * Sets the value of the 'four' field.
      * @param value The value of 'four'.
      * @return This builder.
      */
    public org.apache.avro.test.specialtypes.Types.Builder setFour(org.apache.avro.test.specialtypes.builderBuilder value) {
      validate(fields()[3], value);
      this.fourBuilder = null;
      this.four = value;
      fieldSetFlags()[3] = true;
      return this;
    }

    /**
      * Checks whether the 'four' field has been set.
      * @return True if the 'four' field has been set, false otherwise.
      */
    public boolean hasFour() {
      return fieldSetFlags()[3];
    }

    /**
     * Gets the Builder instance for the 'four' field and creates one if it doesn't exist yet.
     * @return This builder.
     */
    public org.apache.avro.test.specialtypes.builderBuilder.Builder getFourBuilder() {
      if (fourBuilder == null) {
        if (hasFour()) {
          setFourBuilder(org.apache.avro.test.specialtypes.builderBuilder.newBuilder(four));
        } else {
          setFourBuilder(org.apache.avro.test.specialtypes.builderBuilder.newBuilder());
        }
      }
      return fourBuilder;
    }

    /**
     * Sets the Builder instance for the 'four' field
     * @param value The builder instance that must be set.
     * @return This builder.
     */
    public org.apache.avro.test.specialtypes.Types.Builder setFourBuilder(org.apache.avro.test.specialtypes.builderBuilder.Builder value) {
      clearFour();
      fourBuilder = value;
      return this;
    }

    /**
     * Checks whether the 'four' field has an active Builder instance
     * @return True if the 'four' field has an active Builder instance
     */
    public boolean hasFourBuilder() {
      return fourBuilder != null;
    }

    /**
      * Clears the value of the 'four' field.
      * @return This builder.
      */
    public org.apache.avro.test.specialtypes.Types.Builder clearFour() {
      four = null;
      fourBuilder = null;
      fieldSetFlags()[3] = false;
      return this;
    }

    /**
      * Gets the value of the 'five' field.
      * @return The value.
      */
    public org.apache.avro.test.specialtypes.String getFive() {
      return five;
    }

    /**
      * Gets the value of the 'five' field as an Optional&lt;org.apache.avro.test.specialtypes.String&gt;.
      * @return The value wrapped in an Optional&lt;org.apache.avro.test.specialtypes.String&gt;.
      */
    public Optional<org.apache.avro.test.specialtypes.String> getOptionalFive() {
      return Optional.<org.apache.avro.test.specialtypes.String>ofNullable(five);
    }

    /**
      * Sets the value of the 'five' field.
      * @param value The value of 'five'.
      * @return This builder.
      */
    public org.apache.avro.test.specialtypes.Types.Builder setFive(org.apache.avro.test.specialtypes.String value) {
      validate(fields()[4], value);
      this.fiveBuilder = null;
      this.five = value;
      fieldSetFlags()[4] = true;
      return this;
    }

    /**
      * Checks whether the 'five' field has been set.
      * @return True if the 'five' field has been set, false otherwise.
      */
    public boolean hasFive() {
      return fieldSetFlags()[4];
    }

    /**
     * Gets the Builder instance for the 'five' field and creates one if it doesn't exist yet.
     * @return This builder.
     */
    public org.apache.avro.test.specialtypes.String.Builder getFiveBuilder() {
      if (fiveBuilder == null) {
        if (hasFive()) {
          setFiveBuilder(org.apache.avro.test.specialtypes.String.newBuilder(five));
        } else {
          setFiveBuilder(org.apache.avro.test.specialtypes.String.newBuilder());
        }
      }
      return fiveBuilder;
    }

    /**
     * Sets the Builder instance for the 'five' field
     * @param value The builder instance that must be set.
     * @return This builder.
     */
    public org.apache.avro.test.specialtypes.Types.Builder setFiveBuilder(org.apache.avro.test.specialtypes.String.Builder value) {
      clearFive();
      fiveBuilder = value;
      return this;
    }

    /**
     * Checks whether the 'five' field has an active Builder instance
     * @return True if the 'five' field has an active Builder instance
     */
    public boolean hasFiveBuilder() {
      return fiveBuilder != null;
    }

    /**
      * Clears the value of the 'five' field.
      * @return This builder.
      */
    public org.apache.avro.test.specialtypes.Types.Builder clearFive() {
      five = null;
      fiveBuilder = null;
      fieldSetFlags()[4] = false;
      return this;
    }

    /**
      * Gets the value of the 'six' field.
      * @return The value.
      */
    public org.apache.avro.test.specialtypes.value getSix() {
      return six;
    }

    /**
      * Gets the value of the 'six' field as an Optional&lt;org.apache.avro.test.specialtypes.value&gt;.
      * @return The value wrapped in an Optional&lt;org.apache.avro.test.specialtypes.value&gt;.
      */
    public Optional<org.apache.avro.test.specialtypes.value> getOptionalSix() {
      return Optional.<org.apache.avro.test.specialtypes.value>ofNullable(six);
    }

    /**
      * Sets the value of the 'six' field.
      * @param value The value of 'six'.
      * @return This builder.
      */
    public org.apache.avro.test.specialtypes.Types.Builder setSix(org.apache.avro.test.specialtypes.value value) {
      validate(fields()[5], value);
      this.sixBuilder = null;
      this.six = value;
      fieldSetFlags()[5] = true;
      return this;
    }

    /**
      * Checks whether the 'six' field has been set.
      * @return True if the 'six' field has been set, false otherwise.
      */
    public boolean hasSix() {
      return fieldSetFlags()[5];
    }

    /**
     * Gets the Builder instance for the 'six' field and creates one if it doesn't exist yet.
     * @return This builder.
     */
    public org.apache.avro.test.specialtypes.value.Builder getSixBuilder() {
      if (sixBuilder == null) {
        if (hasSix()) {
          setSixBuilder(org.apache.avro.test.specialtypes.value.newBuilder(six));
        } else {
          setSixBuilder(org.apache.avro.test.specialtypes.value.newBuilder());
        }
      }
      return sixBuilder;
    }

    /**
     * Sets the Builder instance for the 'six' field
     * @param value The builder instance that must be set.
     * @return This builder.
     */
    public org.apache.avro.test.specialtypes.Types.Builder setSixBuilder(org.apache.avro.test.specialtypes.value.Builder value) {
      clearSix();
      sixBuilder = value;
      return this;
    }

    /**
     * Checks whether the 'six' field has an active Builder instance
     * @return True if the 'six' field has an active Builder instance
     */
    public boolean hasSixBuilder() {
      return sixBuilder != null;
    }

    /**
      * Clears the value of the 'six' field.
      * @return This builder.
      */
    public org.apache.avro.test.specialtypes.Types.Builder clearSix() {
      six = null;
      sixBuilder = null;
      fieldSetFlags()[5] = false;
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    public Types build() {
      try {
        Types record = new Types();
        record.one = fieldSetFlags()[0] ? this.one : (org.apache.avro.test.specialtypes.Boolean) defaultValue(fields()[0]);
        if (twoBuilder != null) {
          try {
            record.two = this.twoBuilder.build();
          } catch (org.apache.avro.AvroMissingFieldException e) {
            e.addParentField(record.getSchema().getField("two"));
            throw e;
          }
        } else {
          record.two = fieldSetFlags()[1] ? this.two : (org.apache.avro.test.specialtypes.builder) defaultValue(fields()[1]);
        }
        if (threeBuilder != null) {
          try {
            record.three = this.threeBuilder.build();
          } catch (org.apache.avro.AvroMissingFieldException e) {
            e.addParentField(record.getSchema().getField("three"));
            throw e;
          }
        } else {
          record.three = fieldSetFlags()[2] ? this.three : (org.apache.avro.test.specialtypes.Builder$) defaultValue(fields()[2]);
        }
        if (fourBuilder != null) {
          try {
            record.four = this.fourBuilder.build();
          } catch (org.apache.avro.AvroMissingFieldException e) {
            e.addParentField(record.getSchema().getField("four"));
            throw e;
          }
        } else {
          record.four = fieldSetFlags()[3] ? this.four : (org.apache.avro.test.specialtypes.builderBuilder) defaultValue(fields()[3]);
        }
        if (fiveBuilder != null) {
          try {
            record.five = this.fiveBuilder.build();
          } catch (org.apache.avro.AvroMissingFieldException e) {
            e.addParentField(record.getSchema().getField("five"));
            throw e;
          }
        } else {
          record.five = fieldSetFlags()[4] ? this.five : (org.apache.avro.test.specialtypes.String) defaultValue(fields()[4]);
        }
        if (sixBuilder != null) {
          try {
            record.six = this.sixBuilder.build();
          } catch (org.apache.avro.AvroMissingFieldException e) {
            e.addParentField(record.getSchema().getField("six"));
            throw e;
          }
        } else {
          record.six = fieldSetFlags()[5] ? this.six : (org.apache.avro.test.specialtypes.value) defaultValue(fields()[5]);
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
  private static final org.apache.avro.io.DatumWriter<Types>
    WRITER$ = (org.apache.avro.io.DatumWriter<Types>)MODEL$.createDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumReader<Types>
    READER$ = (org.apache.avro.io.DatumReader<Types>)MODEL$.createDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

  @Override protected boolean hasCustomCoders() { return true; }

  @Override public void customEncode(org.apache.avro.io.Encoder out)
    throws java.io.IOException
  {
    out.writeEnum(this.one.ordinal());

    this.two.customEncode(out);

    this.three.customEncode(out);

    this.four.customEncode(out);

    this.five.customEncode(out);

    this.six.customEncode(out);

  }

  @Override public void customDecode(org.apache.avro.io.ResolvingDecoder in)
    throws java.io.IOException
  {
    org.apache.avro.Schema.Field[] fieldOrder = in.readFieldOrderIfDiff();
    if (fieldOrder == null) {
      this.one = org.apache.avro.test.specialtypes.Boolean.values()[in.readEnum()];

      if (this.two == null) {
        this.two = new org.apache.avro.test.specialtypes.builder();
      }
      this.two.customDecode(in);

      if (this.three == null) {
        this.three = new org.apache.avro.test.specialtypes.Builder$();
      }
      this.three.customDecode(in);

      if (this.four == null) {
        this.four = new org.apache.avro.test.specialtypes.builderBuilder();
      }
      this.four.customDecode(in);

      if (this.five == null) {
        this.five = new org.apache.avro.test.specialtypes.String();
      }
      this.five.customDecode(in);

      if (this.six == null) {
        this.six = new org.apache.avro.test.specialtypes.value();
      }
      this.six.customDecode(in);

    } else {
      for (int i = 0; i < 6; i++) {
        switch (fieldOrder[i].pos()) {
        case 0:
          this.one = org.apache.avro.test.specialtypes.Boolean.values()[in.readEnum()];
          break;

        case 1:
          if (this.two == null) {
            this.two = new org.apache.avro.test.specialtypes.builder();
          }
          this.two.customDecode(in);
          break;

        case 2:
          if (this.three == null) {
            this.three = new org.apache.avro.test.specialtypes.Builder$();
          }
          this.three.customDecode(in);
          break;

        case 3:
          if (this.four == null) {
            this.four = new org.apache.avro.test.specialtypes.builderBuilder();
          }
          this.four.customDecode(in);
          break;

        case 4:
          if (this.five == null) {
            this.five = new org.apache.avro.test.specialtypes.String();
          }
          this.five.customDecode(in);
          break;

        case 5:
          if (this.six == null) {
            this.six = new org.apache.avro.test.specialtypes.value();
          }
          this.six.customDecode(in);
          break;

        default:
          throw new java.io.IOException("Corrupt ResolvingDecoder.");
        }
      }
    }
  }
}










