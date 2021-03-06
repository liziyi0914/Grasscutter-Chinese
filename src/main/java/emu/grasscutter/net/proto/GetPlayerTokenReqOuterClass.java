// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: GetPlayerTokenReq.proto

package emu.grasscutter.net.proto;

public final class GetPlayerTokenReqOuterClass {
  private GetPlayerTokenReqOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface GetPlayerTokenReqOrBuilder extends
      // @@protoc_insertion_point(interface_extends:GetPlayerTokenReq)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 accountType = 1;</code>
     * @return The accountType.
     */
    int getAccountType();

    /**
     * <code>string accountUid = 2;</code>
     * @return The accountUid.
     */
    java.lang.String getAccountUid();
    /**
     * <code>string accountUid = 2;</code>
     * @return The bytes for accountUid.
     */
    com.google.protobuf.ByteString
        getAccountUidBytes();

    /**
     * <code>string accountToken = 3;</code>
     * @return The accountToken.
     */
    java.lang.String getAccountToken();
    /**
     * <code>string accountToken = 3;</code>
     * @return The bytes for accountToken.
     */
    com.google.protobuf.ByteString
        getAccountTokenBytes();

    /**
     * <code>uint64 platformType = 7;</code>
     * @return The platformType.
     */
    long getPlatformType();

