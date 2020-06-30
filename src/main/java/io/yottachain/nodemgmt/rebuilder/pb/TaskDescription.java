// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: types.proto

package io.yottachain.nodemgmt.rebuilder.pb;

/**
 * <pre>
 *msgid=0x68b3
 * </pre>
 *
 * Protobuf type {@code pbrebuilder.TaskDescription}
 */
public  final class TaskDescription extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:pbrebuilder.TaskDescription)
    TaskDescriptionOrBuilder {
private static final long serialVersionUID = 0L;
  // Use TaskDescription.newBuilder() to construct.
  private TaskDescription(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private TaskDescription() {
    id_ = com.google.protobuf.ByteString.EMPTY;
    hashs_ = java.util.Collections.emptyList();
    locations_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new TaskDescription();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private TaskDescription(
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

            id_ = input.readBytes();
            break;
          }
          case 18: {
            if (!((mutable_bitField0_ & 0x00000001) != 0)) {
              hashs_ = new java.util.ArrayList<com.google.protobuf.ByteString>();
              mutable_bitField0_ |= 0x00000001;
            }
            hashs_.add(input.readBytes());
            break;
          }
          case 26: {
            if (!((mutable_bitField0_ & 0x00000002) != 0)) {
              locations_ = new java.util.ArrayList<io.yottachain.nodemgmt.rebuilder.pb.P2PLocation>();
              mutable_bitField0_ |= 0x00000002;
            }
            locations_.add(
                input.readMessage(io.yottachain.nodemgmt.rebuilder.pb.P2PLocation.parser(), extensionRegistry));
            break;
          }
          case 32: {

            parityShardCount_ = input.readInt32();
            break;
          }
          case 40: {

            recoverId_ = input.readInt32();
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
        hashs_ = java.util.Collections.unmodifiableList(hashs_); // C
      }
      if (((mutable_bitField0_ & 0x00000002) != 0)) {
        locations_ = java.util.Collections.unmodifiableList(locations_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return io.yottachain.nodemgmt.rebuilder.pb.RebuilderProto.internal_static_pbrebuilder_TaskDescription_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return io.yottachain.nodemgmt.rebuilder.pb.RebuilderProto.internal_static_pbrebuilder_TaskDescription_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            io.yottachain.nodemgmt.rebuilder.pb.TaskDescription.class, io.yottachain.nodemgmt.rebuilder.pb.TaskDescription.Builder.class);
  }

  public static final int ID_FIELD_NUMBER = 1;
  private com.google.protobuf.ByteString id_;
  /**
   * <code>bytes id = 1;</code>
   */
  public com.google.protobuf.ByteString getId() {
    return id_;
  }

  public static final int HASHS_FIELD_NUMBER = 2;
  private java.util.List<com.google.protobuf.ByteString> hashs_;
  /**
   * <code>repeated bytes hashs = 2;</code>
   */
  public java.util.List<com.google.protobuf.ByteString>
      getHashsList() {
    return hashs_;
  }
  /**
   * <code>repeated bytes hashs = 2;</code>
   */
  public int getHashsCount() {
    return hashs_.size();
  }
  /**
   * <code>repeated bytes hashs = 2;</code>
   */
  public com.google.protobuf.ByteString getHashs(int index) {
    return hashs_.get(index);
  }

  public static final int LOCATIONS_FIELD_NUMBER = 3;
  private java.util.List<io.yottachain.nodemgmt.rebuilder.pb.P2PLocation> locations_;
  /**
   * <code>repeated .pbrebuilder.P2PLocation locations = 3;</code>
   */
  public java.util.List<io.yottachain.nodemgmt.rebuilder.pb.P2PLocation> getLocationsList() {
    return locations_;
  }
  /**
   * <code>repeated .pbrebuilder.P2PLocation locations = 3;</code>
   */
  public java.util.List<? extends io.yottachain.nodemgmt.rebuilder.pb.P2PLocationOrBuilder> 
      getLocationsOrBuilderList() {
    return locations_;
  }
  /**
   * <code>repeated .pbrebuilder.P2PLocation locations = 3;</code>
   */
  public int getLocationsCount() {
    return locations_.size();
  }
  /**
   * <code>repeated .pbrebuilder.P2PLocation locations = 3;</code>
   */
  public io.yottachain.nodemgmt.rebuilder.pb.P2PLocation getLocations(int index) {
    return locations_.get(index);
  }
  /**
   * <code>repeated .pbrebuilder.P2PLocation locations = 3;</code>
   */
  public io.yottachain.nodemgmt.rebuilder.pb.P2PLocationOrBuilder getLocationsOrBuilder(
      int index) {
    return locations_.get(index);
  }

  public static final int PARITYSHARDCOUNT_FIELD_NUMBER = 4;
  private int parityShardCount_;
  /**
   * <code>int32 parityShardCount = 4;</code>
   */
  public int getParityShardCount() {
    return parityShardCount_;
  }

  public static final int RECOVERID_FIELD_NUMBER = 5;
  private int recoverId_;
  /**
   * <code>int32 recoverId = 5;</code>
   */
  public int getRecoverId() {
    return recoverId_;
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
    if (!id_.isEmpty()) {
      output.writeBytes(1, id_);
    }
    for (int i = 0; i < hashs_.size(); i++) {
      output.writeBytes(2, hashs_.get(i));
    }
    for (int i = 0; i < locations_.size(); i++) {
      output.writeMessage(3, locations_.get(i));
    }
    if (parityShardCount_ != 0) {
      output.writeInt32(4, parityShardCount_);
    }
    if (recoverId_ != 0) {
      output.writeInt32(5, recoverId_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!id_.isEmpty()) {
      size += com.google.protobuf.CodedOutputStream
        .computeBytesSize(1, id_);
    }
    {
      int dataSize = 0;
      for (int i = 0; i < hashs_.size(); i++) {
        dataSize += com.google.protobuf.CodedOutputStream
          .computeBytesSizeNoTag(hashs_.get(i));
      }
      size += dataSize;
      size += 1 * getHashsList().size();
    }
    for (int i = 0; i < locations_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(3, locations_.get(i));
    }
    if (parityShardCount_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(4, parityShardCount_);
    }
    if (recoverId_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(5, recoverId_);
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
    if (!(obj instanceof io.yottachain.nodemgmt.rebuilder.pb.TaskDescription)) {
      return super.equals(obj);
    }
    io.yottachain.nodemgmt.rebuilder.pb.TaskDescription other = (io.yottachain.nodemgmt.rebuilder.pb.TaskDescription) obj;

    if (!getId()
        .equals(other.getId())) return false;
    if (!getHashsList()
        .equals(other.getHashsList())) return false;
    if (!getLocationsList()
        .equals(other.getLocationsList())) return false;
    if (getParityShardCount()
        != other.getParityShardCount()) return false;
    if (getRecoverId()
        != other.getRecoverId()) return false;
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
    hash = (53 * hash) + getId().hashCode();
    if (getHashsCount() > 0) {
      hash = (37 * hash) + HASHS_FIELD_NUMBER;
      hash = (53 * hash) + getHashsList().hashCode();
    }
    if (getLocationsCount() > 0) {
      hash = (37 * hash) + LOCATIONS_FIELD_NUMBER;
      hash = (53 * hash) + getLocationsList().hashCode();
    }
    hash = (37 * hash) + PARITYSHARDCOUNT_FIELD_NUMBER;
    hash = (53 * hash) + getParityShardCount();
    hash = (37 * hash) + RECOVERID_FIELD_NUMBER;
    hash = (53 * hash) + getRecoverId();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static io.yottachain.nodemgmt.rebuilder.pb.TaskDescription parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.yottachain.nodemgmt.rebuilder.pb.TaskDescription parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.yottachain.nodemgmt.rebuilder.pb.TaskDescription parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.yottachain.nodemgmt.rebuilder.pb.TaskDescription parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.yottachain.nodemgmt.rebuilder.pb.TaskDescription parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.yottachain.nodemgmt.rebuilder.pb.TaskDescription parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.yottachain.nodemgmt.rebuilder.pb.TaskDescription parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.yottachain.nodemgmt.rebuilder.pb.TaskDescription parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.yottachain.nodemgmt.rebuilder.pb.TaskDescription parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static io.yottachain.nodemgmt.rebuilder.pb.TaskDescription parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.yottachain.nodemgmt.rebuilder.pb.TaskDescription parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.yottachain.nodemgmt.rebuilder.pb.TaskDescription parseFrom(
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
  public static Builder newBuilder(io.yottachain.nodemgmt.rebuilder.pb.TaskDescription prototype) {
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
   *msgid=0x68b3
   * </pre>
   *
   * Protobuf type {@code pbrebuilder.TaskDescription}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:pbrebuilder.TaskDescription)
      io.yottachain.nodemgmt.rebuilder.pb.TaskDescriptionOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return io.yottachain.nodemgmt.rebuilder.pb.RebuilderProto.internal_static_pbrebuilder_TaskDescription_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.yottachain.nodemgmt.rebuilder.pb.RebuilderProto.internal_static_pbrebuilder_TaskDescription_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.yottachain.nodemgmt.rebuilder.pb.TaskDescription.class, io.yottachain.nodemgmt.rebuilder.pb.TaskDescription.Builder.class);
    }

    // Construct using io.yottachain.nodemgmt.rebuilder.pb.TaskDescription.newBuilder()
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
        getLocationsFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      id_ = com.google.protobuf.ByteString.EMPTY;

      hashs_ = java.util.Collections.emptyList();
      bitField0_ = (bitField0_ & ~0x00000001);
      if (locationsBuilder_ == null) {
        locations_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000002);
      } else {
        locationsBuilder_.clear();
      }
      parityShardCount_ = 0;

      recoverId_ = 0;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return io.yottachain.nodemgmt.rebuilder.pb.RebuilderProto.internal_static_pbrebuilder_TaskDescription_descriptor;
    }

    @java.lang.Override
    public io.yottachain.nodemgmt.rebuilder.pb.TaskDescription getDefaultInstanceForType() {
      return io.yottachain.nodemgmt.rebuilder.pb.TaskDescription.getDefaultInstance();
    }

    @java.lang.Override
    public io.yottachain.nodemgmt.rebuilder.pb.TaskDescription build() {
      io.yottachain.nodemgmt.rebuilder.pb.TaskDescription result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public io.yottachain.nodemgmt.rebuilder.pb.TaskDescription buildPartial() {
      io.yottachain.nodemgmt.rebuilder.pb.TaskDescription result = new io.yottachain.nodemgmt.rebuilder.pb.TaskDescription(this);
      int from_bitField0_ = bitField0_;
      result.id_ = id_;
      if (((bitField0_ & 0x00000001) != 0)) {
        hashs_ = java.util.Collections.unmodifiableList(hashs_);
        bitField0_ = (bitField0_ & ~0x00000001);
      }
      result.hashs_ = hashs_;
      if (locationsBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0)) {
          locations_ = java.util.Collections.unmodifiableList(locations_);
          bitField0_ = (bitField0_ & ~0x00000002);
        }
        result.locations_ = locations_;
      } else {
        result.locations_ = locationsBuilder_.build();
      }
      result.parityShardCount_ = parityShardCount_;
      result.recoverId_ = recoverId_;
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
      if (other instanceof io.yottachain.nodemgmt.rebuilder.pb.TaskDescription) {
        return mergeFrom((io.yottachain.nodemgmt.rebuilder.pb.TaskDescription)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(io.yottachain.nodemgmt.rebuilder.pb.TaskDescription other) {
      if (other == io.yottachain.nodemgmt.rebuilder.pb.TaskDescription.getDefaultInstance()) return this;
      if (other.getId() != com.google.protobuf.ByteString.EMPTY) {
        setId(other.getId());
      }
      if (!other.hashs_.isEmpty()) {
        if (hashs_.isEmpty()) {
          hashs_ = other.hashs_;
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          ensureHashsIsMutable();
          hashs_.addAll(other.hashs_);
        }
        onChanged();
      }
      if (locationsBuilder_ == null) {
        if (!other.locations_.isEmpty()) {
          if (locations_.isEmpty()) {
            locations_ = other.locations_;
            bitField0_ = (bitField0_ & ~0x00000002);
          } else {
            ensureLocationsIsMutable();
            locations_.addAll(other.locations_);
          }
          onChanged();
        }
      } else {
        if (!other.locations_.isEmpty()) {
          if (locationsBuilder_.isEmpty()) {
            locationsBuilder_.dispose();
            locationsBuilder_ = null;
            locations_ = other.locations_;
            bitField0_ = (bitField0_ & ~0x00000002);
            locationsBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getLocationsFieldBuilder() : null;
          } else {
            locationsBuilder_.addAllMessages(other.locations_);
          }
        }
      }
      if (other.getParityShardCount() != 0) {
        setParityShardCount(other.getParityShardCount());
      }
      if (other.getRecoverId() != 0) {
        setRecoverId(other.getRecoverId());
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
      io.yottachain.nodemgmt.rebuilder.pb.TaskDescription parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (io.yottachain.nodemgmt.rebuilder.pb.TaskDescription) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private com.google.protobuf.ByteString id_ = com.google.protobuf.ByteString.EMPTY;
    /**
     * <code>bytes id = 1;</code>
     */
    public com.google.protobuf.ByteString getId() {
      return id_;
    }
    /**
     * <code>bytes id = 1;</code>
     */
    public Builder setId(com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      id_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>bytes id = 1;</code>
     */
    public Builder clearId() {
      
      id_ = getDefaultInstance().getId();
      onChanged();
      return this;
    }

    private java.util.List<com.google.protobuf.ByteString> hashs_ = java.util.Collections.emptyList();
    private void ensureHashsIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        hashs_ = new java.util.ArrayList<com.google.protobuf.ByteString>(hashs_);
        bitField0_ |= 0x00000001;
       }
    }
    /**
     * <code>repeated bytes hashs = 2;</code>
     */
    public java.util.List<com.google.protobuf.ByteString>
        getHashsList() {
      return ((bitField0_ & 0x00000001) != 0) ?
               java.util.Collections.unmodifiableList(hashs_) : hashs_;
    }
    /**
     * <code>repeated bytes hashs = 2;</code>
     */
    public int getHashsCount() {
      return hashs_.size();
    }
    /**
     * <code>repeated bytes hashs = 2;</code>
     */
    public com.google.protobuf.ByteString getHashs(int index) {
      return hashs_.get(index);
    }
    /**
     * <code>repeated bytes hashs = 2;</code>
     */
    public Builder setHashs(
        int index, com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  ensureHashsIsMutable();
      hashs_.set(index, value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated bytes hashs = 2;</code>
     */
    public Builder addHashs(com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  ensureHashsIsMutable();
      hashs_.add(value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated bytes hashs = 2;</code>
     */
    public Builder addAllHashs(
        java.lang.Iterable<? extends com.google.protobuf.ByteString> values) {
      ensureHashsIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(
          values, hashs_);
      onChanged();
      return this;
    }
    /**
     * <code>repeated bytes hashs = 2;</code>
     */
    public Builder clearHashs() {
      hashs_ = java.util.Collections.emptyList();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }

    private java.util.List<io.yottachain.nodemgmt.rebuilder.pb.P2PLocation> locations_ =
      java.util.Collections.emptyList();
    private void ensureLocationsIsMutable() {
      if (!((bitField0_ & 0x00000002) != 0)) {
        locations_ = new java.util.ArrayList<io.yottachain.nodemgmt.rebuilder.pb.P2PLocation>(locations_);
        bitField0_ |= 0x00000002;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        io.yottachain.nodemgmt.rebuilder.pb.P2PLocation, io.yottachain.nodemgmt.rebuilder.pb.P2PLocation.Builder, io.yottachain.nodemgmt.rebuilder.pb.P2PLocationOrBuilder> locationsBuilder_;

    /**
     * <code>repeated .pbrebuilder.P2PLocation locations = 3;</code>
     */
    public java.util.List<io.yottachain.nodemgmt.rebuilder.pb.P2PLocation> getLocationsList() {
      if (locationsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(locations_);
      } else {
        return locationsBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .pbrebuilder.P2PLocation locations = 3;</code>
     */
    public int getLocationsCount() {
      if (locationsBuilder_ == null) {
        return locations_.size();
      } else {
        return locationsBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .pbrebuilder.P2PLocation locations = 3;</code>
     */
    public io.yottachain.nodemgmt.rebuilder.pb.P2PLocation getLocations(int index) {
      if (locationsBuilder_ == null) {
        return locations_.get(index);
      } else {
        return locationsBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .pbrebuilder.P2PLocation locations = 3;</code>
     */
    public Builder setLocations(
        int index, io.yottachain.nodemgmt.rebuilder.pb.P2PLocation value) {
      if (locationsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureLocationsIsMutable();
        locations_.set(index, value);
        onChanged();
      } else {
        locationsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .pbrebuilder.P2PLocation locations = 3;</code>
     */
    public Builder setLocations(
        int index, io.yottachain.nodemgmt.rebuilder.pb.P2PLocation.Builder builderForValue) {
      if (locationsBuilder_ == null) {
        ensureLocationsIsMutable();
        locations_.set(index, builderForValue.build());
        onChanged();
      } else {
        locationsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .pbrebuilder.P2PLocation locations = 3;</code>
     */
    public Builder addLocations(io.yottachain.nodemgmt.rebuilder.pb.P2PLocation value) {
      if (locationsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureLocationsIsMutable();
        locations_.add(value);
        onChanged();
      } else {
        locationsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .pbrebuilder.P2PLocation locations = 3;</code>
     */
    public Builder addLocations(
        int index, io.yottachain.nodemgmt.rebuilder.pb.P2PLocation value) {
      if (locationsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureLocationsIsMutable();
        locations_.add(index, value);
        onChanged();
      } else {
        locationsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .pbrebuilder.P2PLocation locations = 3;</code>
     */
    public Builder addLocations(
        io.yottachain.nodemgmt.rebuilder.pb.P2PLocation.Builder builderForValue) {
      if (locationsBuilder_ == null) {
        ensureLocationsIsMutable();
        locations_.add(builderForValue.build());
        onChanged();
      } else {
        locationsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .pbrebuilder.P2PLocation locations = 3;</code>
     */
    public Builder addLocations(
        int index, io.yottachain.nodemgmt.rebuilder.pb.P2PLocation.Builder builderForValue) {
      if (locationsBuilder_ == null) {
        ensureLocationsIsMutable();
        locations_.add(index, builderForValue.build());
        onChanged();
      } else {
        locationsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .pbrebuilder.P2PLocation locations = 3;</code>
     */
    public Builder addAllLocations(
        java.lang.Iterable<? extends io.yottachain.nodemgmt.rebuilder.pb.P2PLocation> values) {
      if (locationsBuilder_ == null) {
        ensureLocationsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, locations_);
        onChanged();
      } else {
        locationsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .pbrebuilder.P2PLocation locations = 3;</code>
     */
    public Builder clearLocations() {
      if (locationsBuilder_ == null) {
        locations_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000002);
        onChanged();
      } else {
        locationsBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .pbrebuilder.P2PLocation locations = 3;</code>
     */
    public Builder removeLocations(int index) {
      if (locationsBuilder_ == null) {
        ensureLocationsIsMutable();
        locations_.remove(index);
        onChanged();
      } else {
        locationsBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .pbrebuilder.P2PLocation locations = 3;</code>
     */
    public io.yottachain.nodemgmt.rebuilder.pb.P2PLocation.Builder getLocationsBuilder(
        int index) {
      return getLocationsFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .pbrebuilder.P2PLocation locations = 3;</code>
     */
    public io.yottachain.nodemgmt.rebuilder.pb.P2PLocationOrBuilder getLocationsOrBuilder(
        int index) {
      if (locationsBuilder_ == null) {
        return locations_.get(index);  } else {
        return locationsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .pbrebuilder.P2PLocation locations = 3;</code>
     */
    public java.util.List<? extends io.yottachain.nodemgmt.rebuilder.pb.P2PLocationOrBuilder> 
         getLocationsOrBuilderList() {
      if (locationsBuilder_ != null) {
        return locationsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(locations_);
      }
    }
    /**
     * <code>repeated .pbrebuilder.P2PLocation locations = 3;</code>
     */
    public io.yottachain.nodemgmt.rebuilder.pb.P2PLocation.Builder addLocationsBuilder() {
      return getLocationsFieldBuilder().addBuilder(
          io.yottachain.nodemgmt.rebuilder.pb.P2PLocation.getDefaultInstance());
    }
    /**
     * <code>repeated .pbrebuilder.P2PLocation locations = 3;</code>
     */
    public io.yottachain.nodemgmt.rebuilder.pb.P2PLocation.Builder addLocationsBuilder(
        int index) {
      return getLocationsFieldBuilder().addBuilder(
          index, io.yottachain.nodemgmt.rebuilder.pb.P2PLocation.getDefaultInstance());
    }
    /**
     * <code>repeated .pbrebuilder.P2PLocation locations = 3;</code>
     */
    public java.util.List<io.yottachain.nodemgmt.rebuilder.pb.P2PLocation.Builder> 
         getLocationsBuilderList() {
      return getLocationsFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        io.yottachain.nodemgmt.rebuilder.pb.P2PLocation, io.yottachain.nodemgmt.rebuilder.pb.P2PLocation.Builder, io.yottachain.nodemgmt.rebuilder.pb.P2PLocationOrBuilder> 
        getLocationsFieldBuilder() {
      if (locationsBuilder_ == null) {
        locationsBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            io.yottachain.nodemgmt.rebuilder.pb.P2PLocation, io.yottachain.nodemgmt.rebuilder.pb.P2PLocation.Builder, io.yottachain.nodemgmt.rebuilder.pb.P2PLocationOrBuilder>(
                locations_,
                ((bitField0_ & 0x00000002) != 0),
                getParentForChildren(),
                isClean());
        locations_ = null;
      }
      return locationsBuilder_;
    }

    private int parityShardCount_ ;
    /**
     * <code>int32 parityShardCount = 4;</code>
     */
    public int getParityShardCount() {
      return parityShardCount_;
    }
    /**
     * <code>int32 parityShardCount = 4;</code>
     */
    public Builder setParityShardCount(int value) {
      
      parityShardCount_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 parityShardCount = 4;</code>
     */
    public Builder clearParityShardCount() {
      
      parityShardCount_ = 0;
      onChanged();
      return this;
    }

    private int recoverId_ ;
    /**
     * <code>int32 recoverId = 5;</code>
     */
    public int getRecoverId() {
      return recoverId_;
    }
    /**
     * <code>int32 recoverId = 5;</code>
     */
    public Builder setRecoverId(int value) {
      
      recoverId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 recoverId = 5;</code>
     */
    public Builder clearRecoverId() {
      
      recoverId_ = 0;
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


    // @@protoc_insertion_point(builder_scope:pbrebuilder.TaskDescription)
  }

  // @@protoc_insertion_point(class_scope:pbrebuilder.TaskDescription)
  private static final io.yottachain.nodemgmt.rebuilder.pb.TaskDescription DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new io.yottachain.nodemgmt.rebuilder.pb.TaskDescription();
  }

  public static io.yottachain.nodemgmt.rebuilder.pb.TaskDescription getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<TaskDescription>
      PARSER = new com.google.protobuf.AbstractParser<TaskDescription>() {
    @java.lang.Override
    public TaskDescription parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new TaskDescription(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<TaskDescription> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<TaskDescription> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public io.yottachain.nodemgmt.rebuilder.pb.TaskDescription getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

