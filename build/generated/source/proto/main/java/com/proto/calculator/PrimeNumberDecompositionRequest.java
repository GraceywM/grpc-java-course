// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: caculator/calculator.proto

package com.proto.calculator;

/**
 * Protobuf type {@code calculator.PrimeNumberDecompositionRequest}
 */
public  final class PrimeNumberDecompositionRequest extends
    com.google.protobuf.GeneratedMessageLite<
        PrimeNumberDecompositionRequest, PrimeNumberDecompositionRequest.Builder> implements
    // @@protoc_insertion_point(message_implements:calculator.PrimeNumberDecompositionRequest)
    PrimeNumberDecompositionRequestOrBuilder {
  private PrimeNumberDecompositionRequest() {
  }
  public static final int NUMBER_FIELD_NUMBER = 1;
  private int number_;
  /**
   * <code>int32 number = 1;</code>
   * @return The number.
   */
  @java.lang.Override
  public int getNumber() {
    return number_;
  }
  /**
   * <code>int32 number = 1;</code>
   * @param value The number to set.
   */
  private void setNumber(int value) {
    
    number_ = value;
  }
  /**
   * <code>int32 number = 1;</code>
   */
  private void clearNumber() {
    
    number_ = 0;
  }

  public static com.proto.calculator.PrimeNumberDecompositionRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static com.proto.calculator.PrimeNumberDecompositionRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static com.proto.calculator.PrimeNumberDecompositionRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static com.proto.calculator.PrimeNumberDecompositionRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static com.proto.calculator.PrimeNumberDecompositionRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static com.proto.calculator.PrimeNumberDecompositionRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static com.proto.calculator.PrimeNumberDecompositionRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static com.proto.calculator.PrimeNumberDecompositionRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }
  public static com.proto.calculator.PrimeNumberDecompositionRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input);
  }
  public static com.proto.calculator.PrimeNumberDecompositionRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
  }
  public static com.proto.calculator.PrimeNumberDecompositionRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static com.proto.calculator.PrimeNumberDecompositionRequest parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }

  public static Builder newBuilder() {
    return (Builder) DEFAULT_INSTANCE.createBuilder();
  }
  public static Builder newBuilder(com.proto.calculator.PrimeNumberDecompositionRequest prototype) {
    return (Builder) DEFAULT_INSTANCE.createBuilder(prototype);
  }

  /**
   * Protobuf type {@code calculator.PrimeNumberDecompositionRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageLite.Builder<
        com.proto.calculator.PrimeNumberDecompositionRequest, Builder> implements
      // @@protoc_insertion_point(builder_implements:calculator.PrimeNumberDecompositionRequest)
      com.proto.calculator.PrimeNumberDecompositionRequestOrBuilder {
    // Construct using com.proto.calculator.PrimeNumberDecompositionRequest.newBuilder()
    private Builder() {
      super(DEFAULT_INSTANCE);
    }


    /**
     * <code>int32 number = 1;</code>
     * @return The number.
     */
    @java.lang.Override
    public int getNumber() {
      return instance.getNumber();
    }
    /**
     * <code>int32 number = 1;</code>
     * @param value The number to set.
     * @return This builder for chaining.
     */
    public Builder setNumber(int value) {
      copyOnWrite();
      instance.setNumber(value);
      return this;
    }
    /**
     * <code>int32 number = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearNumber() {
      copyOnWrite();
      instance.clearNumber();
      return this;
    }

    // @@protoc_insertion_point(builder_scope:calculator.PrimeNumberDecompositionRequest)
  }
  @java.lang.Override
  @java.lang.SuppressWarnings({"unchecked", "fallthrough"})
  protected final java.lang.Object dynamicMethod(
      com.google.protobuf.GeneratedMessageLite.MethodToInvoke method,
      java.lang.Object arg0, java.lang.Object arg1) {
    switch (method) {
      case NEW_MUTABLE_INSTANCE: {
        return new com.proto.calculator.PrimeNumberDecompositionRequest();
      }
      case NEW_BUILDER: {
        return new Builder();
      }
      case BUILD_MESSAGE_INFO: {
          java.lang.Object[] objects = new java.lang.Object[] {
            "number_",
          };
          java.lang.String info =
              "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0004";
          return newMessageInfo(DEFAULT_INSTANCE, info, objects);
      }
      // fall through
      case GET_DEFAULT_INSTANCE: {
        return DEFAULT_INSTANCE;
      }
      case GET_PARSER: {
        com.google.protobuf.Parser<com.proto.calculator.PrimeNumberDecompositionRequest> parser = PARSER;
        if (parser == null) {
          synchronized (com.proto.calculator.PrimeNumberDecompositionRequest.class) {
            parser = PARSER;
            if (parser == null) {
              parser =
                  new DefaultInstanceBasedParser<com.proto.calculator.PrimeNumberDecompositionRequest>(
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


  // @@protoc_insertion_point(class_scope:calculator.PrimeNumberDecompositionRequest)
  private static final com.proto.calculator.PrimeNumberDecompositionRequest DEFAULT_INSTANCE;
  static {
    PrimeNumberDecompositionRequest defaultInstance = new PrimeNumberDecompositionRequest();
    // New instances are implicitly immutable so no need to make
    // immutable.
    DEFAULT_INSTANCE = defaultInstance;
    com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(
      PrimeNumberDecompositionRequest.class, defaultInstance);
  }

  public static com.proto.calculator.PrimeNumberDecompositionRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static volatile com.google.protobuf.Parser<PrimeNumberDecompositionRequest> PARSER;

  public static com.google.protobuf.Parser<PrimeNumberDecompositionRequest> parser() {
    return DEFAULT_INSTANCE.getParserForType();
  }
}
