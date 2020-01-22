// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: types.proto

package io.yottachain.nodemgmt.pb;

/**
 * <pre>
 * NodeStat message
 * </pre>
 *
 * Protobuf type {@code pb.NodeStatMsg}
 */
public  final class NodeStatMsg extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:pb.NodeStatMsg)
    NodeStatMsgOrBuilder {
private static final long serialVersionUID = 0L;
  // Use NodeStatMsg.newBuilder() to construct.
  private NodeStatMsg(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private NodeStatMsg() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new NodeStatMsg();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private NodeStatMsg(
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

            activeMiners_ = input.readInt64();
            break;
          }
          case 16: {

            totalMiners_ = input.readInt64();
            break;
          }
          case 24: {

            maxTotal_ = input.readInt64();
            break;
          }
          case 32: {

            assignedTotal_ = input.readInt64();
            break;
          }
          case 40: {

            productiveTotal_ = input.readInt64();
            break;
          }
          case 48: {

            usedTotal_ = input.readInt64();
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
    return io.yottachain.nodemgmt.pb.NodeMgmtProto.internal_static_pb_NodeStatMsg_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return io.yottachain.nodemgmt.pb.NodeMgmtProto.internal_static_pb_NodeStatMsg_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            io.yottachain.nodemgmt.pb.NodeStatMsg.class, io.yottachain.nodemgmt.pb.NodeStatMsg.Builder.class);
  }

  public static final int ACTIVEMINERS_FIELD_NUMBER = 1;
  private long activeMiners_;
  /**
   * <pre>
   * count of active miners
   * </pre>
   *
   * <code>int64 activeMiners = 1;</code>
   */
  public long getActiveMiners() {
    return activeMiners_;
  }

  public static final int TOTALMINERS_FIELD_NUMBER = 2;
  private long totalMiners_;
  /**
   * <pre>
   * count of all miners
   * </pre>
   *
   * <code>int64 totalMiners = 2;</code>
   */
  public long getTotalMiners() {
    return totalMiners_;
  }

  public static final int MAXTOTAL_FIELD_NUMBER = 3;
  private long maxTotal_;
  /**
   * <pre>
   * total disk size of all miners' storage
   * </pre>
   *
   * <code>int64 maxTotal = 3;</code>
   */
  public long getMaxTotal() {
    return maxTotal_;
  }

  public static final int ASSIGNEDTOTAL_FIELD_NUMBER = 4;
  private long assignedTotal_;
  /**
   * <pre>
   * total amount of all miners' assigned space
   * </pre>
   *
   * <code>int64 assignedTotal = 4;</code>
   */
  public long getAssignedTotal() {
    return assignedTotal_;
  }

  public static final int PRODUCTIVETOTAL_FIELD_NUMBER = 5;
  private long productiveTotal_;
  /**
   * <pre>
   * total amount of all miners' productive space
   * </pre>
   *
   * <code>int64 productiveTotal = 5;</code>
   */
  public long getProductiveTotal() {
    return productiveTotal_;
  }

  public static final int USEDTOTAL_FIELD_NUMBER = 6;
  private long usedTotal_;
  /**
   * <pre>
   * total amount of all miners' used space
   * </pre>
   *
   * <code>int64 usedTotal = 6;</code>
   */
  public long getUsedTotal() {
    return usedTotal_;
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
    if (activeMiners_ != 0L) {
      output.writeInt64(1, activeMiners_);
    }
    if (totalMiners_ != 0L) {
      output.writeInt64(2, totalMiners_);
    }
    if (maxTotal_ != 0L) {
      output.writeInt64(3, maxTotal_);
    }
    if (assignedTotal_ != 0L) {
      output.writeInt64(4, assignedTotal_);
    }
    if (productiveTotal_ != 0L) {
      output.writeInt64(5, productiveTotal_);
    }
    if (usedTotal_ != 0L) {
      output.writeInt64(6, usedTotal_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (activeMiners_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(1, activeMiners_);
    }
    if (totalMiners_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(2, totalMiners_);
    }
    if (maxTotal_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(3, maxTotal_);
    }
    if (assignedTotal_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(4, assignedTotal_);
    }
    if (productiveTotal_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(5, productiveTotal_);
    }
    if (usedTotal_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(6, usedTotal_);
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
    if (!(obj instanceof io.yottachain.nodemgmt.pb.NodeStatMsg)) {
      return super.equals(obj);
    }
    io.yottachain.nodemgmt.pb.NodeStatMsg other = (io.yottachain.nodemgmt.pb.NodeStatMsg) obj;

    if (getActiveMiners()
        != other.getActiveMiners()) return false;
    if (getTotalMiners()
        != other.getTotalMiners()) return false;
    if (getMaxTotal()
        != other.getMaxTotal()) return false;
    if (getAssignedTotal()
        != other.getAssignedTotal()) return false;
    if (getProductiveTotal()
        != other.getProductiveTotal()) return false;
    if (getUsedTotal()
        != other.getUsedTotal()) return false;
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
    hash = (37 * hash) + ACTIVEMINERS_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getActiveMiners());
    hash = (37 * hash) + TOTALMINERS_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getTotalMiners());
    hash = (37 * hash) + MAXTOTAL_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getMaxTotal());
    hash = (37 * hash) + ASSIGNEDTOTAL_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getAssignedTotal());
    hash = (37 * hash) + PRODUCTIVETOTAL_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getProductiveTotal());
    hash = (37 * hash) + USEDTOTAL_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getUsedTotal());
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static io.yottachain.nodemgmt.pb.NodeStatMsg parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.yottachain.nodemgmt.pb.NodeStatMsg parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.yottachain.nodemgmt.pb.NodeStatMsg parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.yottachain.nodemgmt.pb.NodeStatMsg parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.yottachain.nodemgmt.pb.NodeStatMsg parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.yottachain.nodemgmt.pb.NodeStatMsg parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.yottachain.nodemgmt.pb.NodeStatMsg parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.yottachain.nodemgmt.pb.NodeStatMsg parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.yottachain.nodemgmt.pb.NodeStatMsg parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static io.yottachain.nodemgmt.pb.NodeStatMsg parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.yottachain.nodemgmt.pb.NodeStatMsg parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.yottachain.nodemgmt.pb.NodeStatMsg parseFrom(
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
  public static Builder newBuilder(io.yottachain.nodemgmt.pb.NodeStatMsg prototype) {
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
   * NodeStat message
   * </pre>
   *
   * Protobuf type {@code pb.NodeStatMsg}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:pb.NodeStatMsg)
      io.yottachain.nodemgmt.pb.NodeStatMsgOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return io.yottachain.nodemgmt.pb.NodeMgmtProto.internal_static_pb_NodeStatMsg_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.yottachain.nodemgmt.pb.NodeMgmtProto.internal_static_pb_NodeStatMsg_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.yottachain.nodemgmt.pb.NodeStatMsg.class, io.yottachain.nodemgmt.pb.NodeStatMsg.Builder.class);
    }

    // Construct using io.yottachain.nodemgmt.pb.NodeStatMsg.newBuilder()
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
      activeMiners_ = 0L;

      totalMiners_ = 0L;

      maxTotal_ = 0L;

      assignedTotal_ = 0L;

      productiveTotal_ = 0L;

      usedTotal_ = 0L;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return io.yottachain.nodemgmt.pb.NodeMgmtProto.internal_static_pb_NodeStatMsg_descriptor;
    }

    @java.lang.Override
    public io.yottachain.nodemgmt.pb.NodeStatMsg getDefaultInstanceForType() {
      return io.yottachain.nodemgmt.pb.NodeStatMsg.getDefaultInstance();
    }

    @java.lang.Override
    public io.yottachain.nodemgmt.pb.NodeStatMsg build() {
      io.yottachain.nodemgmt.pb.NodeStatMsg result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public io.yottachain.nodemgmt.pb.NodeStatMsg buildPartial() {
      io.yottachain.nodemgmt.pb.NodeStatMsg result = new io.yottachain.nodemgmt.pb.NodeStatMsg(this);
      result.activeMiners_ = activeMiners_;
      result.totalMiners_ = totalMiners_;
      result.maxTotal_ = maxTotal_;
      result.assignedTotal_ = assignedTotal_;
      result.productiveTotal_ = productiveTotal_;
      result.usedTotal_ = usedTotal_;
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
      if (other instanceof io.yottachain.nodemgmt.pb.NodeStatMsg) {
        return mergeFrom((io.yottachain.nodemgmt.pb.NodeStatMsg)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(io.yottachain.nodemgmt.pb.NodeStatMsg other) {
      if (other == io.yottachain.nodemgmt.pb.NodeStatMsg.getDefaultInstance()) return this;
      if (other.getActiveMiners() != 0L) {
        setActiveMiners(other.getActiveMiners());
      }
      if (other.getTotalMiners() != 0L) {
        setTotalMiners(other.getTotalMiners());
      }
      if (other.getMaxTotal() != 0L) {
        setMaxTotal(other.getMaxTotal());
      }
      if (other.getAssignedTotal() != 0L) {
        setAssignedTotal(other.getAssignedTotal());
      }
      if (other.getProductiveTotal() != 0L) {
        setProductiveTotal(other.getProductiveTotal());
      }
      if (other.getUsedTotal() != 0L) {
        setUsedTotal(other.getUsedTotal());
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
      io.yottachain.nodemgmt.pb.NodeStatMsg parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (io.yottachain.nodemgmt.pb.NodeStatMsg) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private long activeMiners_ ;
    /**
     * <pre>
     * count of active miners
     * </pre>
     *
     * <code>int64 activeMiners = 1;</code>
     */
    public long getActiveMiners() {
      return activeMiners_;
    }
    /**
     * <pre>
     * count of active miners
     * </pre>
     *
     * <code>int64 activeMiners = 1;</code>
     */
    public Builder setActiveMiners(long value) {
      
      activeMiners_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * count of active miners
     * </pre>
     *
     * <code>int64 activeMiners = 1;</code>
     */
    public Builder clearActiveMiners() {
      
      activeMiners_ = 0L;
      onChanged();
      return this;
    }

    private long totalMiners_ ;
    /**
     * <pre>
     * count of all miners
     * </pre>
     *
     * <code>int64 totalMiners = 2;</code>
     */
    public long getTotalMiners() {
      return totalMiners_;
    }
    /**
     * <pre>
     * count of all miners
     * </pre>
     *
     * <code>int64 totalMiners = 2;</code>
     */
    public Builder setTotalMiners(long value) {
      
      totalMiners_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * count of all miners
     * </pre>
     *
     * <code>int64 totalMiners = 2;</code>
     */
    public Builder clearTotalMiners() {
      
      totalMiners_ = 0L;
      onChanged();
      return this;
    }

    private long maxTotal_ ;
    /**
     * <pre>
     * total disk size of all miners' storage
     * </pre>
     *
     * <code>int64 maxTotal = 3;</code>
     */
    public long getMaxTotal() {
      return maxTotal_;
    }
    /**
     * <pre>
     * total disk size of all miners' storage
     * </pre>
     *
     * <code>int64 maxTotal = 3;</code>
     */
    public Builder setMaxTotal(long value) {
      
      maxTotal_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * total disk size of all miners' storage
     * </pre>
     *
     * <code>int64 maxTotal = 3;</code>
     */
    public Builder clearMaxTotal() {
      
      maxTotal_ = 0L;
      onChanged();
      return this;
    }

    private long assignedTotal_ ;
    /**
     * <pre>
     * total amount of all miners' assigned space
     * </pre>
     *
     * <code>int64 assignedTotal = 4;</code>
     */
    public long getAssignedTotal() {
      return assignedTotal_;
    }
    /**
     * <pre>
     * total amount of all miners' assigned space
     * </pre>
     *
     * <code>int64 assignedTotal = 4;</code>
     */
    public Builder setAssignedTotal(long value) {
      
      assignedTotal_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * total amount of all miners' assigned space
     * </pre>
     *
     * <code>int64 assignedTotal = 4;</code>
     */
    public Builder clearAssignedTotal() {
      
      assignedTotal_ = 0L;
      onChanged();
      return this;
    }

    private long productiveTotal_ ;
    /**
     * <pre>
     * total amount of all miners' productive space
     * </pre>
     *
     * <code>int64 productiveTotal = 5;</code>
     */
    public long getProductiveTotal() {
      return productiveTotal_;
    }
    /**
     * <pre>
     * total amount of all miners' productive space
     * </pre>
     *
     * <code>int64 productiveTotal = 5;</code>
     */
    public Builder setProductiveTotal(long value) {
      
      productiveTotal_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * total amount of all miners' productive space
     * </pre>
     *
     * <code>int64 productiveTotal = 5;</code>
     */
    public Builder clearProductiveTotal() {
      
      productiveTotal_ = 0L;
      onChanged();
      return this;
    }

    private long usedTotal_ ;
    /**
     * <pre>
     * total amount of all miners' used space
     * </pre>
     *
     * <code>int64 usedTotal = 6;</code>
     */
    public long getUsedTotal() {
      return usedTotal_;
    }
    /**
     * <pre>
     * total amount of all miners' used space
     * </pre>
     *
     * <code>int64 usedTotal = 6;</code>
     */
    public Builder setUsedTotal(long value) {
      
      usedTotal_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * total amount of all miners' used space
     * </pre>
     *
     * <code>int64 usedTotal = 6;</code>
     */
    public Builder clearUsedTotal() {
      
      usedTotal_ = 0L;
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


    // @@protoc_insertion_point(builder_scope:pb.NodeStatMsg)
  }

  // @@protoc_insertion_point(class_scope:pb.NodeStatMsg)
  private static final io.yottachain.nodemgmt.pb.NodeStatMsg DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new io.yottachain.nodemgmt.pb.NodeStatMsg();
  }

  public static io.yottachain.nodemgmt.pb.NodeStatMsg getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<NodeStatMsg>
      PARSER = new com.google.protobuf.AbstractParser<NodeStatMsg>() {
    @java.lang.Override
    public NodeStatMsg parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new NodeStatMsg(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<NodeStatMsg> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<NodeStatMsg> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public io.yottachain.nodemgmt.pb.NodeStatMsg getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
