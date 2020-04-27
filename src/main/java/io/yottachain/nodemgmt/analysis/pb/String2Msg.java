// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: types.proto

package io.yottachain.nodemgmt.analysis.pb;

/**
 * <pre>
 * message that only contains a value of string
 * </pre>
 *
 * Protobuf type {@code pb.String2Msg}
 */
public  final class String2Msg extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:pb.String2Msg)
    String2MsgOrBuilder {
private static final long serialVersionUID = 0L;
  // Use String2Msg.newBuilder() to construct.
  private String2Msg(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private String2Msg() {
    param1_ = "";
    param2_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new String2Msg();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private String2Msg(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 10: {
            java.lang.String s = input.readStringRequireUtf8();

            param1_ = s;
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            param2_ = s;
            break;
          }
          default: {
            if (!parseUnknownField(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return io.yottachain.nodemgmt.analysis.pb.AnalysisProto.internal_static_pb_String2Msg_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return io.yottachain.nodemgmt.analysis.pb.AnalysisProto.internal_static_pb_String2Msg_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            io.yottachain.nodemgmt.analysis.pb.String2Msg.class, io.yottachain.nodemgmt.analysis.pb.String2Msg.Builder.class);
  }

  public static final int PARAM1_FIELD_NUMBER = 1;
  private volatile java.lang.Object param1_;
  /**
   * <code>string param1 = 1;</code>
   */
  public java.lang.String getParam1() {
    java.lang.Object ref = param1_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      param1_ = s;
      return s;
    }
  }
  /**
   * <code>string param1 = 1;</code>
   */
  public com.google.protobuf.ByteString
      getParam1Bytes() {
    java.lang.Object ref = param1_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      param1_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int PARAM2_FIELD_NUMBER = 2;
  private volatile java.lang.Object param2_;
  /**
   * <code>string param2 = 2;</code>
   */
  public java.lang.String getParam2() {
    java.lang.Object ref = param2_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      param2_ = s;
      return s;
    }
  }
  /**
   * <code>string param2 = 2;</code>
   */
  public com.google.protobuf.ByteString
      getParam2Bytes() {
    java.lang.Object ref = param2_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      param2_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (!getParam1Bytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, param1_);
    }
    if (!getParam2Bytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, param2_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getParam1Bytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, param1_);
    }
    if (!getParam2Bytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, param2_);
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof io.yottachain.nodemgmt.analysis.pb.String2Msg)) {
      return super.equals(obj);
    }
    io.yottachain.nodemgmt.analysis.pb.String2Msg other = (io.yottachain.nodemgmt.analysis.pb.String2Msg) obj;

    if (!getParam1()
        .equals(other.getParam1())) return false;
    if (!getParam2()
        .equals(other.getParam2())) return false;
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + PARAM1_FIELD_NUMBER;
    hash = (53 * hash) + getParam1().hashCode();
    hash = (37 * hash) + PARAM2_FIELD_NUMBER;
    hash = (53 * hash) + getParam2().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static io.yottachain.nodemgmt.analysis.pb.String2Msg parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.yottachain.nodemgmt.analysis.pb.String2Msg parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.yottachain.nodemgmt.analysis.pb.String2Msg parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.yottachain.nodemgmt.analysis.pb.String2Msg parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.yottachain.nodemgmt.analysis.pb.String2Msg parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.yottachain.nodemgmt.analysis.pb.String2Msg parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.yottachain.nodemgmt.analysis.pb.String2Msg parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.yottachain.nodemgmt.analysis.pb.String2Msg parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.yottachain.nodemgmt.analysis.pb.String2Msg parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static io.yottachain.nodemgmt.analysis.pb.String2Msg parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.yottachain.nodemgmt.analysis.pb.String2Msg parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.yottachain.nodemgmt.analysis.pb.String2Msg parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(io.yottachain.nodemgmt.analysis.pb.String2Msg prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * <pre>
   * message that only contains a value of string
   * </pre>
   *
   * Protobuf type {@code pb.String2Msg}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:pb.String2Msg)
      io.yottachain.nodemgmt.analysis.pb.String2MsgOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return io.yottachain.nodemgmt.analysis.pb.AnalysisProto.internal_static_pb_String2Msg_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.yottachain.nodemgmt.analysis.pb.AnalysisProto.internal_static_pb_String2Msg_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.yottachain.nodemgmt.analysis.pb.String2Msg.class, io.yottachain.nodemgmt.analysis.pb.String2Msg.Builder.class);
    }

    // Construct using io.yottachain.nodemgmt.analysis.pb.String2Msg.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      param1_ = "";

      param2_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return io.yottachain.nodemgmt.analysis.pb.AnalysisProto.internal_static_pb_String2Msg_descriptor;
    }

    @java.lang.Override
    public io.yottachain.nodemgmt.analysis.pb.String2Msg getDefaultInstanceForType() {
      return io.yottachain.nodemgmt.analysis.pb.String2Msg.getDefaultInstance();
    }

    @java.lang.Override
    public io.yottachain.nodemgmt.analysis.pb.String2Msg build() {
      io.yottachain.nodemgmt.analysis.pb.String2Msg result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public io.yottachain.nodemgmt.analysis.pb.String2Msg buildPartial() {
      io.yottachain.nodemgmt.analysis.pb.String2Msg result = new io.yottachain.nodemgmt.analysis.pb.String2Msg(this);
      result.param1_ = param1_;
      result.param2_ = param2_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof io.yottachain.nodemgmt.analysis.pb.String2Msg) {
        return mergeFrom((io.yottachain.nodemgmt.analysis.pb.String2Msg)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(io.yottachain.nodemgmt.analysis.pb.String2Msg other) {
      if (other == io.yottachain.nodemgmt.analysis.pb.String2Msg.getDefaultInstance()) return this;
      if (!other.getParam1().isEmpty()) {
        param1_ = other.param1_;
        onChanged();
      }
      if (!other.getParam2().isEmpty()) {
        param2_ = other.param2_;
        onChanged();
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      io.yottachain.nodemgmt.analysis.pb.String2Msg parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (io.yottachain.nodemgmt.analysis.pb.String2Msg) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object param1_ = "";
    /**
     * <code>string param1 = 1;</code>
     */
    public java.lang.String getParam1() {
      java.lang.Object ref = param1_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        param1_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string param1 = 1;</code>
     */
    public com.google.protobuf.ByteString
        getParam1Bytes() {
      java.lang.Object ref = param1_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        param1_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string param1 = 1;</code>
     */
    public Builder setParam1(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      param1_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string param1 = 1;</code>
     */
    public Builder clearParam1() {
      
      param1_ = getDefaultInstance().getParam1();
      onChanged();
      return this;
    }
    /**
     * <code>string param1 = 1;</code>
     */
    public Builder setParam1Bytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      param1_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object param2_ = "";
    /**
     * <code>string param2 = 2;</code>
     */
    public java.lang.String getParam2() {
      java.lang.Object ref = param2_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        param2_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string param2 = 2;</code>
     */
    public com.google.protobuf.ByteString
        getParam2Bytes() {
      java.lang.Object ref = param2_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        param2_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string param2 = 2;</code>
     */
    public Builder setParam2(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      param2_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string param2 = 2;</code>
     */
    public Builder clearParam2() {
      
      param2_ = getDefaultInstance().getParam2();
      onChanged();
      return this;
    }
    /**
     * <code>string param2 = 2;</code>
     */
    public Builder setParam2Bytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      param2_ = value;
      onChanged();
      return this;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:pb.String2Msg)
  }

  // @@protoc_insertion_point(class_scope:pb.String2Msg)
  private static final io.yottachain.nodemgmt.analysis.pb.String2Msg DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new io.yottachain.nodemgmt.analysis.pb.String2Msg();
  }

  public static io.yottachain.nodemgmt.analysis.pb.String2Msg getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<String2Msg>
      PARSER = new com.google.protobuf.AbstractParser<String2Msg>() {
    @java.lang.Override
    public String2Msg parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new String2Msg(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<String2Msg> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<String2Msg> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public io.yottachain.nodemgmt.analysis.pb.String2Msg getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

