// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: types.proto

package io.yottachain.nodemgmt.pb;

/**
 * <pre>
 * response message of GetInvalidNodes function
 * </pre>
 *
 * Protobuf type {@code pb.GetRebuildItemResp}
 */
public  final class GetRebuildItemResp extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:pb.GetRebuildItemResp)
    GetRebuildItemRespOrBuilder {
private static final long serialVersionUID = 0L;
  // Use GetRebuildItemResp.newBuilder() to construct.
  private GetRebuildItemResp(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private GetRebuildItemResp() {
    shards_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new GetRebuildItemResp();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private GetRebuildItemResp(
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
            io.yottachain.nodemgmt.pb.NodeMsg.Builder subBuilder = null;
            if (node_ != null) {
              subBuilder = node_.toBuilder();
            }
            node_ = input.readMessage(io.yottachain.nodemgmt.pb.NodeMsg.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(node_);
              node_ = subBuilder.buildPartial();
            }

            break;
          }
          case 18: {
            if (!((mutable_bitField0_ & 0x00000001) != 0)) {
              shards_ = new java.util.ArrayList<com.google.protobuf.ByteString>();
              mutable_bitField0_ |= 0x00000001;
            }
            shards_.add(input.readBytes());
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
        shards_ = java.util.Collections.unmodifiableList(shards_); // C
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return io.yottachain.nodemgmt.pb.NodeMgmtProto.internal_static_pb_GetRebuildItemResp_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return io.yottachain.nodemgmt.pb.NodeMgmtProto.internal_static_pb_GetRebuildItemResp_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            io.yottachain.nodemgmt.pb.GetRebuildItemResp.class, io.yottachain.nodemgmt.pb.GetRebuildItemResp.Builder.class);
  }

  public static final int NODE_FIELD_NUMBER = 1;
  private io.yottachain.nodemgmt.pb.NodeMsg node_;
  /**
   * <code>.pb.NodeMsg node = 1;</code>
   */
  public boolean hasNode() {
    return node_ != null;
  }
  /**
   * <code>.pb.NodeMsg node = 1;</code>
   */
  public io.yottachain.nodemgmt.pb.NodeMsg getNode() {
    return node_ == null ? io.yottachain.nodemgmt.pb.NodeMsg.getDefaultInstance() : node_;
  }
  /**
   * <code>.pb.NodeMsg node = 1;</code>
   */
  public io.yottachain.nodemgmt.pb.NodeMsgOrBuilder getNodeOrBuilder() {
    return getNode();
  }

  public static final int SHARDS_FIELD_NUMBER = 2;
  private java.util.List<com.google.protobuf.ByteString> shards_;
  /**
   * <code>repeated bytes shards = 2;</code>
   */
  public java.util.List<com.google.protobuf.ByteString>
      getShardsList() {
    return shards_;
  }
  /**
   * <code>repeated bytes shards = 2;</code>
   */
  public int getShardsCount() {
    return shards_.size();
  }
  /**
   * <code>repeated bytes shards = 2;</code>
   */
  public com.google.protobuf.ByteString getShards(int index) {
    return shards_.get(index);
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
    if (node_ != null) {
      output.writeMessage(1, getNode());
    }
    for (int i = 0; i < shards_.size(); i++) {
      output.writeBytes(2, shards_.get(i));
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (node_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getNode());
    }
    {
      int dataSize = 0;
      for (int i = 0; i < shards_.size(); i++) {
        dataSize += com.google.protobuf.CodedOutputStream
          .computeBytesSizeNoTag(shards_.get(i));
      }
      size += dataSize;
      size += 1 * getShardsList().size();
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
    if (!(obj instanceof io.yottachain.nodemgmt.pb.GetRebuildItemResp)) {
      return super.equals(obj);
    }
    io.yottachain.nodemgmt.pb.GetRebuildItemResp other = (io.yottachain.nodemgmt.pb.GetRebuildItemResp) obj;

    if (hasNode() != other.hasNode()) return false;
    if (hasNode()) {
      if (!getNode()
          .equals(other.getNode())) return false;
    }
    if (!getShardsList()
        .equals(other.getShardsList())) return false;
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
    if (hasNode()) {
      hash = (37 * hash) + NODE_FIELD_NUMBER;
      hash = (53 * hash) + getNode().hashCode();
    }
    if (getShardsCount() > 0) {
      hash = (37 * hash) + SHARDS_FIELD_NUMBER;
      hash = (53 * hash) + getShardsList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static io.yottachain.nodemgmt.pb.GetRebuildItemResp parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.yottachain.nodemgmt.pb.GetRebuildItemResp parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.yottachain.nodemgmt.pb.GetRebuildItemResp parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.yottachain.nodemgmt.pb.GetRebuildItemResp parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.yottachain.nodemgmt.pb.GetRebuildItemResp parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.yottachain.nodemgmt.pb.GetRebuildItemResp parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.yottachain.nodemgmt.pb.GetRebuildItemResp parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.yottachain.nodemgmt.pb.GetRebuildItemResp parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.yottachain.nodemgmt.pb.GetRebuildItemResp parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static io.yottachain.nodemgmt.pb.GetRebuildItemResp parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.yottachain.nodemgmt.pb.GetRebuildItemResp parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.yottachain.nodemgmt.pb.GetRebuildItemResp parseFrom(
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
  public static Builder newBuilder(io.yottachain.nodemgmt.pb.GetRebuildItemResp prototype) {
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
   * response message of GetInvalidNodes function
   * </pre>
   *
   * Protobuf type {@code pb.GetRebuildItemResp}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:pb.GetRebuildItemResp)
      io.yottachain.nodemgmt.pb.GetRebuildItemRespOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return io.yottachain.nodemgmt.pb.NodeMgmtProto.internal_static_pb_GetRebuildItemResp_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.yottachain.nodemgmt.pb.NodeMgmtProto.internal_static_pb_GetRebuildItemResp_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.yottachain.nodemgmt.pb.GetRebuildItemResp.class, io.yottachain.nodemgmt.pb.GetRebuildItemResp.Builder.class);
    }

    // Construct using io.yottachain.nodemgmt.pb.GetRebuildItemResp.newBuilder()
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
      if (nodeBuilder_ == null) {
        node_ = null;
      } else {
        node_ = null;
        nodeBuilder_ = null;
      }
      shards_ = java.util.Collections.emptyList();
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return io.yottachain.nodemgmt.pb.NodeMgmtProto.internal_static_pb_GetRebuildItemResp_descriptor;
    }

    @java.lang.Override
    public io.yottachain.nodemgmt.pb.GetRebuildItemResp getDefaultInstanceForType() {
      return io.yottachain.nodemgmt.pb.GetRebuildItemResp.getDefaultInstance();
    }

    @java.lang.Override
    public io.yottachain.nodemgmt.pb.GetRebuildItemResp build() {
      io.yottachain.nodemgmt.pb.GetRebuildItemResp result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public io.yottachain.nodemgmt.pb.GetRebuildItemResp buildPartial() {
      io.yottachain.nodemgmt.pb.GetRebuildItemResp result = new io.yottachain.nodemgmt.pb.GetRebuildItemResp(this);
      int from_bitField0_ = bitField0_;
      if (nodeBuilder_ == null) {
        result.node_ = node_;
      } else {
        result.node_ = nodeBuilder_.build();
      }
      if (((bitField0_ & 0x00000001) != 0)) {
        shards_ = java.util.Collections.unmodifiableList(shards_);
        bitField0_ = (bitField0_ & ~0x00000001);
      }
      result.shards_ = shards_;
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
      if (other instanceof io.yottachain.nodemgmt.pb.GetRebuildItemResp) {
        return mergeFrom((io.yottachain.nodemgmt.pb.GetRebuildItemResp)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(io.yottachain.nodemgmt.pb.GetRebuildItemResp other) {
      if (other == io.yottachain.nodemgmt.pb.GetRebuildItemResp.getDefaultInstance()) return this;
      if (other.hasNode()) {
        mergeNode(other.getNode());
      }
      if (!other.shards_.isEmpty()) {
        if (shards_.isEmpty()) {
          shards_ = other.shards_;
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          ensureShardsIsMutable();
          shards_.addAll(other.shards_);
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
      io.yottachain.nodemgmt.pb.GetRebuildItemResp parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (io.yottachain.nodemgmt.pb.GetRebuildItemResp) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private io.yottachain.nodemgmt.pb.NodeMsg node_;
    private com.google.protobuf.SingleFieldBuilderV3<
        io.yottachain.nodemgmt.pb.NodeMsg, io.yottachain.nodemgmt.pb.NodeMsg.Builder, io.yottachain.nodemgmt.pb.NodeMsgOrBuilder> nodeBuilder_;
    /**
     * <code>.pb.NodeMsg node = 1;</code>
     */
    public boolean hasNode() {
      return nodeBuilder_ != null || node_ != null;
    }
    /**
     * <code>.pb.NodeMsg node = 1;</code>
     */
    public io.yottachain.nodemgmt.pb.NodeMsg getNode() {
      if (nodeBuilder_ == null) {
        return node_ == null ? io.yottachain.nodemgmt.pb.NodeMsg.getDefaultInstance() : node_;
      } else {
        return nodeBuilder_.getMessage();
      }
    }
    /**
     * <code>.pb.NodeMsg node = 1;</code>
     */
    public Builder setNode(io.yottachain.nodemgmt.pb.NodeMsg value) {
      if (nodeBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        node_ = value;
        onChanged();
      } else {
        nodeBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.pb.NodeMsg node = 1;</code>
     */
    public Builder setNode(
        io.yottachain.nodemgmt.pb.NodeMsg.Builder builderForValue) {
      if (nodeBuilder_ == null) {
        node_ = builderForValue.build();
        onChanged();
      } else {
        nodeBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.pb.NodeMsg node = 1;</code>
     */
    public Builder mergeNode(io.yottachain.nodemgmt.pb.NodeMsg value) {
      if (nodeBuilder_ == null) {
        if (node_ != null) {
          node_ =
            io.yottachain.nodemgmt.pb.NodeMsg.newBuilder(node_).mergeFrom(value).buildPartial();
        } else {
          node_ = value;
        }
        onChanged();
      } else {
        nodeBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.pb.NodeMsg node = 1;</code>
     */
    public Builder clearNode() {
      if (nodeBuilder_ == null) {
        node_ = null;
        onChanged();
      } else {
        node_ = null;
        nodeBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.pb.NodeMsg node = 1;</code>
     */
    public io.yottachain.nodemgmt.pb.NodeMsg.Builder getNodeBuilder() {
      
      onChanged();
      return getNodeFieldBuilder().getBuilder();
    }
    /**
     * <code>.pb.NodeMsg node = 1;</code>
     */
    public io.yottachain.nodemgmt.pb.NodeMsgOrBuilder getNodeOrBuilder() {
      if (nodeBuilder_ != null) {
        return nodeBuilder_.getMessageOrBuilder();
      } else {
        return node_ == null ?
            io.yottachain.nodemgmt.pb.NodeMsg.getDefaultInstance() : node_;
      }
    }
    /**
     * <code>.pb.NodeMsg node = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        io.yottachain.nodemgmt.pb.NodeMsg, io.yottachain.nodemgmt.pb.NodeMsg.Builder, io.yottachain.nodemgmt.pb.NodeMsgOrBuilder> 
        getNodeFieldBuilder() {
      if (nodeBuilder_ == null) {
        nodeBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            io.yottachain.nodemgmt.pb.NodeMsg, io.yottachain.nodemgmt.pb.NodeMsg.Builder, io.yottachain.nodemgmt.pb.NodeMsgOrBuilder>(
                getNode(),
                getParentForChildren(),
                isClean());
        node_ = null;
      }
      return nodeBuilder_;
    }

    private java.util.List<com.google.protobuf.ByteString> shards_ = java.util.Collections.emptyList();
    private void ensureShardsIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        shards_ = new java.util.ArrayList<com.google.protobuf.ByteString>(shards_);
        bitField0_ |= 0x00000001;
       }
    }
    /**
     * <code>repeated bytes shards = 2;</code>
     */
    public java.util.List<com.google.protobuf.ByteString>
        getShardsList() {
      return ((bitField0_ & 0x00000001) != 0) ?
               java.util.Collections.unmodifiableList(shards_) : shards_;
    }
    /**
     * <code>repeated bytes shards = 2;</code>
     */
    public int getShardsCount() {
      return shards_.size();
    }
    /**
     * <code>repeated bytes shards = 2;</code>
     */
    public com.google.protobuf.ByteString getShards(int index) {
      return shards_.get(index);
    }
    /**
     * <code>repeated bytes shards = 2;</code>
     */
    public Builder setShards(
        int index, com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  ensureShardsIsMutable();
      shards_.set(index, value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated bytes shards = 2;</code>
     */
    public Builder addShards(com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  ensureShardsIsMutable();
      shards_.add(value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated bytes shards = 2;</code>
     */
    public Builder addAllShards(
        java.lang.Iterable<? extends com.google.protobuf.ByteString> values) {
      ensureShardsIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(
          values, shards_);
      onChanged();
      return this;
    }
    /**
     * <code>repeated bytes shards = 2;</code>
     */
    public Builder clearShards() {
      shards_ = java.util.Collections.emptyList();
      bitField0_ = (bitField0_ & ~0x00000001);
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


    // @@protoc_insertion_point(builder_scope:pb.GetRebuildItemResp)
  }

  // @@protoc_insertion_point(class_scope:pb.GetRebuildItemResp)
  private static final io.yottachain.nodemgmt.pb.GetRebuildItemResp DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new io.yottachain.nodemgmt.pb.GetRebuildItemResp();
  }

  public static io.yottachain.nodemgmt.pb.GetRebuildItemResp getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<GetRebuildItemResp>
      PARSER = new com.google.protobuf.AbstractParser<GetRebuildItemResp>() {
    @java.lang.Override
    public GetRebuildItemResp parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new GetRebuildItemResp(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<GetRebuildItemResp> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<GetRebuildItemResp> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public io.yottachain.nodemgmt.pb.GetRebuildItemResp getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

