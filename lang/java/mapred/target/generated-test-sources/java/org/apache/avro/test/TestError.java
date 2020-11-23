/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */
package org.apache.avro.test;

import org.apache.avro.generic.GenericArray;
import org.apache.avro.specific.SpecificData;
import org.apache.avro.util.Utf8;

@org.apache.avro.specific.AvroGenerated
public class TestError extends org.apache.avro.specific.SpecificExceptionBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = 6283908527314045615L;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"error\",\"name\":\"TestError\",\"namespace\":\"org.apache.avro.test\",\"fields\":[{\"name\":\"message\",\"type\":\"string\"}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }

  private static SpecificData MODEL$ = new SpecificData();


   private java.lang.CharSequence message$;

  public TestError() {
    super();
  }

  public TestError(Object value) {
    super(value);
  }

  public TestError(Throwable cause) {
    super(cause);
  }

  public TestError(Object value, Throwable cause) {
    super(value, cause);
  }

  public org.apache.avro.specific.SpecificData getSpecificData() { return MODEL$; }
  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return message$;
    default: throw new IndexOutOfBoundsException("Invalid index: " + field$);
    }
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: message$ = (java.lang.CharSequence)value$; break;
    default: throw new IndexOutOfBoundsException("Invalid index: " + field$);
    }
  }

  /**
   * Gets the value of the 'message$' field.
   * @return The value of the 'message$' field.
   */
  public java.lang.CharSequence getMessage$() {
    return message$;
  }


  /**
   * Sets the value of the 'message$' field.
   * @param value the value to set.
   */
  public void setMessage$(java.lang.CharSequence value) {
    this.message$ = value;
  }

  /**
   * Creates a new TestError RecordBuilder.
   * @return A new TestError RecordBuilder
   */
  public static org.apache.avro.test.TestError.Builder newBuilder() {
    return new org.apache.avro.test.TestError.Builder();
  }

  /**
   * Creates a new TestError RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new TestError RecordBuilder
   */
  public static org.apache.avro.test.TestError.Builder newBuilder(org.apache.avro.test.TestError.Builder other) {
    if (other == null) {
      return new org.apache.avro.test.TestError.Builder();
    } else {
      return new org.apache.avro.test.TestError.Builder(other);
    }
  }

  /**
   * Creates a new TestError RecordBuilder by copying an existing TestError instance.
   * @param other The existing instance to copy.
   * @return A new TestError RecordBuilder
   */
  public static org.apache.avro.test.TestError.Builder newBuilder(org.apache.avro.test.TestError other) {
    if (other == null) {
      return new org.apache.avro.test.TestError.Builder();
    } else {
      return new org.apache.avro.test.TestError.Builder(other);
    }
  }

  /**
   * RecordBuilder for TestError instances.
   */
  @org.apache.avro.specific.AvroGenerated
  public static class Builder extends org.apache.avro.specific.SpecificErrorBuilderBase<TestError>
    implements org.apache.avro.data.ErrorBuilder<TestError> {

    private java.lang.CharSequence message$;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(org.apache.avro.test.TestError.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.message$)) {
        this.message$ = data().deepCopy(fields()[0].schema(), other.message$);
        fieldSetFlags()[0] = other.fieldSetFlags()[0];
      }
    }

    /**
     * Creates a Builder by copying an existing TestError instance
     * @param other The existing instance to copy.
     */
    private Builder(org.apache.avro.test.TestError other) {
      super(other);
      if (isValidValue(fields()[0], other.message$)) {
        this.message$ = data().deepCopy(fields()[0].schema(), other.message$);
        fieldSetFlags()[0] = true;
      }
    }

    @Override
    public org.apache.avro.test.TestError.Builder setValue(Object value) {
      super.setValue(value);
      return this;
    }

    @Override
    public org.apache.avro.test.TestError.Builder clearValue() {
      super.clearValue();
      return this;
    }

    @Override
    public org.apache.avro.test.TestError.Builder setCause(Throwable cause) {
      super.setCause(cause);
      return this;
    }

    @Override
    public org.apache.avro.test.TestError.Builder clearCause() {
      super.clearCause();
      return this;
    }

    /**
      * Gets the value of the 'message$' field.
      * @return The value.
      */
    public java.lang.CharSequence getMessage$() {
      return message$;
    }


    /**
      * Sets the value of the 'message$' field.
      * @param value The value of 'message$'.
      * @return This builder.
      */
    public org.apache.avro.test.TestError.Builder setMessage$(java.lang.CharSequence value) {
      validate(fields()[0], value);
      this.message$ = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'message$' field has been set.
      * @return True if the 'message$' field has been set, false otherwise.
      */
    public boolean hasMessage$() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'message$' field.
      * @return This builder.
      */
    public org.apache.avro.test.TestError.Builder clearMessage$() {
      message$ = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    public TestError build() {
      try {
        TestError record = new TestError(getValue(), getCause());
        record.message$ = fieldSetFlags()[0] ? this.message$ : (java.lang.CharSequence) defaultValue(fields()[0]);
        return record;
      } catch (org.apache.avro.AvroMissingFieldException e) {
        throw e;
      } catch (java.lang.Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumWriter<TestError>
    WRITER$ = (org.apache.avro.io.DatumWriter<TestError>)MODEL$.createDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumReader<TestError>
    READER$ = (org.apache.avro.io.DatumReader<TestError>)MODEL$.createDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

}










