// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: StoreItemDelNotify.proto

package emu.grasscutter.net.proto;

public final class StoreItemDelNotifyOuterClass {
  private StoreItemDelNotifyOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface StoreItemDelNotifyOrBuilder extends
      // @@protoc_insertion_point(interface_extends:StoreItemDelNotify)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>.StoreType storeType = 1;</code>
     * @return The enum numeric value on the wire for storeType.
     */
    int getStoreTypeValue();
    /**
     * <code>.StoreType storeType = 1;</code>
     * @return The storeType.
     */
    emu.grasscutter.net.proto.StoreTypeOuterClass.StoreType getStoreType();

    /**
     * <code>repeated uint64 guidList = 2;</code>
     * @return A list containing the guidList.
     */
    java.util.List<java.lang.Long> getGuidListList();
    /**
     * <code>repeated uint64 guidList = 2;</code>
     * @return The count of guidList.
     */
    int getGuidListCount();
    /**
     * <code>repeated uint64 guidList = 2;</code>
     * @param index The index of the element to return.
     * @return The guidList at the given index.
     */
    long getGuidList(int index);
  }
  /**
   * Protobuf type {@code StoreItemDelNotify}
   */
  public static final class StoreItemDelNotify extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:StoreItemDelNotify)
      StoreItemDelNotifyOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use StoreItemDelNotify.newBuilder() to construct.
    private StoreItemDelNotify(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private StoreItemDelNotify() {
      storeType_ = 0;
      guidList_ = emptyLongList();
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new StoreItemDelNotify();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private StoreItemDelNotify(
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
              int rawValue = input.readEnum();

              storeType_ = rawValue;
              break;
            }
            case 16: {
              if (!((mutable_bitField0_ & 0x00000001) != 0)) {
                guidList_ = newLongList();
                mutable_bitField0_ |= 0x00000001;
              }
              guidList_.addLong(input.readUInt64());
              break;
            }
            case 18: {
              int length = input.readRawVarint32();
              int limit = input.pushLimit(length);
              if (!((mutable_bitField0_ & 0x00000001) != 0) && input.getBytesUntilLimit() > 0) {
                guidList_ = newLongList();
                mutable_bitField0_ |= 0x00000001;
              }
              while (input.getBytesUntilLimit() > 0) {
                guidList_.addLong(input.readUInt64());
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
          guidList_.makeImmutable(); // C
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.proto.StoreItemDelNotifyOuterClass.internal_static_StoreItemDelNotify_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.StoreItemDelNotifyOuterClass.internal_static_StoreItemDelNotify_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.StoreItemDelNotifyOuterClass.StoreItemDelNotify.class, emu.grasscutter.net.proto.StoreItemDelNotifyOuterClass.StoreItemDelNotify.Builder.class);
    }

    public static final int STORETYPE_FIELD_NUMBER = 1;
    private int storeType_;
    /**
     * <code>.StoreType storeType = 1;</code>
     * @return The enum numeric value on the wire for storeType.
     */
    @java.lang.Override public int getStoreTypeValue() {
      return storeType_;
    }
    /**
     * <code>.StoreType storeType = 1;</code>
     * @return The storeType.
     */
    @java.lang.Override public emu.grasscutter.net.proto.StoreTypeOuterClass.StoreType getStoreType() {
      @SuppressWarnings("deprecation")
      emu.grasscutter.net.proto.StoreTypeOuterClass.StoreType result = emu.grasscutter.net.proto.StoreTypeOuterClass.StoreType.valueOf(storeType_);
      return result == null ? emu.grasscutter.net.proto.StoreTypeOuterClass.StoreType.UNRECOGNIZED : result;
    }

    public static final int GUIDLIST_FIELD_NUMBER = 2;
    private com.google.protobuf.Internal.LongList guidList_;
    /**
     * <code>repeated uint64 guidList = 2;</code>
     * @return A list containing the guidList.
     */
    @java.lang.Override
    public java.util.List<java.lang.Long>
        getGuidListList() {
      return guidList_;
    }
    /**
     * <code>repeated uint64 guidList = 2;</code>
     * @return The count of guidList.
     */
    public int getGuidListCount() {
      return guidList_.size();
    }
    /**
     * <code>repeated uint64 guidList = 2;</code>
     * @param index The index of the element to return.
     * @return The guidList at the given index.
     */
    public long getGuidList(int index) {
      return guidList_.getLong(index);
    }
    private int guidListMemoizedSerializedSize = -1;

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
      if (storeType_ != emu.grasscutter.net.proto.StoreTypeOuterClass.StoreType.StoreNone.getNumber()) {
        output.writeEnum(1, storeType_);
      }
      if (getGuidListList().size() > 0) {
        output.writeUInt32NoTag(18);
        output.writeUInt32NoTag(guidListMemoizedSerializedSize);
      }
      for (int i = 0; i < guidList_.size(); i++) {
        output.writeUInt64NoTag(guidList_.getLong(i));
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (storeType_ != emu.grasscutter.net.proto.StoreTypeOuterClass.StoreType.StoreNone.getNumber()) {
        size += com.google.protobuf.CodedOutputStream
          .computeEnumSize(1, storeType_);
      }
      {
        int dataSize = 0;
        for (int i = 0; i < guidList_.size(); i++) {
          dataSize += com.google.protobuf.CodedOutputStream
            .computeUInt64SizeNoTag(guidList_.getLong(i));
        }
        size += dataSize;
        if (!getGuidListList().isEmpty()) {
          size += 1;
          size += com.google.protobuf.CodedOutputStream
              .computeInt32SizeNoTag(dataSize);
        }
        guidListMemoizedSerializedSize = dataSize;
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
      if (!(obj instanceof emu.grasscutter.net.proto.StoreItemDelNotifyOuterClass.StoreItemDelNotify)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.StoreItemDelNotifyOuterClass.StoreItemDelNotify other = (emu.grasscutter.net.proto.StoreItemDelNotifyOuterClass.StoreItemDelNotify) obj;

      if (storeType_ != other.storeType_) return false;
      if (!getGuidListList()
          .equals(other.getGuidListList())) return false;
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
      hash = (37 * hash) + STORETYPE_FIELD_NUMBER;
      hash = (53 * hash) + storeType_;
      if (getGuidListCount() > 0) {
        hash = (37 * hash) + GUIDLIST_FIELD_NUMBER;
        hash = (53 * hash) + getGuidListList().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.StoreItemDelNotifyOuterClass.StoreItemDelNotify parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.StoreItemDelNotifyOuterClass.StoreItemDelNotify parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.StoreItemDelNotifyOuterClass.StoreItemDelNotify parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.StoreItemDelNotifyOuterClass.StoreItemDelNotify parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.StoreItemDelNotifyOuterClass.StoreItemDelNotify parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.StoreItemDelNotifyOuterClass.StoreItemDelNotify parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.StoreItemDelNotifyOuterClass.StoreItemDelNotify parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.StoreItemDelNotifyOuterClass.StoreItemDelNotify parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.StoreItemDelNotifyOuterClass.StoreItemDelNotify parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.StoreItemDelNotifyOuterClass.StoreItemDelNotify parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.StoreItemDelNotifyOuterClass.StoreItemDelNotify parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.StoreItemDelNotifyOuterClass.StoreItemDelNotify parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.StoreItemDelNotifyOuterClass.StoreItemDelNotify prototype) {
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
     * Protobuf type {@code StoreItemDelNotify}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:StoreItemDelNotify)
        emu.grasscutter.net.proto.StoreItemDelNotifyOuterClass.StoreItemDelNotifyOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.StoreItemDelNotifyOuterClass.internal_static_StoreItemDelNotify_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.StoreItemDelNotifyOuterClass.internal_static_StoreItemDelNotify_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.StoreItemDelNotifyOuterClass.StoreItemDelNotify.class, emu.grasscutter.net.proto.StoreItemDelNotifyOuterClass.StoreItemDelNotify.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.StoreItemDelNotifyOuterClass.StoreItemDelNotify.newBuilder()
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
        storeType_ = 0;

        guidList_ = emptyLongList();
        bitField0_ = (bitField0_ & ~0x00000001);
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.StoreItemDelNotifyOuterClass.internal_static_StoreItemDelNotify_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.StoreItemDelNotifyOuterClass.StoreItemDelNotify getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.StoreItemDelNotifyOuterClass.StoreItemDelNotify.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.StoreItemDelNotifyOuterClass.StoreItemDelNotify build() {
        emu.grasscutter.net.proto.StoreItemDelNotifyOuterClass.StoreItemDelNotify result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.StoreItemDelNotifyOuterClass.StoreItemDelNotify buildPartial() {
        emu.grasscutter.net.proto.StoreItemDelNotifyOuterClass.StoreItemDelNotify result = new emu.grasscutter.net.proto.StoreItemDelNotifyOuterClass.StoreItemDelNotify(this);
        int from_bitField0_ = bitField0_;
        result.storeType_ = storeType_;
        if (((bitField0_ & 0x00000001) != 0)) {
          guidList_.makeImmutable();
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.guidList_ = guidList_;
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
        if (other instanceof emu.grasscutter.net.proto.StoreItemDelNotifyOuterClass.StoreItemDelNotify) {
          return mergeFrom((emu.grasscutter.net.proto.StoreItemDelNotifyOuterClass.StoreItemDelNotify)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.StoreItemDelNotifyOuterClass.StoreItemDelNotify other) {
        if (other == emu.grasscutter.net.proto.StoreItemDelNotifyOuterClass.StoreItemDelNotify.getDefaultInstance()) return this;
        if (other.storeType_ != 0) {
          setStoreTypeValue(other.getStoreTypeValue());
        }
        if (!other.guidList_.isEmpty()) {
          if (guidList_.isEmpty()) {
            guidList_ = other.guidList_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureGuidListIsMutable();
            guidList_.addAll(other.guidList_);
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
        emu.grasscutter.net.proto.StoreItemDelNotifyOuterClass.StoreItemDelNotify parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.StoreItemDelNotifyOuterClass.StoreItemDelNotify) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private int storeType_ = 0;
      /**
       * <code>.StoreType storeType = 1;</code>
       * @return The enum numeric value on the wire for storeType.
       */
      @java.lang.Override public int getStoreTypeValue() {
        return storeType_;
      }
      /**
       * <code>.StoreType storeType = 1;</code>
       * @param value The enum numeric value on the wire for storeType to set.
       * @return This builder for chaining.
       */
      public Builder setStoreTypeValue(int value) {
        
        storeType_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>.StoreType storeType = 1;</code>
       * @return The storeType.
       */
      @java.lang.Override
      public emu.grasscutter.net.proto.StoreTypeOuterClass.StoreType getStoreType() {
        @SuppressWarnings("deprecation")
        emu.grasscutter.net.proto.StoreTypeOuterClass.StoreType result = emu.grasscutter.net.proto.StoreTypeOuterClass.StoreType.valueOf(storeType_);
        return result == null ? emu.grasscutter.net.proto.StoreTypeOuterClass.StoreType.UNRECOGNIZED : result;
      }
      /**
       * <code>.StoreType storeType = 1;</code>
       * @param value The storeType to set.
       * @return This builder for chaining.
       */
      public Builder setStoreType(emu.grasscutter.net.proto.StoreTypeOuterClass.StoreType value) {
        if (value == null) {
          throw new NullPointerException();
        }
        
        storeType_ = value.getNumber();
        onChanged();
        return this;
      }
      /**
       * <code>.StoreType storeType = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearStoreType() {
        
        storeType_ = 0;
        onChanged();
        return this;
      }

      private com.google.protobuf.Internal.LongList guidList_ = emptyLongList();
      private void ensureGuidListIsMutable() {
        if (!((bitField0_ & 0x00000001) != 0)) {
          guidList_ = mutableCopy(guidList_);
          bitField0_ |= 0x00000001;
         }
      }
      /**
       * <code>repeated uint64 guidList = 2;</code>
       * @return A list containing the guidList.
       */
      public java.util.List<java.lang.Long>
          getGuidListList() {
        return ((bitField0_ & 0x00000001) != 0) ?
                 java.util.Collections.unmodifiableList(guidList_) : guidList_;
      }
      /**
       * <code>repeated uint64 guidList = 2;</code>
       * @return The count of guidList.
       */
      public int getGuidListCount() {
        return guidList_.size();
      }
      /**
       * <code>repeated uint64 guidList = 2;</code>
       * @param index The index of the element to return.
       * @return The guidList at the given index.
       */
      public long getGuidList(int index) {
        return guidList_.getLong(index);
      }
      /**
       * <code>repeated uint64 guidList = 2;</code>
       * @param index The index to set the value at.
       * @param value The guidList to set.
       * @return This builder for chaining.
       */
      public Builder setGuidList(
          int index, long value) {
        ensureGuidListIsMutable();
        guidList_.setLong(index, value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint64 guidList = 2;</code>
       * @param value The guidList to add.
       * @return This builder for chaining.
       */
      public Builder addGuidList(long value) {
        ensureGuidListIsMutable();
        guidList_.addLong(value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint64 guidList = 2;</code>
       * @param values The guidList to add.
       * @return This builder for chaining.
       */
      public Builder addAllGuidList(
          java.lang.Iterable<? extends java.lang.Long> values) {
        ensureGuidListIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, guidList_);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint64 guidList = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearGuidList() {
        guidList_ = emptyLongList();
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


      // @@protoc_insertion_point(builder_scope:StoreItemDelNotify)
    }

    // @@protoc_insertion_point(class_scope:StoreItemDelNotify)
    private static final emu.grasscutter.net.proto.StoreItemDelNotifyOuterClass.StoreItemDelNotify DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.StoreItemDelNotifyOuterClass.StoreItemDelNotify();
    }

    public static emu.grasscutter.net.proto.StoreItemDelNotifyOuterClass.StoreItemDelNotify getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<StoreItemDelNotify>
        PARSER = new com.google.protobuf.AbstractParser<StoreItemDelNotify>() {
      @java.lang.Override
      public StoreItemDelNotify parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new StoreItemDelNotify(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<StoreItemDelNotify> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<StoreItemDelNotify> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.StoreItemDelNotifyOuterClass.StoreItemDelNotify getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_StoreItemDelNotify_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_StoreItemDelNotify_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\030StoreItemDelNotify.proto\032\017StoreType.pr" +
      "oto\"E\n\022StoreItemDelNotify\022\035\n\tstoreType\030\001" +
      " \001(\0162\n.StoreType\022\020\n\010guidList\030\002 \003(\004B\033\n\031em" +
      "u.grasscutter.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.grasscutter.net.proto.StoreTypeOuterClass.getDescriptor(),
        });
    internal_static_StoreItemDelNotify_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_StoreItemDelNotify_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_StoreItemDelNotify_descriptor,
        new java.lang.String[] { "StoreType", "GuidList", });
    emu.grasscutter.net.proto.StoreTypeOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
