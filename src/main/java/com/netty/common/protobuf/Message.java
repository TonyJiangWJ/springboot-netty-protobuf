// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: Message.proto

package com.netty.common.protobuf;

public final class Message {
    private Message() {
    }

    public static void registerAllExtensions(
            com.google.protobuf.ExtensionRegistryLite registry) {
    }

    public static void registerAllExtensions(
            com.google.protobuf.ExtensionRegistry registry) {
        registerAllExtensions(
                (com.google.protobuf.ExtensionRegistryLite) registry);
    }

    public interface MessageBaseOrBuilder extends
            // @@protoc_insertion_point(interface_extends:MessageBase)
            com.google.protobuf.MessageOrBuilder {

        /**
         * <code>required string clientId = 1;</code>
         */
        boolean hasClientId();

        /**
         * <code>required string clientId = 1;</code>
         */
        java.lang.String getClientId();

        /**
         * <code>required string clientId = 1;</code>
         */
        com.google.protobuf.ByteString
        getClientIdBytes();

        /**
         * <code>required .CommandType cmd = 2;</code>
         */
        boolean hasCmd();

        /**
         * <code>required .CommandType cmd = 2;</code>
         */
        com.netty.common.protobuf.Command.CommandType getCmd();

        /**
         * <code>optional string data = 3;</code>
         */
        boolean hasData();

        /**
         * <code>optional string data = 3;</code>
         */
        java.lang.String getData();

        /**
         * <code>optional string data = 3;</code>
         */
        com.google.protobuf.ByteString
        getDataBytes();
    }

