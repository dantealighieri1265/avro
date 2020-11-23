/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */
package org.apache.avro.echo;

import org.apache.avro.generic.GenericArray;
import org.apache.avro.specific.SpecificData;
import org.apache.avro.util.Utf8;
import org.apache.avro.message.BinaryMessageEncoder;
import org.apache.avro.message.BinaryMessageDecoder;
import org.apache.avro.message.SchemaStore;
import java.util.Optional;
@org.apache.avro.specific.AvroGenerated
public class Pong extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = 7016708463525776610L;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"Pong\",\"namespace\":\"org.apache.avro.echo\",\"fields\":[{\"name\":\"timestamp\",\"type\":\"long\",\"default\":-1},{\"name\":\"ping\",\"type\":{\"type\":\"record\",\"name\":\"Ping\",\"fields\":[{\"name\":\"timestamp\",\"type\":\"long\",\"default\":-1},{\"name\":\"text\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"},\"default\":\"\"}]}}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }

  private static SpecificData MODEL$ = new SpecificData();

  private static final BinaryMessageEncoder<Pong> ENCODER =
      new BinaryMessageEncoder<Pong>(MODEL$, SCHEMA$);

  private static final BinaryMessageDecoder<Pong> DECODER =
      new BinaryMessageDecoder<Pong>(MODEL$, SCHEMA$);

  /**
   * Return the BinaryMessageEncoder instance used by this class.
   * @return the message encoder used by this class
   */
  public static BinaryMessageEncoder<Pong> getEncoder() {
    return ENCODER;
  }

  /**
   * Return the BinaryMessageDecoder instance used by this class.
   * @return the message decoder used by this class
   */
  public static BinaryMessageDecoder<Pong> getDecoder() {
    return DECODER;
  }

  /**
   * Create a new BinaryMessageDecoder instance for this class that uses the specified {@link SchemaStore}.
   * @param resolver a {@link SchemaStore} used to find schemas by fingerprint
   * @return a BinaryMessageDecoder instance for this class backed by the given SchemaStore
   */
  public static BinaryMessageDecoder<Pong> createDecoder(SchemaStore resolver) {
    return new BinaryMessageDecoder<Pong>(MODEL$, SCHEMA$, resolver);
  }

  /**
   * Serializes this Pong to a ByteBuffer.
   * @return a buffer holding the serialized data for this instance
   * @throws java.io.IOException if this instance could not be serialized
   */
  public java.nio.ByteBuffer toByteBuffer() throws java.io.IOException {
    return ENCODER.encode(this);
  }

  /**
   * Deserializes a Pong from a ByteBuffer.
   * @param b a byte buffer holding serialized data for an instance of this class
   * @return a Pong instance decoded from the given buffer
   * @throws java.io.IOException if the given bytes could not be deserialized into an instance of this class
   */
  public static Pong fromByteBuffer(
      java.nio.ByteBuffer b) throws java.io.IOException {
    return DECODER.decode(b);
  }

   private long timestamp;
   private org.apache.avro.echo.Ping ping;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public Pong() {}

  /**
   * All-args constructor.
   * @param timestamp The new value for timestamp
   * @param ping The new value for ping
   */
  public Pong(java.lang.Long timestamp, org.apache.avro.echo.Ping ping) {
    this.timestamp = timestamp;
    this.ping = ping;
  }

  public org.apache.avro.specific.SpecificData getSpecificData() { return MODEL$; }
  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return timestamp;
    case 1: return ping;
    default: throw new IndexOutOfBoundsException("Invalid index: " + field$);
    }
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: timestamp = (java.lang.Long)value$; break;
    case 1: ping = (org.apache.avro.echo.Ping)value$; break;
    default: throw new IndexOutOfBoundsException("Invalid index: " + field$);
    }
  }

  /**
   * Gets the value of the 'timestamp' field.
   * @return The value of the 'timestamp' field.
   */
  public long getTimestamp() {
    return timestamp;
  }

  /**
   * Gets the value of the 'timestamp' field as an Optional&lt;java.lang.Long&gt;.
   * @return The value wrapped in an Optional&lt;java.lang.Long&gt;.
   */
  public Optional<java.lang.Long> getOptionalTimestamp() {
    return Optional.<java.lang.Long>ofNullable(timestamp);
  }

  /**
   * Sets the value of the 'timestamp' field.
   * @param value the value to set.
   */
  public void setTimestamp(long value) {
    this.timestamp = value;
  }

  /**
   * Gets the value of the 'ping' field.
   * @return The value of the 'ping' field.
   */
  public org.apache.avro.echo.Ping getPing() {
    return ping;
  }

  /**
   * Gets the value of the 'ping' field as an Optional&lt;org.apache.avro.echo.Ping&gt;.
   * @return The value wrapped in an Optional&lt;org.apache.avro.echo.Ping&gt;.
   */
  public Optional<org.apache.avro.echo.Ping> getOptionalPing() {
    return Optional.<org.apache.avro.echo.Ping>ofNullable(ping);
  }

  /**
   * Sets the value of the 'ping' field.
   * @param value the value to set.
   */
  public void setPing(org.apache.avro.echo.Ping value) {
    this.ping = value;
  }

  /**
   * Creates a new Pong RecordBuilder.
   * @return A new Pong RecordBuilder
   */
  public static org.apache.avro.echo.Pong.Builder newBuilder() {
    return new org.apache.avro.echo.Pong.Builder();
  }

  /**
   * Creates a new Pong RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new Pong RecordBuilder
   */
  public static org.apache.avro.echo.Pong.Builder newBuilder(org.apache.avro.echo.Pong.Builder other) {
    if (other == null) {
      return new org.apache.avro.echo.Pong.Builder();
    } else {
      return new org.apache.avro.echo.Pong.Builder(other);
    }
  }

  /**
   * Creates a new Pong RecordBuilder by copying an existing Pong instance.
   * @param other The existing instance to copy.
   * @return A new Pong RecordBuilder
   */
  public static org.apache.avro.echo.Pong.Builder newBuilder(org.apache.avro.echo.Pong other) {
    if (other == null) {
      return new org.apache.avro.echo.Pong.Builder();
    } else {
      return new org.apache.avro.echo.Pong.Builder(other);
    }
  }

  /**
   * RecordBuilder for Pong instances.
   */
  @org.apache.avro.specific.AvroGenerated
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<Pong>
    implements org.apache.avro.data.RecordBuilder<Pong> {

    private long timestamp;
    private org.apache.avro.echo.Ping ping;
    private org.apache.avro.echo.Ping.Builder pingBuilder;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(org.apache.avro.echo.Pong.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.timestamp)) {
        this.timestamp = data().deepCopy(fields()[0].schema(), other.timestamp);
        fieldSetFlags()[0] = other.fieldSetFlags()[0];
      }
      if (isValidValue(fields()[1], other.ping)) {
        this.ping = data().deepCopy(fields()[1].schema(), other.ping);
        fieldSetFlags()[1] = other.fieldSetFlags()[1];
      }
      if (other.hasPingBuilder()) {
        this.pingBuilder = org.apache.avro.echo.Ping.newBuilder(other.getPingBuilder());
      }
    }

    /**
     * Creates a Builder by copying an existing Pong instance
     * @param other The existing instance to copy.
     */
    private Builder(org.apache.avro.echo.Pong other) {
      super(SCHEMA$);
      if (isValidValue(fields()[0], other.timestamp)) {
        this.timestamp = data().deepCopy(fields()[0].schema(), other.timestamp);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.ping)) {
        this.ping = data().deepCopy(fields()[1].schema(), other.ping);
        fieldSetFlags()[1] = true;
      }
      this.pingBuilder = null;
    }

    /**
      * Gets the value of the 'timestamp' field.
      * @return The value.
      */
    public long getTimestamp() {
      return timestamp;
    }

    /**
      * Gets the value of the 'timestamp' field as an Optional&lt;java.lang.Long&gt;.
      * @return The value wrapped in an Optional&lt;java.lang.Long&gt;.
      */
    public Optional<java.lang.Long> getOptionalTimestamp() {
      return Optional.<java.lang.Long>ofNullable(timestamp);
    }

    /**
      * Sets the value of the 'timestamp' field.
      * @param value The value of 'timestamp'.
      * @return This builder.
      */
    public org.apache.avro.echo.Pong.Builder setTimestamp(long value) {
      validate(fields()[0], value);
      this.timestamp = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'timestamp' field has been set.
      * @return True if the 'timestamp' field has been set, false otherwise.
      */
    public boolean hasTimestamp() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'timestamp' field.
      * @return This builder.
      */
    public org.apache.avro.echo.Pong.Builder clearTimestamp() {
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
      * Gets the value of the 'ping' field.
      * @return The value.
      */
    public org.apache.avro.echo.Ping getPing() {
      return ping;
    }

    /**
      * Gets the value of the 'ping' field as an Optional&lt;org.apache.avro.echo.Ping&gt;.
      * @return The value wrapped in an Optional&lt;org.apache.avro.echo.Ping&gt;.
      */
    public Optional<org.apache.avro.echo.Ping> getOptionalPing() {
      return Optional.<org.apache.avro.echo.Ping>ofNullable(ping);
    }

    /**
      * Sets the value of the 'ping' field.
      * @param value The value of 'ping'.
      * @return This builder.
      */
    public org.apache.avro.echo.Pong.Builder setPing(org.apache.avro.echo.Ping value) {
      validate(fields()[1], value);
      this.pingBuilder = null;
      this.ping = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'ping' field has been set.
      * @return True if the 'ping' field has been set, false otherwise.
      */
    public boolean hasPing() {
      return fieldSetFlags()[1];
    }

    /**
     * Gets the Builder instance for the 'ping' field and creates one if it doesn't exist yet.
     * @return This builder.
     */
    public org.apache.avro.echo.Ping.Builder getPingBuilder() {
      if (pingBuilder == null) {
        if (hasPing()) {
          setPingBuilder(org.apache.avro.echo.Ping.newBuilder(ping));
        } else {
          setPingBuilder(org.apache.avro.echo.Ping.newBuilder());
        }
      }
      return pingBuilder;
    }

    /**
     * Sets the Builder instance for the 'ping' field
     * @param value The builder instance that must be set.
     * @return This builder.
     */
    public org.apache.avro.echo.Pong.Builder setPingBuilder(org.apache.avro.echo.Ping.Builder value) {
      clearPing();
      pingBuilder = value;
      return this;
    }

    /**
     * Checks whether the 'ping' field has an active Builder instance
     * @return True if the 'ping' field has an active Builder instance
     */
    public boolean hasPingBuilder() {
      return pingBuilder != null;
    }

    /**
      * Clears the value of the 'ping' field.
      * @return This builder.
      */
    public org.apache.avro.echo.Pong.Builder clearPing() {
      ping = null;
      pingBuilder = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    public Pong build() {
      try {
        Pong record = new Pong();
        record.timestamp = fieldSetFlags()[0] ? this.timestamp : (java.lang.Long) defaultValue(fields()[0]);
        if (pingBuilder != null) {
          try {
            record.ping = this.pingBuilder.build();
          } catch (org.apache.avro.AvroMissingFieldException e) {
            e.addParentField(record.getSchema().getField("ping"));
            throw e;
          }
        } else {
          record.ping = fieldSetFlags()[1] ? this.ping : (org.apache.avro.echo.Ping) defaultValue(fields()[1]);
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
  private static final org.apache.avro.io.DatumWriter<Pong>
    WRITER$ = (org.apache.avro.io.DatumWriter<Pong>)MODEL$.createDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumReader<Pong>
    READER$ = (org.apache.avro.io.DatumReader<Pong>)MODEL$.createDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

  @Override protected boolean hasCustomCoders() { return true; }

  @Override public void customEncode(org.apache.avro.io.Encoder out)
    throws java.io.IOException
  {
    out.writeLong(this.timestamp);

    this.ping.customEncode(out);

  }

  @Override public void customDecode(org.apache.avro.io.ResolvingDecoder in)
    throws java.io.IOException
  {
    org.apache.avro.Schema.Field[] fieldOrder = in.readFieldOrderIfDiff();
    if (fieldOrder == null) {
      this.timestamp = in.readLong();

      if (this.ping == null) {
        this.ping = new org.apache.avro.echo.Ping();
      }
      this.ping.customDecode(in);

    } else {
      for (int i = 0; i < 2; i++) {
        switch (fieldOrder[i].pos()) {
        case 0:
          this.timestamp = in.readLong();
          break;

        case 1:
          if (this.ping == null) {
            this.ping = new org.apache.avro.echo.Ping();
          }
          this.ping.customDecode(in);
          break;

        default:
          throw new java.io.IOException("Corrupt ResolvingDecoder.");
        }
      }
    }
  }
}










