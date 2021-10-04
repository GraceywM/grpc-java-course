// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: caculator/calculator.proto

package com.proto.calculator;

/**
 * Protobuf type {@code calculator.PrimeNumberDecompositionResponse}
 */
public  final class PrimeNumberDecompositionResponse extends
    com.google.protobuf.GeneratedMessageLite<
        PrimeNumberDecompositionResponse, PrimeNumberDecompositionResponse.Builder> implements
    // @@protoc_insertion_point(message_implements:calculator.PrimeNumberDecompositionResponse)
    PrimeNumberDecompositionResponseOrBuilder {
  private PrimeNumberDecompositionResponse() {
  }
  public static final int PRIME_FACTOR_FIELD_NUMBER = 1;
  private int primeFactor_;
  /**
   * <code>int32 prime_factor = 1;</code>
   * @return The primeFactor.
   */
  @java.lang.Override
  public int getPrimeFactor() {
    return primeFactor_;
  }
  /**
   * <code>int32 prime_factor = 1;</code>
   * @param value The primeFactor to set.
   */
  private void setPrimeFactor(int value) {
    
    primeFactor_ = value;
  }
  /**
   * <code>int32 prime_factor = 1;</code>
   */
  private void clearPrimeFactor() {
    
    primeFactor_ = 0;
  }

  public static com.proto.calculator.PrimeNumberDecompositionResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static com.proto.calculator.PrimeNumberDecompositionResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static com.proto.calculator.PrimeNumberDecompositionResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static com.proto.calculator.PrimeNumberDecompositionResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static com.proto.calculator.PrimeNumberDecompositionResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static com.proto.calculator.PrimeNumberDecompositionResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static com.proto.calculator.PrimeNumberDecompositionResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static com.proto.calculator.PrimeNumberDecompositionResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }
  public static com.proto.calculator.PrimeNumberDecompositionResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input);
  }
  public static com.proto.calculator.PrimeNumberDecompositionResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
  }
  public static com.proto.calculator.PrimeNumberDecompositionResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static com.proto.calculator.PrimeNumberDecompositionResponse parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }

  public static Builder newBuilder() {
    return (Builder) DEFAULT_INSTANCE.createBuilder();
  }
  public static Builder newBuilder(com.proto.calculator.PrimeNumberDecompositionResponse prototype) {
    return (Builder) DEFAULT_INSTANCE.createBuilder(prototype);
  }

  /**
   * Protobuf type {@code calculator.PrimeNumberDecompositionResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageLite.Builder<
        com.proto.calculator.PrimeNumberDecompositionResponse, Builder> implements
      // @@protoc_insertion_point(builder_implements:calculator.PrimeNumberDecompositionResponse)
      com.proto.calculator.PrimeNumberDecompositionResponseOrBuilder {
    // Construct using com.proto.calculator.PrimeNumberDecompositionResponse.newBuilder()
    private Builder() {
      super(DEFAULT_INSTANCE);
    }


    /**
     * <code>int32 prime_factor = 1;</code>
     * @return The primeFactor.
     */
    @java.lang.Override
    public int getPrimeFactor() {
      return instance.getPrimeFactor();
    }
    /**
     * <code>int32 prime_factor = 1;</code>
     * @param value The primeFactor to set.
     * @return This builder for chaining.
     */
    public Builder setPrimeFactor(int value) {
      copyOnWrite();
      instance.setPrimeFactor(value);
      return this;
    }
    /**
     * <code>int32 prime_factor = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearPrimeFactor() {
      copyOnWrite();
      instance.clearPrimeFactor();
      return this;
    }

    // @@protoc_insertion_point(builder_scope:calculator.PrimeNumberDecompositionResponse)
  }
  @java.lang.Override
  @java.lang.SuppressWarnings({"unchecked", "fallthrough"})
  protected final java.lang.Object dynamicMethod(
      com.google.protobuf.GeneratedMessageLite.MethodToInvoke method,
      java.lang.Object arg0, java.lang.Object arg1) {
    switch (method) {
      case NEW_MUTABLE_INSTANCE: {
        return new com.proto.calculator.PrimeNumberDecompositionResponse();
      }
      case NEW_BUILDER: {
        return new Builder();
      }
      case BUILD_MESSAGE_INFO: {
          java.lang.Object[] objects = new java.lang.Object[] {
            "primeFactor_",
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
        com.google.protobuf.Parser<com.proto.calculator.PrimeNumberDecompositionResponse> parser = PARSER;
        if (parser == null) {
          synchronized (com.proto.calculator.PrimeNumberDecompositionResponse.class) {
            parser = PARSER;
            if (parser == null) {
              parser =
                  new DefaultInstanceBasedParser<com.proto.calculator.PrimeNumberDecompositionResponse>(
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


  // @@protoc_insertion_point(class_scope:calculator.PrimeNumberDecompositionResponse)
  private static final com.proto.calculator.PrimeNumberDecompositionResponse DEFAULT_INSTANCE;
  static {
    PrimeNumberDecompositionResponse defaultInstance = new PrimeNumberDecompositionResponse();
    // New instances are implicitly immutable so no need to make
    // immutable.
    DEFAULT_INSTANCE = defaultInstance;
    com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(
      PrimeNumberDecompositionResponse.class, defaultInstance);
  }

  public static com.proto.calculator.PrimeNumberDecompositionResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static volatile com.google.protobuf.Parser<PrimeNumberDecompositionResponse> PARSER;

  public static com.google.protobuf.Parser<PrimeNumberDecompositionResponse> parser() {
    return DEFAULT_INSTANCE.getParserForType();
  }
}