    /**
     * Protobuf type {@code MessageBase}
     */
    public static final class MessageBase extends
            com.google.protobuf.GeneratedMessageV3 implements
            // @@protoc_insertion_point(message_implements:MessageBase)
            MessageBaseOrBuilder {
        // Use MessageBase.newBuilder() to construct.
        private MessageBase(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
            super(builder);
        }

        private MessageBase() {
            clientId_ = "";
            cmd_ = 1;
            data_ = "";
        }

        @java.lang.Override
        public final com.google.protobuf.UnknownFieldSet
        getUnknownFields() {
            return this.unknownFields;
        }

        private MessageBase(
                com.google.protobuf.CodedInputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            this();
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
                        default: {
                            if (!parseUnknownField(input, unknownFields,
                                    extensionRegistry, tag)) {
                                done = true;
                            }
                            break;
                        }
                        case 10: {
                            com.google.protobuf.ByteString bs = input.readBytes();
                            bitField0_ |= 0x00000001;
                            clientId_ = bs;
                            break;
                        }
                        case 16: {
                            int rawValue = input.readEnum();
                            com.netty.common.protobuf.Command.CommandType value = com.netty.common.protobuf.Command.CommandType.valueOf(rawValue);
                            if (value == null) {
                                unknownFields.mergeVarintField(2, rawValue);
                            } else {
                                bitField0_ |= 0x00000002;
                                cmd_ = rawValue;
                            }
                            break;
                        }
                        case 26: {
                            com.google.protobuf.ByteString bs = input.readBytes();
                            bitField0_ |= 0x00000004;
                            data_ = bs;
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
            return com.netty.common.protobuf.Message.internal_static_MessageBase_descriptor;
        }

        protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
            return com.netty.common.protobuf.Message.internal_static_MessageBase_fieldAccessorTable
                    .ensureFieldAccessorsInitialized(
                            com.netty.common.protobuf.Message.MessageBase.class, com.netty.common.protobuf.Message.MessageBase.Builder.class);
        }

        private int bitField0_;
        public static final int CLIENTID_FIELD_NUMBER = 1;
        private volatile java.lang.Object clientId_;

        /**
         * <code>required string clientId = 1;</code>
         */
        public boolean hasClientId() {
            return ((bitField0_ & 0x00000001) == 0x00000001);
        }

        /**
         * <code>required string clientId = 1;</code>
         */
        public java.lang.String getClientId() {
            java.lang.Object ref = clientId_;
            if (ref instanceof java.lang.String) {
                return (java.lang.String) ref;
            } else {
                com.google.protobuf.ByteString bs =
                        (com.google.protobuf.ByteString) ref;
                java.lang.String s = bs.toStringUtf8();
                if (bs.isValidUtf8()) {
                    clientId_ = s;
                }
                return s;
            }
        }

        /**
         * <code>required string clientId = 1;</code>
         */
        public com.google.protobuf.ByteString
        getClientIdBytes() {
            java.lang.Object ref = clientId_;
            if (ref instanceof java.lang.String) {
                com.google.protobuf.ByteString b =
                        com.google.protobuf.ByteString.copyFromUtf8(
                                (java.lang.String) ref);
                clientId_ = b;
                return b;
            } else {
                return (com.google.protobuf.ByteString) ref;
            }
        }

        public static final int CMD_FIELD_NUMBER = 2;
        private int cmd_;

        /**
         * <code>required .CommandType cmd = 2;</code>
         */
        public boolean hasCmd() {
            return ((bitField0_ & 0x00000002) == 0x00000002);
        }

        /**
         * <code>required .CommandType cmd = 2;</code>
         */
        public com.netty.common.protobuf.Command.CommandType getCmd() {
            com.netty.common.protobuf.Command.CommandType result = com.netty.common.protobuf.Command.CommandType.valueOf(cmd_);
            return result == null ? com.netty.common.protobuf.Command.CommandType.AUTH : result;
        }

        public static final int DATA_FIELD_NUMBER = 3;
        private volatile java.lang.Object data_;

        /**
         * <code>optional string data = 3;</code>
         */
        public boolean hasData() {
            return ((bitField0_ & 0x00000004) == 0x00000004);
        }

        /**
         * <code>optional string data = 3;</code>
         */
        public java.lang.String getData() {
            java.lang.Object ref = data_;
            if (ref instanceof java.lang.String) {
                return (java.lang.String) ref;
            } else {
                com.google.protobuf.ByteString bs =
                        (com.google.protobuf.ByteString) ref;
                java.lang.String s = bs.toStringUtf8();
                if (bs.isValidUtf8()) {
                    data_ = s;
                }
                return s;
            }
        }

        /**
         * <code>optional string data = 3;</code>
         */
        public com.google.protobuf.ByteString
        getDataBytes() {
            java.lang.Object ref = data_;
            if (ref instanceof java.lang.String) {
                com.google.protobuf.ByteString b =
                        com.google.protobuf.ByteString.copyFromUtf8(
                                (java.lang.String) ref);
                data_ = b;
                return b;
            } else {
                return (com.google.protobuf.ByteString) ref;
            }
        }

        private byte memoizedIsInitialized = -1;

        public final boolean isInitialized() {
            byte isInitialized = memoizedIsInitialized;
            if (isInitialized == 1) return true;
            if (isInitialized == 0) return false;

            if (!hasClientId()) {
                memoizedIsInitialized = 0;
                return false;
            }
            if (!hasCmd()) {
                memoizedIsInitialized = 0;
                return false;
            }
            memoizedIsInitialized = 1;
            return true;
        }

        public void writeTo(com.google.protobuf.CodedOutputStream output)
                throws java.io.IOException {
            if (((bitField0_ & 0x00000001) == 0x00000001)) {
                com.google.protobuf.GeneratedMessageV3.writeString(output, 1, clientId_);
            }
            if (((bitField0_ & 0x00000002) == 0x00000002)) {
                output.writeEnum(2, cmd_);
            }
            if (((bitField0_ & 0x00000004) == 0x00000004)) {
                com.google.protobuf.GeneratedMessageV3.writeString(output, 3, data_);
            }
            unknownFields.writeTo(output);
        }

        public int getSerializedSize() {
            int size = memoizedSize;
            if (size != -1) return size;

            size = 0;
            if (((bitField0_ & 0x00000001) == 0x00000001)) {
                size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, clientId_);
            }
            if (((bitField0_ & 0x00000002) == 0x00000002)) {
                size += com.google.protobuf.CodedOutputStream
                        .computeEnumSize(2, cmd_);
            }
            if (((bitField0_ & 0x00000004) == 0x00000004)) {
                size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, data_);
            }
            size += unknownFields.getSerializedSize();
            memoizedSize = size;
            return size;
        }

        private static final long serialVersionUID = 0L;

        @java.lang.Override
        public boolean equals(final java.lang.Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof com.netty.common.protobuf.Message.MessageBase)) {
                return super.equals(obj);
            }
            com.netty.common.protobuf.Message.MessageBase other = (com.netty.common.protobuf.Message.MessageBase) obj;

            boolean result = true;
            result = result && (hasClientId() == other.hasClientId());
            if (hasClientId()) {
                result = result && getClientId()
                        .equals(other.getClientId());
            }
            result = result && (hasCmd() == other.hasCmd());
            if (hasCmd()) {
                result = result && cmd_ == other.cmd_;
            }
            result = result && (hasData() == other.hasData());
            if (hasData()) {
                result = result && getData()
                        .equals(other.getData());
            }
            result = result && unknownFields.equals(other.unknownFields);
            return result;
        }

        @java.lang.Override
        public int hashCode() {
            if (memoizedHashCode != 0) {
                return memoizedHashCode;
            }
            int hash = 41;
            hash = (19 * hash) + getDescriptorForType().hashCode();
            if (hasClientId()) {
                hash = (37 * hash) + CLIENTID_FIELD_NUMBER;
                hash = (53 * hash) + getClientId().hashCode();
            }
            if (hasCmd()) {
                hash = (37 * hash) + CMD_FIELD_NUMBER;
                hash = (53 * hash) + cmd_;
            }
            if (hasData()) {
                hash = (37 * hash) + DATA_FIELD_NUMBER;
                hash = (53 * hash) + getData().hashCode();
            }
            hash = (29 * hash) + unknownFields.hashCode();
            memoizedHashCode = hash;
            return hash;
        }

        public static com.netty.common.protobuf.Message.MessageBase parseFrom(
                com.google.protobuf.ByteString data)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }

        public static com.netty.common.protobuf.Message.MessageBase parseFrom(
                com.google.protobuf.ByteString data,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }

        public static com.netty.common.protobuf.Message.MessageBase parseFrom(byte[] data)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }

        public static com.netty.common.protobuf.Message.MessageBase parseFrom(
                byte[] data,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }

        public static com.netty.common.protobuf.Message.MessageBase parseFrom(java.io.InputStream input)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseWithIOException(PARSER, input);
        }

        public static com.netty.common.protobuf.Message.MessageBase parseFrom(
                java.io.InputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseWithIOException(PARSER, input, extensionRegistry);
        }

        public static com.netty.common.protobuf.Message.MessageBase parseDelimitedFrom(java.io.InputStream input)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseDelimitedWithIOException(PARSER, input);
        }

        public static com.netty.common.protobuf.Message.MessageBase parseDelimitedFrom(
                java.io.InputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
        }

        public static com.netty.common.protobuf.Message.MessageBase parseFrom(
                com.google.protobuf.CodedInputStream input)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseWithIOException(PARSER, input);
        }

        public static com.netty.common.protobuf.Message.MessageBase parseFrom(
                com.google.protobuf.CodedInputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseWithIOException(PARSER, input, extensionRegistry);
        }

        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static Builder newBuilder(com.netty.common.protobuf.Message.MessageBase prototype) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }

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
         * Protobuf type {@code MessageBase}
         */
        public static final class Builder extends
                com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
                // @@protoc_insertion_point(builder_implements:MessageBase)
                com.netty.common.protobuf.Message.MessageBaseOrBuilder {
            public static final com.google.protobuf.Descriptors.Descriptor
            getDescriptor() {
                return com.netty.common.protobuf.Message.internal_static_MessageBase_descriptor;
            }

            protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
            internalGetFieldAccessorTable() {
                return com.netty.common.protobuf.Message.internal_static_MessageBase_fieldAccessorTable
                        .ensureFieldAccessorsInitialized(
                                com.netty.common.protobuf.Message.MessageBase.class, com.netty.common.protobuf.Message.MessageBase.Builder.class);
            }

            // Construct using com.netty.common.protobuf.Message.MessageBase.newBuilder()
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

            public Builder clear() {
                super.clear();
                clientId_ = "";
                bitField0_ = (bitField0_ & ~0x00000001);
                cmd_ = 1;
                bitField0_ = (bitField0_ & ~0x00000002);
                data_ = "";
                bitField0_ = (bitField0_ & ~0x00000004);
                return this;
            }

            public com.google.protobuf.Descriptors.Descriptor
            getDescriptorForType() {
                return com.netty.common.protobuf.Message.internal_static_MessageBase_descriptor;
            }

            public com.netty.common.protobuf.Message.MessageBase getDefaultInstanceForType() {
                return com.netty.common.protobuf.Message.MessageBase.getDefaultInstance();
            }

            public com.netty.common.protobuf.Message.MessageBase build() {
                com.netty.common.protobuf.Message.MessageBase result = buildPartial();
                if (!result.isInitialized()) {
                    throw newUninitializedMessageException(result);
                }
                return result;
            }

            public com.netty.common.protobuf.Message.MessageBase buildPartial() {
                com.netty.common.protobuf.Message.MessageBase result = new com.netty.common.protobuf.Message.MessageBase(this);
                int from_bitField0_ = bitField0_;
                int to_bitField0_ = 0;
                if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
                    to_bitField0_ |= 0x00000001;
                }
                result.clientId_ = clientId_;
                if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
                    to_bitField0_ |= 0x00000002;
                }
                result.cmd_ = cmd_;
                if (((from_bitField0_ & 0x00000004) == 0x00000004)) {
                    to_bitField0_ |= 0x00000004;
                }
                result.data_ = data_;
                result.bitField0_ = to_bitField0_;
                onBuilt();
                return result;
            }

            public Builder clone() {
                return (Builder) super.clone();
            }

            public Builder setField(
                    com.google.protobuf.Descriptors.FieldDescriptor field,
                    Object value) {
                return (Builder) super.setField(field, value);
            }

            public Builder clearField(
                    com.google.protobuf.Descriptors.FieldDescriptor field) {
                return (Builder) super.clearField(field);
            }

            public Builder clearOneof(
                    com.google.protobuf.Descriptors.OneofDescriptor oneof) {
                return (Builder) super.clearOneof(oneof);
            }

            public Builder setRepeatedField(
                    com.google.protobuf.Descriptors.FieldDescriptor field,
                    int index, Object value) {
                return (Builder) super.setRepeatedField(field, index, value);
            }

            public Builder addRepeatedField(
                    com.google.protobuf.Descriptors.FieldDescriptor field,
                    Object value) {
                return (Builder) super.addRepeatedField(field, value);
            }

            public Builder mergeFrom(com.google.protobuf.Message other) {
                if (other instanceof com.netty.common.protobuf.Message.MessageBase) {
                    return mergeFrom((com.netty.common.protobuf.Message.MessageBase) other);
                } else {
                    super.mergeFrom(other);
                    return this;
                }
            }

            public Builder mergeFrom(com.netty.common.protobuf.Message.MessageBase other) {
                if (other == com.netty.common.protobuf.Message.MessageBase.getDefaultInstance()) return this;
                if (other.hasClientId()) {
                    bitField0_ |= 0x00000001;
                    clientId_ = other.clientId_;
                    onChanged();
                }
                if (other.hasCmd()) {
                    setCmd(other.getCmd());
                }
                if (other.hasData()) {
                    bitField0_ |= 0x00000004;
                    data_ = other.data_;
                    onChanged();
                }
                this.mergeUnknownFields(other.unknownFields);
                onChanged();
                return this;
            }

            public final boolean isInitialized() {
                if (!hasClientId()) {
                    return false;
                }
                if (!hasCmd()) {
                    return false;
                }
                return true;
            }

            public Builder mergeFrom(
                    com.google.protobuf.CodedInputStream input,
                    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                    throws java.io.IOException {
                com.netty.common.protobuf.Message.MessageBase parsedMessage = null;
                try {
                    parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
                } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                    parsedMessage = (com.netty.common.protobuf.Message.MessageBase) e.getUnfinishedMessage();
                    throw e.unwrapIOException();
                } finally {
                    if (parsedMessage != null) {
                        mergeFrom(parsedMessage);
                    }
                }
                return this;
            }

            private int bitField0_;

            private java.lang.Object clientId_ = "";

            /**
             * <code>required string clientId = 1;</code>
             */
            public boolean hasClientId() {
                return ((bitField0_ & 0x00000001) == 0x00000001);
            }

            /**
             * <code>required string clientId = 1;</code>
             */
            public java.lang.String getClientId() {
                java.lang.Object ref = clientId_;
                if (!(ref instanceof java.lang.String)) {
                    com.google.protobuf.ByteString bs =
                            (com.google.protobuf.ByteString) ref;
                    java.lang.String s = bs.toStringUtf8();
                    if (bs.isValidUtf8()) {
                        clientId_ = s;
                    }
                    return s;
                } else {
                    return (java.lang.String) ref;
                }
            }

            /**
             * <code>required string clientId = 1;</code>
             */
            public com.google.protobuf.ByteString
            getClientIdBytes() {
                java.lang.Object ref = clientId_;
                if (ref instanceof String) {
                    com.google.protobuf.ByteString b =
                            com.google.protobuf.ByteString.copyFromUtf8(
                                    (java.lang.String) ref);
                    clientId_ = b;
                    return b;
                } else {
                    return (com.google.protobuf.ByteString) ref;
                }
            }

            /**
             * <code>required string clientId = 1;</code>
             */
            public Builder setClientId(
                    java.lang.String value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                bitField0_ |= 0x00000001;
                clientId_ = value;
                onChanged();
                return this;
            }

            /**
             * <code>required string clientId = 1;</code>
             */
            public Builder clearClientId() {
                bitField0_ = (bitField0_ & ~0x00000001);
                clientId_ = getDefaultInstance().getClientId();
                onChanged();
                return this;
            }

            /**
             * <code>required string clientId = 1;</code>
             */
            public Builder setClientIdBytes(
                    com.google.protobuf.ByteString value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                bitField0_ |= 0x00000001;
                clientId_ = value;
                onChanged();
                return this;
            }

            private int cmd_ = 1;

            /**
             * <code>required .CommandType cmd = 2;</code>
             */
            public boolean hasCmd() {
                return ((bitField0_ & 0x00000002) == 0x00000002);
            }

            /**
             * <code>required .CommandType cmd = 2;</code>
             */
            public com.netty.common.protobuf.Command.CommandType getCmd() {
                com.netty.common.protobuf.Command.CommandType result = com.netty.common.protobuf.Command.CommandType.valueOf(cmd_);
                return result == null ? com.netty.common.protobuf.Command.CommandType.AUTH : result;
            }

            /**
             * <code>required .CommandType cmd = 2;</code>
             */
            public Builder setCmd(com.netty.common.protobuf.Command.CommandType value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                bitField0_ |= 0x00000002;
                cmd_ = value.getNumber();
                onChanged();
                return this;
            }

            /**
             * <code>required .CommandType cmd = 2;</code>
             */
            public Builder clearCmd() {
                bitField0_ = (bitField0_ & ~0x00000002);
                cmd_ = 1;
                onChanged();
                return this;
            }

            private java.lang.Object data_ = "";

            /**
             * <code>optional string data = 3;</code>
             */
            public boolean hasData() {
                return ((bitField0_ & 0x00000004) == 0x00000004);
            }

            /**
             * <code>optional string data = 3;</code>
             */
            public java.lang.String getData() {
                java.lang.Object ref = data_;
                if (!(ref instanceof java.lang.String)) {
                    com.google.protobuf.ByteString bs =
                            (com.google.protobuf.ByteString) ref;
                    java.lang.String s = bs.toStringUtf8();
                    if (bs.isValidUtf8()) {
                        data_ = s;
                    }
                    return s;
                } else {
                    return (java.lang.String) ref;
                }
            }

            /**
             * <code>optional string data = 3;</code>
             */
            public com.google.protobuf.ByteString
            getDataBytes() {
                java.lang.Object ref = data_;
                if (ref instanceof String) {
                    com.google.protobuf.ByteString b =
                            com.google.protobuf.ByteString.copyFromUtf8(
                                    (java.lang.String) ref);
                    data_ = b;
                    return b;
                } else {
                    return (com.google.protobuf.ByteString) ref;
                }
            }

            /**
             * <code>optional string data = 3;</code>
             */
            public Builder setData(
                    java.lang.String value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                bitField0_ |= 0x00000004;
                data_ = value;
                onChanged();
                return this;
            }

            /**
             * <code>optional string data = 3;</code>
             */
            public Builder clearData() {
                bitField0_ = (bitField0_ & ~0x00000004);
                data_ = getDefaultInstance().getData();
                onChanged();
                return this;
            }

            /**
             * <code>optional string data = 3;</code>
             */
            public Builder setDataBytes(
                    com.google.protobuf.ByteString value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                bitField0_ |= 0x00000004;
                data_ = value;
                onChanged();
                return this;
            }

            public final Builder setUnknownFields(
                    final com.google.protobuf.UnknownFieldSet unknownFields) {
                return super.setUnknownFields(unknownFields);
            }

            public final Builder mergeUnknownFields(
                    final com.google.protobuf.UnknownFieldSet unknownFields) {
                return super.mergeUnknownFields(unknownFields);
            }


            // @@protoc_insertion_point(builder_scope:MessageBase)
        }

        // @@protoc_insertion_point(class_scope:MessageBase)
        private static final com.netty.common.protobuf.Message.MessageBase DEFAULT_INSTANCE;

        static {
            DEFAULT_INSTANCE = new com.netty.common.protobuf.Message.MessageBase();
        }

        public static com.netty.common.protobuf.Message.MessageBase getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        @java.lang.Deprecated
        public static final com.google.protobuf.Parser<MessageBase>
                PARSER = new com.google.protobuf.AbstractParser<MessageBase>() {
            public MessageBase parsePartialFrom(
                    com.google.protobuf.CodedInputStream input,
                    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                    throws com.google.protobuf.InvalidProtocolBufferException {
                return new MessageBase(input, extensionRegistry);
            }
        };

        public static com.google.protobuf.Parser<MessageBase> parser() {
            return PARSER;
        }

        @java.lang.Override
        public com.google.protobuf.Parser<MessageBase> getParserForType() {
            return PARSER;
        }

        public com.netty.common.protobuf.Message.MessageBase getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

    }

    private static final com.google.protobuf.Descriptors.Descriptor
            internal_static_MessageBase_descriptor;
    private static final
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
            internal_static_MessageBase_fieldAccessorTable;

    public static com.google.protobuf.Descriptors.FileDescriptor
    getDescriptor() {
        return descriptor;
    }

    private static com.google.protobuf.Descriptors.FileDescriptor
            descriptor;

    static {
        java.lang.String[] descriptorData = {
                "\n\rMessage.proto\032\rCommand.proto\"H\n\013Messag" +
                        "eBase\022\020\n\010clientId\030\001 \002(\t\022\031\n\003cmd\030\002 \002(\0162\014.C" +
                        "ommandType\022\014\n\004data\030\003 \001(\tB$\n\031com.netty.co" +
                        "mmon.protobufB\007Message"
        };
        com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
                new com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner() {
                    public com.google.protobuf.ExtensionRegistry assignDescriptors(
                            com.google.protobuf.Descriptors.FileDescriptor root) {
                        descriptor = root;
                        return null;
                    }
                };
        com.google.protobuf.Descriptors.FileDescriptor
                .internalBuildGeneratedFileFrom(descriptorData,
                        new com.google.protobuf.Descriptors.FileDescriptor[]{
                                com.netty.common.protobuf.Command.getDescriptor(),
                        }, assigner);
        internal_static_MessageBase_descriptor =
                getDescriptor().getMessageTypes().get(0);
        internal_static_MessageBase_fieldAccessorTable = new
                com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
                internal_static_MessageBase_descriptor,
                new java.lang.String[]{"ClientId", "Cmd", "Data",});
        com.netty.common.protobuf.Command.getDescriptor();
    }

    // @@protoc_insertion_point(outer_class_scope)
}
