// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: NFEOKJAFAFK.proto

package emu.grasscutter.net.proto;

public final class NFEOKJAFAFKOuterClass {
  private NFEOKJAFAFKOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface NFEOKJAFAFKOrBuilder extends
      // @@protoc_insertion_point(interface_extends:NFEOKJAFAFK)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>float AMEAHHBOPGN = 5;</code>
     * @return The aMEAHHBOPGN.
     */
    float getAMEAHHBOPGN();
  }
  /**
   * Protobuf type {@code NFEOKJAFAFK}
   */
  public static final class NFEOKJAFAFK extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:NFEOKJAFAFK)
      NFEOKJAFAFKOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use NFEOKJAFAFK.newBuilder() to construct.
    private NFEOKJAFAFK(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private NFEOKJAFAFK() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new NFEOKJAFAFK();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private NFEOKJAFAFK(
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
            case 45: {

              aMEAHHBOPGN_ = input.readFloat();
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
      return emu.grasscutter.net.proto.NFEOKJAFAFKOuterClass.internal_static_NFEOKJAFAFK_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.NFEOKJAFAFKOuterClass.internal_static_NFEOKJAFAFK_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.NFEOKJAFAFKOuterClass.NFEOKJAFAFK.class, emu.grasscutter.net.proto.NFEOKJAFAFKOuterClass.NFEOKJAFAFK.Builder.class);
    }

    public static final int AMEAHHBOPGN_FIELD_NUMBER = 5;
    private float aMEAHHBOPGN_;
    /**
     * <code>float AMEAHHBOPGN = 5;</code>
     * @return The aMEAHHBOPGN.
     */
    @java.lang.Override
    public float getAMEAHHBOPGN() {
      return aMEAHHBOPGN_;
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
      if (aMEAHHBOPGN_ != 0F) {
        output.writeFloat(5, aMEAHHBOPGN_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (aMEAHHBOPGN_ != 0F) {
        size += com.google.protobuf.CodedOutputStream
          .computeFloatSize(5, aMEAHHBOPGN_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.NFEOKJAFAFKOuterClass.NFEOKJAFAFK)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.NFEOKJAFAFKOuterClass.NFEOKJAFAFK other = (emu.grasscutter.net.proto.NFEOKJAFAFKOuterClass.NFEOKJAFAFK) obj;

      if (java.lang.Float.floatToIntBits(getAMEAHHBOPGN())
          != java.lang.Float.floatToIntBits(
              other.getAMEAHHBOPGN())) return false;
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
      hash = (37 * hash) + AMEAHHBOPGN_FIELD_NUMBER;
      hash = (53 * hash) + java.lang.Float.floatToIntBits(
          getAMEAHHBOPGN());
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.NFEOKJAFAFKOuterClass.NFEOKJAFAFK parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.NFEOKJAFAFKOuterClass.NFEOKJAFAFK parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.NFEOKJAFAFKOuterClass.NFEOKJAFAFK parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.NFEOKJAFAFKOuterClass.NFEOKJAFAFK parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.NFEOKJAFAFKOuterClass.NFEOKJAFAFK parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.NFEOKJAFAFKOuterClass.NFEOKJAFAFK parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.NFEOKJAFAFKOuterClass.NFEOKJAFAFK parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.NFEOKJAFAFKOuterClass.NFEOKJAFAFK parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.NFEOKJAFAFKOuterClass.NFEOKJAFAFK parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.NFEOKJAFAFKOuterClass.NFEOKJAFAFK parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.NFEOKJAFAFKOuterClass.NFEOKJAFAFK parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.NFEOKJAFAFKOuterClass.NFEOKJAFAFK parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.NFEOKJAFAFKOuterClass.NFEOKJAFAFK prototype) {
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
     * Protobuf type {@code NFEOKJAFAFK}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:NFEOKJAFAFK)
        emu.grasscutter.net.proto.NFEOKJAFAFKOuterClass.NFEOKJAFAFKOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.NFEOKJAFAFKOuterClass.internal_static_NFEOKJAFAFK_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.NFEOKJAFAFKOuterClass.internal_static_NFEOKJAFAFK_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.NFEOKJAFAFKOuterClass.NFEOKJAFAFK.class, emu.grasscutter.net.proto.NFEOKJAFAFKOuterClass.NFEOKJAFAFK.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.NFEOKJAFAFKOuterClass.NFEOKJAFAFK.newBuilder()
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
        aMEAHHBOPGN_ = 0F;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.NFEOKJAFAFKOuterClass.internal_static_NFEOKJAFAFK_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.NFEOKJAFAFKOuterClass.NFEOKJAFAFK getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.NFEOKJAFAFKOuterClass.NFEOKJAFAFK.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.NFEOKJAFAFKOuterClass.NFEOKJAFAFK build() {
        emu.grasscutter.net.proto.NFEOKJAFAFKOuterClass.NFEOKJAFAFK result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.NFEOKJAFAFKOuterClass.NFEOKJAFAFK buildPartial() {
        emu.grasscutter.net.proto.NFEOKJAFAFKOuterClass.NFEOKJAFAFK result = new emu.grasscutter.net.proto.NFEOKJAFAFKOuterClass.NFEOKJAFAFK(this);
        result.aMEAHHBOPGN_ = aMEAHHBOPGN_;
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
        if (other instanceof emu.grasscutter.net.proto.NFEOKJAFAFKOuterClass.NFEOKJAFAFK) {
          return mergeFrom((emu.grasscutter.net.proto.NFEOKJAFAFKOuterClass.NFEOKJAFAFK)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.NFEOKJAFAFKOuterClass.NFEOKJAFAFK other) {
        if (other == emu.grasscutter.net.proto.NFEOKJAFAFKOuterClass.NFEOKJAFAFK.getDefaultInstance()) return this;
        if (other.getAMEAHHBOPGN() != 0F) {
          setAMEAHHBOPGN(other.getAMEAHHBOPGN());
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
        emu.grasscutter.net.proto.NFEOKJAFAFKOuterClass.NFEOKJAFAFK parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.NFEOKJAFAFKOuterClass.NFEOKJAFAFK) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private float aMEAHHBOPGN_ ;
      /**
       * <code>float AMEAHHBOPGN = 5;</code>
       * @return The aMEAHHBOPGN.
       */
      @java.lang.Override
      public float getAMEAHHBOPGN() {
        return aMEAHHBOPGN_;
      }
      /**
       * <code>float AMEAHHBOPGN = 5;</code>
       * @param value The aMEAHHBOPGN to set.
       * @return This builder for chaining.
       */
      public Builder setAMEAHHBOPGN(float value) {
        
        aMEAHHBOPGN_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>float AMEAHHBOPGN = 5;</code>
       * @return This builder for chaining.
       */
      public Builder clearAMEAHHBOPGN() {
        
        aMEAHHBOPGN_ = 0F;
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


      // @@protoc_insertion_point(builder_scope:NFEOKJAFAFK)
    }

    // @@protoc_insertion_point(class_scope:NFEOKJAFAFK)
    private static final emu.grasscutter.net.proto.NFEOKJAFAFKOuterClass.NFEOKJAFAFK DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.NFEOKJAFAFKOuterClass.NFEOKJAFAFK();
    }

    public static emu.grasscutter.net.proto.NFEOKJAFAFKOuterClass.NFEOKJAFAFK getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<NFEOKJAFAFK>
        PARSER = new com.google.protobuf.AbstractParser<NFEOKJAFAFK>() {
      @java.lang.Override
      public NFEOKJAFAFK parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new NFEOKJAFAFK(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<NFEOKJAFAFK> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<NFEOKJAFAFK> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.NFEOKJAFAFKOuterClass.NFEOKJAFAFK getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_NFEOKJAFAFK_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_NFEOKJAFAFK_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\021NFEOKJAFAFK.proto\"\"\n\013NFEOKJAFAFK\022\023\n\013AM" +
      "EAHHBOPGN\030\005 \001(\002B\033\n\031emu.grasscutter.net.p" +
      "rotob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_NFEOKJAFAFK_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_NFEOKJAFAFK_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_NFEOKJAFAFK_descriptor,
        new java.lang.String[] { "AMEAHHBOPGN", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}