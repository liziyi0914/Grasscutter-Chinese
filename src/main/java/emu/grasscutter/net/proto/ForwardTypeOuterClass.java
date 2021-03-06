// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ForwardType.proto

package emu.grasscutter.net.proto;

public final class ForwardTypeOuterClass {
  private ForwardTypeOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  /**
   * Protobuf enum {@code ForwardType}
   */
  public enum ForwardType
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <code>ForwardLocal = 0;</code>
     */
    ForwardLocal(0),
    /**
     * <code>ForwardToAll = 1;</code>
     */
    ForwardToAll(1),
    /**
     * <code>ForwardToAllExceptCur = 2;</code>
     */
    ForwardToAllExceptCur(2),
    /**
     * <code>ForwardToHost = 3;</code>
     */
    ForwardToHost(3),
    /**
     * <code>ForwardToAllGuest = 4;</code>
     */
    ForwardToAllGuest(4),
    /**
     * <code>ForwardToPeer = 5;</code>
     */
    ForwardToPeer(5),
    /**
     * <code>ForwardToPeers = 6;</code>
     */
    ForwardToPeers(6),
    /**
     * <code>ForwardOnlyServer = 7;</code>
     */
    ForwardOnlyServer(7),
    /**
     * <code>ForwardToAllExistExceptCur = 8;</code>
     */
    ForwardToAllExistExceptCur(8),
    UNRECOGNIZED(-1),
    ;

    /**
     * <code>ForwardLocal = 0;</code>
     */
    public static final int ForwardLocal_VALUE = 0;
    /**
     * <code>ForwardToAll = 1;</code>
     */
    public static final int ForwardToAll_VALUE = 1;
    /**
     * <code>ForwardToAllExceptCur = 2;</code>
     */
    public static final int ForwardToAllExceptCur_VALUE = 2;
    /**
     * <code>ForwardToHost = 3;</code>
     */
    public static final int ForwardToHost_VALUE = 3;
    /**
     * <code>ForwardToAllGuest = 4;</code>
     */
    public static final int ForwardToAllGuest_VALUE = 4;
    /**
     * <code>ForwardToPeer = 5;</code>
     */
    public static final int ForwardToPeer_VALUE = 5;
    /**
     * <code>ForwardToPeers = 6;</code>
     */
    public static final int ForwardToPeers_VALUE = 6;
    /**
     * <code>ForwardOnlyServer = 7;</code>
     */
    public static final int ForwardOnlyServer_VALUE = 7;
    /**
     * <code>ForwardToAllExistExceptCur = 8;</code>
     */
    public static final int ForwardToAllExistExceptCur_VALUE = 8;


    public final int getNumber() {
      if (this == UNRECOGNIZED) {
        throw new java.lang.IllegalArgumentException(
            "Can't get the number of an unknown enum value.");
      }
      return value;
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static ForwardType valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static ForwardType forNumber(int value) {
      switch (value) {
        case 0: return ForwardLocal;
        case 1: return ForwardToAll;
        case 2: return ForwardToAllExceptCur;
        case 3: return ForwardToHost;
        case 4: return ForwardToAllGuest;
        case 5: return ForwardToPeer;
        case 6: return ForwardToPeers;
        case 7: return ForwardOnlyServer;
        case 8: return ForwardToAllExistExceptCur;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<ForwardType>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        ForwardType> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<ForwardType>() {
            public ForwardType findValueByNumber(int number) {
              return ForwardType.forNumber(number);
            }
          };

    public final com.google.protobuf.Descriptors.EnumValueDescriptor
        getValueDescriptor() {
      if (this == UNRECOGNIZED) {
        throw new java.lang.IllegalStateException(
            "Can't get the descriptor of an unrecognized enum value.");
      }
      return getDescriptor().getValues().get(ordinal());
    }
    public final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptorForType() {
      return getDescriptor();
    }
    public static final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptor() {
      return emu.grasscutter.net.proto.ForwardTypeOuterClass.getDescriptor().getEnumTypes().get(0);
    }

    private static final ForwardType[] VALUES = values();

    public static ForwardType valueOf(
        com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException(
          "EnumValueDescriptor is not for this type.");
      }
      if (desc.getIndex() == -1) {
        return UNRECOGNIZED;
      }
      return VALUES[desc.getIndex()];
    }

    private final int value;

    private ForwardType(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:ForwardType)
  }


  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\021ForwardType.proto*\324\001\n\013ForwardType\022\020\n\014F" +
      "orwardLocal\020\000\022\020\n\014ForwardToAll\020\001\022\031\n\025Forwa" +
      "rdToAllExceptCur\020\002\022\021\n\rForwardToHost\020\003\022\025\n" +
      "\021ForwardToAllGuest\020\004\022\021\n\rForwardToPeer\020\005\022" +
      "\022\n\016ForwardToPeers\020\006\022\025\n\021ForwardOnlyServer" +
      "\020\007\022\036\n\032ForwardToAllExistExceptCur\020\010B\033\n\031em" +
      "u.grasscutter.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
