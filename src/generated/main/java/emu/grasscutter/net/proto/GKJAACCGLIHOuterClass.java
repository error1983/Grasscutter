// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: GKJAACCGLIH.proto

package emu.grasscutter.net.proto;

public final class GKJAACCGLIHOuterClass {
  private GKJAACCGLIHOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface GKJAACCGLIHOrBuilder extends
      // @@protoc_insertion_point(interface_extends:GKJAACCGLIH)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 FDKENKPIJKA = 14;</code>
     * @return The fDKENKPIJKA.
     */
    int getFDKENKPIJKA();

    /**
     * <code>uint32 BFMLPJDCMPF = 5;</code>
     * @return The bFMLPJDCMPF.
     */
    int getBFMLPJDCMPF();

    /**
     * <code>uint32 JDMAPGMEGGO = 12;</code>
     * @return The jDMAPGMEGGO.
     */
    int getJDMAPGMEGGO();

    /**
     * <code>uint32 group_id = 7;</code>
     * @return The groupId.
     */
    int getGroupId();
  }
  /**
   * <pre>
   * CmdId: 1897
   * </pre>
   *
   * Protobuf type {@code GKJAACCGLIH}
   */
  public static final class GKJAACCGLIH extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:GKJAACCGLIH)
      GKJAACCGLIHOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use GKJAACCGLIH.newBuilder() to construct.
    private GKJAACCGLIH(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private GKJAACCGLIH() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new GKJAACCGLIH();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private GKJAACCGLIH(
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
            case 40: {

              bFMLPJDCMPF_ = input.readUInt32();
              break;
            }
            case 56: {

              groupId_ = input.readUInt32();
              break;
            }
            case 96: {

              jDMAPGMEGGO_ = input.readUInt32();
              break;
            }
            case 112: {

              fDKENKPIJKA_ = input.readUInt32();
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
      return emu.grasscutter.net.proto.GKJAACCGLIHOuterClass.internal_static_GKJAACCGLIH_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.GKJAACCGLIHOuterClass.internal_static_GKJAACCGLIH_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.GKJAACCGLIHOuterClass.GKJAACCGLIH.class, emu.grasscutter.net.proto.GKJAACCGLIHOuterClass.GKJAACCGLIH.Builder.class);
    }

    public static final int FDKENKPIJKA_FIELD_NUMBER = 14;
    private int fDKENKPIJKA_;
    /**
     * <code>uint32 FDKENKPIJKA = 14;</code>
     * @return The fDKENKPIJKA.
     */
    @java.lang.Override
    public int getFDKENKPIJKA() {
      return fDKENKPIJKA_;
    }

    public static final int BFMLPJDCMPF_FIELD_NUMBER = 5;
    private int bFMLPJDCMPF_;
    /**
     * <code>uint32 BFMLPJDCMPF = 5;</code>
     * @return The bFMLPJDCMPF.
     */
    @java.lang.Override
    public int getBFMLPJDCMPF() {
      return bFMLPJDCMPF_;
    }

    public static final int JDMAPGMEGGO_FIELD_NUMBER = 12;
    private int jDMAPGMEGGO_;
    /**
     * <code>uint32 JDMAPGMEGGO = 12;</code>
     * @return The jDMAPGMEGGO.
     */
    @java.lang.Override
    public int getJDMAPGMEGGO() {
      return jDMAPGMEGGO_;
    }

    public static final int GROUP_ID_FIELD_NUMBER = 7;
    private int groupId_;
    /**
     * <code>uint32 group_id = 7;</code>
     * @return The groupId.
     */
    @java.lang.Override
    public int getGroupId() {
      return groupId_;
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
      if (bFMLPJDCMPF_ != 0) {
        output.writeUInt32(5, bFMLPJDCMPF_);
      }
      if (groupId_ != 0) {
        output.writeUInt32(7, groupId_);
      }
      if (jDMAPGMEGGO_ != 0) {
        output.writeUInt32(12, jDMAPGMEGGO_);
      }
      if (fDKENKPIJKA_ != 0) {
        output.writeUInt32(14, fDKENKPIJKA_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (bFMLPJDCMPF_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(5, bFMLPJDCMPF_);
      }
      if (groupId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(7, groupId_);
      }
      if (jDMAPGMEGGO_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(12, jDMAPGMEGGO_);
      }
      if (fDKENKPIJKA_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(14, fDKENKPIJKA_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.GKJAACCGLIHOuterClass.GKJAACCGLIH)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.GKJAACCGLIHOuterClass.GKJAACCGLIH other = (emu.grasscutter.net.proto.GKJAACCGLIHOuterClass.GKJAACCGLIH) obj;

      if (getFDKENKPIJKA()
          != other.getFDKENKPIJKA()) return false;
      if (getBFMLPJDCMPF()
          != other.getBFMLPJDCMPF()) return false;
      if (getJDMAPGMEGGO()
          != other.getJDMAPGMEGGO()) return false;
      if (getGroupId()
          != other.getGroupId()) return false;
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
      hash = (37 * hash) + FDKENKPIJKA_FIELD_NUMBER;
      hash = (53 * hash) + getFDKENKPIJKA();
      hash = (37 * hash) + BFMLPJDCMPF_FIELD_NUMBER;
      hash = (53 * hash) + getBFMLPJDCMPF();
      hash = (37 * hash) + JDMAPGMEGGO_FIELD_NUMBER;
      hash = (53 * hash) + getJDMAPGMEGGO();
      hash = (37 * hash) + GROUP_ID_FIELD_NUMBER;
      hash = (53 * hash) + getGroupId();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.GKJAACCGLIHOuterClass.GKJAACCGLIH parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.GKJAACCGLIHOuterClass.GKJAACCGLIH parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GKJAACCGLIHOuterClass.GKJAACCGLIH parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.GKJAACCGLIHOuterClass.GKJAACCGLIH parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GKJAACCGLIHOuterClass.GKJAACCGLIH parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.GKJAACCGLIHOuterClass.GKJAACCGLIH parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GKJAACCGLIHOuterClass.GKJAACCGLIH parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.GKJAACCGLIHOuterClass.GKJAACCGLIH parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GKJAACCGLIHOuterClass.GKJAACCGLIH parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.GKJAACCGLIHOuterClass.GKJAACCGLIH parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GKJAACCGLIHOuterClass.GKJAACCGLIH parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.GKJAACCGLIHOuterClass.GKJAACCGLIH parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.GKJAACCGLIHOuterClass.GKJAACCGLIH prototype) {
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
     * CmdId: 1897
     * </pre>
     *
     * Protobuf type {@code GKJAACCGLIH}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:GKJAACCGLIH)
        emu.grasscutter.net.proto.GKJAACCGLIHOuterClass.GKJAACCGLIHOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.GKJAACCGLIHOuterClass.internal_static_GKJAACCGLIH_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.GKJAACCGLIHOuterClass.internal_static_GKJAACCGLIH_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.GKJAACCGLIHOuterClass.GKJAACCGLIH.class, emu.grasscutter.net.proto.GKJAACCGLIHOuterClass.GKJAACCGLIH.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.GKJAACCGLIHOuterClass.GKJAACCGLIH.newBuilder()
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
        fDKENKPIJKA_ = 0;

        bFMLPJDCMPF_ = 0;

        jDMAPGMEGGO_ = 0;

        groupId_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.GKJAACCGLIHOuterClass.internal_static_GKJAACCGLIH_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.GKJAACCGLIHOuterClass.GKJAACCGLIH getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.GKJAACCGLIHOuterClass.GKJAACCGLIH.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.GKJAACCGLIHOuterClass.GKJAACCGLIH build() {
        emu.grasscutter.net.proto.GKJAACCGLIHOuterClass.GKJAACCGLIH result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.GKJAACCGLIHOuterClass.GKJAACCGLIH buildPartial() {
        emu.grasscutter.net.proto.GKJAACCGLIHOuterClass.GKJAACCGLIH result = new emu.grasscutter.net.proto.GKJAACCGLIHOuterClass.GKJAACCGLIH(this);
        result.fDKENKPIJKA_ = fDKENKPIJKA_;
        result.bFMLPJDCMPF_ = bFMLPJDCMPF_;
        result.jDMAPGMEGGO_ = jDMAPGMEGGO_;
        result.groupId_ = groupId_;
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
        if (other instanceof emu.grasscutter.net.proto.GKJAACCGLIHOuterClass.GKJAACCGLIH) {
          return mergeFrom((emu.grasscutter.net.proto.GKJAACCGLIHOuterClass.GKJAACCGLIH)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.GKJAACCGLIHOuterClass.GKJAACCGLIH other) {
        if (other == emu.grasscutter.net.proto.GKJAACCGLIHOuterClass.GKJAACCGLIH.getDefaultInstance()) return this;
        if (other.getFDKENKPIJKA() != 0) {
          setFDKENKPIJKA(other.getFDKENKPIJKA());
        }
        if (other.getBFMLPJDCMPF() != 0) {
          setBFMLPJDCMPF(other.getBFMLPJDCMPF());
        }
        if (other.getJDMAPGMEGGO() != 0) {
          setJDMAPGMEGGO(other.getJDMAPGMEGGO());
        }
        if (other.getGroupId() != 0) {
          setGroupId(other.getGroupId());
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
        emu.grasscutter.net.proto.GKJAACCGLIHOuterClass.GKJAACCGLIH parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.GKJAACCGLIHOuterClass.GKJAACCGLIH) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int fDKENKPIJKA_ ;
      /**
       * <code>uint32 FDKENKPIJKA = 14;</code>
       * @return The fDKENKPIJKA.
       */
      @java.lang.Override
      public int getFDKENKPIJKA() {
        return fDKENKPIJKA_;
      }
      /**
       * <code>uint32 FDKENKPIJKA = 14;</code>
       * @param value The fDKENKPIJKA to set.
       * @return This builder for chaining.
       */
      public Builder setFDKENKPIJKA(int value) {
        
        fDKENKPIJKA_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 FDKENKPIJKA = 14;</code>
       * @return This builder for chaining.
       */
      public Builder clearFDKENKPIJKA() {
        
        fDKENKPIJKA_ = 0;
        onChanged();
        return this;
      }

      private int bFMLPJDCMPF_ ;
      /**
       * <code>uint32 BFMLPJDCMPF = 5;</code>
       * @return The bFMLPJDCMPF.
       */
      @java.lang.Override
      public int getBFMLPJDCMPF() {
        return bFMLPJDCMPF_;
      }
      /**
       * <code>uint32 BFMLPJDCMPF = 5;</code>
       * @param value The bFMLPJDCMPF to set.
       * @return This builder for chaining.
       */
      public Builder setBFMLPJDCMPF(int value) {
        
        bFMLPJDCMPF_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 BFMLPJDCMPF = 5;</code>
       * @return This builder for chaining.
       */
      public Builder clearBFMLPJDCMPF() {
        
        bFMLPJDCMPF_ = 0;
        onChanged();
        return this;
      }

      private int jDMAPGMEGGO_ ;
      /**
       * <code>uint32 JDMAPGMEGGO = 12;</code>
       * @return The jDMAPGMEGGO.
       */
      @java.lang.Override
      public int getJDMAPGMEGGO() {
        return jDMAPGMEGGO_;
      }
      /**
       * <code>uint32 JDMAPGMEGGO = 12;</code>
       * @param value The jDMAPGMEGGO to set.
       * @return This builder for chaining.
       */
      public Builder setJDMAPGMEGGO(int value) {
        
        jDMAPGMEGGO_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 JDMAPGMEGGO = 12;</code>
       * @return This builder for chaining.
       */
      public Builder clearJDMAPGMEGGO() {
        
        jDMAPGMEGGO_ = 0;
        onChanged();
        return this;
      }

      private int groupId_ ;
      /**
       * <code>uint32 group_id = 7;</code>
       * @return The groupId.
       */
      @java.lang.Override
      public int getGroupId() {
        return groupId_;
      }
      /**
       * <code>uint32 group_id = 7;</code>
       * @param value The groupId to set.
       * @return This builder for chaining.
       */
      public Builder setGroupId(int value) {
        
        groupId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 group_id = 7;</code>
       * @return This builder for chaining.
       */
      public Builder clearGroupId() {
        
        groupId_ = 0;
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


      // @@protoc_insertion_point(builder_scope:GKJAACCGLIH)
    }

    // @@protoc_insertion_point(class_scope:GKJAACCGLIH)
    private static final emu.grasscutter.net.proto.GKJAACCGLIHOuterClass.GKJAACCGLIH DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.GKJAACCGLIHOuterClass.GKJAACCGLIH();
    }

    public static emu.grasscutter.net.proto.GKJAACCGLIHOuterClass.GKJAACCGLIH getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<GKJAACCGLIH>
        PARSER = new com.google.protobuf.AbstractParser<GKJAACCGLIH>() {
      @java.lang.Override
      public GKJAACCGLIH parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new GKJAACCGLIH(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<GKJAACCGLIH> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<GKJAACCGLIH> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.GKJAACCGLIHOuterClass.GKJAACCGLIH getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_GKJAACCGLIH_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_GKJAACCGLIH_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\021GKJAACCGLIH.proto\"^\n\013GKJAACCGLIH\022\023\n\013FD" +
      "KENKPIJKA\030\016 \001(\r\022\023\n\013BFMLPJDCMPF\030\005 \001(\r\022\023\n\013" +
      "JDMAPGMEGGO\030\014 \001(\r\022\020\n\010group_id\030\007 \001(\rB\033\n\031e" +
      "mu.grasscutter.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_GKJAACCGLIH_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_GKJAACCGLIH_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_GKJAACCGLIH_descriptor,
        new java.lang.String[] { "FDKENKPIJKA", "BFMLPJDCMPF", "JDMAPGMEGGO", "GroupId", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}