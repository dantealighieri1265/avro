/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */
package org.apache.avro.test;
@org.apache.avro.TestAnnotation
@org.apache.avro.specific.AvroGenerated
public enum Kind implements org.apache.avro.generic.GenericEnumSymbol<Kind> {
  FOO, BAR, BAZ  ;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"enum\",\"name\":\"Kind\",\"namespace\":\"org.apache.avro.test\",\"symbols\":[\"FOO\",\"BAR\",\"BAZ\"],\"javaAnnotation\":\"org.apache.avro.TestAnnotation\"}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }
  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
}