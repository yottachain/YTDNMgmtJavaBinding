// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: types.proto

package io.yottachain.nodemgmt.rebuilder.pb;

/**
 * <pre>
 *MessageID:1b31
 * </pre>
 *
 * Protobuf type {@code pbrebuilder.MultiTaskOpResult}
 */
public  final class MultiTaskOpResult extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:pbrebuilder.MultiTaskOpResult)
    MultiTaskOpResultOrBuilder {
private static final long serialVersionUID = 0L;
  // Use MultiTaskOpResult.newBuilder() to construct.
  private MultiTaskOpResult(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private MultiTaskOpResult() {
    id_ = java.util.Collections.emptyList();
    rES_ = emptyIntList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new MultiTaskOpResult();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private MultiTaskOpResult(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    int mutable_bitField0_ = 0;
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
            if (!((mutable_bitField0_ & 0x00000001) != 0)) {
              id_ = new java.util.ArrayList<com.google.protobuf.ByteString>();
              mutable_bitField0_ |= 0x00000001;
            }
            id_.add(input.readBytes());
            break;
          }
          case 16: {
            if (!((mutable_bitField0_ & 0x00000002) != 0)) {
              rES_ = newIntList();
              mutable_bitField0_ |= 0x00000002;
            }
            rES_.addInt(input.readInt32());
            break;
          }
          case 18: {
            int length = input.readRawVarint32();
            int limit = input.pushLimit(length);
            if (!((mutable_bitField0_ & 0x00000002) != 0) && input.getBytesUntilLimit() > 0) {
              rES_ = newIntList();
              mutable_bitField0_ |= 0x00000002;
            }
            while (input.getBytesUntilLimit() > 0) {
              rES_.addInt(input.readInt32());
            }
            input.popLimit(limit);
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
      if (((mutable_bitField0_ & 0x00000001) != 0)) {
        id_ = java.util.Collections.unmodifiableList(id_); // C
      }
      if (((mutable_bitField0_ & 0x00000002) != 0)) {
        rES_.makeImmutable(); // C
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return io.yottachain.nodemgmt.rebuilder.pb.RebuilderProto.internal_static_pbrebuilder_MultiTaskOpResult_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return io.yottachain.nodemgmt.rebuilder.pb.RebuilderProto.internal_static_pbrebuilder_MultiTaskOpResult_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            io.yottachain.nodemgmt.rebuilder.pb.MultiTaskOpResult.class, io.yottachain.nodemgmt.rebuilder.pb.MultiTaskOpResult.Builder.class);
  }

  public static final int ID_FIELD_NUMBER = 1;
  private java.util.List<com.google.protobuf.ByteString> id_;
  /**
   * <code>repeated bytes id = 1;</code>
   */
  public java.util.List<com.google.protobuf.ByteString>
      getIdList() {
    return id_;
  }
  /**
   * <code>repeated bytes id = 1;</code>
   */
  public int getIdCount() {
    return id_.size();
  }
  /**
   * <code>repeated bytes id = 1;</code>
   */
  public com.google.protobuf.ByteString getId(int index) {
    return id_.get(index);
  }

  public static final int RES_FIELD_NUMBER = 2;
  private com.google.protobuf.Internal.IntList rES_;
  /**
   * <code>repeated int32 RES = 2;</code>
   */
  public java.util.List<java.lang.Integer>
      getRESList() {
    return rES_;
  }
  /**
   * <code>repeated int32 RES = 2;</code>
   */
  public int getRESCount() {
    return rES_.size();
  }
  /**
   * <code>repeated int32 RES = 2;</code>
   */
  public int getRES(int index) {
    return rES_.getInt(index);
  }
  private int rESMemoizedSerializedSize = -1;

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
    getSerializedSize();
    for (int i = 0; i < id_.size(); i++) {
      output.writeBytes(1, id_.get(i));
    }
    if (getRESList().size() > 0) {
      output.writeUInt32NoTag(18);
      output.writeUInt32NoTag(rESMemoizedSerializedSize);
    }
    for (int i = 0; i < rES_.size(); i++) {
      output.writeInt32NoTag(rES_.getInt(i));
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    {
      int dataSize = 0;
      for (int i = 0; i < id_.size(); i++) {
        dataSize += com.google.protobuf.CodedOutputStream
          .computeBytesSizeNoTag(id_.get(i));
      }
      size += dataSize;
      size += 1 * getIdList().size();
    }
    {
      int dataSize = 0;
      for (int i = 0; i < rES_.size(); i++) {
        dataSize += com.google.protobuf.CodedOutputStream
          .computeInt32SizeNoTag(rES_.getInt(i));
      }
      size += dataSize;
      if (!getRESList().isEmpty()) {
        size += 1;
        size += com.google.protobuf.CodedOutputStream
            .computeInt32SizeNoTag(dataSize);
      }
      rESMemoizedSerializedSize = dataSize;
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
    if (!(obj instanceof io.yottachain.nodemgmt.rebuilder.pb.MultiTaskOpResult)) {
      return super.equals(obj);
    }
    io.yottachain.nodemgmt.rebuilder.pb.MultiTaskOpResult other = (io.yottachain.nodemgmt.rebuilder.pb.MultiTaskOpResult) obj;

    if (!getIdList()
        .equals(other.getIdList())) return false;
    if (!getRESList()
        .equals(other.getRESList())) return false;
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
    if (getIdCount() > 0) {
      hash = (37 * hash) + ID_FIELD_NUMBER;
      hash = (53 * hash) + getIdList().hashCode();
    }
    if (getRESCount() > 0) {
      hash = (37 * hash) + RES_FIELD_NUMBER;
      hash = (53 * hash) + getRESList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static io.yottachain.nodemgmt.rebuilder.pb.MultiTaskOpResult parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.yottachain.nodemgmt.rebuilder.pb.MultiTaskOpResult parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.yottachain.nodemgmt.rebuilder.pb.MultiTaskOpResult parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.yottachain.nodemgmt.rebuilder.pb.MultiTaskOpResult parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.yottachain.nodemgmt.rebuilder.pb.MultiTaskOpResult parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.yottachain.nodemgmt.rebuilder.pb.MultiTaskOpResult parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.yottachain.nodemgmt.rebuilder.pb.MultiTaskOpResult parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.yottachain.nodemgmt.rebuilder.pb.MultiTaskOpResult parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.yottachain.nodemgmt.rebuilder.pb.MultiTaskOpResult parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static io.yottachain.nodemgmt.rebuilder.pb.MultiTaskOpResult parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.yottachain.nodemgmt.rebuilder.pb.MultiTaskOpResult parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.yottachain.nodemgmt.rebuilder.pb.MultiTaskOpResult parseFrom(
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
  public static Builder newBuilder(io.yottachain.nodemgmt.rebuilder.pb.MultiTaskOpResult prototype) {
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
   *MessageID:1b31
   * </pre>
   *
   * Protobuf type {@code pbrebuilder.MultiTaskOpResult}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:pbrebuilder.MultiTaskOpResult)
      io.yottachain.nodemgmt.rebuilder.pb.MultiTaskOpResultOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return io.yottachain.nodemgmt.rebuilder.pb.RebuilderProto.internal_static_pbrebuilder_MultiTaskOpResult_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.yottachain.nodemgmt.rebuilder.pb.RebuilderProto.internal_static_pbrebuilder_MultiTaskOpResult_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.yottachain.nodemgmt.rebuilder.pb.MultiTaskOpResult.class, io.yottachain.nodemgmt.rebuilder.pb.MultiTaskOpResult.Builder.class);
    }

    // Construct using io.yottachain.nodemgmt.rebuilder.pb.MultiTaskOpResult.newBuilder()
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
      id_ = java.util.Collections.emptyList();
      bitField0_ = (bitField0_ & ~0x00000001);
      rES_ = emptyIntList();
      bitField0_ = (bitField0_ & ~0x00000002);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return io.yottachain.nodemgmt.rebuilder.pb.RebuilderProto.internal_static_pbrebuilder_MultiTaskOpResult_descriptor;
    }

    @java.lang.Override
    public io.yottachain.nodemgmt.rebuilder.pb.MultiTaskOpResult getDefaultInstanceForType() {
      return io.yottachain.nodemgmt.rebuilder.pb.MultiTaskOpResult.getDefaultInstance();
    }

    @java.lang.Override
    public io.yottachain.nodemgmt.rebuilder.pb.MultiTaskOpResult build() {
      io.yottachain.nodemgmt.rebuilder.pb.MultiTaskOpResult result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public io.yottachain.nodemgmt.rebuilder.pb.MultiTaskOpResult buildPartial() {
      io.yottachain.nodemgmt.rebuilder.pb.MultiTaskOpResult result = new io.yottachain.nodemgmt.rebuilder.pb.MultiTaskOpResult(this);
      int from_bitField0_ = bitField0_;
      if (((bitField0_ & 0x00000001) != 0)) {
        id_ = java.util.Collections.unmodifiableList(id_);
        bitField0_ = (bitField0_ & ~0x00000001);
      }
      result.id_ = id_;
      if (((bitField0_ & 0x00000002) != 0)) {
        rES_.makeImmutable();
        bitField0_ = (bitField0_ & ~0x00000002);
      }
      result.rES_ = rES_;
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
      if (other instanceof io.yottachain.nodemgmt.rebuilder.pb.MultiTaskOpResult) {
        return mergeFrom((io.yottachain.nodemgmt.rebuilder.pb.MultiTaskOpResult)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(io.yottachain.nodemgmt.rebuilder.pb.MultiTaskOpResult other) {
      if (other == io.yottachain.nodemgmt.rebuilder.pb.MultiTaskOpResult.getDefaultInstance()) return this;
      if (!other.id_.isEmpty()) {
        if (id_.isEmpty()) {
          id_ = other.id_;
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          ensureIdIsMutable();
          id_.addAll(other.id_);
        }
        onChanged();
      }
      if (!other.rES_.isEmpty()) {
        if (rES_.isEmpty()) {
          rES_ = other.rES_;
          bitField0_ = (bitField0_ & ~0x00000002);
        } else {
          ensureRESIsMutable();
          rES_.addAll(other.rES_);
        }
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
      io.yottachain.nodemgmt.rebuilder.pb.MultiTaskOpResult parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (io.yottachain.nodemgmt.rebuilder.pb.MultiTaskOpResult) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.util.List<com.google.protobuf.ByteString> id_ = java.util.Collections.emptyList();
    private void ensureIdIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        id_ = new java.util.ArrayList<com.google.protobuf.ByteString>(id_);
        bitField0_ |= 0x00000001;
       }
    }
    /**
     * <code>repeated bytes id = 1;</code>
     */
    public java.util.List<com.google.protobuf.ByteString>
        getIdList() {
      return ((bitField0_ & 0x00000001) != 0) ?
               java.util.Collections.unmodifiableList(id_) : id_;
    }
    /**
     * <code>repeated bytes id = 1;</code>
     */
    public int getIdCount() {
      return id_.size();
    }
    /**
     * <code>repeated bytes id = 1;</code>
     */
    public com.google.protobuf.ByteString getId(int index) {
      return id_.get(index);
    }
    /**
     * <code>repeated bytes id = 1;</code>
     */
    public Builder setId(
        int index, com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  ensureIdIsMutable();
      id_.set(index, value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated bytes id = 1;</code>
     */
    public Builder addId(com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  ensureIdIsMutable();
      id_.add(value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated bytes id = 1;</code>
     */
    public Builder addAllId(
        java.lang.Iterable<? extends com.google.protobuf.ByteString> values) {
      ensureIdIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(
          values, id_);
      onChanged();
      return this;
    }
    /**
     * <code>repeated bytes id = 1;</code>
     */
    public Builder clearId() {
      id_ = java.util.Collections.emptyList();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }

    private com.google.protobuf.Internal.IntList rES_ = emptyIntList();
    private void ensureRESIsMutable() {
      if (!((bitField0_ & 0x00000002) != 0)) {
        rES_ = mutableCopy(rES_);
        bitField0_ |= 0x00000002;
       }
    }
    /**
     * <code>repeated int32 RES = 2;</code>
     */
    public java.util.List<java.lang.Integer>
        getRESList() {
      return ((bitField0_ & 0x00000002) != 0) ?
               java.util.Collections.unmodifiableList(rES_) : rES_;
    }
    /**
     * <code>repeated int32 RES = 2;</code>
     */
    public int getRESCount() {
      return rES_.size();
    }
    /**
     * <code>repeated int32 RES = 2;</code>
     */
    public int getRES(int index) {
      return rES_.getInt(index);
    }
    /**
     * <code>repeated int32 RES = 2;</code>
     */
    public Builder setRES(
        int index, int value) {
      ensureRESIsMutable();
      rES_.setInt(index, value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated int32 RES = 2;</code>
     */
    public Builder addRES(int value) {
      ensureRESIsMutable();
      rES_.addInt(value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated int32 RES = 2;</code>
     */
    public Builder addAllRES(
        java.lang.Iterable<? extends java.lang.Integer> values) {
      ensureRESIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(
          values, rES_);
      onChanged();
      return this;
    }
    /**
     * <code>repeated int32 RES = 2;</code>
     */
    public Builder clearRES() {
      rES_ = emptyIntList();
      bitField0_ = (bitField0_ & ~0x00000002);
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


    // @@protoc_insertion_point(builder_scope:pbrebuilder.MultiTaskOpResult)
  }

  // @@protoc_insertion_point(class_scope:pbrebuilder.MultiTaskOpResult)
  private static final io.yottachain.nodemgmt.rebuilder.pb.MultiTaskOpResult DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new io.yottachain.nodemgmt.rebuilder.pb.MultiTaskOpResult();
  }

  public static io.yottachain.nodemgmt.rebuilder.pb.MultiTaskOpResult getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<MultiTaskOpResult>
      PARSER = new com.google.protobuf.AbstractParser<MultiTaskOpResult>() {
    @java.lang.Override
    public MultiTaskOpResult parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new MultiTaskOpResult(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<MultiTaskOpResult> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<MultiTaskOpResult> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public io.yottachain.nodemgmt.rebuilder.pb.MultiTaskOpResult getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
