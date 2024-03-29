// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: types.proto

package io.yottachain.nodemgmt.pb;

/**
 * <pre>
 * request message of AddDNI function
 * </pre>
 *
 * Protobuf type {@code pb.DNIReq}
 */
public  final class DNIReq extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:pb.DNIReq)
    DNIReqOrBuilder {
private static final long serialVersionUID = 0L;
  // Use DNIReq.newBuilder() to construct.
  private DNIReq(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private DNIReq() {
    shard_ = com.google.protobuf.ByteString.EMPTY;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new DNIReq();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private DNIReq(
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

            id_ = input.readInt32();
            break;
          }
          case 18: {

            shard_ = input.readBytes();
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
    return io.yottachain.nodemgmt.pb.NodeMgmtProto.internal_static_pb_DNIReq_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return io.yottachain.nodemgmt.pb.NodeMgmtProto.internal_static_pb_DNIReq_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            io.yottachain.nodemgmt.pb.DNIReq.class, io.yottachain.nodemgmt.pb.DNIReq.Builder.class);
  }

  public static final int ID_FIELD_NUMBER = 1;
  private int id_;
  /**
   * <code>int32 id = 1;</code>
   */
  public int getId() {
    return id_;
  }

  public static final int SHARD_FIELD_NUMBER = 2;
  private com.google.protobuf.ByteString shard_;
  /**
   * <code>bytes shard = 2;</code>
   */
  public com.google.protobuf.ByteString getShard() {
    return shard_;
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
    if (id_ != 0) {
      output.writeInt32(1, id_);
    }
    if (!shard_.isEmpty()) {
      output.writeBytes(2, shard_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (id_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(1, id_);
    }
    if (!shard_.isEmpty()) {
      size += com.google.protobuf.CodedOutputStream
        .computeBytesSize(2, shard_);
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
    if (!(obj instanceof io.yottachain.nodemgmt.pb.DNIReq)) {
      return super.equals(obj);
    }
    io.yottachain.nodemgmt.pb.DNIReq other = (io.yottachain.nodemgmt.pb.DNIReq) obj;

    if (getId()
        != other.getId()) return false;
    if (!getShard()
        .equals(other.getShard())) return false;
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
    hash = (53 * hash) + getId();
    hash = (37 * hash) + SHARD_FIELD_NUMBER;
    hash = (53 * hash) + getShard().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static io.yottachain.nodemgmt.pb.DNIReq parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.yottachain.nodemgmt.pb.DNIReq parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.yottachain.nodemgmt.pb.DNIReq parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.yottachain.nodemgmt.pb.DNIReq parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.yottachain.nodemgmt.pb.DNIReq parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.yottachain.nodemgmt.pb.DNIReq parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.yottachain.nodemgmt.pb.DNIReq parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.yottachain.nodemgmt.pb.DNIReq parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.yottachain.nodemgmt.pb.DNIReq parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static io.yottachain.nodemgmt.pb.DNIReq parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.yottachain.nodemgmt.pb.DNIReq parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.yottachain.nodemgmt.pb.DNIReq parseFrom(
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
  public static Builder newBuilder(io.yottachain.nodemgmt.pb.DNIReq prototype) {
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
   * request message of AddDNI function
   * </pre>
   *
   * Protobuf type {@code pb.DNIReq}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:pb.DNIReq)
      io.yottachain.nodemgmt.pb.DNIReqOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return io.yottachain.nodemgmt.pb.NodeMgmtProto.internal_static_pb_DNIReq_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.yottachain.nodemgmt.pb.NodeMgmtProto.internal_static_pb_DNIReq_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.yottachain.nodemgmt.pb.DNIReq.class, io.yottachain.nodemgmt.pb.DNIReq.Builder.class);
    }

    // Construct using io.yottachain.nodemgmt.pb.DNIReq.newBuilder()
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
      id_ = 0;

      shard_ = com.google.protobuf.ByteString.EMPTY;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return io.yottachain.nodemgmt.pb.NodeMgmtProto.internal_static_pb_DNIReq_descriptor;
    }

    @java.lang.Override
    public io.yottachain.nodemgmt.pb.DNIReq getDefaultInstanceForType() {
      return io.yottachain.nodemgmt.pb.DNIReq.getDefaultInstance();
    }

    @java.lang.Override
    public io.yottachain.nodemgmt.pb.DNIReq build() {
      io.yottachain.nodemgmt.pb.DNIReq result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public io.yottachain.nodemgmt.pb.DNIReq buildPartial() {
      io.yottachain.nodemgmt.pb.DNIReq result = new io.yottachain.nodemgmt.pb.DNIReq(this);
      result.id_ = id_;
      result.shard_ = shard_;
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
      if (other instanceof io.yottachain.nodemgmt.pb.DNIReq) {
        return mergeFrom((io.yottachain.nodemgmt.pb.DNIReq)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(io.yottachain.nodemgmt.pb.DNIReq other) {
      if (other == io.yottachain.nodemgmt.pb.DNIReq.getDefaultInstance()) return this;
      if (other.getId() != 0) {
        setId(other.getId());
      }
      if (other.getShard() != com.google.protobuf.ByteString.EMPTY) {
        setShard(other.getShard());
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
      io.yottachain.nodemgmt.pb.DNIReq parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (io.yottachain.nodemgmt.pb.DNIReq) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int id_ ;
    /**
     * <code>int32 id = 1;</code>
     */
    public int getId() {
      return id_;
    }
    /**
     * <code>int32 id = 1;</code>
     */
    public Builder setId(int value) {
      
      id_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 id = 1;</code>
     */
    public Builder clearId() {
      
      id_ = 0;
      onChanged();
      return this;
    }

    private com.google.protobuf.ByteString shard_ = com.google.protobuf.ByteString.EMPTY;
    /**
     * <code>bytes shard = 2;</code>
     */
    public com.google.protobuf.ByteString getShard() {
      return shard_;
    }
    /**
     * <code>bytes shard = 2;</code>
     */
    public Builder setShard(com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      shard_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>bytes shard = 2;</code>
     */
    public Builder clearShard() {
      
      shard_ = getDefaultInstance().getShard();
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


    // @@protoc_insertion_point(builder_scope:pb.DNIReq)
  }

  // @@protoc_insertion_point(class_scope:pb.DNIReq)
  private static final io.yottachain.nodemgmt.pb.DNIReq DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new io.yottachain.nodemgmt.pb.DNIReq();
  }

  public static io.yottachain.nodemgmt.pb.DNIReq getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<DNIReq>
      PARSER = new com.google.protobuf.AbstractParser<DNIReq>() {
    @java.lang.Override
    public DNIReq parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new DNIReq(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<DNIReq> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<DNIReq> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public io.yottachain.nodemgmt.pb.DNIReq getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

