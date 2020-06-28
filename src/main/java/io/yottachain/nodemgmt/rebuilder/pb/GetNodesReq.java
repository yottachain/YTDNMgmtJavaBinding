// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: types.proto

package io.yottachain.nodemgmt.rebuilder.pb;

/**
 * <pre>
 * request message of GetNodes function
 * </pre>
 *
 * Protobuf type {@code pb.GetNodesReq}
 */
public  final class GetNodesReq extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:pb.GetNodesReq)
    GetNodesReqOrBuilder {
private static final long serialVersionUID = 0L;
  // Use GetNodesReq.newBuilder() to construct.
  private GetNodesReq(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private GetNodesReq() {
    nodeIDs_ = emptyIntList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new GetNodesReq();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private GetNodesReq(
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
          case 8: {
            if (!((mutable_bitField0_ & 0x00000001) != 0)) {
              nodeIDs_ = newIntList();
              mutable_bitField0_ |= 0x00000001;
            }
            nodeIDs_.addInt(input.readInt32());
            break;
          }
          case 10: {
            int length = input.readRawVarint32();
            int limit = input.pushLimit(length);
            if (!((mutable_bitField0_ & 0x00000001) != 0) && input.getBytesUntilLimit() > 0) {
              nodeIDs_ = newIntList();
              mutable_bitField0_ |= 0x00000001;
            }
            while (input.getBytesUntilLimit() > 0) {
              nodeIDs_.addInt(input.readInt32());
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
        nodeIDs_.makeImmutable(); // C
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return io.yottachain.nodemgmt.rebuilder.pb.RebuilderProto.internal_static_pb_GetNodesReq_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return io.yottachain.nodemgmt.rebuilder.pb.RebuilderProto.internal_static_pb_GetNodesReq_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            io.yottachain.nodemgmt.rebuilder.pb.GetNodesReq.class, io.yottachain.nodemgmt.rebuilder.pb.GetNodesReq.Builder.class);
  }

  public static final int NODEIDS_FIELD_NUMBER = 1;
  private com.google.protobuf.Internal.IntList nodeIDs_;
  /**
   * <code>repeated int32 nodeIDs = 1;</code>
   */
  public java.util.List<java.lang.Integer>
      getNodeIDsList() {
    return nodeIDs_;
  }
  /**
   * <code>repeated int32 nodeIDs = 1;</code>
   */
  public int getNodeIDsCount() {
    return nodeIDs_.size();
  }
  /**
   * <code>repeated int32 nodeIDs = 1;</code>
   */
  public int getNodeIDs(int index) {
    return nodeIDs_.getInt(index);
  }
  private int nodeIDsMemoizedSerializedSize = -1;

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
    if (getNodeIDsList().size() > 0) {
      output.writeUInt32NoTag(10);
      output.writeUInt32NoTag(nodeIDsMemoizedSerializedSize);
    }
    for (int i = 0; i < nodeIDs_.size(); i++) {
      output.writeInt32NoTag(nodeIDs_.getInt(i));
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
      for (int i = 0; i < nodeIDs_.size(); i++) {
        dataSize += com.google.protobuf.CodedOutputStream
          .computeInt32SizeNoTag(nodeIDs_.getInt(i));
      }
      size += dataSize;
      if (!getNodeIDsList().isEmpty()) {
        size += 1;
        size += com.google.protobuf.CodedOutputStream
            .computeInt32SizeNoTag(dataSize);
      }
      nodeIDsMemoizedSerializedSize = dataSize;
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
    if (!(obj instanceof io.yottachain.nodemgmt.rebuilder.pb.GetNodesReq)) {
      return super.equals(obj);
    }
    io.yottachain.nodemgmt.rebuilder.pb.GetNodesReq other = (io.yottachain.nodemgmt.rebuilder.pb.GetNodesReq) obj;

    if (!getNodeIDsList()
        .equals(other.getNodeIDsList())) return false;
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
    if (getNodeIDsCount() > 0) {
      hash = (37 * hash) + NODEIDS_FIELD_NUMBER;
      hash = (53 * hash) + getNodeIDsList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static io.yottachain.nodemgmt.rebuilder.pb.GetNodesReq parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.yottachain.nodemgmt.rebuilder.pb.GetNodesReq parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.yottachain.nodemgmt.rebuilder.pb.GetNodesReq parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.yottachain.nodemgmt.rebuilder.pb.GetNodesReq parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.yottachain.nodemgmt.rebuilder.pb.GetNodesReq parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.yottachain.nodemgmt.rebuilder.pb.GetNodesReq parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.yottachain.nodemgmt.rebuilder.pb.GetNodesReq parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.yottachain.nodemgmt.rebuilder.pb.GetNodesReq parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.yottachain.nodemgmt.rebuilder.pb.GetNodesReq parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static io.yottachain.nodemgmt.rebuilder.pb.GetNodesReq parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.yottachain.nodemgmt.rebuilder.pb.GetNodesReq parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.yottachain.nodemgmt.rebuilder.pb.GetNodesReq parseFrom(
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
  public static Builder newBuilder(io.yottachain.nodemgmt.rebuilder.pb.GetNodesReq prototype) {
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
   * request message of GetNodes function
   * </pre>
   *
   * Protobuf type {@code pb.GetNodesReq}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:pb.GetNodesReq)
      io.yottachain.nodemgmt.rebuilder.pb.GetNodesReqOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return io.yottachain.nodemgmt.rebuilder.pb.RebuilderProto.internal_static_pb_GetNodesReq_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.yottachain.nodemgmt.rebuilder.pb.RebuilderProto.internal_static_pb_GetNodesReq_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.yottachain.nodemgmt.rebuilder.pb.GetNodesReq.class, io.yottachain.nodemgmt.rebuilder.pb.GetNodesReq.Builder.class);
    }

    // Construct using io.yottachain.nodemgmt.rebuilder.pb.GetNodesReq.newBuilder()
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
      nodeIDs_ = emptyIntList();
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return io.yottachain.nodemgmt.rebuilder.pb.RebuilderProto.internal_static_pb_GetNodesReq_descriptor;
    }

    @java.lang.Override
    public io.yottachain.nodemgmt.rebuilder.pb.GetNodesReq getDefaultInstanceForType() {
      return io.yottachain.nodemgmt.rebuilder.pb.GetNodesReq.getDefaultInstance();
    }

    @java.lang.Override
    public io.yottachain.nodemgmt.rebuilder.pb.GetNodesReq build() {
      io.yottachain.nodemgmt.rebuilder.pb.GetNodesReq result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public io.yottachain.nodemgmt.rebuilder.pb.GetNodesReq buildPartial() {
      io.yottachain.nodemgmt.rebuilder.pb.GetNodesReq result = new io.yottachain.nodemgmt.rebuilder.pb.GetNodesReq(this);
      int from_bitField0_ = bitField0_;
      if (((bitField0_ & 0x00000001) != 0)) {
        nodeIDs_.makeImmutable();
        bitField0_ = (bitField0_ & ~0x00000001);
      }
      result.nodeIDs_ = nodeIDs_;
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
      if (other instanceof io.yottachain.nodemgmt.rebuilder.pb.GetNodesReq) {
        return mergeFrom((io.yottachain.nodemgmt.rebuilder.pb.GetNodesReq)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(io.yottachain.nodemgmt.rebuilder.pb.GetNodesReq other) {
      if (other == io.yottachain.nodemgmt.rebuilder.pb.GetNodesReq.getDefaultInstance()) return this;
      if (!other.nodeIDs_.isEmpty()) {
        if (nodeIDs_.isEmpty()) {
          nodeIDs_ = other.nodeIDs_;
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          ensureNodeIDsIsMutable();
          nodeIDs_.addAll(other.nodeIDs_);
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
      io.yottachain.nodemgmt.rebuilder.pb.GetNodesReq parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (io.yottachain.nodemgmt.rebuilder.pb.GetNodesReq) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private com.google.protobuf.Internal.IntList nodeIDs_ = emptyIntList();
    private void ensureNodeIDsIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        nodeIDs_ = mutableCopy(nodeIDs_);
        bitField0_ |= 0x00000001;
       }
    }
    /**
     * <code>repeated int32 nodeIDs = 1;</code>
     */
    public java.util.List<java.lang.Integer>
        getNodeIDsList() {
      return ((bitField0_ & 0x00000001) != 0) ?
               java.util.Collections.unmodifiableList(nodeIDs_) : nodeIDs_;
    }
    /**
     * <code>repeated int32 nodeIDs = 1;</code>
     */
    public int getNodeIDsCount() {
      return nodeIDs_.size();
    }
    /**
     * <code>repeated int32 nodeIDs = 1;</code>
     */
    public int getNodeIDs(int index) {
      return nodeIDs_.getInt(index);
    }
    /**
     * <code>repeated int32 nodeIDs = 1;</code>
     */
    public Builder setNodeIDs(
        int index, int value) {
      ensureNodeIDsIsMutable();
      nodeIDs_.setInt(index, value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated int32 nodeIDs = 1;</code>
     */
    public Builder addNodeIDs(int value) {
      ensureNodeIDsIsMutable();
      nodeIDs_.addInt(value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated int32 nodeIDs = 1;</code>
     */
    public Builder addAllNodeIDs(
        java.lang.Iterable<? extends java.lang.Integer> values) {
      ensureNodeIDsIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(
          values, nodeIDs_);
      onChanged();
      return this;
    }
    /**
     * <code>repeated int32 nodeIDs = 1;</code>
     */
    public Builder clearNodeIDs() {
      nodeIDs_ = emptyIntList();
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


    // @@protoc_insertion_point(builder_scope:pb.GetNodesReq)
  }

  // @@protoc_insertion_point(class_scope:pb.GetNodesReq)
  private static final io.yottachain.nodemgmt.rebuilder.pb.GetNodesReq DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new io.yottachain.nodemgmt.rebuilder.pb.GetNodesReq();
  }

  public static io.yottachain.nodemgmt.rebuilder.pb.GetNodesReq getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<GetNodesReq>
      PARSER = new com.google.protobuf.AbstractParser<GetNodesReq>() {
    @java.lang.Override
    public GetNodesReq parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new GetNodesReq(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<GetNodesReq> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<GetNodesReq> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public io.yottachain.nodemgmt.rebuilder.pb.GetNodesReq getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

