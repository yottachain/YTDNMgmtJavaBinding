// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: types.proto

package io.yottachain.nodemgmt.analysis.pb;

/**
 * <pre>
 * response message with multiple nodes
 * </pre>
 *
 * Protobuf type {@code pbanalysis.NodesResp}
 */
public  final class NodesResp extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:pbanalysis.NodesResp)
    NodesRespOrBuilder {
private static final long serialVersionUID = 0L;
  // Use NodesResp.newBuilder() to construct.
  private NodesResp(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private NodesResp() {
    nodes_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new NodesResp();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private NodesResp(
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
              nodes_ = new java.util.ArrayList<io.yottachain.nodemgmt.analysis.pb.NodeMsg>();
              mutable_bitField0_ |= 0x00000001;
            }
            nodes_.add(
                input.readMessage(io.yottachain.nodemgmt.analysis.pb.NodeMsg.parser(), extensionRegistry));
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
        nodes_ = java.util.Collections.unmodifiableList(nodes_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return io.yottachain.nodemgmt.analysis.pb.AnalysisProto.internal_static_pbanalysis_NodesResp_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return io.yottachain.nodemgmt.analysis.pb.AnalysisProto.internal_static_pbanalysis_NodesResp_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            io.yottachain.nodemgmt.analysis.pb.NodesResp.class, io.yottachain.nodemgmt.analysis.pb.NodesResp.Builder.class);
  }

  public static final int NODES_FIELD_NUMBER = 1;
  private java.util.List<io.yottachain.nodemgmt.analysis.pb.NodeMsg> nodes_;
  /**
   * <code>repeated .pbanalysis.NodeMsg nodes = 1;</code>
   */
  public java.util.List<io.yottachain.nodemgmt.analysis.pb.NodeMsg> getNodesList() {
    return nodes_;
  }
  /**
   * <code>repeated .pbanalysis.NodeMsg nodes = 1;</code>
   */
  public java.util.List<? extends io.yottachain.nodemgmt.analysis.pb.NodeMsgOrBuilder> 
      getNodesOrBuilderList() {
    return nodes_;
  }
  /**
   * <code>repeated .pbanalysis.NodeMsg nodes = 1;</code>
   */
  public int getNodesCount() {
    return nodes_.size();
  }
  /**
   * <code>repeated .pbanalysis.NodeMsg nodes = 1;</code>
   */
  public io.yottachain.nodemgmt.analysis.pb.NodeMsg getNodes(int index) {
    return nodes_.get(index);
  }
  /**
   * <code>repeated .pbanalysis.NodeMsg nodes = 1;</code>
   */
  public io.yottachain.nodemgmt.analysis.pb.NodeMsgOrBuilder getNodesOrBuilder(
      int index) {
    return nodes_.get(index);
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
    for (int i = 0; i < nodes_.size(); i++) {
      output.writeMessage(1, nodes_.get(i));
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < nodes_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, nodes_.get(i));
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
    if (!(obj instanceof io.yottachain.nodemgmt.analysis.pb.NodesResp)) {
      return super.equals(obj);
    }
    io.yottachain.nodemgmt.analysis.pb.NodesResp other = (io.yottachain.nodemgmt.analysis.pb.NodesResp) obj;

    if (!getNodesList()
        .equals(other.getNodesList())) return false;
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
    if (getNodesCount() > 0) {
      hash = (37 * hash) + NODES_FIELD_NUMBER;
      hash = (53 * hash) + getNodesList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static io.yottachain.nodemgmt.analysis.pb.NodesResp parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.yottachain.nodemgmt.analysis.pb.NodesResp parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.yottachain.nodemgmt.analysis.pb.NodesResp parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.yottachain.nodemgmt.analysis.pb.NodesResp parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.yottachain.nodemgmt.analysis.pb.NodesResp parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.yottachain.nodemgmt.analysis.pb.NodesResp parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.yottachain.nodemgmt.analysis.pb.NodesResp parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.yottachain.nodemgmt.analysis.pb.NodesResp parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.yottachain.nodemgmt.analysis.pb.NodesResp parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static io.yottachain.nodemgmt.analysis.pb.NodesResp parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.yottachain.nodemgmt.analysis.pb.NodesResp parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.yottachain.nodemgmt.analysis.pb.NodesResp parseFrom(
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
  public static Builder newBuilder(io.yottachain.nodemgmt.analysis.pb.NodesResp prototype) {
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
   * response message with multiple nodes
   * </pre>
   *
   * Protobuf type {@code pbanalysis.NodesResp}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:pbanalysis.NodesResp)
      io.yottachain.nodemgmt.analysis.pb.NodesRespOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return io.yottachain.nodemgmt.analysis.pb.AnalysisProto.internal_static_pbanalysis_NodesResp_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.yottachain.nodemgmt.analysis.pb.AnalysisProto.internal_static_pbanalysis_NodesResp_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.yottachain.nodemgmt.analysis.pb.NodesResp.class, io.yottachain.nodemgmt.analysis.pb.NodesResp.Builder.class);
    }

    // Construct using io.yottachain.nodemgmt.analysis.pb.NodesResp.newBuilder()
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
        getNodesFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (nodesBuilder_ == null) {
        nodes_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        nodesBuilder_.clear();
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return io.yottachain.nodemgmt.analysis.pb.AnalysisProto.internal_static_pbanalysis_NodesResp_descriptor;
    }

    @java.lang.Override
    public io.yottachain.nodemgmt.analysis.pb.NodesResp getDefaultInstanceForType() {
      return io.yottachain.nodemgmt.analysis.pb.NodesResp.getDefaultInstance();
    }

    @java.lang.Override
    public io.yottachain.nodemgmt.analysis.pb.NodesResp build() {
      io.yottachain.nodemgmt.analysis.pb.NodesResp result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public io.yottachain.nodemgmt.analysis.pb.NodesResp buildPartial() {
      io.yottachain.nodemgmt.analysis.pb.NodesResp result = new io.yottachain.nodemgmt.analysis.pb.NodesResp(this);
      int from_bitField0_ = bitField0_;
      if (nodesBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          nodes_ = java.util.Collections.unmodifiableList(nodes_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.nodes_ = nodes_;
      } else {
        result.nodes_ = nodesBuilder_.build();
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
      if (other instanceof io.yottachain.nodemgmt.analysis.pb.NodesResp) {
        return mergeFrom((io.yottachain.nodemgmt.analysis.pb.NodesResp)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(io.yottachain.nodemgmt.analysis.pb.NodesResp other) {
      if (other == io.yottachain.nodemgmt.analysis.pb.NodesResp.getDefaultInstance()) return this;
      if (nodesBuilder_ == null) {
        if (!other.nodes_.isEmpty()) {
          if (nodes_.isEmpty()) {
            nodes_ = other.nodes_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureNodesIsMutable();
            nodes_.addAll(other.nodes_);
          }
          onChanged();
        }
      } else {
        if (!other.nodes_.isEmpty()) {
          if (nodesBuilder_.isEmpty()) {
            nodesBuilder_.dispose();
            nodesBuilder_ = null;
            nodes_ = other.nodes_;
            bitField0_ = (bitField0_ & ~0x00000001);
            nodesBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getNodesFieldBuilder() : null;
          } else {
            nodesBuilder_.addAllMessages(other.nodes_);
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
      io.yottachain.nodemgmt.analysis.pb.NodesResp parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (io.yottachain.nodemgmt.analysis.pb.NodesResp) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.util.List<io.yottachain.nodemgmt.analysis.pb.NodeMsg> nodes_ =
      java.util.Collections.emptyList();
    private void ensureNodesIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        nodes_ = new java.util.ArrayList<io.yottachain.nodemgmt.analysis.pb.NodeMsg>(nodes_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        io.yottachain.nodemgmt.analysis.pb.NodeMsg, io.yottachain.nodemgmt.analysis.pb.NodeMsg.Builder, io.yottachain.nodemgmt.analysis.pb.NodeMsgOrBuilder> nodesBuilder_;

    /**
     * <code>repeated .pbanalysis.NodeMsg nodes = 1;</code>
     */
    public java.util.List<io.yottachain.nodemgmt.analysis.pb.NodeMsg> getNodesList() {
      if (nodesBuilder_ == null) {
        return java.util.Collections.unmodifiableList(nodes_);
      } else {
        return nodesBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .pbanalysis.NodeMsg nodes = 1;</code>
     */
    public int getNodesCount() {
      if (nodesBuilder_ == null) {
        return nodes_.size();
      } else {
        return nodesBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .pbanalysis.NodeMsg nodes = 1;</code>
     */
    public io.yottachain.nodemgmt.analysis.pb.NodeMsg getNodes(int index) {
      if (nodesBuilder_ == null) {
        return nodes_.get(index);
      } else {
        return nodesBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .pbanalysis.NodeMsg nodes = 1;</code>
     */
    public Builder setNodes(
        int index, io.yottachain.nodemgmt.analysis.pb.NodeMsg value) {
      if (nodesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureNodesIsMutable();
        nodes_.set(index, value);
        onChanged();
      } else {
        nodesBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .pbanalysis.NodeMsg nodes = 1;</code>
     */
    public Builder setNodes(
        int index, io.yottachain.nodemgmt.analysis.pb.NodeMsg.Builder builderForValue) {
      if (nodesBuilder_ == null) {
        ensureNodesIsMutable();
        nodes_.set(index, builderForValue.build());
        onChanged();
      } else {
        nodesBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .pbanalysis.NodeMsg nodes = 1;</code>
     */
    public Builder addNodes(io.yottachain.nodemgmt.analysis.pb.NodeMsg value) {
      if (nodesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureNodesIsMutable();
        nodes_.add(value);
        onChanged();
      } else {
        nodesBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .pbanalysis.NodeMsg nodes = 1;</code>
     */
    public Builder addNodes(
        int index, io.yottachain.nodemgmt.analysis.pb.NodeMsg value) {
      if (nodesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureNodesIsMutable();
        nodes_.add(index, value);
        onChanged();
      } else {
        nodesBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .pbanalysis.NodeMsg nodes = 1;</code>
     */
    public Builder addNodes(
        io.yottachain.nodemgmt.analysis.pb.NodeMsg.Builder builderForValue) {
      if (nodesBuilder_ == null) {
        ensureNodesIsMutable();
        nodes_.add(builderForValue.build());
        onChanged();
      } else {
        nodesBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .pbanalysis.NodeMsg nodes = 1;</code>
     */
    public Builder addNodes(
        int index, io.yottachain.nodemgmt.analysis.pb.NodeMsg.Builder builderForValue) {
      if (nodesBuilder_ == null) {
        ensureNodesIsMutable();
        nodes_.add(index, builderForValue.build());
        onChanged();
      } else {
        nodesBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .pbanalysis.NodeMsg nodes = 1;</code>
     */
    public Builder addAllNodes(
        java.lang.Iterable<? extends io.yottachain.nodemgmt.analysis.pb.NodeMsg> values) {
      if (nodesBuilder_ == null) {
        ensureNodesIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, nodes_);
        onChanged();
      } else {
        nodesBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .pbanalysis.NodeMsg nodes = 1;</code>
     */
    public Builder clearNodes() {
      if (nodesBuilder_ == null) {
        nodes_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        nodesBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .pbanalysis.NodeMsg nodes = 1;</code>
     */
    public Builder removeNodes(int index) {
      if (nodesBuilder_ == null) {
        ensureNodesIsMutable();
        nodes_.remove(index);
        onChanged();
      } else {
        nodesBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .pbanalysis.NodeMsg nodes = 1;</code>
     */
    public io.yottachain.nodemgmt.analysis.pb.NodeMsg.Builder getNodesBuilder(
        int index) {
      return getNodesFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .pbanalysis.NodeMsg nodes = 1;</code>
     */
    public io.yottachain.nodemgmt.analysis.pb.NodeMsgOrBuilder getNodesOrBuilder(
        int index) {
      if (nodesBuilder_ == null) {
        return nodes_.get(index);  } else {
        return nodesBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .pbanalysis.NodeMsg nodes = 1;</code>
     */
    public java.util.List<? extends io.yottachain.nodemgmt.analysis.pb.NodeMsgOrBuilder> 
         getNodesOrBuilderList() {
      if (nodesBuilder_ != null) {
        return nodesBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(nodes_);
      }
    }
    /**
     * <code>repeated .pbanalysis.NodeMsg nodes = 1;</code>
     */
    public io.yottachain.nodemgmt.analysis.pb.NodeMsg.Builder addNodesBuilder() {
      return getNodesFieldBuilder().addBuilder(
          io.yottachain.nodemgmt.analysis.pb.NodeMsg.getDefaultInstance());
    }
    /**
     * <code>repeated .pbanalysis.NodeMsg nodes = 1;</code>
     */
    public io.yottachain.nodemgmt.analysis.pb.NodeMsg.Builder addNodesBuilder(
        int index) {
      return getNodesFieldBuilder().addBuilder(
          index, io.yottachain.nodemgmt.analysis.pb.NodeMsg.getDefaultInstance());
    }
    /**
     * <code>repeated .pbanalysis.NodeMsg nodes = 1;</code>
     */
    public java.util.List<io.yottachain.nodemgmt.analysis.pb.NodeMsg.Builder> 
         getNodesBuilderList() {
      return getNodesFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        io.yottachain.nodemgmt.analysis.pb.NodeMsg, io.yottachain.nodemgmt.analysis.pb.NodeMsg.Builder, io.yottachain.nodemgmt.analysis.pb.NodeMsgOrBuilder> 
        getNodesFieldBuilder() {
      if (nodesBuilder_ == null) {
        nodesBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            io.yottachain.nodemgmt.analysis.pb.NodeMsg, io.yottachain.nodemgmt.analysis.pb.NodeMsg.Builder, io.yottachain.nodemgmt.analysis.pb.NodeMsgOrBuilder>(
                nodes_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        nodes_ = null;
      }
      return nodesBuilder_;
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


    // @@protoc_insertion_point(builder_scope:pbanalysis.NodesResp)
  }

  // @@protoc_insertion_point(class_scope:pbanalysis.NodesResp)
  private static final io.yottachain.nodemgmt.analysis.pb.NodesResp DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new io.yottachain.nodemgmt.analysis.pb.NodesResp();
  }

  public static io.yottachain.nodemgmt.analysis.pb.NodesResp getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<NodesResp>
      PARSER = new com.google.protobuf.AbstractParser<NodesResp>() {
    @java.lang.Override
    public NodesResp parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new NodesResp(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<NodesResp> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<NodesResp> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public io.yottachain.nodemgmt.analysis.pb.NodesResp getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

