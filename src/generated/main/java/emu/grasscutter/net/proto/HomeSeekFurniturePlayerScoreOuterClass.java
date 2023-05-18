// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: HomeSeekFurniturePlayerScore.proto

package emu.grasscutter.net.proto;

public final class HomeSeekFurniturePlayerScoreOuterClass {
  private HomeSeekFurniturePlayerScoreOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface HomeSeekFurniturePlayerScoreOrBuilder extends
      // @@protoc_insertion_point(interface_extends:HomeSeekFurniturePlayerScore)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>.HomeGroupPlayerInfo player_info = 6;</code>
     * @return Whether the playerInfo field is set.
     */
    boolean hasPlayerInfo();
    /**
     * <code>.HomeGroupPlayerInfo player_info = 6;</code>
     * @return The playerInfo.
     */
    emu.grasscutter.net.proto.HomeGroupPlayerInfoOuterClass.HomeGroupPlayerInfo getPlayerInfo();
    /**
     * <code>.HomeGroupPlayerInfo player_info = 6;</code>
     */
    emu.grasscutter.net.proto.HomeGroupPlayerInfoOuterClass.HomeGroupPlayerInfoOrBuilder getPlayerInfoOrBuilder();

    /**
     * <code>uint32 score = 10;</code>
     * @return The score.
     */
    int getScore();
  }
  /**
   * <pre>
   * Name: PJIPFEBDAFF
   * </pre>
   *
   * Protobuf type {@code HomeSeekFurniturePlayerScore}
   */
  public static final class HomeSeekFurniturePlayerScore extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:HomeSeekFurniturePlayerScore)
      HomeSeekFurniturePlayerScoreOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use HomeSeekFurniturePlayerScore.newBuilder() to construct.
    private HomeSeekFurniturePlayerScore(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private HomeSeekFurniturePlayerScore() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new HomeSeekFurniturePlayerScore();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private HomeSeekFurniturePlayerScore(
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
            case 50: {
              emu.grasscutter.net.proto.HomeGroupPlayerInfoOuterClass.HomeGroupPlayerInfo.Builder subBuilder = null;
              if (playerInfo_ != null) {
                subBuilder = playerInfo_.toBuilder();
              }
              playerInfo_ = input.readMessage(emu.grasscutter.net.proto.HomeGroupPlayerInfoOuterClass.HomeGroupPlayerInfo.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(playerInfo_);
                playerInfo_ = subBuilder.buildPartial();
              }

              break;
            }
            case 80: {

              score_ = input.readUInt32();
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
      return emu.grasscutter.net.proto.HomeSeekFurniturePlayerScoreOuterClass.internal_static_HomeSeekFurniturePlayerScore_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.HomeSeekFurniturePlayerScoreOuterClass.internal_static_HomeSeekFurniturePlayerScore_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.HomeSeekFurniturePlayerScoreOuterClass.HomeSeekFurniturePlayerScore.class, emu.grasscutter.net.proto.HomeSeekFurniturePlayerScoreOuterClass.HomeSeekFurniturePlayerScore.Builder.class);
    }

    public static final int PLAYER_INFO_FIELD_NUMBER = 6;
    private emu.grasscutter.net.proto.HomeGroupPlayerInfoOuterClass.HomeGroupPlayerInfo playerInfo_;
    /**
     * <code>.HomeGroupPlayerInfo player_info = 6;</code>
     * @return Whether the playerInfo field is set.
     */
    @java.lang.Override
    public boolean hasPlayerInfo() {
      return playerInfo_ != null;
    }
    /**
     * <code>.HomeGroupPlayerInfo player_info = 6;</code>
     * @return The playerInfo.
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.HomeGroupPlayerInfoOuterClass.HomeGroupPlayerInfo getPlayerInfo() {
      return playerInfo_ == null ? emu.grasscutter.net.proto.HomeGroupPlayerInfoOuterClass.HomeGroupPlayerInfo.getDefaultInstance() : playerInfo_;
    }
    /**
     * <code>.HomeGroupPlayerInfo player_info = 6;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.HomeGroupPlayerInfoOuterClass.HomeGroupPlayerInfoOrBuilder getPlayerInfoOrBuilder() {
      return getPlayerInfo();
    }

    public static final int SCORE_FIELD_NUMBER = 10;
    private int score_;
    /**
     * <code>uint32 score = 10;</code>
     * @return The score.
     */
    @java.lang.Override
    public int getScore() {
      return score_;
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
      if (playerInfo_ != null) {
        output.writeMessage(6, getPlayerInfo());
      }
      if (score_ != 0) {
        output.writeUInt32(10, score_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (playerInfo_ != null) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(6, getPlayerInfo());
      }
      if (score_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(10, score_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.HomeSeekFurniturePlayerScoreOuterClass.HomeSeekFurniturePlayerScore)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.HomeSeekFurniturePlayerScoreOuterClass.HomeSeekFurniturePlayerScore other = (emu.grasscutter.net.proto.HomeSeekFurniturePlayerScoreOuterClass.HomeSeekFurniturePlayerScore) obj;

      if (hasPlayerInfo() != other.hasPlayerInfo()) return false;
      if (hasPlayerInfo()) {
        if (!getPlayerInfo()
            .equals(other.getPlayerInfo())) return false;
      }
      if (getScore()
          != other.getScore()) return false;
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
      if (hasPlayerInfo()) {
        hash = (37 * hash) + PLAYER_INFO_FIELD_NUMBER;
        hash = (53 * hash) + getPlayerInfo().hashCode();
      }
      hash = (37 * hash) + SCORE_FIELD_NUMBER;
      hash = (53 * hash) + getScore();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.HomeSeekFurniturePlayerScoreOuterClass.HomeSeekFurniturePlayerScore parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.HomeSeekFurniturePlayerScoreOuterClass.HomeSeekFurniturePlayerScore parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.HomeSeekFurniturePlayerScoreOuterClass.HomeSeekFurniturePlayerScore parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.HomeSeekFurniturePlayerScoreOuterClass.HomeSeekFurniturePlayerScore parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.HomeSeekFurniturePlayerScoreOuterClass.HomeSeekFurniturePlayerScore parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.HomeSeekFurniturePlayerScoreOuterClass.HomeSeekFurniturePlayerScore parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.HomeSeekFurniturePlayerScoreOuterClass.HomeSeekFurniturePlayerScore parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.HomeSeekFurniturePlayerScoreOuterClass.HomeSeekFurniturePlayerScore parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.HomeSeekFurniturePlayerScoreOuterClass.HomeSeekFurniturePlayerScore parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.HomeSeekFurniturePlayerScoreOuterClass.HomeSeekFurniturePlayerScore parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.HomeSeekFurniturePlayerScoreOuterClass.HomeSeekFurniturePlayerScore parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.HomeSeekFurniturePlayerScoreOuterClass.HomeSeekFurniturePlayerScore parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.HomeSeekFurniturePlayerScoreOuterClass.HomeSeekFurniturePlayerScore prototype) {
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
     * Name: PJIPFEBDAFF
     * </pre>
     *
     * Protobuf type {@code HomeSeekFurniturePlayerScore}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:HomeSeekFurniturePlayerScore)
        emu.grasscutter.net.proto.HomeSeekFurniturePlayerScoreOuterClass.HomeSeekFurniturePlayerScoreOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.HomeSeekFurniturePlayerScoreOuterClass.internal_static_HomeSeekFurniturePlayerScore_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.HomeSeekFurniturePlayerScoreOuterClass.internal_static_HomeSeekFurniturePlayerScore_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.HomeSeekFurniturePlayerScoreOuterClass.HomeSeekFurniturePlayerScore.class, emu.grasscutter.net.proto.HomeSeekFurniturePlayerScoreOuterClass.HomeSeekFurniturePlayerScore.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.HomeSeekFurniturePlayerScoreOuterClass.HomeSeekFurniturePlayerScore.newBuilder()
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
        if (playerInfoBuilder_ == null) {
          playerInfo_ = null;
        } else {
          playerInfo_ = null;
          playerInfoBuilder_ = null;
        }
        score_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.HomeSeekFurniturePlayerScoreOuterClass.internal_static_HomeSeekFurniturePlayerScore_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.HomeSeekFurniturePlayerScoreOuterClass.HomeSeekFurniturePlayerScore getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.HomeSeekFurniturePlayerScoreOuterClass.HomeSeekFurniturePlayerScore.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.HomeSeekFurniturePlayerScoreOuterClass.HomeSeekFurniturePlayerScore build() {
        emu.grasscutter.net.proto.HomeSeekFurniturePlayerScoreOuterClass.HomeSeekFurniturePlayerScore result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.HomeSeekFurniturePlayerScoreOuterClass.HomeSeekFurniturePlayerScore buildPartial() {
        emu.grasscutter.net.proto.HomeSeekFurniturePlayerScoreOuterClass.HomeSeekFurniturePlayerScore result = new emu.grasscutter.net.proto.HomeSeekFurniturePlayerScoreOuterClass.HomeSeekFurniturePlayerScore(this);
        if (playerInfoBuilder_ == null) {
          result.playerInfo_ = playerInfo_;
        } else {
          result.playerInfo_ = playerInfoBuilder_.build();
        }
        result.score_ = score_;
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
        if (other instanceof emu.grasscutter.net.proto.HomeSeekFurniturePlayerScoreOuterClass.HomeSeekFurniturePlayerScore) {
          return mergeFrom((emu.grasscutter.net.proto.HomeSeekFurniturePlayerScoreOuterClass.HomeSeekFurniturePlayerScore)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.HomeSeekFurniturePlayerScoreOuterClass.HomeSeekFurniturePlayerScore other) {
        if (other == emu.grasscutter.net.proto.HomeSeekFurniturePlayerScoreOuterClass.HomeSeekFurniturePlayerScore.getDefaultInstance()) return this;
        if (other.hasPlayerInfo()) {
          mergePlayerInfo(other.getPlayerInfo());
        }
        if (other.getScore() != 0) {
          setScore(other.getScore());
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
        emu.grasscutter.net.proto.HomeSeekFurniturePlayerScoreOuterClass.HomeSeekFurniturePlayerScore parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.HomeSeekFurniturePlayerScoreOuterClass.HomeSeekFurniturePlayerScore) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private emu.grasscutter.net.proto.HomeGroupPlayerInfoOuterClass.HomeGroupPlayerInfo playerInfo_;
      private com.google.protobuf.SingleFieldBuilderV3<
          emu.grasscutter.net.proto.HomeGroupPlayerInfoOuterClass.HomeGroupPlayerInfo, emu.grasscutter.net.proto.HomeGroupPlayerInfoOuterClass.HomeGroupPlayerInfo.Builder, emu.grasscutter.net.proto.HomeGroupPlayerInfoOuterClass.HomeGroupPlayerInfoOrBuilder> playerInfoBuilder_;
      /**
       * <code>.HomeGroupPlayerInfo player_info = 6;</code>
       * @return Whether the playerInfo field is set.
       */
      public boolean hasPlayerInfo() {
        return playerInfoBuilder_ != null || playerInfo_ != null;
      }
      /**
       * <code>.HomeGroupPlayerInfo player_info = 6;</code>
       * @return The playerInfo.
       */
      public emu.grasscutter.net.proto.HomeGroupPlayerInfoOuterClass.HomeGroupPlayerInfo getPlayerInfo() {
        if (playerInfoBuilder_ == null) {
          return playerInfo_ == null ? emu.grasscutter.net.proto.HomeGroupPlayerInfoOuterClass.HomeGroupPlayerInfo.getDefaultInstance() : playerInfo_;
        } else {
          return playerInfoBuilder_.getMessage();
        }
      }
      /**
       * <code>.HomeGroupPlayerInfo player_info = 6;</code>
       */
      public Builder setPlayerInfo(emu.grasscutter.net.proto.HomeGroupPlayerInfoOuterClass.HomeGroupPlayerInfo value) {
        if (playerInfoBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          playerInfo_ = value;
          onChanged();
        } else {
          playerInfoBuilder_.setMessage(value);
        }

        return this;
      }
      /**
       * <code>.HomeGroupPlayerInfo player_info = 6;</code>
       */
      public Builder setPlayerInfo(
          emu.grasscutter.net.proto.HomeGroupPlayerInfoOuterClass.HomeGroupPlayerInfo.Builder builderForValue) {
        if (playerInfoBuilder_ == null) {
          playerInfo_ = builderForValue.build();
          onChanged();
        } else {
          playerInfoBuilder_.setMessage(builderForValue.build());
        }

        return this;
      }
      /**
       * <code>.HomeGroupPlayerInfo player_info = 6;</code>
       */
      public Builder mergePlayerInfo(emu.grasscutter.net.proto.HomeGroupPlayerInfoOuterClass.HomeGroupPlayerInfo value) {
        if (playerInfoBuilder_ == null) {
          if (playerInfo_ != null) {
            playerInfo_ =
              emu.grasscutter.net.proto.HomeGroupPlayerInfoOuterClass.HomeGroupPlayerInfo.newBuilder(playerInfo_).mergeFrom(value).buildPartial();
          } else {
            playerInfo_ = value;
          }
          onChanged();
        } else {
          playerInfoBuilder_.mergeFrom(value);
        }

        return this;
      }
      /**
       * <code>.HomeGroupPlayerInfo player_info = 6;</code>
       */
      public Builder clearPlayerInfo() {
        if (playerInfoBuilder_ == null) {
          playerInfo_ = null;
          onChanged();
        } else {
          playerInfo_ = null;
          playerInfoBuilder_ = null;
        }

        return this;
      }
      /**
       * <code>.HomeGroupPlayerInfo player_info = 6;</code>
       */
      public emu.grasscutter.net.proto.HomeGroupPlayerInfoOuterClass.HomeGroupPlayerInfo.Builder getPlayerInfoBuilder() {
        
        onChanged();
        return getPlayerInfoFieldBuilder().getBuilder();
      }
      /**
       * <code>.HomeGroupPlayerInfo player_info = 6;</code>
       */
      public emu.grasscutter.net.proto.HomeGroupPlayerInfoOuterClass.HomeGroupPlayerInfoOrBuilder getPlayerInfoOrBuilder() {
        if (playerInfoBuilder_ != null) {
          return playerInfoBuilder_.getMessageOrBuilder();
        } else {
          return playerInfo_ == null ?
              emu.grasscutter.net.proto.HomeGroupPlayerInfoOuterClass.HomeGroupPlayerInfo.getDefaultInstance() : playerInfo_;
        }
      }
      /**
       * <code>.HomeGroupPlayerInfo player_info = 6;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          emu.grasscutter.net.proto.HomeGroupPlayerInfoOuterClass.HomeGroupPlayerInfo, emu.grasscutter.net.proto.HomeGroupPlayerInfoOuterClass.HomeGroupPlayerInfo.Builder, emu.grasscutter.net.proto.HomeGroupPlayerInfoOuterClass.HomeGroupPlayerInfoOrBuilder> 
          getPlayerInfoFieldBuilder() {
        if (playerInfoBuilder_ == null) {
          playerInfoBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              emu.grasscutter.net.proto.HomeGroupPlayerInfoOuterClass.HomeGroupPlayerInfo, emu.grasscutter.net.proto.HomeGroupPlayerInfoOuterClass.HomeGroupPlayerInfo.Builder, emu.grasscutter.net.proto.HomeGroupPlayerInfoOuterClass.HomeGroupPlayerInfoOrBuilder>(
                  getPlayerInfo(),
                  getParentForChildren(),
                  isClean());
          playerInfo_ = null;
        }
        return playerInfoBuilder_;
      }

      private int score_ ;
      /**
       * <code>uint32 score = 10;</code>
       * @return The score.
       */
      @java.lang.Override
      public int getScore() {
        return score_;
      }
      /**
       * <code>uint32 score = 10;</code>
       * @param value The score to set.
       * @return This builder for chaining.
       */
      public Builder setScore(int value) {
        
        score_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 score = 10;</code>
       * @return This builder for chaining.
       */
      public Builder clearScore() {
        
        score_ = 0;
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


      // @@protoc_insertion_point(builder_scope:HomeSeekFurniturePlayerScore)
    }

    // @@protoc_insertion_point(class_scope:HomeSeekFurniturePlayerScore)
    private static final emu.grasscutter.net.proto.HomeSeekFurniturePlayerScoreOuterClass.HomeSeekFurniturePlayerScore DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.HomeSeekFurniturePlayerScoreOuterClass.HomeSeekFurniturePlayerScore();
    }

    public static emu.grasscutter.net.proto.HomeSeekFurniturePlayerScoreOuterClass.HomeSeekFurniturePlayerScore getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<HomeSeekFurniturePlayerScore>
        PARSER = new com.google.protobuf.AbstractParser<HomeSeekFurniturePlayerScore>() {
      @java.lang.Override
      public HomeSeekFurniturePlayerScore parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new HomeSeekFurniturePlayerScore(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<HomeSeekFurniturePlayerScore> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<HomeSeekFurniturePlayerScore> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.HomeSeekFurniturePlayerScoreOuterClass.HomeSeekFurniturePlayerScore getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_HomeSeekFurniturePlayerScore_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_HomeSeekFurniturePlayerScore_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\"HomeSeekFurniturePlayerScore.proto\032\031Ho" +
      "meGroupPlayerInfo.proto\"X\n\034HomeSeekFurni" +
      "turePlayerScore\022)\n\013player_info\030\006 \001(\0132\024.H" +
      "omeGroupPlayerInfo\022\r\n\005score\030\n \001(\rB\033\n\031emu" +
      ".grasscutter.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.grasscutter.net.proto.HomeGroupPlayerInfoOuterClass.getDescriptor(),
        });
    internal_static_HomeSeekFurniturePlayerScore_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_HomeSeekFurniturePlayerScore_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_HomeSeekFurniturePlayerScore_descriptor,
        new java.lang.String[] { "PlayerInfo", "Score", });
    emu.grasscutter.net.proto.HomeGroupPlayerInfoOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}