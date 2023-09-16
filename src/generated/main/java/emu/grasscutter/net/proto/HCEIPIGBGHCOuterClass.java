// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: HCEIPIGBGHC.proto

package emu.grasscutter.net.proto;

public final class HCEIPIGBGHCOuterClass {
  private HCEIPIGBGHCOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface HCEIPIGBGHCOrBuilder extends
      // @@protoc_insertion_point(interface_extends:HCEIPIGBGHC)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>int32 retcode = 9;</code>
     * @return The retcode.
     */
    int getRetcode();

    /**
     * <code>.MultistagePlayInfo KMHOBLOHNCD = 4;</code>
     * @return Whether the kMHOBLOHNCD field is set.
     */
    boolean hasKMHOBLOHNCD();
    /**
     * <code>.MultistagePlayInfo KMHOBLOHNCD = 4;</code>
     * @return The kMHOBLOHNCD.
     */
    emu.grasscutter.net.proto.MultistagePlayInfoOuterClass.MultistagePlayInfo getKMHOBLOHNCD();
    /**
     * <code>.MultistagePlayInfo KMHOBLOHNCD = 4;</code>
     */
    emu.grasscutter.net.proto.MultistagePlayInfoOuterClass.MultistagePlayInfoOrBuilder getKMHOBLOHNCDOrBuilder();
  }
  /**
   * <pre>
   * CmdId: 4865
   * </pre>
   *
   * Protobuf type {@code HCEIPIGBGHC}
   */
  public static final class HCEIPIGBGHC extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:HCEIPIGBGHC)
      HCEIPIGBGHCOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use HCEIPIGBGHC.newBuilder() to construct.
    private HCEIPIGBGHC(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private HCEIPIGBGHC() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new HCEIPIGBGHC();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private HCEIPIGBGHC(
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
            case 34: {
              emu.grasscutter.net.proto.MultistagePlayInfoOuterClass.MultistagePlayInfo.Builder subBuilder = null;
              if (kMHOBLOHNCD_ != null) {
                subBuilder = kMHOBLOHNCD_.toBuilder();
              }
              kMHOBLOHNCD_ = input.readMessage(emu.grasscutter.net.proto.MultistagePlayInfoOuterClass.MultistagePlayInfo.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(kMHOBLOHNCD_);
                kMHOBLOHNCD_ = subBuilder.buildPartial();
              }

              break;
            }
            case 72: {

              retcode_ = input.readInt32();
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
      return emu.grasscutter.net.proto.HCEIPIGBGHCOuterClass.internal_static_HCEIPIGBGHC_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.HCEIPIGBGHCOuterClass.internal_static_HCEIPIGBGHC_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.HCEIPIGBGHCOuterClass.HCEIPIGBGHC.class, emu.grasscutter.net.proto.HCEIPIGBGHCOuterClass.HCEIPIGBGHC.Builder.class);
    }

    public static final int RETCODE_FIELD_NUMBER = 9;
    private int retcode_;
    /**
     * <code>int32 retcode = 9;</code>
     * @return The retcode.
     */
    @java.lang.Override
    public int getRetcode() {
      return retcode_;
    }

    public static final int KMHOBLOHNCD_FIELD_NUMBER = 4;
    private emu.grasscutter.net.proto.MultistagePlayInfoOuterClass.MultistagePlayInfo kMHOBLOHNCD_;
    /**
     * <code>.MultistagePlayInfo KMHOBLOHNCD = 4;</code>
     * @return Whether the kMHOBLOHNCD field is set.
     */
    @java.lang.Override
    public boolean hasKMHOBLOHNCD() {
      return kMHOBLOHNCD_ != null;
    }
    /**
     * <code>.MultistagePlayInfo KMHOBLOHNCD = 4;</code>
     * @return The kMHOBLOHNCD.
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.MultistagePlayInfoOuterClass.MultistagePlayInfo getKMHOBLOHNCD() {
      return kMHOBLOHNCD_ == null ? emu.grasscutter.net.proto.MultistagePlayInfoOuterClass.MultistagePlayInfo.getDefaultInstance() : kMHOBLOHNCD_;
    }
    /**
     * <code>.MultistagePlayInfo KMHOBLOHNCD = 4;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.MultistagePlayInfoOuterClass.MultistagePlayInfoOrBuilder getKMHOBLOHNCDOrBuilder() {
      return getKMHOBLOHNCD();
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
      if (kMHOBLOHNCD_ != null) {
        output.writeMessage(4, getKMHOBLOHNCD());
      }
      if (retcode_ != 0) {
        output.writeInt32(9, retcode_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (kMHOBLOHNCD_ != null) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(4, getKMHOBLOHNCD());
      }
      if (retcode_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(9, retcode_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.HCEIPIGBGHCOuterClass.HCEIPIGBGHC)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.HCEIPIGBGHCOuterClass.HCEIPIGBGHC other = (emu.grasscutter.net.proto.HCEIPIGBGHCOuterClass.HCEIPIGBGHC) obj;

      if (getRetcode()
          != other.getRetcode()) return false;
      if (hasKMHOBLOHNCD() != other.hasKMHOBLOHNCD()) return false;
      if (hasKMHOBLOHNCD()) {
        if (!getKMHOBLOHNCD()
            .equals(other.getKMHOBLOHNCD())) return false;
      }
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
      hash = (37 * hash) + RETCODE_FIELD_NUMBER;
      hash = (53 * hash) + getRetcode();
      if (hasKMHOBLOHNCD()) {
        hash = (37 * hash) + KMHOBLOHNCD_FIELD_NUMBER;
        hash = (53 * hash) + getKMHOBLOHNCD().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.HCEIPIGBGHCOuterClass.HCEIPIGBGHC parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.HCEIPIGBGHCOuterClass.HCEIPIGBGHC parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.HCEIPIGBGHCOuterClass.HCEIPIGBGHC parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.HCEIPIGBGHCOuterClass.HCEIPIGBGHC parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.HCEIPIGBGHCOuterClass.HCEIPIGBGHC parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.HCEIPIGBGHCOuterClass.HCEIPIGBGHC parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.HCEIPIGBGHCOuterClass.HCEIPIGBGHC parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.HCEIPIGBGHCOuterClass.HCEIPIGBGHC parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.HCEIPIGBGHCOuterClass.HCEIPIGBGHC parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.HCEIPIGBGHCOuterClass.HCEIPIGBGHC parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.HCEIPIGBGHCOuterClass.HCEIPIGBGHC parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.HCEIPIGBGHCOuterClass.HCEIPIGBGHC parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.HCEIPIGBGHCOuterClass.HCEIPIGBGHC prototype) {
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
     * CmdId: 4865
     * </pre>
     *
     * Protobuf type {@code HCEIPIGBGHC}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:HCEIPIGBGHC)
        emu.grasscutter.net.proto.HCEIPIGBGHCOuterClass.HCEIPIGBGHCOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.HCEIPIGBGHCOuterClass.internal_static_HCEIPIGBGHC_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.HCEIPIGBGHCOuterClass.internal_static_HCEIPIGBGHC_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.HCEIPIGBGHCOuterClass.HCEIPIGBGHC.class, emu.grasscutter.net.proto.HCEIPIGBGHCOuterClass.HCEIPIGBGHC.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.HCEIPIGBGHCOuterClass.HCEIPIGBGHC.newBuilder()
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
        retcode_ = 0;

        if (kMHOBLOHNCDBuilder_ == null) {
          kMHOBLOHNCD_ = null;
        } else {
          kMHOBLOHNCD_ = null;
          kMHOBLOHNCDBuilder_ = null;
        }
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.HCEIPIGBGHCOuterClass.internal_static_HCEIPIGBGHC_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.HCEIPIGBGHCOuterClass.HCEIPIGBGHC getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.HCEIPIGBGHCOuterClass.HCEIPIGBGHC.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.HCEIPIGBGHCOuterClass.HCEIPIGBGHC build() {
        emu.grasscutter.net.proto.HCEIPIGBGHCOuterClass.HCEIPIGBGHC result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.HCEIPIGBGHCOuterClass.HCEIPIGBGHC buildPartial() {
        emu.grasscutter.net.proto.HCEIPIGBGHCOuterClass.HCEIPIGBGHC result = new emu.grasscutter.net.proto.HCEIPIGBGHCOuterClass.HCEIPIGBGHC(this);
        result.retcode_ = retcode_;
        if (kMHOBLOHNCDBuilder_ == null) {
          result.kMHOBLOHNCD_ = kMHOBLOHNCD_;
        } else {
          result.kMHOBLOHNCD_ = kMHOBLOHNCDBuilder_.build();
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
        if (other instanceof emu.grasscutter.net.proto.HCEIPIGBGHCOuterClass.HCEIPIGBGHC) {
          return mergeFrom((emu.grasscutter.net.proto.HCEIPIGBGHCOuterClass.HCEIPIGBGHC)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.HCEIPIGBGHCOuterClass.HCEIPIGBGHC other) {
        if (other == emu.grasscutter.net.proto.HCEIPIGBGHCOuterClass.HCEIPIGBGHC.getDefaultInstance()) return this;
        if (other.getRetcode() != 0) {
          setRetcode(other.getRetcode());
        }
        if (other.hasKMHOBLOHNCD()) {
          mergeKMHOBLOHNCD(other.getKMHOBLOHNCD());
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
        emu.grasscutter.net.proto.HCEIPIGBGHCOuterClass.HCEIPIGBGHC parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.HCEIPIGBGHCOuterClass.HCEIPIGBGHC) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int retcode_ ;
      /**
       * <code>int32 retcode = 9;</code>
       * @return The retcode.
       */
      @java.lang.Override
      public int getRetcode() {
        return retcode_;
      }
      /**
       * <code>int32 retcode = 9;</code>
       * @param value The retcode to set.
       * @return This builder for chaining.
       */
      public Builder setRetcode(int value) {
        
        retcode_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>int32 retcode = 9;</code>
       * @return This builder for chaining.
       */
      public Builder clearRetcode() {
        
        retcode_ = 0;
        onChanged();
        return this;
      }

      private emu.grasscutter.net.proto.MultistagePlayInfoOuterClass.MultistagePlayInfo kMHOBLOHNCD_;
      private com.google.protobuf.SingleFieldBuilderV3<
          emu.grasscutter.net.proto.MultistagePlayInfoOuterClass.MultistagePlayInfo, emu.grasscutter.net.proto.MultistagePlayInfoOuterClass.MultistagePlayInfo.Builder, emu.grasscutter.net.proto.MultistagePlayInfoOuterClass.MultistagePlayInfoOrBuilder> kMHOBLOHNCDBuilder_;
      /**
       * <code>.MultistagePlayInfo KMHOBLOHNCD = 4;</code>
       * @return Whether the kMHOBLOHNCD field is set.
       */
      public boolean hasKMHOBLOHNCD() {
        return kMHOBLOHNCDBuilder_ != null || kMHOBLOHNCD_ != null;
      }
      /**
       * <code>.MultistagePlayInfo KMHOBLOHNCD = 4;</code>
       * @return The kMHOBLOHNCD.
       */
      public emu.grasscutter.net.proto.MultistagePlayInfoOuterClass.MultistagePlayInfo getKMHOBLOHNCD() {
        if (kMHOBLOHNCDBuilder_ == null) {
          return kMHOBLOHNCD_ == null ? emu.grasscutter.net.proto.MultistagePlayInfoOuterClass.MultistagePlayInfo.getDefaultInstance() : kMHOBLOHNCD_;
        } else {
          return kMHOBLOHNCDBuilder_.getMessage();
        }
      }
      /**
       * <code>.MultistagePlayInfo KMHOBLOHNCD = 4;</code>
       */
      public Builder setKMHOBLOHNCD(emu.grasscutter.net.proto.MultistagePlayInfoOuterClass.MultistagePlayInfo value) {
        if (kMHOBLOHNCDBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          kMHOBLOHNCD_ = value;
          onChanged();
        } else {
          kMHOBLOHNCDBuilder_.setMessage(value);
        }

        return this;
      }
      /**
       * <code>.MultistagePlayInfo KMHOBLOHNCD = 4;</code>
       */
      public Builder setKMHOBLOHNCD(
          emu.grasscutter.net.proto.MultistagePlayInfoOuterClass.MultistagePlayInfo.Builder builderForValue) {
        if (kMHOBLOHNCDBuilder_ == null) {
          kMHOBLOHNCD_ = builderForValue.build();
          onChanged();
        } else {
          kMHOBLOHNCDBuilder_.setMessage(builderForValue.build());
        }

        return this;
      }
      /**
       * <code>.MultistagePlayInfo KMHOBLOHNCD = 4;</code>
       */
      public Builder mergeKMHOBLOHNCD(emu.grasscutter.net.proto.MultistagePlayInfoOuterClass.MultistagePlayInfo value) {
        if (kMHOBLOHNCDBuilder_ == null) {
          if (kMHOBLOHNCD_ != null) {
            kMHOBLOHNCD_ =
              emu.grasscutter.net.proto.MultistagePlayInfoOuterClass.MultistagePlayInfo.newBuilder(kMHOBLOHNCD_).mergeFrom(value).buildPartial();
          } else {
            kMHOBLOHNCD_ = value;
          }
          onChanged();
        } else {
          kMHOBLOHNCDBuilder_.mergeFrom(value);
        }

        return this;
      }
      /**
       * <code>.MultistagePlayInfo KMHOBLOHNCD = 4;</code>
       */
      public Builder clearKMHOBLOHNCD() {
        if (kMHOBLOHNCDBuilder_ == null) {
          kMHOBLOHNCD_ = null;
          onChanged();
        } else {
          kMHOBLOHNCD_ = null;
          kMHOBLOHNCDBuilder_ = null;
        }

        return this;
      }
      /**
       * <code>.MultistagePlayInfo KMHOBLOHNCD = 4;</code>
       */
      public emu.grasscutter.net.proto.MultistagePlayInfoOuterClass.MultistagePlayInfo.Builder getKMHOBLOHNCDBuilder() {
        
        onChanged();
        return getKMHOBLOHNCDFieldBuilder().getBuilder();
      }
      /**
       * <code>.MultistagePlayInfo KMHOBLOHNCD = 4;</code>
       */
      public emu.grasscutter.net.proto.MultistagePlayInfoOuterClass.MultistagePlayInfoOrBuilder getKMHOBLOHNCDOrBuilder() {
        if (kMHOBLOHNCDBuilder_ != null) {
          return kMHOBLOHNCDBuilder_.getMessageOrBuilder();
        } else {
          return kMHOBLOHNCD_ == null ?
              emu.grasscutter.net.proto.MultistagePlayInfoOuterClass.MultistagePlayInfo.getDefaultInstance() : kMHOBLOHNCD_;
        }
      }
      /**
       * <code>.MultistagePlayInfo KMHOBLOHNCD = 4;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          emu.grasscutter.net.proto.MultistagePlayInfoOuterClass.MultistagePlayInfo, emu.grasscutter.net.proto.MultistagePlayInfoOuterClass.MultistagePlayInfo.Builder, emu.grasscutter.net.proto.MultistagePlayInfoOuterClass.MultistagePlayInfoOrBuilder> 
          getKMHOBLOHNCDFieldBuilder() {
        if (kMHOBLOHNCDBuilder_ == null) {
          kMHOBLOHNCDBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              emu.grasscutter.net.proto.MultistagePlayInfoOuterClass.MultistagePlayInfo, emu.grasscutter.net.proto.MultistagePlayInfoOuterClass.MultistagePlayInfo.Builder, emu.grasscutter.net.proto.MultistagePlayInfoOuterClass.MultistagePlayInfoOrBuilder>(
                  getKMHOBLOHNCD(),
                  getParentForChildren(),
                  isClean());
          kMHOBLOHNCD_ = null;
        }
        return kMHOBLOHNCDBuilder_;
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


      // @@protoc_insertion_point(builder_scope:HCEIPIGBGHC)
    }

    // @@protoc_insertion_point(class_scope:HCEIPIGBGHC)
    private static final emu.grasscutter.net.proto.HCEIPIGBGHCOuterClass.HCEIPIGBGHC DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.HCEIPIGBGHCOuterClass.HCEIPIGBGHC();
    }

    public static emu.grasscutter.net.proto.HCEIPIGBGHCOuterClass.HCEIPIGBGHC getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<HCEIPIGBGHC>
        PARSER = new com.google.protobuf.AbstractParser<HCEIPIGBGHC>() {
      @java.lang.Override
      public HCEIPIGBGHC parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new HCEIPIGBGHC(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<HCEIPIGBGHC> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<HCEIPIGBGHC> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.HCEIPIGBGHCOuterClass.HCEIPIGBGHC getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_HCEIPIGBGHC_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_HCEIPIGBGHC_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\021HCEIPIGBGHC.proto\032\030MultistagePlayInfo." +
      "proto\"H\n\013HCEIPIGBGHC\022\017\n\007retcode\030\t \001(\005\022(\n" +
      "\013KMHOBLOHNCD\030\004 \001(\0132\023.MultistagePlayInfoB" +
      "\033\n\031emu.grasscutter.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.grasscutter.net.proto.MultistagePlayInfoOuterClass.getDescriptor(),
        });
    internal_static_HCEIPIGBGHC_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_HCEIPIGBGHC_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_HCEIPIGBGHC_descriptor,
        new java.lang.String[] { "Retcode", "KMHOBLOHNCD", });
    emu.grasscutter.net.proto.MultistagePlayInfoOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}