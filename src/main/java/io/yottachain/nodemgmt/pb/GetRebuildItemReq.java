// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: types.proto

package io.yottachain.nodemgmt.pb;

/**
 * <pre>
 * request message of GetInvalidNodes function
 * </pre>
 *
 * Protobuf type {@code pb.GetRebuildItemReq}
 */
public  final class GetRebuildItemReq extends
        com.google.protobuf.GeneratedMessageV3 implements
        // @@protoc_insertion_point(message_implements:pb.GetRebuildItemReq)
        GetRebuildItemReqOrBuilder {
    private static final long serialVersionUID = 0L;
    // Use GetRebuildItemReq.newBuilder() to construct.
    private GetRebuildItemReq(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
        super(builder);
    }
    private GetRebuildItemReq() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
            UnusedPrivateParameter unused) {
        return new GetRebuildItemReq();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
        return this.unknownFields;
    }
    private GetRebuildItemReq(
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

                        minerID_ = input.readInt32();
                        break;
                    }
                    case 16: {

                        index_ = input.readInt64();
                        break;
                    }
                    case 24: {

                        total_ = input.readInt64();
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
        return io.yottachain.nodemgmt.pb.NodeMgmtProto.internal_static_pb_GetRebuildItemReq_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
    internalGetFieldAccessorTable() {
        return io.yottachain.nodemgmt.pb.NodeMgmtProto.internal_static_pb_GetRebuildItemReq_fieldAccessorTable
                .ensureFieldAccessorsInitialized(
                        io.yottachain.nodemgmt.pb.GetRebuildItemReq.class, io.yottachain.nodemgmt.pb.GetRebuildItemReq.Builder.class);
    }

    public static final int MINERID_FIELD_NUMBER = 1;
    private int minerID_;
    /**
     * <code>int32 minerID = 1;</code>
     */
    public int getMinerID() {
        return minerID_;
    }

    public static final int INDEX_FIELD_NUMBER = 2;
    private long index_;
    /**
     * <code>int64 index = 2;</code>
     */
    public long getIndex() {
        return index_;
    }

    public static final int TOTAL_FIELD_NUMBER = 3;
    private long total_;
    /**
     * <code>int64 total = 3;</code>
     */
    public long getTotal() {
        return total_;
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
        if (minerID_ != 0) {
            output.writeInt32(1, minerID_);
        }
        if (index_ != 0L) {
            output.writeInt64(2, index_);
        }
        if (total_ != 0L) {
            output.writeInt64(3, total_);
        }
        unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
        int size = memoizedSize;
        if (size != -1) return size;

        size = 0;
        if (minerID_ != 0) {
            size += com.google.protobuf.CodedOutputStream
                    .computeInt32Size(1, minerID_);
        }
        if (index_ != 0L) {
            size += com.google.protobuf.CodedOutputStream
                    .computeInt64Size(2, index_);
        }
        if (total_ != 0L) {
            size += com.google.protobuf.CodedOutputStream
                    .computeInt64Size(3, total_);
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
        if (!(obj instanceof io.yottachain.nodemgmt.pb.GetRebuildItemReq)) {
            return super.equals(obj);
        }
        io.yottachain.nodemgmt.pb.GetRebuildItemReq other = (io.yottachain.nodemgmt.pb.GetRebuildItemReq) obj;

        if (getMinerID()
                != other.getMinerID()) return false;
        if (getIndex()
                != other.getIndex()) return false;
        if (getTotal()
                != other.getTotal()) return false;
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
        hash = (37 * hash) + MINERID_FIELD_NUMBER;
        hash = (53 * hash) + getMinerID();
        hash = (37 * hash) + INDEX_FIELD_NUMBER;
        hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
                getIndex());
        hash = (37 * hash) + TOTAL_FIELD_NUMBER;
        hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
                getTotal());
        hash = (29 * hash) + unknownFields.hashCode();
        memoizedHashCode = hash;
        return hash;
    }

    public static io.yottachain.nodemgmt.pb.GetRebuildItemReq parseFrom(
            java.nio.ByteBuffer data)
            throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data);
    }
    public static io.yottachain.nodemgmt.pb.GetRebuildItemReq parseFrom(
            java.nio.ByteBuffer data,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data, extensionRegistry);
    }
    public static io.yottachain.nodemgmt.pb.GetRebuildItemReq parseFrom(
            com.google.protobuf.ByteString data)
            throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data);
    }
    public static io.yottachain.nodemgmt.pb.GetRebuildItemReq parseFrom(
            com.google.protobuf.ByteString data,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data, extensionRegistry);
    }
    public static io.yottachain.nodemgmt.pb.GetRebuildItemReq parseFrom(byte[] data)
            throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data);
    }
    public static io.yottachain.nodemgmt.pb.GetRebuildItemReq parseFrom(
            byte[] data,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data, extensionRegistry);
    }
    public static io.yottachain.nodemgmt.pb.GetRebuildItemReq parseFrom(java.io.InputStream input)
            throws java.io.IOException {
        return com.google.protobuf.GeneratedMessageV3
                .parseWithIOException(PARSER, input);
    }
    public static io.yottachain.nodemgmt.pb.GetRebuildItemReq parseFrom(
            java.io.InputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws java.io.IOException {
        return com.google.protobuf.GeneratedMessageV3
                .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static io.yottachain.nodemgmt.pb.GetRebuildItemReq parseDelimitedFrom(java.io.InputStream input)
            throws java.io.IOException {
        return com.google.protobuf.GeneratedMessageV3
                .parseDelimitedWithIOException(PARSER, input);
    }
    public static io.yottachain.nodemgmt.pb.GetRebuildItemReq parseDelimitedFrom(
            java.io.InputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws java.io.IOException {
        return com.google.protobuf.GeneratedMessageV3
                .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static io.yottachain.nodemgmt.pb.GetRebuildItemReq parseFrom(
            com.google.protobuf.CodedInputStream input)
            throws java.io.IOException {
        return com.google.protobuf.GeneratedMessageV3
                .parseWithIOException(PARSER, input);
    }
    public static io.yottachain.nodemgmt.pb.GetRebuildItemReq parseFrom(
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
    public static Builder newBuilder(io.yottachain.nodemgmt.pb.GetRebuildItemReq prototype) {
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
     * Protobuf type {@code pb.GetRebuildItemReq}
     */
    public static final class Builder extends
            com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
            // @@protoc_insertion_point(builder_implements:pb.GetRebuildItemReq)
            io.yottachain.nodemgmt.pb.GetRebuildItemReqOrBuilder {
        public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
            return io.yottachain.nodemgmt.pb.NodeMgmtProto.internal_static_pb_GetRebuildItemReq_descriptor;
        }

        @java.lang.Override
        protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
            return io.yottachain.nodemgmt.pb.NodeMgmtProto.internal_static_pb_GetRebuildItemReq_fieldAccessorTable
                    .ensureFieldAccessorsInitialized(
                            io.yottachain.nodemgmt.pb.GetRebuildItemReq.class, io.yottachain.nodemgmt.pb.GetRebuildItemReq.Builder.class);
        }

        // Construct using io.yottachain.nodemgmt.pb.GetRebuildItemReq.newBuilder()
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
            minerID_ = 0;

            index_ = 0L;

            total_ = 0L;

            return this;
        }

        @java.lang.Override
        public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
            return io.yottachain.nodemgmt.pb.NodeMgmtProto.internal_static_pb_GetRebuildItemReq_descriptor;
        }

        @java.lang.Override
        public io.yottachain.nodemgmt.pb.GetRebuildItemReq getDefaultInstanceForType() {
            return io.yottachain.nodemgmt.pb.GetRebuildItemReq.getDefaultInstance();
        }

        @java.lang.Override
        public io.yottachain.nodemgmt.pb.GetRebuildItemReq build() {
            io.yottachain.nodemgmt.pb.GetRebuildItemReq result = buildPartial();
            if (!result.isInitialized()) {
                throw newUninitializedMessageException(result);
            }
            return result;
        }

        @java.lang.Override
        public io.yottachain.nodemgmt.pb.GetRebuildItemReq buildPartial() {
            io.yottachain.nodemgmt.pb.GetRebuildItemReq result = new io.yottachain.nodemgmt.pb.GetRebuildItemReq(this);
            result.minerID_ = minerID_;
            result.index_ = index_;
            result.total_ = total_;
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
            if (other instanceof io.yottachain.nodemgmt.pb.GetRebuildItemReq) {
                return mergeFrom((io.yottachain.nodemgmt.pb.GetRebuildItemReq)other);
            } else {
                super.mergeFrom(other);
                return this;
            }
        }

        public Builder mergeFrom(io.yottachain.nodemgmt.pb.GetRebuildItemReq other) {
            if (other == io.yottachain.nodemgmt.pb.GetRebuildItemReq.getDefaultInstance()) return this;
            if (other.getMinerID() != 0) {
                setMinerID(other.getMinerID());
            }
            if (other.getIndex() != 0L) {
                setIndex(other.getIndex());
            }
            if (other.getTotal() != 0L) {
                setTotal(other.getTotal());
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
            io.yottachain.nodemgmt.pb.GetRebuildItemReq parsedMessage = null;
            try {
                parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                parsedMessage = (io.yottachain.nodemgmt.pb.GetRebuildItemReq) e.getUnfinishedMessage();
                throw e.unwrapIOException();
            } finally {
                if (parsedMessage != null) {
                    mergeFrom(parsedMessage);
                }
            }
            return this;
        }

        private int minerID_ ;
        /**
         * <code>int32 minerID = 1;</code>
         */
        public int getMinerID() {
            return minerID_;
        }
        /**
         * <code>int32 minerID = 1;</code>
         */
        public Builder setMinerID(int value) {

            minerID_ = value;
            onChanged();
            return this;
        }
        /**
         * <code>int32 minerID = 1;</code>
         */
        public Builder clearMinerID() {

            minerID_ = 0;
            onChanged();
            return this;
        }

        private long index_ ;
        /**
         * <code>int64 index = 2;</code>
         */
        public long getIndex() {
            return index_;
        }
        /**
         * <code>int64 index = 2;</code>
         */
        public Builder setIndex(long value) {

            index_ = value;
            onChanged();
            return this;
        }
        /**
         * <code>int64 index = 2;</code>
         */
        public Builder clearIndex() {

            index_ = 0L;
            onChanged();
            return this;
        }

        private long total_ ;
        /**
         * <code>int64 total = 3;</code>
         */
        public long getTotal() {
            return total_;
        }
        /**
         * <code>int64 total = 3;</code>
         */
        public Builder setTotal(long value) {

            total_ = value;
            onChanged();
            return this;
        }
        /**
         * <code>int64 total = 3;</code>
         */
        public Builder clearTotal() {

            total_ = 0L;
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


        // @@protoc_insertion_point(builder_scope:pb.GetRebuildItemReq)
    }

    // @@protoc_insertion_point(class_scope:pb.GetRebuildItemReq)
    private static final io.yottachain.nodemgmt.pb.GetRebuildItemReq DEFAULT_INSTANCE;
    static {
        DEFAULT_INSTANCE = new io.yottachain.nodemgmt.pb.GetRebuildItemReq();
    }

    public static io.yottachain.nodemgmt.pb.GetRebuildItemReq getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<GetRebuildItemReq>
            PARSER = new com.google.protobuf.AbstractParser<GetRebuildItemReq>() {
        @java.lang.Override
        public GetRebuildItemReq parsePartialFrom(
                com.google.protobuf.CodedInputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return new GetRebuildItemReq(input, extensionRegistry);
        }
    };

    public static com.google.protobuf.Parser<GetRebuildItemReq> parser() {
        return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<GetRebuildItemReq> getParserForType() {
        return PARSER;
    }

    @java.lang.Override
    public io.yottachain.nodemgmt.pb.GetRebuildItemReq getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
    }

}

