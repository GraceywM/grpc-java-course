// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: greet/greet.proto

package com.proto.greet;

/**
 * Protobuf type {@code greet.GreetingManyTimesResponse}
 */
public  final class GreetingManyTimesResponse extends
    com.google.protobuf.GeneratedMessageLite<
        GreetingManyTimesResponse, GreetingManyTimesResponse.Builder> implements
    // @@protoc_insertion_point(message_implements:greet.GreetingManyTimesResponse)
    GreetingManyTimesResponseOrBuilder {
  private GreetingManyTimesResponse() {
    result_ = "";
  }
  public static final int RESULT_FIELD_NUMBER = 1;
  private java.lang.String result_;
  /**
   * <code>string result = 1;</code>
   * @return The result.
   */
  @java.lang.Override
  public java.lang.String getResult() {
    return result_;
  }
  /**
   * <code>string result = 1;</code>
   * @return The bytes for result.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getResultBytes() {
    return com.google.protobuf.ByteString.copyFromUtf8(result_);
  }
  /**
   * <code>string result = 1;</code>
   * @param value The result to set.
   */
  private void setResult(
      java.lang.String value) {
    java.lang.Class<?> valueClass = value.getClass();
  
    result_ = value;
  }
  /**
   * <code>string result = 1;</code>
   */
  private void clearResult() {
    
    result_ = getDefaultInstance().getResult();
  }
  /**
   * <code>string result = 1;</code>
   * @param value The bytes for result to set.
   */
  private void setResultBytes(
      com.google.protobuf.ByteString value) {
    checkByteStringIsUtf8(value);
    result_ = value.toStringUtf8();
    
  }

  public static com.proto.greet.GreetingManyTimesResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static com.proto.greet.GreetingManyTimesResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static com.proto.greet.GreetingManyTimesResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static com.proto.greet.GreetingManyTimesResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static com.proto.greet.GreetingManyTimesResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static com.proto.greet.GreetingManyTimesResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static com.proto.greet.GreetingManyTimesResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static com.proto.greet.GreetingManyTimesResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }
  public static com.proto.greet.GreetingManyTimesResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input);
  }
  public static com.proto.greet.GreetingManyTimesResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
  }
  public static com.proto.greet.GreetingManyTimesResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static com.proto.greet.GreetingManyTimesResponse parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }

  public static Builder newBuilder() {
    return (Builder) DEFAULT_INSTANCE.createBuilder();
  }
  public static Builder newBuilder(com.proto.greet.GreetingManyTimesResponse prototype) {
    return (Builder) DEFAULT_INSTANCE.createBuilder(prototype);
  }

  /**
   * Protobuf type {@code greet.GreetingManyTimesResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageLite.Builder<
        com.proto.greet.GreetingManyTimesResponse, Builder> implements
      // @@protoc_insertion_point(builder_implements:greet.GreetingManyTimesResponse)
      com.proto.greet.GreetingManyTimesResponseOrBuilder {
    // Construct using com.proto.greet.GreetingManyTimesResponse.newBuilder()
    private Builder() {
      super(DEFAULT_INSTANCE);
    }


    /**
     * <code>string result = 1;</code>
     * @return The result.
     */
    @java.lang.Override
    public java.lang.String getResult() {
      return instance.getResult();
    }
    /**
     * <code>string result = 1;</code>
     * @return The bytes for result.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getResultBytes() {
      return instance.getResultBytes();
    }
    /**
     * <code>string result = 1;</code>
     * @param value The result to set.
     * @return This builder for chaining.
     */
    public Builder setResult(
        java.lang.String value) {
      copyOnWrite();
      instance.setResult(value);
      return this;
    }
    /**
     * <code>string result = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearResult() {
      copyOnWrite();
      instance.clearResult();
      return this;
    }
    /**
     * <code>string result = 1;</code>
     * @param value The bytes for result to set.
     * @return This builder for chaining.
     */
    public Builder setResultBytes(
        com.google.protobuf.ByteString value) {
      copyOnWrite();
      instance.setResultBytes(value);
      return this;
    }

    // @@protoc_insertion_point(builder_scope:greet.GreetingManyTimesResponse)
  }
  @java.lang.Override
  @java.lang.SuppressWarnings({"unchecked", "fallthrough"})
  protected final java.lang.Object dynamicMethod(
      com.google.protobuf.GeneratedMessageLite.MethodToInvoke method,
      java.lang.Object arg0, java.lang.Object arg1) {
    switch (method) {
      case NEW_MUTABLE_INSTANCE: {
        return new com.proto.greet.GreetingManyTimesResponse();
      }
      case NEW_BUILDER: {
        return new Builder();
      }
      case BUILD_MESSAGE_INFO: {
          java.lang.Object[] objects = new java.lang.Object[] {
            "result_",
          };
          java.lang.String info =
              "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0208";
          return newMessageInfo(DEFAULT_INSTANCE, info, objects);
      }
      // fall through
      case GET_DEFAULT_INSTANCE: {
        return DEFAULT_INSTANCE;
      }
      case GET_PARSER: {
        com.google.protobuf.Parser<com.proto.greet.GreetingManyTimesResponse> parser = PARSER;
        if (parser == null) {
          synchronized (com.proto.greet.GreetingManyTimesResponse.class) {
            parser = PARSER;
            if (parser == null) {
              parser =
                  new DefaultInstanceBasedParser<com.proto.greet.GreetingManyTimesResponse>(
                      DEFAULT_INSTANCE);
              PARSER = parser;
            }
          }
        }
        return parser;
    }
    case GET_MEMOIZED_IS_INITIALIZED: {
      return (byte) 1;
    }
    case SET_MEMOIZED_IS_INITIALIZED: {
      return null;
    }
    }
    throw new UnsupportedOperationException();
  }


  // @@protoc_insertion_point(class_scope:greet.GreetingManyTimesResponse)
  private static final com.proto.greet.GreetingManyTimesResponse DEFAULT_INSTANCE;
  static {
    GreetingManyTimesResponse defaultInstance = new GreetingManyTimesResponse();
    // New instances are implicitly immutable so no need to make
    // immutable.
    DEFAULT_INSTANCE = defaultInstance;
    com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(
      GreetingManyTimesResponse.class, defaultInstance);
  }

  public static com.proto.greet.GreetingManyTimesResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static volatile com.google.protobuf.Parser<GreetingManyTimesResponse> PARSER;

  public static com.google.protobuf.Parser<GreetingManyTimesResponse> parser() {
    return DEFAULT_INSTANCE.getParserForType();
  }
}

