// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: caculator/calculator.proto

package com.proto.calculator;

/**
 * Protobuf type {@code calculator.ComputeAverageResponse}
 */
public  final class ComputeAverageResponse extends
    com.google.protobuf.GeneratedMessageLite<
        ComputeAverageResponse, ComputeAverageResponse.Builder> implements
    // @@protoc_insertion_point(message_implements:calculator.ComputeAverageResponse)
    ComputeAverageResponseOrBuilder {
  private ComputeAverageResponse() {
  }
  public static final int RESULT_FIELD_NUMBER = 1;
  private double result_;
  /**
   * <code>double result = 1;</code>
   * @return The result.
   */
  @java.lang.Override
  public double getResult() {
    return result_;
  }
  /**
   * <code>double result = 1;</code>
   * @param value The result to set.
   */
  private void setResult(double value) {
    
    result_ = value;
  }
  /**
   * <code>double result = 1;</code>
   */
  private void clearResult() {
    
    result_ = 0D;
  }

  public static com.proto.calculator.ComputeAverageResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static com.proto.calculator.ComputeAverageResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static com.proto.calculator.ComputeAverageResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static com.proto.calculator.ComputeAverageResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static com.proto.calculator.ComputeAverageResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static com.proto.calculator.ComputeAverageResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static com.proto.calculator.ComputeAverageResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static com.proto.calculator.ComputeAverageResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }
  public static com.proto.calculator.ComputeAverageResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input);
  }
  public static com.proto.calculator.ComputeAverageResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
  }
  public static com.proto.calculator.ComputeAverageResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static com.proto.calculator.ComputeAverageResponse parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }

  public static Builder newBuilder() {
    return (Builder) DEFAULT_INSTANCE.createBuilder();
  }
  public static Builder newBuilder(com.proto.calculator.ComputeAverageResponse prototype) {
    return (Builder) DEFAULT_INSTANCE.createBuilder(prototype);
  }

  /**
   * Protobuf type {@code calculator.ComputeAverageResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageLite.Builder<
        com.proto.calculator.ComputeAverageResponse, Builder> implements
      // @@protoc_insertion_point(builder_implements:calculator.ComputeAverageResponse)
      com.proto.calculator.ComputeAverageResponseOrBuilder {
    // Construct using com.proto.calculator.ComputeAverageResponse.newBuilder()
    private Builder() {
      super(DEFAULT_INSTANCE);
    }


    /**
     * <code>double result = 1;</code>
     * @return The result.
     */
    @java.lang.Override
    public double getResult() {
      return instance.getResult();
    }
    /**
     * <code>double result = 1;</code>
     * @param value The result to set.
     * @return This builder for chaining.
     */
    public Builder setResult(double value) {
      copyOnWrite();
      instance.setResult(value);
      return this;
    }
    /**
     * <code>double result = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearResult() {
      copyOnWrite();
      instance.clearResult();
      return this;
    }

    // @@protoc_insertion_point(builder_scope:calculator.ComputeAverageResponse)
  }
  @java.lang.Override
  @java.lang.SuppressWarnings({"unchecked", "fallthrough"})
  protected final java.lang.Object dynamicMethod(
      com.google.protobuf.GeneratedMessageLite.MethodToInvoke method,
      java.lang.Object arg0, java.lang.Object arg1) {
    switch (method) {
      case NEW_MUTABLE_INSTANCE: {
        return new com.proto.calculator.ComputeAverageResponse();
      }
      case NEW_BUILDER: {
        return new Builder();
      }
      case BUILD_MESSAGE_INFO: {
          java.lang.Object[] objects = new java.lang.Object[] {
            "result_",
          };
          java.lang.String info =
              "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0000";
          return newMessageInfo(DEFAULT_INSTANCE, info, objects);
      }
      // fall through
      case GET_DEFAULT_INSTANCE: {
        return DEFAULT_INSTANCE;
      }
      case GET_PARSER: {
        com.google.protobuf.Parser<com.proto.calculator.ComputeAverageResponse> parser = PARSER;
        if (parser == null) {
          synchronized (com.proto.calculator.ComputeAverageResponse.class) {
            parser = PARSER;
            if (parser == null) {
              parser =
                  new DefaultInstanceBasedParser<com.proto.calculator.ComputeAverageResponse>(
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


  // @@protoc_insertion_point(class_scope:calculator.ComputeAverageResponse)
  private static final com.proto.calculator.ComputeAverageResponse DEFAULT_INSTANCE;
  static {
    ComputeAverageResponse defaultInstance = new ComputeAverageResponse();
    // New instances are implicitly immutable so no need to make
    // immutable.
    DEFAULT_INSTANCE = defaultInstance;
    com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(
      ComputeAverageResponse.class, defaultInstance);
  }

  public static com.proto.calculator.ComputeAverageResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static volatile com.google.protobuf.Parser<ComputeAverageResponse> PARSER;

  public static com.google.protobuf.Parser<ComputeAverageResponse> parser() {
    return DEFAULT_INSTANCE.getParserForType();
  }
}

