// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: types.proto

package io.yottachain.nodemgmt.analysis.pb;

/**
 * <pre>
 * request message of GetInvalidNodes function
 * </pre>
 *
 * Protobuf type {@code pb.GetInvalidNodesResp}
 */
public  final class GetInvalidNodesResp extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:pb.GetInvalidNodesResp)
    GetInvalidNodesRespOrBuilder {
private static final long serialVersionUID = 0L;
  // Use GetInvalidNodesResp.newBuilder() to construct.
  private GetInvalidNodesResp(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private GetInvalidNodesResp() {
    shardCounts_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new GetInvalidNodesResp();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private GetInvalidNodesResp(
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
              shardCounts_ = new java.util.ArrayList<io.yottachain.nodemgmt.analysis.pb.ShardCountMsg>();
              mutable_bitField0_ |= 0x00000001;
            }
            shardCounts_.add(
                input.readMessage(io.yottachain.nodemgmt.analysis.pb.ShardCountMsg.parser(), extensionRegistry));
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
        shardCounts_ = java.util.Collections.unmodifiableList(shardCounts_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return io.yottachain.nodemgmt.analysis.pb.AnalysisProto.internal_static_pb_GetInvalidNodesResp_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return io.yottachain.nodemgmt.analysis.pb.AnalysisProto.internal_static_pb_GetInvalidNodesResp_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            io.yottachain.nodemgmt.analysis.pb.GetInvalidNodesResp.class, io.yottachain.nodemgmt.analysis.pb.GetInvalidNodesResp.Builder.class);
  }

  public static final int SHARDCOUNTS_FIELD_NUMBER = 1;
  private java.util.List<io.yottachain.nodemgmt.analysis.pb.ShardCountMsg> shardCounts_;
  /**
   * <code>repeated .pb.ShardCountMsg shardCounts = 1;</code>
   */
  public java.util.List<io.yottachain.nodemgmt.analysis.pb.ShardCountMsg> getShardCountsList() {
    return shardCounts_;
  }
  /**
   * <code>repeated .pb.ShardCountMsg shardCounts = 1;</code>
   */
  public java.util.List<? extends io.yottachain.nodemgmt.analysis.pb.ShardCountMsgOrBuilder> 
      getShardCountsOrBuilderList() {
    return shardCounts_;
  }
  /**
   * <code>repeated .pb.ShardCountMsg shardCounts = 1;</code>
   */
  public int getShardCountsCount() {
    return shardCounts_.size();
  }
  /**
   * <code>repeated .pb.ShardCountMsg shardCounts = 1;</code>
   */
  public io.yottachain.nodemgmt.analysis.pb.ShardCountMsg getShardCounts(int index) {
    return shardCounts_.get(index);
  }
  /**
   * <code>repeated .pb.ShardCountMsg shardCounts = 1;</code>
   */
  public io.yottachain.nodemgmt.analysis.pb.ShardCountMsgOrBuilder getShardCountsOrBuilder(
      int index) {
    return shardCounts_.get(index);
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
    for (int i = 0; i < shardCounts_.size(); i++) {
      output.writeMessage(1, shardCounts_.get(i));
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < shardCounts_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, shardCounts_.get(i));
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
    if (!(obj instanceof io.yottachain.nodemgmt.analysis.pb.GetInvalidNodesResp)) {
      return super.equals(obj);
    }
    io.yottachain.nodemgmt.analysis.pb.GetInvalidNodesResp other = (io.yottachain.nodemgmt.analysis.pb.GetInvalidNodesResp) obj;

    if (!getShardCountsList()
        .equals(other.getShardCountsList())) return false;
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
    if (getShardCountsCount() > 0) {
      hash = (37 * hash) + SHARDCOUNTS_FIELD_NUMBER;
      hash = (53 * hash) + getShardCountsList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static io.yottachain.nodemgmt.analysis.pb.GetInvalidNodesResp parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.yottachain.nodemgmt.analysis.pb.GetInvalidNodesResp parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.yottachain.nodemgmt.analysis.pb.GetInvalidNodesResp parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.yottachain.nodemgmt.analysis.pb.GetInvalidNodesResp parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.yottachain.nodemgmt.analysis.pb.GetInvalidNodesResp parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.yottachain.nodemgmt.analysis.pb.GetInvalidNodesResp parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.yottachain.nodemgmt.analysis.pb.GetInvalidNodesResp parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.yottachain.nodemgmt.analysis.pb.GetInvalidNodesResp parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.yottachain.nodemgmt.analysis.pb.GetInvalidNodesResp parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static io.yottachain.nodemgmt.analysis.pb.GetInvalidNodesResp parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.yottachain.nodemgmt.analysis.pb.GetInvalidNodesResp parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.yottachain.nodemgmt.analysis.pb.GetInvalidNodesResp parseFrom(
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
  public static Builder newBuilder(io.yottachain.nodemgmt.analysis.pb.GetInvalidNodesResp prototype) {
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
   * request message of GetInvalidNodes function
   * </pre>
   *
   * Protobuf type {@code pb.GetInvalidNodesResp}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:pb.GetInvalidNodesResp)
      io.yottachain.nodemgmt.analysis.pb.GetInvalidNodesRespOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return io.yottachain.nodemgmt.analysis.pb.AnalysisProto.internal_static_pb_GetInvalidNodesResp_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.yottachain.nodemgmt.analysis.pb.AnalysisProto.internal_static_pb_GetInvalidNodesResp_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.yottachain.nodemgmt.analysis.pb.GetInvalidNodesResp.class, io.yottachain.nodemgmt.analysis.pb.GetInvalidNodesResp.Builder.class);
    }

    // Construct using io.yottachain.nodemgmt.analysis.pb.GetInvalidNodesResp.newBuilder()
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
        getShardCountsFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (shardCountsBuilder_ == null) {
        shardCounts_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        shardCountsBuilder_.clear();
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return io.yottachain.nodemgmt.analysis.pb.AnalysisProto.internal_static_pb_GetInvalidNodesResp_descriptor;
    }

    @java.lang.Override
    public io.yottachain.nodemgmt.analysis.pb.GetInvalidNodesResp getDefaultInstanceForType() {
      return io.yottachain.nodemgmt.analysis.pb.GetInvalidNodesResp.getDefaultInstance();
    }

    @java.lang.Override
    public io.yottachain.nodemgmt.analysis.pb.GetInvalidNodesResp build() {
      io.yottachain.nodemgmt.analysis.pb.GetInvalidNodesResp result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public io.yottachain.nodemgmt.analysis.pb.GetInvalidNodesResp buildPartial() {
      io.yottachain.nodemgmt.analysis.pb.GetInvalidNodesResp result = new io.yottachain.nodemgmt.analysis.pb.GetInvalidNodesResp(this);
      int from_bitField0_ = bitField0_;
      if (shardCountsBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          shardCounts_ = java.util.Collections.unmodifiableList(shardCounts_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.shardCounts_ = shardCounts_;
      } else {
        result.shardCounts_ = shardCountsBuilder_.build();
      }
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
      if (other instanceof io.yottachain.nodemgmt.analysis.pb.GetInvalidNodesResp) {
        return mergeFrom((io.yottachain.nodemgmt.analysis.pb.GetInvalidNodesResp)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(io.yottachain.nodemgmt.analysis.pb.GetInvalidNodesResp other) {
      if (other == io.yottachain.nodemgmt.analysis.pb.GetInvalidNodesResp.getDefaultInstance()) return this;
      if (shardCountsBuilder_ == null) {
        if (!other.shardCounts_.isEmpty()) {
          if (shardCounts_.isEmpty()) {
            shardCounts_ = other.shardCounts_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureShardCountsIsMutable();
            shardCounts_.addAll(other.shardCounts_);
          }
          onChanged();
        }
      } else {
        if (!other.shardCounts_.isEmpty()) {
          if (shardCountsBuilder_.isEmpty()) {
            shardCountsBuilder_.dispose();
            shardCountsBuilder_ = null;
            shardCounts_ = other.shardCounts_;
            bitField0_ = (bitField0_ & ~0x00000001);
            shardCountsBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getShardCountsFieldBuilder() : null;
          } else {
            shardCountsBuilder_.addAllMessages(other.shardCounts_);
          }
        }
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
      io.yottachain.nodemgmt.analysis.pb.GetInvalidNodesResp parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (io.yottachain.nodemgmt.analysis.pb.GetInvalidNodesResp) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.util.List<io.yottachain.nodemgmt.analysis.pb.ShardCountMsg> shardCounts_ =
      java.util.Collections.emptyList();
    private void ensureShardCountsIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        shardCounts_ = new java.util.ArrayList<io.yottachain.nodemgmt.analysis.pb.ShardCountMsg>(shardCounts_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        io.yottachain.nodemgmt.analysis.pb.ShardCountMsg, io.yottachain.nodemgmt.analysis.pb.ShardCountMsg.Builder, io.yottachain.nodemgmt.analysis.pb.ShardCountMsgOrBuilder> shardCountsBuilder_;

    /**
     * <code>repeated .pb.ShardCountMsg shardCounts = 1;</code>
     */
    public java.util.List<io.yottachain.nodemgmt.analysis.pb.ShardCountMsg> getShardCountsList() {
      if (shardCountsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(shardCounts_);
      } else {
        return shardCountsBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .pb.ShardCountMsg shardCounts = 1;</code>
     */
    public int getShardCountsCount() {
      if (shardCountsBuilder_ == null) {
        return shardCounts_.size();
      } else {
        return shardCountsBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .pb.ShardCountMsg shardCounts = 1;</code>
     */
    public io.yottachain.nodemgmt.analysis.pb.ShardCountMsg getShardCounts(int index) {
      if (shardCountsBuilder_ == null) {
        return shardCounts_.get(index);
      } else {
        return shardCountsBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .pb.ShardCountMsg shardCounts = 1;</code>
     */
    public Builder setShardCounts(
        int index, io.yottachain.nodemgmt.analysis.pb.ShardCountMsg value) {
      if (shardCountsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureShardCountsIsMutable();
        shardCounts_.set(index, value);
        onChanged();
      } else {
        shardCountsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .pb.ShardCountMsg shardCounts = 1;</code>
     */
    public Builder setShardCounts(
        int index, io.yottachain.nodemgmt.analysis.pb.ShardCountMsg.Builder builderForValue) {
      if (shardCountsBuilder_ == null) {
        ensureShardCountsIsMutable();
        shardCounts_.set(index, builderForValue.build());
        onChanged();
      } else {
        shardCountsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .pb.ShardCountMsg shardCounts = 1;</code>
     */
    public Builder addShardCounts(io.yottachain.nodemgmt.analysis.pb.ShardCountMsg value) {
      if (shardCountsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureShardCountsIsMutable();
        shardCounts_.add(value);
        onChanged();
      } else {
        shardCountsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .pb.ShardCountMsg shardCounts = 1;</code>
     */
    public Builder addShardCounts(
        int index, io.yottachain.nodemgmt.analysis.pb.ShardCountMsg value) {
      if (shardCountsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureShardCountsIsMutable();
        shardCounts_.add(index, value);
        onChanged();
      } else {
        shardCountsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .pb.ShardCountMsg shardCounts = 1;</code>
     */
    public Builder addShardCounts(
        io.yottachain.nodemgmt.analysis.pb.ShardCountMsg.Builder builderForValue) {
      if (shardCountsBuilder_ == null) {
        ensureShardCountsIsMutable();
        shardCounts_.add(builderForValue.build());
        onChanged();
      } else {
        shardCountsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .pb.ShardCountMsg shardCounts = 1;</code>
     */
    public Builder addShardCounts(
        int index, io.yottachain.nodemgmt.analysis.pb.ShardCountMsg.Builder builderForValue) {
      if (shardCountsBuilder_ == null) {
        ensureShardCountsIsMutable();
        shardCounts_.add(index, builderForValue.build());
        onChanged();
      } else {
        shardCountsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .pb.ShardCountMsg shardCounts = 1;</code>
     */
    public Builder addAllShardCounts(
        java.lang.Iterable<? extends io.yottachain.nodemgmt.analysis.pb.ShardCountMsg> values) {
      if (shardCountsBuilder_ == null) {
        ensureShardCountsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, shardCounts_);
        onChanged();
      } else {
        shardCountsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .pb.ShardCountMsg shardCounts = 1;</code>
     */
    public Builder clearShardCounts() {
      if (shardCountsBuilder_ == null) {
        shardCounts_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        shardCountsBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .pb.ShardCountMsg shardCounts = 1;</code>
     */
    public Builder removeShardCounts(int index) {
      if (shardCountsBuilder_ == null) {
        ensureShardCountsIsMutable();
        shardCounts_.remove(index);
        onChanged();
      } else {
        shardCountsBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .pb.ShardCountMsg shardCounts = 1;</code>
     */
    public io.yottachain.nodemgmt.analysis.pb.ShardCountMsg.Builder getShardCountsBuilder(
        int index) {
      return getShardCountsFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .pb.ShardCountMsg shardCounts = 1;</code>
     */
    public io.yottachain.nodemgmt.analysis.pb.ShardCountMsgOrBuilder getShardCountsOrBuilder(
        int index) {
      if (shardCountsBuilder_ == null) {
        return shardCounts_.get(index);  } else {
        return shardCountsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .pb.ShardCountMsg shardCounts = 1;</code>
     */
    public java.util.List<? extends io.yottachain.nodemgmt.analysis.pb.ShardCountMsgOrBuilder> 
         getShardCountsOrBuilderList() {
      if (shardCountsBuilder_ != null) {
        return shardCountsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(shardCounts_);
      }
    }
    /**
     * <code>repeated .pb.ShardCountMsg shardCounts = 1;</code>
     */
    public io.yottachain.nodemgmt.analysis.pb.ShardCountMsg.Builder addShardCountsBuilder() {
      return getShardCountsFieldBuilder().addBuilder(
          io.yottachain.nodemgmt.analysis.pb.ShardCountMsg.getDefaultInstance());
    }
    /**
     * <code>repeated .pb.ShardCountMsg shardCounts = 1;</code>
     */
    public io.yottachain.nodemgmt.analysis.pb.ShardCountMsg.Builder addShardCountsBuilder(
        int index) {
      return getShardCountsFieldBuilder().addBuilder(
          index, io.yottachain.nodemgmt.analysis.pb.ShardCountMsg.getDefaultInstance());
    }
    /**
     * <code>repeated .pb.ShardCountMsg shardCounts = 1;</code>
     */
    public java.util.List<io.yottachain.nodemgmt.analysis.pb.ShardCountMsg.Builder> 
         getShardCountsBuilderList() {
      return getShardCountsFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        io.yottachain.nodemgmt.analysis.pb.ShardCountMsg, io.yottachain.nodemgmt.analysis.pb.ShardCountMsg.Builder, io.yottachain.nodemgmt.analysis.pb.ShardCountMsgOrBuilder> 
        getShardCountsFieldBuilder() {
      if (shardCountsBuilder_ == null) {
        shardCountsBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            io.yottachain.nodemgmt.analysis.pb.ShardCountMsg, io.yottachain.nodemgmt.analysis.pb.ShardCountMsg.Builder, io.yottachain.nodemgmt.analysis.pb.ShardCountMsgOrBuilder>(
                shardCounts_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        shardCounts_ = null;
      }
      return shardCountsBuilder_;
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


    // @@protoc_insertion_point(builder_scope:pb.GetInvalidNodesResp)
  }

  // @@protoc_insertion_point(class_scope:pb.GetInvalidNodesResp)
  private static final io.yottachain.nodemgmt.analysis.pb.GetInvalidNodesResp DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new io.yottachain.nodemgmt.analysis.pb.GetInvalidNodesResp();
  }

  public static io.yottachain.nodemgmt.analysis.pb.GetInvalidNodesResp getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<GetInvalidNodesResp>
      PARSER = new com.google.protobuf.AbstractParser<GetInvalidNodesResp>() {
    @java.lang.Override
    public GetInvalidNodesResp parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new GetInvalidNodesResp(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<GetInvalidNodesResp> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<GetInvalidNodesResp> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public io.yottachain.nodemgmt.analysis.pb.GetInvalidNodesResp getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
