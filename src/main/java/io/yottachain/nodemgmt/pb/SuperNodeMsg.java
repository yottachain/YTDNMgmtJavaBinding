// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: types.proto

package io.yottachain.nodemgmt.pb;

/**
 * <pre>
 * SuperNode message
 * </pre>
 *
 * Protobuf type {@code pb.SuperNodeMsg}
 */
public  final class SuperNodeMsg extends
        com.google.protobuf.GeneratedMessageV3 implements
        // @@protoc_insertion_point(message_implements:pb.SuperNodeMsg)
        SuperNodeMsgOrBuilder {
    private static final long serialVersionUID = 0L;
    // Use SuperNodeMsg.newBuilder() to construct.
    private SuperNodeMsg(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
        super(builder);
    }
    private SuperNodeMsg() {
        nodeID_ = "";
        pubKey_ = "";
        privKey_ = "";
        addrs_ = com.google.protobuf.LazyStringArrayList.EMPTY;
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
            UnusedPrivateParameter unused) {
        return new SuperNodeMsg();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
        return this.unknownFields;
    }
    private SuperNodeMsg(
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

                        iD_ = input.readInt32();
                        break;
                    }
                    case 18: {
                        java.lang.String s = input.readStringRequireUtf8();

                        nodeID_ = s;
                        break;
                    }
                    case 26: {
                        java.lang.String s = input.readStringRequireUtf8();

                        pubKey_ = s;
                        break;
                    }
                    case 34: {
                        java.lang.String s = input.readStringRequireUtf8();

                        privKey_ = s;
                        break;
                    }
                    case 42: {
                        java.lang.String s = input.readStringRequireUtf8();
                        if (!((mutable_bitField0_ & 0x00000001) != 0)) {
                            addrs_ = new com.google.protobuf.LazyStringArrayList();
                            mutable_bitField0_ |= 0x00000001;
                        }
                        addrs_.add(s);
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
                addrs_ = addrs_.getUnmodifiableView();
            }
            this.unknownFields = unknownFields.build();
            makeExtensionsImmutable();
        }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
    getDescriptor() {
        return io.yottachain.nodemgmt.pb.NodeMgmtProto.internal_static_pb_SuperNodeMsg_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
    internalGetFieldAccessorTable() {
        return io.yottachain.nodemgmt.pb.NodeMgmtProto.internal_static_pb_SuperNodeMsg_fieldAccessorTable
                .ensureFieldAccessorsInitialized(
                        io.yottachain.nodemgmt.pb.SuperNodeMsg.class, io.yottachain.nodemgmt.pb.SuperNodeMsg.Builder.class);
    }

    public static final int ID_FIELD_NUMBER = 1;
    private int iD_;
    /**
     * <pre>
     *super node index
     * </pre>
     *
     * <code>int32 iD = 1;</code>
     */
    public int getID() {
        return iD_;
    }

    public static final int NODEID_FIELD_NUMBER = 2;
    private volatile java.lang.Object nodeID_;
    /**
     * <pre>
     *super node ID, generated from PubKey
     * </pre>
     *
     * <code>string nodeID = 2;</code>
     */
    public java.lang.String getNodeID() {
        java.lang.Object ref = nodeID_;
        if (ref instanceof java.lang.String) {
            return (java.lang.String) ref;
        } else {
            com.google.protobuf.ByteString bs =
                    (com.google.protobuf.ByteString) ref;
            java.lang.String s = bs.toStringUtf8();
            nodeID_ = s;
            return s;
        }
    }
    /**
     * <pre>
     *super node ID, generated from PubKey
     * </pre>
     *
     * <code>string nodeID = 2;</code>
     */
    public com.google.protobuf.ByteString
    getNodeIDBytes() {
        java.lang.Object ref = nodeID_;
        if (ref instanceof java.lang.String) {
            com.google.protobuf.ByteString b =
                    com.google.protobuf.ByteString.copyFromUtf8(
                            (java.lang.String) ref);
            nodeID_ = b;
            return b;
        } else {
            return (com.google.protobuf.ByteString) ref;
        }
    }

    public static final int PUBKEY_FIELD_NUMBER = 3;
    private volatile java.lang.Object pubKey_;
    /**
     * <pre>
     *public key of super node
     * </pre>
     *
     * <code>string pubKey = 3;</code>
     */
    public java.lang.String getPubKey() {
        java.lang.Object ref = pubKey_;
        if (ref instanceof java.lang.String) {
            return (java.lang.String) ref;
        } else {
            com.google.protobuf.ByteString bs =
                    (com.google.protobuf.ByteString) ref;
            java.lang.String s = bs.toStringUtf8();
            pubKey_ = s;
            return s;
        }
    }
    /**
     * <pre>
     *public key of super node
     * </pre>
     *
     * <code>string pubKey = 3;</code>
     */
    public com.google.protobuf.ByteString
    getPubKeyBytes() {
        java.lang.Object ref = pubKey_;
        if (ref instanceof java.lang.String) {
            com.google.protobuf.ByteString b =
                    com.google.protobuf.ByteString.copyFromUtf8(
                            (java.lang.String) ref);
            pubKey_ = b;
            return b;
        } else {
            return (com.google.protobuf.ByteString) ref;
        }
    }

    public static final int PRIVKEY_FIELD_NUMBER = 4;
    private volatile java.lang.Object privKey_;
    /**
     * <pre>
     *private key of super node
     * </pre>
     *
     * <code>string privKey = 4;</code>
     */
    public java.lang.String getPrivKey() {
        java.lang.Object ref = privKey_;
        if (ref instanceof java.lang.String) {
            return (java.lang.String) ref;
        } else {
            com.google.protobuf.ByteString bs =
                    (com.google.protobuf.ByteString) ref;
            java.lang.String s = bs.toStringUtf8();
            privKey_ = s;
            return s;
        }
    }
    /**
     * <pre>
     *private key of super node
     * </pre>
     *
     * <code>string privKey = 4;</code>
     */
    public com.google.protobuf.ByteString
    getPrivKeyBytes() {
        java.lang.Object ref = privKey_;
        if (ref instanceof java.lang.String) {
            com.google.protobuf.ByteString b =
                    com.google.protobuf.ByteString.copyFromUtf8(
                            (java.lang.String) ref);
            privKey_ = b;
            return b;
        } else {
            return (com.google.protobuf.ByteString) ref;
        }
    }

    public static final int ADDRS_FIELD_NUMBER = 5;
    private com.google.protobuf.LazyStringList addrs_;
    /**
     * <pre>
     *listening addresses of super node
     * </pre>
     *
     * <code>repeated string addrs = 5;</code>
     */
    public com.google.protobuf.ProtocolStringList
    getAddrsList() {
        return addrs_;
    }
    /**
     * <pre>
     *listening addresses of super node
     * </pre>
     *
     * <code>repeated string addrs = 5;</code>
     */
    public int getAddrsCount() {
        return addrs_.size();
    }
    /**
     * <pre>
     *listening addresses of super node
     * </pre>
     *
     * <code>repeated string addrs = 5;</code>
     */
    public java.lang.String getAddrs(int index) {
        return addrs_.get(index);
    }
    /**
     * <pre>
     *listening addresses of super node
     * </pre>
     *
     * <code>repeated string addrs = 5;</code>
     */
    public com.google.protobuf.ByteString
    getAddrsBytes(int index) {
        return addrs_.getByteString(index);
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
        if (!getNodeIDBytes().isEmpty()) {
            com.google.protobuf.GeneratedMessageV3.writeString(output, 2, nodeID_);
        }
        if (!getPubKeyBytes().isEmpty()) {
            com.google.protobuf.GeneratedMessageV3.writeString(output, 3, pubKey_);
        }
        if (!getPrivKeyBytes().isEmpty()) {
            com.google.protobuf.GeneratedMessageV3.writeString(output, 4, privKey_);
        }
        for (int i = 0; i < addrs_.size(); i++) {
            com.google.protobuf.GeneratedMessageV3.writeString(output, 5, addrs_.getRaw(i));
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
        if (!getNodeIDBytes().isEmpty()) {
            size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, nodeID_);
        }
        if (!getPubKeyBytes().isEmpty()) {
            size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, pubKey_);
        }
        if (!getPrivKeyBytes().isEmpty()) {
            size += com.google.protobuf.GeneratedMessageV3.computeStringSize(4, privKey_);
        }
        {
            int dataSize = 0;
            for (int i = 0; i < addrs_.size(); i++) {
                dataSize += computeStringSizeNoTag(addrs_.getRaw(i));
            }
            size += dataSize;
            size += 1 * getAddrsList().size();
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
        if (!(obj instanceof io.yottachain.nodemgmt.pb.SuperNodeMsg)) {
            return super.equals(obj);
        }
        io.yottachain.nodemgmt.pb.SuperNodeMsg other = (io.yottachain.nodemgmt.pb.SuperNodeMsg) obj;

        if (getID()
                != other.getID()) return false;
        if (!getNodeID()
                .equals(other.getNodeID())) return false;
        if (!getPubKey()
                .equals(other.getPubKey())) return false;
        if (!getPrivKey()
                .equals(other.getPrivKey())) return false;
        if (!getAddrsList()
                .equals(other.getAddrsList())) return false;
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
        hash = (37 * hash) + NODEID_FIELD_NUMBER;
        hash = (53 * hash) + getNodeID().hashCode();
        hash = (37 * hash) + PUBKEY_FIELD_NUMBER;
        hash = (53 * hash) + getPubKey().hashCode();
        hash = (37 * hash) + PRIVKEY_FIELD_NUMBER;
        hash = (53 * hash) + getPrivKey().hashCode();
        if (getAddrsCount() > 0) {
            hash = (37 * hash) + ADDRS_FIELD_NUMBER;
            hash = (53 * hash) + getAddrsList().hashCode();
        }
        hash = (29 * hash) + unknownFields.hashCode();
        memoizedHashCode = hash;
        return hash;
    }

    public static io.yottachain.nodemgmt.pb.SuperNodeMsg parseFrom(
            java.nio.ByteBuffer data)
            throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data);
    }
    public static io.yottachain.nodemgmt.pb.SuperNodeMsg parseFrom(
            java.nio.ByteBuffer data,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data, extensionRegistry);
    }
    public static io.yottachain.nodemgmt.pb.SuperNodeMsg parseFrom(
            com.google.protobuf.ByteString data)
            throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data);
    }
    public static io.yottachain.nodemgmt.pb.SuperNodeMsg parseFrom(
            com.google.protobuf.ByteString data,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data, extensionRegistry);
    }
    public static io.yottachain.nodemgmt.pb.SuperNodeMsg parseFrom(byte[] data)
            throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data);
    }
    public static io.yottachain.nodemgmt.pb.SuperNodeMsg parseFrom(
            byte[] data,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data, extensionRegistry);
    }
    public static io.yottachain.nodemgmt.pb.SuperNodeMsg parseFrom(java.io.InputStream input)
            throws java.io.IOException {
        return com.google.protobuf.GeneratedMessageV3
                .parseWithIOException(PARSER, input);
    }
    public static io.yottachain.nodemgmt.pb.SuperNodeMsg parseFrom(
            java.io.InputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws java.io.IOException {
        return com.google.protobuf.GeneratedMessageV3
                .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static io.yottachain.nodemgmt.pb.SuperNodeMsg parseDelimitedFrom(java.io.InputStream input)
            throws java.io.IOException {
        return com.google.protobuf.GeneratedMessageV3
                .parseDelimitedWithIOException(PARSER, input);
    }
    public static io.yottachain.nodemgmt.pb.SuperNodeMsg parseDelimitedFrom(
            java.io.InputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws java.io.IOException {
        return com.google.protobuf.GeneratedMessageV3
                .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static io.yottachain.nodemgmt.pb.SuperNodeMsg parseFrom(
            com.google.protobuf.CodedInputStream input)
            throws java.io.IOException {
        return com.google.protobuf.GeneratedMessageV3
                .parseWithIOException(PARSER, input);
    }
    public static io.yottachain.nodemgmt.pb.SuperNodeMsg parseFrom(
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
    public static Builder newBuilder(io.yottachain.nodemgmt.pb.SuperNodeMsg prototype) {
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
     * SuperNode message
     * </pre>
     *
     * Protobuf type {@code pb.SuperNodeMsg}
     */
    public static final class Builder extends
            com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
            // @@protoc_insertion_point(builder_implements:pb.SuperNodeMsg)
            io.yottachain.nodemgmt.pb.SuperNodeMsgOrBuilder {
        public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
            return io.yottachain.nodemgmt.pb.NodeMgmtProto.internal_static_pb_SuperNodeMsg_descriptor;
        }

        @java.lang.Override
        protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
            return io.yottachain.nodemgmt.pb.NodeMgmtProto.internal_static_pb_SuperNodeMsg_fieldAccessorTable
                    .ensureFieldAccessorsInitialized(
                            io.yottachain.nodemgmt.pb.SuperNodeMsg.class, io.yottachain.nodemgmt.pb.SuperNodeMsg.Builder.class);
        }

        // Construct using io.yottachain.nodemgmt.pb.SuperNodeMsg.newBuilder()
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

            nodeID_ = "";

            pubKey_ = "";

            privKey_ = "";

            addrs_ = com.google.protobuf.LazyStringArrayList.EMPTY;
            bitField0_ = (bitField0_ & ~0x00000001);
            return this;
        }

        @java.lang.Override
        public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
            return io.yottachain.nodemgmt.pb.NodeMgmtProto.internal_static_pb_SuperNodeMsg_descriptor;
        }

        @java.lang.Override
        public io.yottachain.nodemgmt.pb.SuperNodeMsg getDefaultInstanceForType() {
            return io.yottachain.nodemgmt.pb.SuperNodeMsg.getDefaultInstance();
        }

        @java.lang.Override
        public io.yottachain.nodemgmt.pb.SuperNodeMsg build() {
            io.yottachain.nodemgmt.pb.SuperNodeMsg result = buildPartial();
            if (!result.isInitialized()) {
                throw newUninitializedMessageException(result);
            }
            return result;
        }

        @java.lang.Override
        public io.yottachain.nodemgmt.pb.SuperNodeMsg buildPartial() {
            io.yottachain.nodemgmt.pb.SuperNodeMsg result = new io.yottachain.nodemgmt.pb.SuperNodeMsg(this);
            int from_bitField0_ = bitField0_;
            result.iD_ = iD_;
            result.nodeID_ = nodeID_;
            result.pubKey_ = pubKey_;
            result.privKey_ = privKey_;
            if (((bitField0_ & 0x00000001) != 0)) {
                addrs_ = addrs_.getUnmodifiableView();
                bitField0_ = (bitField0_ & ~0x00000001);
            }
            result.addrs_ = addrs_;
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
            if (other instanceof io.yottachain.nodemgmt.pb.SuperNodeMsg) {
                return mergeFrom((io.yottachain.nodemgmt.pb.SuperNodeMsg)other);
            } else {
                super.mergeFrom(other);
                return this;
            }
        }

        public Builder mergeFrom(io.yottachain.nodemgmt.pb.SuperNodeMsg other) {
            if (other == io.yottachain.nodemgmt.pb.SuperNodeMsg.getDefaultInstance()) return this;
            if (other.getID() != 0) {
                setID(other.getID());
            }
            if (!other.getNodeID().isEmpty()) {
                nodeID_ = other.nodeID_;
                onChanged();
            }
            if (!other.getPubKey().isEmpty()) {
                pubKey_ = other.pubKey_;
                onChanged();
            }
            if (!other.getPrivKey().isEmpty()) {
                privKey_ = other.privKey_;
                onChanged();
            }
            if (!other.addrs_.isEmpty()) {
                if (addrs_.isEmpty()) {
                    addrs_ = other.addrs_;
                    bitField0_ = (bitField0_ & ~0x00000001);
                } else {
                    ensureAddrsIsMutable();
                    addrs_.addAll(other.addrs_);
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
            io.yottachain.nodemgmt.pb.SuperNodeMsg parsedMessage = null;
            try {
                parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                parsedMessage = (io.yottachain.nodemgmt.pb.SuperNodeMsg) e.getUnfinishedMessage();
                throw e.unwrapIOException();
            } finally {
                if (parsedMessage != null) {
                    mergeFrom(parsedMessage);
                }
            }
            return this;
        }
        private int bitField0_;

        private int iD_ ;
        /**
         * <pre>
         *super node index
         * </pre>
         *
         * <code>int32 iD = 1;</code>
         */
        public int getID() {
            return iD_;
        }
        /**
         * <pre>
         *super node index
         * </pre>
         *
         * <code>int32 iD = 1;</code>
         */
        public Builder setID(int value) {

            iD_ = value;
            onChanged();
            return this;
        }
        /**
         * <pre>
         *super node index
         * </pre>
         *
         * <code>int32 iD = 1;</code>
         */
        public Builder clearID() {

            iD_ = 0;
            onChanged();
            return this;
        }

        private java.lang.Object nodeID_ = "";
        /**
         * <pre>
         *super node ID, generated from PubKey
         * </pre>
         *
         * <code>string nodeID = 2;</code>
         */
        public java.lang.String getNodeID() {
            java.lang.Object ref = nodeID_;
            if (!(ref instanceof java.lang.String)) {
                com.google.protobuf.ByteString bs =
                        (com.google.protobuf.ByteString) ref;
                java.lang.String s = bs.toStringUtf8();
                nodeID_ = s;
                return s;
            } else {
                return (java.lang.String) ref;
            }
        }
        /**
         * <pre>
         *super node ID, generated from PubKey
         * </pre>
         *
         * <code>string nodeID = 2;</code>
         */
        public com.google.protobuf.ByteString
        getNodeIDBytes() {
            java.lang.Object ref = nodeID_;
            if (ref instanceof String) {
                com.google.protobuf.ByteString b =
                        com.google.protobuf.ByteString.copyFromUtf8(
                                (java.lang.String) ref);
                nodeID_ = b;
                return b;
            } else {
                return (com.google.protobuf.ByteString) ref;
            }
        }
        /**
         * <pre>
         *super node ID, generated from PubKey
         * </pre>
         *
         * <code>string nodeID = 2;</code>
         */
        public Builder setNodeID(
                java.lang.String value) {
            if (value == null) {
                throw new NullPointerException();
            }

            nodeID_ = value;
            onChanged();
            return this;
        }
        /**
         * <pre>
         *super node ID, generated from PubKey
         * </pre>
         *
         * <code>string nodeID = 2;</code>
         */
        public Builder clearNodeID() {

            nodeID_ = getDefaultInstance().getNodeID();
            onChanged();
            return this;
        }
        /**
         * <pre>
         *super node ID, generated from PubKey
         * </pre>
         *
         * <code>string nodeID = 2;</code>
         */
        public Builder setNodeIDBytes(
                com.google.protobuf.ByteString value) {
            if (value == null) {
                throw new NullPointerException();
            }
            checkByteStringIsUtf8(value);

            nodeID_ = value;
            onChanged();
            return this;
        }

        private java.lang.Object pubKey_ = "";
        /**
         * <pre>
         *public key of super node
         * </pre>
         *
         * <code>string pubKey = 3;</code>
         */
        public java.lang.String getPubKey() {
            java.lang.Object ref = pubKey_;
            if (!(ref instanceof java.lang.String)) {
                com.google.protobuf.ByteString bs =
                        (com.google.protobuf.ByteString) ref;
                java.lang.String s = bs.toStringUtf8();
                pubKey_ = s;
                return s;
            } else {
                return (java.lang.String) ref;
            }
        }
        /**
         * <pre>
         *public key of super node
         * </pre>
         *
         * <code>string pubKey = 3;</code>
         */
        public com.google.protobuf.ByteString
        getPubKeyBytes() {
            java.lang.Object ref = pubKey_;
            if (ref instanceof String) {
                com.google.protobuf.ByteString b =
                        com.google.protobuf.ByteString.copyFromUtf8(
                                (java.lang.String) ref);
                pubKey_ = b;
                return b;
            } else {
                return (com.google.protobuf.ByteString) ref;
            }
        }
        /**
         * <pre>
         *public key of super node
         * </pre>
         *
         * <code>string pubKey = 3;</code>
         */
        public Builder setPubKey(
                java.lang.String value) {
            if (value == null) {
                throw new NullPointerException();
            }

            pubKey_ = value;
            onChanged();
            return this;
        }
        /**
         * <pre>
         *public key of super node
         * </pre>
         *
         * <code>string pubKey = 3;</code>
         */
        public Builder clearPubKey() {

            pubKey_ = getDefaultInstance().getPubKey();
            onChanged();
            return this;
        }
        /**
         * <pre>
         *public key of super node
         * </pre>
         *
         * <code>string pubKey = 3;</code>
         */
        public Builder setPubKeyBytes(
                com.google.protobuf.ByteString value) {
            if (value == null) {
                throw new NullPointerException();
            }
            checkByteStringIsUtf8(value);

            pubKey_ = value;
            onChanged();
            return this;
        }

        private java.lang.Object privKey_ = "";
        /**
         * <pre>
         *private key of super node
         * </pre>
         *
         * <code>string privKey = 4;</code>
         */
        public java.lang.String getPrivKey() {
            java.lang.Object ref = privKey_;
            if (!(ref instanceof java.lang.String)) {
                com.google.protobuf.ByteString bs =
                        (com.google.protobuf.ByteString) ref;
                java.lang.String s = bs.toStringUtf8();
                privKey_ = s;
                return s;
            } else {
                return (java.lang.String) ref;
            }
        }
        /**
         * <pre>
         *private key of super node
         * </pre>
         *
         * <code>string privKey = 4;</code>
         */
        public com.google.protobuf.ByteString
        getPrivKeyBytes() {
            java.lang.Object ref = privKey_;
            if (ref instanceof String) {
                com.google.protobuf.ByteString b =
                        com.google.protobuf.ByteString.copyFromUtf8(
                                (java.lang.String) ref);
                privKey_ = b;
                return b;
            } else {
                return (com.google.protobuf.ByteString) ref;
            }
        }
        /**
         * <pre>
         *private key of super node
         * </pre>
         *
         * <code>string privKey = 4;</code>
         */
        public Builder setPrivKey(
                java.lang.String value) {
            if (value == null) {
                throw new NullPointerException();
            }

            privKey_ = value;
            onChanged();
            return this;
        }
        /**
         * <pre>
         *private key of super node
         * </pre>
         *
         * <code>string privKey = 4;</code>
         */
        public Builder clearPrivKey() {

            privKey_ = getDefaultInstance().getPrivKey();
            onChanged();
            return this;
        }
        /**
         * <pre>
         *private key of super node
         * </pre>
         *
         * <code>string privKey = 4;</code>
         */
        public Builder setPrivKeyBytes(
                com.google.protobuf.ByteString value) {
            if (value == null) {
                throw new NullPointerException();
            }
            checkByteStringIsUtf8(value);

            privKey_ = value;
            onChanged();
            return this;
        }

        private com.google.protobuf.LazyStringList addrs_ = com.google.protobuf.LazyStringArrayList.EMPTY;
        private void ensureAddrsIsMutable() {
            if (!((bitField0_ & 0x00000001) != 0)) {
                addrs_ = new com.google.protobuf.LazyStringArrayList(addrs_);
                bitField0_ |= 0x00000001;
            }
        }
        /**
         * <pre>
         *listening addresses of super node
         * </pre>
         *
         * <code>repeated string addrs = 5;</code>
         */
        public com.google.protobuf.ProtocolStringList
        getAddrsList() {
            return addrs_.getUnmodifiableView();
        }
        /**
         * <pre>
         *listening addresses of super node
         * </pre>
         *
         * <code>repeated string addrs = 5;</code>
         */
        public int getAddrsCount() {
            return addrs_.size();
        }
        /**
         * <pre>
         *listening addresses of super node
         * </pre>
         *
         * <code>repeated string addrs = 5;</code>
         */
        public java.lang.String getAddrs(int index) {
            return addrs_.get(index);
        }
        /**
         * <pre>
         *listening addresses of super node
         * </pre>
         *
         * <code>repeated string addrs = 5;</code>
         */
        public com.google.protobuf.ByteString
        getAddrsBytes(int index) {
            return addrs_.getByteString(index);
        }
        /**
         * <pre>
         *listening addresses of super node
         * </pre>
         *
         * <code>repeated string addrs = 5;</code>
         */
        public Builder setAddrs(
                int index, java.lang.String value) {
            if (value == null) {
                throw new NullPointerException();
            }
            ensureAddrsIsMutable();
            addrs_.set(index, value);
            onChanged();
            return this;
        }
        /**
         * <pre>
         *listening addresses of super node
         * </pre>
         *
         * <code>repeated string addrs = 5;</code>
         */
        public Builder addAddrs(
                java.lang.String value) {
            if (value == null) {
                throw new NullPointerException();
            }
            ensureAddrsIsMutable();
            addrs_.add(value);
            onChanged();
            return this;
        }
        /**
         * <pre>
         *listening addresses of super node
         * </pre>
         *
         * <code>repeated string addrs = 5;</code>
         */
        public Builder addAllAddrs(
                java.lang.Iterable<java.lang.String> values) {
            ensureAddrsIsMutable();
            com.google.protobuf.AbstractMessageLite.Builder.addAll(
                    values, addrs_);
            onChanged();
            return this;
        }
        /**
         * <pre>
         *listening addresses of super node
         * </pre>
         *
         * <code>repeated string addrs = 5;</code>
         */
        public Builder clearAddrs() {
            addrs_ = com.google.protobuf.LazyStringArrayList.EMPTY;
            bitField0_ = (bitField0_ & ~0x00000001);
            onChanged();
            return this;
        }
        /**
         * <pre>
         *listening addresses of super node
         * </pre>
         *
         * <code>repeated string addrs = 5;</code>
         */
        public Builder addAddrsBytes(
                com.google.protobuf.ByteString value) {
            if (value == null) {
                throw new NullPointerException();
            }
            checkByteStringIsUtf8(value);
            ensureAddrsIsMutable();
            addrs_.add(value);
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


        // @@protoc_insertion_point(builder_scope:pb.SuperNodeMsg)
    }

    // @@protoc_insertion_point(class_scope:pb.SuperNodeMsg)
    private static final io.yottachain.nodemgmt.pb.SuperNodeMsg DEFAULT_INSTANCE;
    static {
        DEFAULT_INSTANCE = new io.yottachain.nodemgmt.pb.SuperNodeMsg();
    }

    public static io.yottachain.nodemgmt.pb.SuperNodeMsg getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<SuperNodeMsg>
            PARSER = new com.google.protobuf.AbstractParser<SuperNodeMsg>() {
        @java.lang.Override
        public SuperNodeMsg parsePartialFrom(
                com.google.protobuf.CodedInputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return new SuperNodeMsg(input, extensionRegistry);
        }
    };

    public static com.google.protobuf.Parser<SuperNodeMsg> parser() {
        return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<SuperNodeMsg> getParserForType() {
        return PARSER;
    }

    @java.lang.Override
    public io.yottachain.nodemgmt.pb.SuperNodeMsg getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
    }

}