    /**
     * <code>uint64 schannelId = 11;</code>
     * @return The schannelId.
     */
    long getSchannelId();
  }
  /**
   * Protobuf type {@code GetPlayerTokenReq}
   */
  public static final class GetPlayerTokenReq extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:GetPlayerTokenReq)
      GetPlayerTokenReqOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use GetPlayerTokenReq.newBuilder() to construct.
    private GetPlayerTokenReq(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private GetPlayerTokenReq() {
      accountUid_ = "";
      accountToken_ = "";
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new GetPlayerTokenReq();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private GetPlayerTokenReq(
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

              accountType_ = input.readUInt32();
              break;
            }
            case 18: {
              java.lang.String s = input.readStringRequireUtf8();

              accountUid_ = s;
              break;
            }
            case 26: {
              java.lang.String s = input.readStringRequireUtf8();

              accountToken_ = s;
              break;
            }
            case 56: {

              platformType_ = input.readUInt64();
              break;
            }
            case 88: {

              schannelId_ = input.readUInt64();
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
      return emu.grasscutter.net.proto.GetPlayerTokenReqOuterClass.internal_static_GetPlayerTokenReq_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.GetPlayerTokenReqOuterClass.internal_static_GetPlayerTokenReq_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.GetPlayerTokenReqOuterClass.GetPlayerTokenReq.class, emu.grasscutter.net.proto.GetPlayerTokenReqOuterClass.GetPlayerTokenReq.Builder.class);
    }

    public static final int ACCOUNTTYPE_FIELD_NUMBER = 1;
    private int accountType_;
    /**
     * <code>uint32 accountType = 1;</code>
     * @return The accountType.
     */
    @java.lang.Override
    public int getAccountType() {
      return accountType_;
    }

    public static final int ACCOUNTUID_FIELD_NUMBER = 2;
    private volatile java.lang.Object accountUid_;
    /**
     * <code>string accountUid = 2;</code>
     * @return The accountUid.
     */
    @java.lang.Override
    public java.lang.String getAccountUid() {
      java.lang.Object ref = accountUid_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        accountUid_ = s;
        return s;
      }
    }
    /**
     * <code>string accountUid = 2;</code>
     * @return The bytes for accountUid.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getAccountUidBytes() {
      java.lang.Object ref = accountUid_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        accountUid_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int ACCOUNTTOKEN_FIELD_NUMBER = 3;
    private volatile java.lang.Object accountToken_;
    /**
     * <code>string accountToken = 3;</code>
     * @return The accountToken.
     */
    @java.lang.Override
    public java.lang.String getAccountToken() {
      java.lang.Object ref = accountToken_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        accountToken_ = s;
        return s;
      }
    }
    /**
     * <code>string accountToken = 3;</code>
     * @return The bytes for accountToken.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getAccountTokenBytes() {
      java.lang.Object ref = accountToken_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        accountToken_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int PLATFORMTYPE_FIELD_NUMBER = 7;
    private long platformType_;
    /**
     * <code>uint64 platformType = 7;</code>
     * @return The platformType.
     */
    @java.lang.Override
    public long getPlatformType() {
      return platformType_;
    }

    public static final int SCHANNELID_FIELD_NUMBER = 11;
    private long schannelId_;
    /**
     * <code>uint64 schannelId = 11;</code>
     * @return The schannelId.
     */
    @java.lang.Override
    public long getSchannelId() {
      return schannelId_;
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
      if (accountType_ != 0) {
        output.writeUInt32(1, accountType_);
      }
      if (!getAccountUidBytes().isEmpty()) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 2, accountUid_);
      }
      if (!getAccountTokenBytes().isEmpty()) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 3, accountToken_);
      }
      if (platformType_ != 0L) {
        output.writeUInt64(7, platformType_);
      }
      if (schannelId_ != 0L) {
        output.writeUInt64(11, schannelId_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (accountType_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(1, accountType_);
      }
      if (!getAccountUidBytes().isEmpty()) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, accountUid_);
      }
      if (!getAccountTokenBytes().isEmpty()) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, accountToken_);
      }
      if (platformType_ != 0L) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt64Size(7, platformType_);
      }
      if (schannelId_ != 0L) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt64Size(11, schannelId_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.GetPlayerTokenReqOuterClass.GetPlayerTokenReq)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.GetPlayerTokenReqOuterClass.GetPlayerTokenReq other = (emu.grasscutter.net.proto.GetPlayerTokenReqOuterClass.GetPlayerTokenReq) obj;

      if (getAccountType()
          != other.getAccountType()) return false;
      if (!getAccountUid()
          .equals(other.getAccountUid())) return false;
      if (!getAccountToken()
          .equals(other.getAccountToken())) return false;
      if (getPlatformType()
          != other.getPlatformType()) return false;
      if (getSchannelId()
          != other.getSchannelId()) return false;
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
      hash = (37 * hash) + ACCOUNTTYPE_FIELD_NUMBER;
      hash = (53 * hash) + getAccountType();
      hash = (37 * hash) + ACCOUNTUID_FIELD_NUMBER;
      hash = (53 * hash) + getAccountUid().hashCode();
      hash = (37 * hash) + ACCOUNTTOKEN_FIELD_NUMBER;
      hash = (53 * hash) + getAccountToken().hashCode();
      hash = (37 * hash) + PLATFORMTYPE_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
          getPlatformType());
      hash = (37 * hash) + SCHANNELID_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
          getSchannelId());
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.GetPlayerTokenReqOuterClass.GetPlayerTokenReq parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.GetPlayerTokenReqOuterClass.GetPlayerTokenReq parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GetPlayerTokenReqOuterClass.GetPlayerTokenReq parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.GetPlayerTokenReqOuterClass.GetPlayerTokenReq parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GetPlayerTokenReqOuterClass.GetPlayerTokenReq parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.GetPlayerTokenReqOuterClass.GetPlayerTokenReq parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GetPlayerTokenReqOuterClass.GetPlayerTokenReq parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.GetPlayerTokenReqOuterClass.GetPlayerTokenReq parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GetPlayerTokenReqOuterClass.GetPlayerTokenReq parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.GetPlayerTokenReqOuterClass.GetPlayerTokenReq parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GetPlayerTokenReqOuterClass.GetPlayerTokenReq parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.GetPlayerTokenReqOuterClass.GetPlayerTokenReq parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.GetPlayerTokenReqOuterClass.GetPlayerTokenReq prototype) {
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
     * Protobuf type {@code GetPlayerTokenReq}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:GetPlayerTokenReq)
        emu.grasscutter.net.proto.GetPlayerTokenReqOuterClass.GetPlayerTokenReqOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.GetPlayerTokenReqOuterClass.internal_static_GetPlayerTokenReq_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.GetPlayerTokenReqOuterClass.internal_static_GetPlayerTokenReq_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.GetPlayerTokenReqOuterClass.GetPlayerTokenReq.class, emu.grasscutter.net.proto.GetPlayerTokenReqOuterClass.GetPlayerTokenReq.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.GetPlayerTokenReqOuterClass.GetPlayerTokenReq.newBuilder()
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
        accountType_ = 0;

        accountUid_ = "";

        accountToken_ = "";

        platformType_ = 0L;

        schannelId_ = 0L;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.GetPlayerTokenReqOuterClass.internal_static_GetPlayerTokenReq_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.GetPlayerTokenReqOuterClass.GetPlayerTokenReq getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.GetPlayerTokenReqOuterClass.GetPlayerTokenReq.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.GetPlayerTokenReqOuterClass.GetPlayerTokenReq build() {
        emu.grasscutter.net.proto.GetPlayerTokenReqOuterClass.GetPlayerTokenReq result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.GetPlayerTokenReqOuterClass.GetPlayerTokenReq buildPartial() {
        emu.grasscutter.net.proto.GetPlayerTokenReqOuterClass.GetPlayerTokenReq result = new emu.grasscutter.net.proto.GetPlayerTokenReqOuterClass.GetPlayerTokenReq(this);
        result.accountType_ = accountType_;
        result.accountUid_ = accountUid_;
        result.accountToken_ = accountToken_;
        result.platformType_ = platformType_;
        result.schannelId_ = schannelId_;
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
        if (other instanceof emu.grasscutter.net.proto.GetPlayerTokenReqOuterClass.GetPlayerTokenReq) {
          return mergeFrom((emu.grasscutter.net.proto.GetPlayerTokenReqOuterClass.GetPlayerTokenReq)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.GetPlayerTokenReqOuterClass.GetPlayerTokenReq other) {
        if (other == emu.grasscutter.net.proto.GetPlayerTokenReqOuterClass.GetPlayerTokenReq.getDefaultInstance()) return this;
        if (other.getAccountType() != 0) {
          setAccountType(other.getAccountType());
        }
        if (!other.getAccountUid().isEmpty()) {
          accountUid_ = other.accountUid_;
          onChanged();
        }
        if (!other.getAccountToken().isEmpty()) {
          accountToken_ = other.accountToken_;
          onChanged();
        }
        if (other.getPlatformType() != 0L) {
          setPlatformType(other.getPlatformType());
        }
        if (other.getSchannelId() != 0L) {
          setSchannelId(other.getSchannelId());
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
        emu.grasscutter.net.proto.GetPlayerTokenReqOuterClass.GetPlayerTokenReq parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.GetPlayerTokenReqOuterClass.GetPlayerTokenReq) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int accountType_ ;
      /**
       * <code>uint32 accountType = 1;</code>
       * @return The accountType.
       */
      @java.lang.Override
      public int getAccountType() {
        return accountType_;
      }
      /**
       * <code>uint32 accountType = 1;</code>
       * @param value The accountType to set.
       * @return This builder for chaining.
       */
      public Builder setAccountType(int value) {
        
        accountType_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 accountType = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearAccountType() {
        
        accountType_ = 0;
        onChanged();
        return this;
      }

      private java.lang.Object accountUid_ = "";
      /**
       * <code>string accountUid = 2;</code>
       * @return The accountUid.
       */
      public java.lang.String getAccountUid() {
        java.lang.Object ref = accountUid_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          accountUid_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>string accountUid = 2;</code>
       * @return The bytes for accountUid.
       */
      public com.google.protobuf.ByteString
          getAccountUidBytes() {
        java.lang.Object ref = accountUid_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          accountUid_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>string accountUid = 2;</code>
       * @param value The accountUid to set.
       * @return This builder for chaining.
       */
      public Builder setAccountUid(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        accountUid_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>string accountUid = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearAccountUid() {
        
        accountUid_ = getDefaultInstance().getAccountUid();
        onChanged();
        return this;
      }
      /**
       * <code>string accountUid = 2;</code>
       * @param value The bytes for accountUid to set.
       * @return This builder for chaining.
       */
      public Builder setAccountUidBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        accountUid_ = value;
        onChanged();
        return this;
      }

      private java.lang.Object accountToken_ = "";
      /**
       * <code>string accountToken = 3;</code>
       * @return The accountToken.
       */
      public java.lang.String getAccountToken() {
        java.lang.Object ref = accountToken_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          accountToken_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>string accountToken = 3;</code>
       * @return The bytes for accountToken.
       */
      public com.google.protobuf.ByteString
          getAccountTokenBytes() {
        java.lang.Object ref = accountToken_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          accountToken_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>string accountToken = 3;</code>
       * @param value The accountToken to set.
       * @return This builder for chaining.
       */
      public Builder setAccountToken(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        accountToken_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>string accountToken = 3;</code>
       * @return This builder for chaining.
       */
      public Builder clearAccountToken() {
        
        accountToken_ = getDefaultInstance().getAccountToken();
        onChanged();
        return this;
      }
      /**
       * <code>string accountToken = 3;</code>
       * @param value The bytes for accountToken to set.
       * @return This builder for chaining.
       */
      public Builder setAccountTokenBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        accountToken_ = value;
        onChanged();
        return this;
      }

      private long platformType_ ;
      /**
       * <code>uint64 platformType = 7;</code>
       * @return The platformType.
       */
      @java.lang.Override
      public long getPlatformType() {
        return platformType_;
      }
      /**
       * <code>uint64 platformType = 7;</code>
       * @param value The platformType to set.
       * @return This builder for chaining.
       */
      public Builder setPlatformType(long value) {
        
        platformType_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint64 platformType = 7;</code>
       * @return This builder for chaining.
       */
      public Builder clearPlatformType() {
        
        platformType_ = 0L;
        onChanged();
        return this;
      }

      private long schannelId_ ;
      /**
       * <code>uint64 schannelId = 11;</code>
       * @return The schannelId.
       */
      @java.lang.Override
      public long getSchannelId() {
        return schannelId_;
      }
      /**
       * <code>uint64 schannelId = 11;</code>
       * @param value The schannelId to set.
       * @return This builder for chaining.
       */
      public Builder setSchannelId(long value) {
        
        schannelId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint64 schannelId = 11;</code>
       * @return This builder for chaining.
       */
      public Builder clearSchannelId() {
        
        schannelId_ = 0L;
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


      // @@protoc_insertion_point(builder_scope:GetPlayerTokenReq)
    }

    // @@protoc_insertion_point(class_scope:GetPlayerTokenReq)
    private static final emu.grasscutter.net.proto.GetPlayerTokenReqOuterClass.GetPlayerTokenReq DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.GetPlayerTokenReqOuterClass.GetPlayerTokenReq();
    }

    public static emu.grasscutter.net.proto.GetPlayerTokenReqOuterClass.GetPlayerTokenReq getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<GetPlayerTokenReq>
        PARSER = new com.google.protobuf.AbstractParser<GetPlayerTokenReq>() {
      @java.lang.Override
      public GetPlayerTokenReq parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new GetPlayerTokenReq(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<GetPlayerTokenReq> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<GetPlayerTokenReq> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.GetPlayerTokenReqOuterClass.GetPlayerTokenReq getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_GetPlayerTokenReq_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_GetPlayerTokenReq_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\027GetPlayerTokenReq.proto\"|\n\021GetPlayerTo" +
      "kenReq\022\023\n\013accountType\030\001 \001(\r\022\022\n\naccountUi" +
      "d\030\002 \001(\t\022\024\n\014accountToken\030\003 \001(\t\022\024\n\014platfor" +
      "mType\030\007 \001(\004\022\022\n\nschannelId\030\013 \001(\004B\033\n\031emu.g" +
      "rasscutter.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_GetPlayerTokenReq_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_GetPlayerTokenReq_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_GetPlayerTokenReq_descriptor,
        new java.lang.String[] { "AccountType", "AccountUid", "AccountToken", "PlatformType", "SchannelId", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
