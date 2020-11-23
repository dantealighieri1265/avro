/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */
package org.apache.avro.ipc.specific;

import org.apache.avro.generic.GenericArray;
import org.apache.avro.specific.SpecificData;
import org.apache.avro.util.Utf8;
import org.apache.avro.message.BinaryMessageEncoder;
import org.apache.avro.message.BinaryMessageDecoder;
import org.apache.avro.message.SchemaStore;
import java.util.Optional;
@org.apache.avro.specific.AvroGenerated
public class PageView extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = 5157803860551079723L;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"PageView\",\"namespace\":\"org.apache.avro.ipc.specific\",\"fields\":[{\"name\":\"datetime\",\"type\":\"long\"},{\"name\":\"pageContext\",\"type\":[{\"type\":\"record\",\"name\":\"UnknownPage\",\"fields\":[]},{\"type\":\"record\",\"name\":\"HomePage\",\"fields\":[]},{\"type\":\"record\",\"name\":\"ProductPage\",\"fields\":[{\"name\":\"product\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}}]},{\"type\":\"record\",\"name\":\"CartPage\",\"fields\":[{\"name\":\"productsInCart\",\"type\":{\"type\":\"array\",\"items\":{\"type\":\"string\",\"avro.java.string\":\"String\"}}}]}]}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }

  private static SpecificData MODEL$ = new SpecificData();

  private static final BinaryMessageEncoder<PageView> ENCODER =
      new BinaryMessageEncoder<PageView>(MODEL$, SCHEMA$);

  private static final BinaryMessageDecoder<PageView> DECODER =
      new BinaryMessageDecoder<PageView>(MODEL$, SCHEMA$);

  /**
   * Return the BinaryMessageEncoder instance used by this class.
   * @return the message encoder used by this class
   */
  public static BinaryMessageEncoder<PageView> getEncoder() {
    return ENCODER;
  }

  /**
   * Return the BinaryMessageDecoder instance used by this class.
   * @return the message decoder used by this class
   */
  public static BinaryMessageDecoder<PageView> getDecoder() {
    return DECODER;
  }

  /**
   * Create a new BinaryMessageDecoder instance for this class that uses the specified {@link SchemaStore}.
   * @param resolver a {@link SchemaStore} used to find schemas by fingerprint
   * @return a BinaryMessageDecoder instance for this class backed by the given SchemaStore
   */
  public static BinaryMessageDecoder<PageView> createDecoder(SchemaStore resolver) {
    return new BinaryMessageDecoder<PageView>(MODEL$, SCHEMA$, resolver);
  }

  /**
   * Serializes this PageView to a ByteBuffer.
   * @return a buffer holding the serialized data for this instance
   * @throws java.io.IOException if this instance could not be serialized
   */
  public java.nio.ByteBuffer toByteBuffer() throws java.io.IOException {
    return ENCODER.encode(this);
  }

  /**
   * Deserializes a PageView from a ByteBuffer.
   * @param b a byte buffer holding serialized data for an instance of this class
   * @return a PageView instance decoded from the given buffer
   * @throws java.io.IOException if the given bytes could not be deserialized into an instance of this class
   */
  public static PageView fromByteBuffer(
      java.nio.ByteBuffer b) throws java.io.IOException {
    return DECODER.decode(b);
  }

   private long datetime;
   private java.lang.Object pageContext;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public PageView() {}

  /**
   * All-args constructor.
   * @param datetime The new value for datetime
   * @param pageContext The new value for pageContext
   */
  public PageView(java.lang.Long datetime, java.lang.Object pageContext) {
    this.datetime = datetime;
    this.pageContext = pageContext;
  }

  public org.apache.avro.specific.SpecificData getSpecificData() { return MODEL$; }
  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return datetime;
    case 1: return pageContext;
    default: throw new IndexOutOfBoundsException("Invalid index: " + field$);
    }
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: datetime = (java.lang.Long)value$; break;
    case 1: pageContext = value$; break;
    default: throw new IndexOutOfBoundsException("Invalid index: " + field$);
    }
  }

  /**
   * Gets the value of the 'datetime' field.
   * @return The value of the 'datetime' field.
   */
  public long getDatetime() {
    return datetime;
  }

  /**
   * Gets the value of the 'datetime' field as an Optional&lt;java.lang.Long&gt;.
   * @return The value wrapped in an Optional&lt;java.lang.Long&gt;.
   */
  public Optional<java.lang.Long> getOptionalDatetime() {
    return Optional.<java.lang.Long>ofNullable(datetime);
  }

  /**
   * Sets the value of the 'datetime' field.
   * @param value the value to set.
   */
  public void setDatetime(long value) {
    this.datetime = value;
  }

  /**
   * Gets the value of the 'pageContext' field.
   * @return The value of the 'pageContext' field.
   */
  public java.lang.Object getPageContext() {
    return pageContext;
  }

  /**
   * Gets the value of the 'pageContext' field as an Optional&lt;java.lang.Object&gt;.
   * @return The value wrapped in an Optional&lt;java.lang.Object&gt;.
   */
  public Optional<java.lang.Object> getOptionalPageContext() {
    return Optional.<java.lang.Object>ofNullable(pageContext);
  }

  /**
   * Sets the value of the 'pageContext' field.
   * @param value the value to set.
   */
  public void setPageContext(java.lang.Object value) {
    this.pageContext = value;
  }

  /**
   * Creates a new PageView RecordBuilder.
   * @return A new PageView RecordBuilder
   */
  public static org.apache.avro.ipc.specific.PageView.Builder newBuilder() {
    return new org.apache.avro.ipc.specific.PageView.Builder();
  }

  /**
   * Creates a new PageView RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new PageView RecordBuilder
   */
  public static org.apache.avro.ipc.specific.PageView.Builder newBuilder(org.apache.avro.ipc.specific.PageView.Builder other) {
    if (other == null) {
      return new org.apache.avro.ipc.specific.PageView.Builder();
    } else {
      return new org.apache.avro.ipc.specific.PageView.Builder(other);
    }
  }

  /**
   * Creates a new PageView RecordBuilder by copying an existing PageView instance.
   * @param other The existing instance to copy.
   * @return A new PageView RecordBuilder
   */
  public static org.apache.avro.ipc.specific.PageView.Builder newBuilder(org.apache.avro.ipc.specific.PageView other) {
    if (other == null) {
      return new org.apache.avro.ipc.specific.PageView.Builder();
    } else {
      return new org.apache.avro.ipc.specific.PageView.Builder(other);
    }
  }

  /**
   * RecordBuilder for PageView instances.
   */
  @org.apache.avro.specific.AvroGenerated
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<PageView>
    implements org.apache.avro.data.RecordBuilder<PageView> {

    private long datetime;
    private java.lang.Object pageContext;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(org.apache.avro.ipc.specific.PageView.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.datetime)) {
        this.datetime = data().deepCopy(fields()[0].schema(), other.datetime);
        fieldSetFlags()[0] = other.fieldSetFlags()[0];
      }
      if (isValidValue(fields()[1], other.pageContext)) {
        this.pageContext = data().deepCopy(fields()[1].schema(), other.pageContext);
        fieldSetFlags()[1] = other.fieldSetFlags()[1];
      }
    }

    /**
     * Creates a Builder by copying an existing PageView instance
     * @param other The existing instance to copy.
     */
    private Builder(org.apache.avro.ipc.specific.PageView other) {
      super(SCHEMA$);
      if (isValidValue(fields()[0], other.datetime)) {
        this.datetime = data().deepCopy(fields()[0].schema(), other.datetime);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.pageContext)) {
        this.pageContext = data().deepCopy(fields()[1].schema(), other.pageContext);
        fieldSetFlags()[1] = true;
      }
    }

    /**
      * Gets the value of the 'datetime' field.
      * @return The value.
      */
    public long getDatetime() {
      return datetime;
    }

    /**
      * Gets the value of the 'datetime' field as an Optional&lt;java.lang.Long&gt;.
      * @return The value wrapped in an Optional&lt;java.lang.Long&gt;.
      */
    public Optional<java.lang.Long> getOptionalDatetime() {
      return Optional.<java.lang.Long>ofNullable(datetime);
    }

    /**
      * Sets the value of the 'datetime' field.
      * @param value The value of 'datetime'.
      * @return This builder.
      */
    public org.apache.avro.ipc.specific.PageView.Builder setDatetime(long value) {
      validate(fields()[0], value);
      this.datetime = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'datetime' field has been set.
      * @return True if the 'datetime' field has been set, false otherwise.
      */
    public boolean hasDatetime() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'datetime' field.
      * @return This builder.
      */
    public org.apache.avro.ipc.specific.PageView.Builder clearDatetime() {
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
      * Gets the value of the 'pageContext' field.
      * @return The value.
      */
    public java.lang.Object getPageContext() {
      return pageContext;
    }

    /**
      * Gets the value of the 'pageContext' field as an Optional&lt;java.lang.Object&gt;.
      * @return The value wrapped in an Optional&lt;java.lang.Object&gt;.
      */
    public Optional<java.lang.Object> getOptionalPageContext() {
      return Optional.<java.lang.Object>ofNullable(pageContext);
    }

    /**
      * Sets the value of the 'pageContext' field.
      * @param value The value of 'pageContext'.
      * @return This builder.
      */
    public org.apache.avro.ipc.specific.PageView.Builder setPageContext(java.lang.Object value) {
      validate(fields()[1], value);
      this.pageContext = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'pageContext' field has been set.
      * @return True if the 'pageContext' field has been set, false otherwise.
      */
    public boolean hasPageContext() {
      return fieldSetFlags()[1];
    }


    /**
      * Clears the value of the 'pageContext' field.
      * @return This builder.
      */
    public org.apache.avro.ipc.specific.PageView.Builder clearPageContext() {
      pageContext = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    public PageView build() {
      try {
        PageView record = new PageView();
        record.datetime = fieldSetFlags()[0] ? this.datetime : (java.lang.Long) defaultValue(fields()[0]);
        record.pageContext = fieldSetFlags()[1] ? this.pageContext :  defaultValue(fields()[1]);
        return record;
      } catch (org.apache.avro.AvroMissingFieldException e) {
        throw e;
      } catch (java.lang.Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumWriter<PageView>
    WRITER$ = (org.apache.avro.io.DatumWriter<PageView>)MODEL$.createDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumReader<PageView>
    READER$ = (org.apache.avro.io.DatumReader<PageView>)MODEL$.createDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

}










