// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: types.proto

package io.yottachain.nodemgmt.analysis.pb;

/**
 * <pre>
 * ShardCount message
 * </pre>
 *
 * Protobuf type {@code pbanalysis.ShardCountMsg}
 */
public  final class ShardCountMsg extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:pbanalysis.ShardCountMsg)
    ShardCountMsgOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ShardCountMsg.newBuilder() to construct.
  private ShardCountMsg(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ShardCountMsg() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ShardCountMsg();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private ShardCountMsg(
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
          case 8: {

            iD_ = input.readInt32();
            break;
          }
          case 16: {

            cnt_ = input.readInt64();
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
    return io.yottachain.nodemgmt.analysis.pb.AnalysisProto.internal_static_pbanalysis_ShardCountMsg_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return io.yottachain.nodemgmt.analysis.pb.AnalysisProto.internal_static_pbanalysis_ShardCountMsg_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            io.yottachain.nodemgmt.analysis.pb.ShardCountMsg.class, io.yottachain.nodemgmt.analysis.pb.ShardCountMsg.Builder.class);
  }

  public static final int ID_FIELD_NUMBER = 1;
  private int iD_;
  /**
   * <code>int32 iD = 1;</code>
   */
  public int getID() {
    return iD_;
  }

  public static final int CNT_FIELD_NUMBER = 2;
  private long cnt_;
  /**
   * <code>int64 cnt = 2;</code>
   */
  public long getCnt() {
    return cnt_;
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
    if (iD_ != 0) {
      output.writeInt32(1, iD_);
    }
    if (cnt_ != 0L) {
      output.writeInt64(2, cnt_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (iD_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(1, iD_);
    }
    if (cnt_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(2, cnt_);
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
    if (!(obj instanceof io.yottachain.nodemgmt.analysis.pb.ShardCountMsg)) {
      return super.equals(obj);
    }
    io.yottachain.nodemgmt.analysis.pb.ShardCountMsg other = (io.yottachain.nodemgmt.analysis.pb.ShardCountMsg) obj;

    if (getID()
        != other.getID()) return false;
    if (getCnt()
        != other.getCnt()) return false;
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
    hash = (37 * hash) + ID_FIELD_NUMBER;
    hash = (53 * hash) + getID();
    hash = (37 * hash) + CNT_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getCnt());
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static io.yottachain.nodemgmt.analysis.pb.ShardCountMsg parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.yottachain.nodemgmt.analysis.pb.ShardCountMsg parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.yottachain.nodemgmt.analysis.pb.ShardCountMsg parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.yottachain.nodemgmt.analysis.pb.ShardCountMsg parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.yottachain.nodemgmt.analysis.pb.ShardCountMsg parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.yottachain.nodemgmt.analysis.pb.ShardCountMsg parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.yottachain.nodemgmt.analysis.pb.ShardCountMsg parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.yottachain.nodemgmt.analysis.pb.ShardCountMsg parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.yottachain.nodemgmt.analysis.pb.ShardCountMsg parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static io.yottachain.nodemgmt.analysis.pb.ShardCountMsg parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.yottachain.nodemgmt.analysis.pb.ShardCountMsg parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.yottachain.nodemgmt.analysis.pb.ShardCountMsg parseFrom(
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
  public static Builder newBuilder(io.yottachain.nodemgmt.analysis.pb.ShardCountMsg prototype) {
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
   * ShardCount message
   * </pre>
   *
   * Protobuf type {@code pbanalysis.ShardCountMsg}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:pbanalysis.ShardCountMsg)
      io.yottachain.nodemgmt.analysis.pb.ShardCountMsgOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return io.yottachain.nodemgmt.analysis.pb.AnalysisProto.internal_static_pbanalysis_ShardCountMsg_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.yottachain.nodemgmt.analysis.pb.AnalysisProto.internal_static_pbanalysis_ShardCountMsg_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.yottachain.nodemgmt.analysis.pb.ShardCountMsg.class, io.yottachain.nodemgmt.analysis.pb.ShardCountMsg.Builder.class);
    }

    // Construct using io.yottachain.nodemgmt.analysis.pb.ShardCountMsg.newBuilder()
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
      iD_ = 0;

      cnt_ = 0L;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return io.yottachain.nodemgmt.analysis.pb.AnalysisProto.internal_static_pbanalysis_ShardCountMsg_descriptor;
    }

    @java.lang.Override
    public io.yottachain.nodemgmt.analysis.pb.ShardCountMsg getDefaultInstanceForType() {
      return io.yottachain.nodemgmt.analysis.pb.ShardCountMsg.getDefaultInstance();
    }

    @java.lang.Override
    public io.yottachain.nodemgmt.analysis.pb.ShardCountMsg build() {
      io.yottachain.nodemgmt.analysis.pb.ShardCountMsg result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public io.yottachain.nodemgmt.analysis.pb.ShardCountMsg buildPartial() {
      io.yottachain.nodemgmt.analysis.pb.ShardCountMsg result = new io.yottachain.nodemgmt.analysis.pb.ShardCountMsg(this);
      result.iD_ = iD_;
      result.cnt_ = cnt_;
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
      if (other instanceof io.yottachain.nodemgmt.analysis.pb.ShardCountMsg) {
        return mergeFrom((io.yottachain.nodemgmt.analysis.pb.ShardCountMsg)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(io.yottachain.nodemgmt.analysis.pb.ShardCountMsg other) {
      if (other == io.yottachain.nodemgmt.analysis.pb.ShardCountMsg.getDefaultInstance()) return this;
      if (other.getID() != 0) {
        setID(other.getID());
      }
      if (other.getCnt() != 0L) {
        setCnt(other.getCnt());
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
      io.yottachain.nodemgmt.analysis.pb.ShardCountMsg parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (io.yottachain.nodemgmt.analysis.pb.ShardCountMsg) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int iD_ ;
    /**
     * <code>int32 iD = 1;</code>
     */
    public int getID() {
      return iD_;
    }
    /**
     * <code>int32 iD = 1;</code>
     */
    public Builder setID(int value) {
      
      iD_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 iD = 1;</code>
     */
    public Builder clearID() {
      
      iD_ = 0;
      onChanged();
      return this;
    }

    private long cnt_ ;
    /**
     * <code>int64 cnt = 2;</code>
     */
    public long getCnt() {
      return cnt_;
    }
    /**
     * <code>int64 cnt = 2;</code>
     */
    public Builder setCnt(long value) {
      
      cnt_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int64 cnt = 2;</code>
     */
    public Builder clearCnt() {
      
      cnt_ = 0L;
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


    // @@protoc_insertion_point(builder_scope:pbanalysis.ShardCountMsg)
  }

  // @@protoc_insertion_point(class_scope:pbanalysis.ShardCountMsg)
  private static final io.yottachain.nodemgmt.analysis.pb.ShardCountMsg DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new io.yottachain.nodemgmt.analysis.pb.ShardCountMsg();
  }

  public static io.yottachain.nodemgmt.analysis.pb.ShardCountMsg getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ShardCountMsg>
      PARSER = new com.google.protobuf.AbstractParser<ShardCountMsg>() {
    @java.lang.Override
    public ShardCountMsg parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new ShardCountMsg(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<ShardCountMsg> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ShardCountMsg> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public io.yottachain.nodemgmt.analysis.pb.ShardCountMsg getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

