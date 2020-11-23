/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */
package org.apache.avro.test;

@org.apache.avro.specific.AvroGenerated
public interface Mail {
  public static final org.apache.avro.Protocol PROTOCOL = org.apache.avro.Protocol.parse("{\"protocol\":\"Mail\",\"namespace\":\"org.apache.avro.test\",\"types\":[{\"type\":\"record\",\"name\":\"Message\",\"fields\":[{\"name\":\"to\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},{\"name\":\"from\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},{\"name\":\"body\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}}]}],\"messages\":{\"send\":{\"request\":[{\"name\":\"message\",\"type\":\"Message\"}],\"response\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},\"fireandforget\":{\"request\":[{\"name\":\"message\",\"type\":\"Message\"}],\"response\":\"null\",\"one-way\":true}}}");
  /**
   */
  java.lang.String send(org.apache.avro.test.Message message);
  /**
   */
  void fireandforget(org.apache.avro.test.Message message);

  @SuppressWarnings("all")
  public interface Callback extends Mail {
    public static final org.apache.avro.Protocol PROTOCOL = org.apache.avro.test.Mail.PROTOCOL;
    /**
     * @throws java.io.IOException The async call could not be completed.
     */
    void send(org.apache.avro.test.Message message, org.apache.avro.ipc.Callback<java.lang.String> callback) throws java.io.IOException;
  }
}