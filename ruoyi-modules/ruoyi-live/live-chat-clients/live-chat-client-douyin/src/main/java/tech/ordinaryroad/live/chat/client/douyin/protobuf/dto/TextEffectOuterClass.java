/*
 * MIT License
 *
 * Copyright (c) 2023 OrdinaryRoad
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */

// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: TextEffect.proto

package tech.ordinaryroad.live.chat.client.douyin.protobuf.dto;

public final class TextEffectOuterClass {
  private TextEffectOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface TextEffectOrBuilder extends
      // @@protoc_insertion_point(interface_extends:TextEffect)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>.TextEffectDetail portrait = 1;</code>
     * @return Whether the portrait field is set.
     */
    boolean hasPortrait();
    /**
     * <code>.TextEffectDetail portrait = 1;</code>
     * @return The portrait.
     */
    tech.ordinaryroad.live.chat.client.douyin.protobuf.dto.TextEffectDetailOuterClass.TextEffectDetail getPortrait();
    /**
     * <code>.TextEffectDetail portrait = 1;</code>
     */
    tech.ordinaryroad.live.chat.client.douyin.protobuf.dto.TextEffectDetailOuterClass.TextEffectDetailOrBuilder getPortraitOrBuilder();

    /**
     * <code>.TextEffectDetail landscape = 2;</code>
     * @return Whether the landscape field is set.
     */
    boolean hasLandscape();
    /**
     * <code>.TextEffectDetail landscape = 2;</code>
     * @return The landscape.
     */
    tech.ordinaryroad.live.chat.client.douyin.protobuf.dto.TextEffectDetailOuterClass.TextEffectDetail getLandscape();
    /**
     * <code>.TextEffectDetail landscape = 2;</code>
     */
    tech.ordinaryroad.live.chat.client.douyin.protobuf.dto.TextEffectDetailOuterClass.TextEffectDetailOrBuilder getLandscapeOrBuilder();
  }
  /**
   * Protobuf type {@code TextEffect}
   */
  public static final class TextEffect extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:TextEffect)
      TextEffectOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use TextEffect.newBuilder() to construct.
    private TextEffect(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private TextEffect() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new TextEffect();
    }

    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return tech.ordinaryroad.live.chat.client.douyin.protobuf.dto.TextEffectOuterClass.internal_static_TextEffect_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return tech.ordinaryroad.live.chat.client.douyin.protobuf.dto.TextEffectOuterClass.internal_static_TextEffect_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              tech.ordinaryroad.live.chat.client.douyin.protobuf.dto.TextEffectOuterClass.TextEffect.class, tech.ordinaryroad.live.chat.client.douyin.protobuf.dto.TextEffectOuterClass.TextEffect.Builder.class);
    }

    public static final int PORTRAIT_FIELD_NUMBER = 1;
    private tech.ordinaryroad.live.chat.client.douyin.protobuf.dto.TextEffectDetailOuterClass.TextEffectDetail portrait_;
    /**
     * <code>.TextEffectDetail portrait = 1;</code>
     * @return Whether the portrait field is set.
     */
    @java.lang.Override
    public boolean hasPortrait() {
      return portrait_ != null;
    }
    /**
     * <code>.TextEffectDetail portrait = 1;</code>
     * @return The portrait.
     */
    @java.lang.Override
    public tech.ordinaryroad.live.chat.client.douyin.protobuf.dto.TextEffectDetailOuterClass.TextEffectDetail getPortrait() {
      return portrait_ == null ? tech.ordinaryroad.live.chat.client.douyin.protobuf.dto.TextEffectDetailOuterClass.TextEffectDetail.getDefaultInstance() : portrait_;
    }
    /**
     * <code>.TextEffectDetail portrait = 1;</code>
     */
    @java.lang.Override
    public tech.ordinaryroad.live.chat.client.douyin.protobuf.dto.TextEffectDetailOuterClass.TextEffectDetailOrBuilder getPortraitOrBuilder() {
      return portrait_ == null ? tech.ordinaryroad.live.chat.client.douyin.protobuf.dto.TextEffectDetailOuterClass.TextEffectDetail.getDefaultInstance() : portrait_;
    }

    public static final int LANDSCAPE_FIELD_NUMBER = 2;
    private tech.ordinaryroad.live.chat.client.douyin.protobuf.dto.TextEffectDetailOuterClass.TextEffectDetail landscape_;
    /**
     * <code>.TextEffectDetail landscape = 2;</code>
     * @return Whether the landscape field is set.
     */
    @java.lang.Override
    public boolean hasLandscape() {
      return landscape_ != null;
    }
    /**
     * <code>.TextEffectDetail landscape = 2;</code>
     * @return The landscape.
     */
    @java.lang.Override
    public tech.ordinaryroad.live.chat.client.douyin.protobuf.dto.TextEffectDetailOuterClass.TextEffectDetail getLandscape() {
      return landscape_ == null ? tech.ordinaryroad.live.chat.client.douyin.protobuf.dto.TextEffectDetailOuterClass.TextEffectDetail.getDefaultInstance() : landscape_;
    }
    /**
     * <code>.TextEffectDetail landscape = 2;</code>
     */
    @java.lang.Override
    public tech.ordinaryroad.live.chat.client.douyin.protobuf.dto.TextEffectDetailOuterClass.TextEffectDetailOrBuilder getLandscapeOrBuilder() {
      return landscape_ == null ? tech.ordinaryroad.live.chat.client.douyin.protobuf.dto.TextEffectDetailOuterClass.TextEffectDetail.getDefaultInstance() : landscape_;
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
      if (portrait_ != null) {
        output.writeMessage(1, getPortrait());
      }
      if (landscape_ != null) {
        output.writeMessage(2, getLandscape());
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (portrait_ != null) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(1, getPortrait());
      }
      if (landscape_ != null) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(2, getLandscape());
      }
      size += getUnknownFields().getSerializedSize();
      memoizedSize = size;
      return size;
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof tech.ordinaryroad.live.chat.client.douyin.protobuf.dto.TextEffectOuterClass.TextEffect)) {
        return super.equals(obj);
      }
      tech.ordinaryroad.live.chat.client.douyin.protobuf.dto.TextEffectOuterClass.TextEffect other = (tech.ordinaryroad.live.chat.client.douyin.protobuf.dto.TextEffectOuterClass.TextEffect) obj;

      if (hasPortrait() != other.hasPortrait()) return false;
      if (hasPortrait()) {
        if (!getPortrait()
            .equals(other.getPortrait())) return false;
      }
      if (hasLandscape() != other.hasLandscape()) return false;
      if (hasLandscape()) {
        if (!getLandscape()
            .equals(other.getLandscape())) return false;
      }
      if (!getUnknownFields().equals(other.getUnknownFields())) return false;
      return true;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      if (hasPortrait()) {
        hash = (37 * hash) + PORTRAIT_FIELD_NUMBER;
        hash = (53 * hash) + getPortrait().hashCode();
      }
      if (hasLandscape()) {
        hash = (37 * hash) + LANDSCAPE_FIELD_NUMBER;
        hash = (53 * hash) + getLandscape().hashCode();
      }
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static tech.ordinaryroad.live.chat.client.douyin.protobuf.dto.TextEffectOuterClass.TextEffect parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static tech.ordinaryroad.live.chat.client.douyin.protobuf.dto.TextEffectOuterClass.TextEffect parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static tech.ordinaryroad.live.chat.client.douyin.protobuf.dto.TextEffectOuterClass.TextEffect parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static tech.ordinaryroad.live.chat.client.douyin.protobuf.dto.TextEffectOuterClass.TextEffect parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static tech.ordinaryroad.live.chat.client.douyin.protobuf.dto.TextEffectOuterClass.TextEffect parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static tech.ordinaryroad.live.chat.client.douyin.protobuf.dto.TextEffectOuterClass.TextEffect parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static tech.ordinaryroad.live.chat.client.douyin.protobuf.dto.TextEffectOuterClass.TextEffect parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static tech.ordinaryroad.live.chat.client.douyin.protobuf.dto.TextEffectOuterClass.TextEffect parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    public static tech.ordinaryroad.live.chat.client.douyin.protobuf.dto.TextEffectOuterClass.TextEffect parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }

    public static tech.ordinaryroad.live.chat.client.douyin.protobuf.dto.TextEffectOuterClass.TextEffect parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static tech.ordinaryroad.live.chat.client.douyin.protobuf.dto.TextEffectOuterClass.TextEffect parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static tech.ordinaryroad.live.chat.client.douyin.protobuf.dto.TextEffectOuterClass.TextEffect parseFrom(
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
    public static Builder newBuilder(tech.ordinaryroad.live.chat.client.douyin.protobuf.dto.TextEffectOuterClass.TextEffect prototype) {
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
     * Protobuf type {@code TextEffect}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:TextEffect)
        tech.ordinaryroad.live.chat.client.douyin.protobuf.dto.TextEffectOuterClass.TextEffectOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return tech.ordinaryroad.live.chat.client.douyin.protobuf.dto.TextEffectOuterClass.internal_static_TextEffect_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return tech.ordinaryroad.live.chat.client.douyin.protobuf.dto.TextEffectOuterClass.internal_static_TextEffect_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                tech.ordinaryroad.live.chat.client.douyin.protobuf.dto.TextEffectOuterClass.TextEffect.class, tech.ordinaryroad.live.chat.client.douyin.protobuf.dto.TextEffectOuterClass.TextEffect.Builder.class);
      }

      // Construct using tech.ordinaryroad.live.chat.client.douyin.protobuf.dto.TextEffectOuterClass.TextEffect.newBuilder()
      private Builder() {

      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);

      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        bitField0_ = 0;
        portrait_ = null;
        if (portraitBuilder_ != null) {
          portraitBuilder_.dispose();
          portraitBuilder_ = null;
        }
        landscape_ = null;
        if (landscapeBuilder_ != null) {
          landscapeBuilder_.dispose();
          landscapeBuilder_ = null;
        }
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return tech.ordinaryroad.live.chat.client.douyin.protobuf.dto.TextEffectOuterClass.internal_static_TextEffect_descriptor;
      }

      @java.lang.Override
      public tech.ordinaryroad.live.chat.client.douyin.protobuf.dto.TextEffectOuterClass.TextEffect getDefaultInstanceForType() {
        return tech.ordinaryroad.live.chat.client.douyin.protobuf.dto.TextEffectOuterClass.TextEffect.getDefaultInstance();
      }

      @java.lang.Override
      public tech.ordinaryroad.live.chat.client.douyin.protobuf.dto.TextEffectOuterClass.TextEffect build() {
        tech.ordinaryroad.live.chat.client.douyin.protobuf.dto.TextEffectOuterClass.TextEffect result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public tech.ordinaryroad.live.chat.client.douyin.protobuf.dto.TextEffectOuterClass.TextEffect buildPartial() {
        tech.ordinaryroad.live.chat.client.douyin.protobuf.dto.TextEffectOuterClass.TextEffect result = new tech.ordinaryroad.live.chat.client.douyin.protobuf.dto.TextEffectOuterClass.TextEffect(this);
        if (bitField0_ != 0) { buildPartial0(result); }
        onBuilt();
        return result;
      }

      private void buildPartial0(tech.ordinaryroad.live.chat.client.douyin.protobuf.dto.TextEffectOuterClass.TextEffect result) {
        int from_bitField0_ = bitField0_;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          result.portrait_ = portraitBuilder_ == null
              ? portrait_
              : portraitBuilder_.build();
        }
        if (((from_bitField0_ & 0x00000002) != 0)) {
          result.landscape_ = landscapeBuilder_ == null
              ? landscape_
              : landscapeBuilder_.build();
        }
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
        if (other instanceof tech.ordinaryroad.live.chat.client.douyin.protobuf.dto.TextEffectOuterClass.TextEffect) {
          return mergeFrom((tech.ordinaryroad.live.chat.client.douyin.protobuf.dto.TextEffectOuterClass.TextEffect)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(tech.ordinaryroad.live.chat.client.douyin.protobuf.dto.TextEffectOuterClass.TextEffect other) {
        if (other == tech.ordinaryroad.live.chat.client.douyin.protobuf.dto.TextEffectOuterClass.TextEffect.getDefaultInstance()) return this;
        if (other.hasPortrait()) {
          mergePortrait(other.getPortrait());
        }
        if (other.hasLandscape()) {
          mergeLandscape(other.getLandscape());
        }
        this.mergeUnknownFields(other.getUnknownFields());
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
        if (extensionRegistry == null) {
          throw new java.lang.NullPointerException();
        }
        try {
          boolean done = false;
          while (!done) {
            int tag = input.readTag();
            switch (tag) {
              case 0:
                done = true;
                break;
              case 10: {
                input.readMessage(
                    getPortraitFieldBuilder().getBuilder(),
                    extensionRegistry);
                bitField0_ |= 0x00000001;
                break;
              } // case 10
              case 18: {
                input.readMessage(
                    getLandscapeFieldBuilder().getBuilder(),
                    extensionRegistry);
                bitField0_ |= 0x00000002;
                break;
              } // case 18
              default: {
                if (!super.parseUnknownField(input, extensionRegistry, tag)) {
                  done = true; // was an endgroup tag
                }
                break;
              } // default:
            } // switch (tag)
          } // while (!done)
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          throw e.unwrapIOException();
        } finally {
          onChanged();
        } // finally
        return this;
      }
      private int bitField0_;

      private tech.ordinaryroad.live.chat.client.douyin.protobuf.dto.TextEffectDetailOuterClass.TextEffectDetail portrait_;
      private com.google.protobuf.SingleFieldBuilderV3<
          tech.ordinaryroad.live.chat.client.douyin.protobuf.dto.TextEffectDetailOuterClass.TextEffectDetail, tech.ordinaryroad.live.chat.client.douyin.protobuf.dto.TextEffectDetailOuterClass.TextEffectDetail.Builder, tech.ordinaryroad.live.chat.client.douyin.protobuf.dto.TextEffectDetailOuterClass.TextEffectDetailOrBuilder> portraitBuilder_;
      /**
       * <code>.TextEffectDetail portrait = 1;</code>
       * @return Whether the portrait field is set.
       */
      public boolean hasPortrait() {
        return ((bitField0_ & 0x00000001) != 0);
      }
      /**
       * <code>.TextEffectDetail portrait = 1;</code>
       * @return The portrait.
       */
      public tech.ordinaryroad.live.chat.client.douyin.protobuf.dto.TextEffectDetailOuterClass.TextEffectDetail getPortrait() {
        if (portraitBuilder_ == null) {
          return portrait_ == null ? tech.ordinaryroad.live.chat.client.douyin.protobuf.dto.TextEffectDetailOuterClass.TextEffectDetail.getDefaultInstance() : portrait_;
        } else {
          return portraitBuilder_.getMessage();
        }
      }
      /**
       * <code>.TextEffectDetail portrait = 1;</code>
       */
      public Builder setPortrait(tech.ordinaryroad.live.chat.client.douyin.protobuf.dto.TextEffectDetailOuterClass.TextEffectDetail value) {
        if (portraitBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          portrait_ = value;
        } else {
          portraitBuilder_.setMessage(value);
        }
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <code>.TextEffectDetail portrait = 1;</code>
       */
      public Builder setPortrait(
          tech.ordinaryroad.live.chat.client.douyin.protobuf.dto.TextEffectDetailOuterClass.TextEffectDetail.Builder builderForValue) {
        if (portraitBuilder_ == null) {
          portrait_ = builderForValue.build();
        } else {
          portraitBuilder_.setMessage(builderForValue.build());
        }
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <code>.TextEffectDetail portrait = 1;</code>
       */
      public Builder mergePortrait(tech.ordinaryroad.live.chat.client.douyin.protobuf.dto.TextEffectDetailOuterClass.TextEffectDetail value) {
        if (portraitBuilder_ == null) {
          if (((bitField0_ & 0x00000001) != 0) &&
            portrait_ != null &&
            portrait_ != tech.ordinaryroad.live.chat.client.douyin.protobuf.dto.TextEffectDetailOuterClass.TextEffectDetail.getDefaultInstance()) {
            getPortraitBuilder().mergeFrom(value);
          } else {
            portrait_ = value;
          }
        } else {
          portraitBuilder_.mergeFrom(value);
        }
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <code>.TextEffectDetail portrait = 1;</code>
       */
      public Builder clearPortrait() {
        bitField0_ = (bitField0_ & ~0x00000001);
        portrait_ = null;
        if (portraitBuilder_ != null) {
          portraitBuilder_.dispose();
          portraitBuilder_ = null;
        }
        onChanged();
        return this;
      }
      /**
       * <code>.TextEffectDetail portrait = 1;</code>
       */
      public tech.ordinaryroad.live.chat.client.douyin.protobuf.dto.TextEffectDetailOuterClass.TextEffectDetail.Builder getPortraitBuilder() {
        bitField0_ |= 0x00000001;
        onChanged();
        return getPortraitFieldBuilder().getBuilder();
      }
      /**
       * <code>.TextEffectDetail portrait = 1;</code>
       */
      public tech.ordinaryroad.live.chat.client.douyin.protobuf.dto.TextEffectDetailOuterClass.TextEffectDetailOrBuilder getPortraitOrBuilder() {
        if (portraitBuilder_ != null) {
          return portraitBuilder_.getMessageOrBuilder();
        } else {
          return portrait_ == null ?
              tech.ordinaryroad.live.chat.client.douyin.protobuf.dto.TextEffectDetailOuterClass.TextEffectDetail.getDefaultInstance() : portrait_;
        }
      }
      /**
       * <code>.TextEffectDetail portrait = 1;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          tech.ordinaryroad.live.chat.client.douyin.protobuf.dto.TextEffectDetailOuterClass.TextEffectDetail, tech.ordinaryroad.live.chat.client.douyin.protobuf.dto.TextEffectDetailOuterClass.TextEffectDetail.Builder, tech.ordinaryroad.live.chat.client.douyin.protobuf.dto.TextEffectDetailOuterClass.TextEffectDetailOrBuilder> 
          getPortraitFieldBuilder() {
        if (portraitBuilder_ == null) {
          portraitBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              tech.ordinaryroad.live.chat.client.douyin.protobuf.dto.TextEffectDetailOuterClass.TextEffectDetail, tech.ordinaryroad.live.chat.client.douyin.protobuf.dto.TextEffectDetailOuterClass.TextEffectDetail.Builder, tech.ordinaryroad.live.chat.client.douyin.protobuf.dto.TextEffectDetailOuterClass.TextEffectDetailOrBuilder>(
                  getPortrait(),
                  getParentForChildren(),
                  isClean());
          portrait_ = null;
        }
        return portraitBuilder_;
      }

      private tech.ordinaryroad.live.chat.client.douyin.protobuf.dto.TextEffectDetailOuterClass.TextEffectDetail landscape_;
      private com.google.protobuf.SingleFieldBuilderV3<
          tech.ordinaryroad.live.chat.client.douyin.protobuf.dto.TextEffectDetailOuterClass.TextEffectDetail, tech.ordinaryroad.live.chat.client.douyin.protobuf.dto.TextEffectDetailOuterClass.TextEffectDetail.Builder, tech.ordinaryroad.live.chat.client.douyin.protobuf.dto.TextEffectDetailOuterClass.TextEffectDetailOrBuilder> landscapeBuilder_;
      /**
       * <code>.TextEffectDetail landscape = 2;</code>
       * @return Whether the landscape field is set.
       */
      public boolean hasLandscape() {
        return ((bitField0_ & 0x00000002) != 0);
      }
      /**
       * <code>.TextEffectDetail landscape = 2;</code>
       * @return The landscape.
       */
      public tech.ordinaryroad.live.chat.client.douyin.protobuf.dto.TextEffectDetailOuterClass.TextEffectDetail getLandscape() {
        if (landscapeBuilder_ == null) {
          return landscape_ == null ? tech.ordinaryroad.live.chat.client.douyin.protobuf.dto.TextEffectDetailOuterClass.TextEffectDetail.getDefaultInstance() : landscape_;
        } else {
          return landscapeBuilder_.getMessage();
        }
      }
      /**
       * <code>.TextEffectDetail landscape = 2;</code>
       */
      public Builder setLandscape(tech.ordinaryroad.live.chat.client.douyin.protobuf.dto.TextEffectDetailOuterClass.TextEffectDetail value) {
        if (landscapeBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          landscape_ = value;
        } else {
          landscapeBuilder_.setMessage(value);
        }
        bitField0_ |= 0x00000002;
        onChanged();
        return this;
      }
      /**
       * <code>.TextEffectDetail landscape = 2;</code>
       */
      public Builder setLandscape(
          tech.ordinaryroad.live.chat.client.douyin.protobuf.dto.TextEffectDetailOuterClass.TextEffectDetail.Builder builderForValue) {
        if (landscapeBuilder_ == null) {
          landscape_ = builderForValue.build();
        } else {
          landscapeBuilder_.setMessage(builderForValue.build());
        }
        bitField0_ |= 0x00000002;
        onChanged();
        return this;
      }
      /**
       * <code>.TextEffectDetail landscape = 2;</code>
       */
      public Builder mergeLandscape(tech.ordinaryroad.live.chat.client.douyin.protobuf.dto.TextEffectDetailOuterClass.TextEffectDetail value) {
        if (landscapeBuilder_ == null) {
          if (((bitField0_ & 0x00000002) != 0) &&
            landscape_ != null &&
            landscape_ != tech.ordinaryroad.live.chat.client.douyin.protobuf.dto.TextEffectDetailOuterClass.TextEffectDetail.getDefaultInstance()) {
            getLandscapeBuilder().mergeFrom(value);
          } else {
            landscape_ = value;
          }
        } else {
          landscapeBuilder_.mergeFrom(value);
        }
        bitField0_ |= 0x00000002;
        onChanged();
        return this;
      }
      /**
       * <code>.TextEffectDetail landscape = 2;</code>
       */
      public Builder clearLandscape() {
        bitField0_ = (bitField0_ & ~0x00000002);
        landscape_ = null;
        if (landscapeBuilder_ != null) {
          landscapeBuilder_.dispose();
          landscapeBuilder_ = null;
        }
        onChanged();
        return this;
      }
      /**
       * <code>.TextEffectDetail landscape = 2;</code>
       */
      public tech.ordinaryroad.live.chat.client.douyin.protobuf.dto.TextEffectDetailOuterClass.TextEffectDetail.Builder getLandscapeBuilder() {
        bitField0_ |= 0x00000002;
        onChanged();
        return getLandscapeFieldBuilder().getBuilder();
      }
      /**
       * <code>.TextEffectDetail landscape = 2;</code>
       */
      public tech.ordinaryroad.live.chat.client.douyin.protobuf.dto.TextEffectDetailOuterClass.TextEffectDetailOrBuilder getLandscapeOrBuilder() {
        if (landscapeBuilder_ != null) {
          return landscapeBuilder_.getMessageOrBuilder();
        } else {
          return landscape_ == null ?
              tech.ordinaryroad.live.chat.client.douyin.protobuf.dto.TextEffectDetailOuterClass.TextEffectDetail.getDefaultInstance() : landscape_;
        }
      }
      /**
       * <code>.TextEffectDetail landscape = 2;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          tech.ordinaryroad.live.chat.client.douyin.protobuf.dto.TextEffectDetailOuterClass.TextEffectDetail, tech.ordinaryroad.live.chat.client.douyin.protobuf.dto.TextEffectDetailOuterClass.TextEffectDetail.Builder, tech.ordinaryroad.live.chat.client.douyin.protobuf.dto.TextEffectDetailOuterClass.TextEffectDetailOrBuilder> 
          getLandscapeFieldBuilder() {
        if (landscapeBuilder_ == null) {
          landscapeBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              tech.ordinaryroad.live.chat.client.douyin.protobuf.dto.TextEffectDetailOuterClass.TextEffectDetail, tech.ordinaryroad.live.chat.client.douyin.protobuf.dto.TextEffectDetailOuterClass.TextEffectDetail.Builder, tech.ordinaryroad.live.chat.client.douyin.protobuf.dto.TextEffectDetailOuterClass.TextEffectDetailOrBuilder>(
                  getLandscape(),
                  getParentForChildren(),
                  isClean());
          landscape_ = null;
        }
        return landscapeBuilder_;
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


      // @@protoc_insertion_point(builder_scope:TextEffect)
    }

    // @@protoc_insertion_point(class_scope:TextEffect)
    private static final tech.ordinaryroad.live.chat.client.douyin.protobuf.dto.TextEffectOuterClass.TextEffect DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new tech.ordinaryroad.live.chat.client.douyin.protobuf.dto.TextEffectOuterClass.TextEffect();
    }

    public static tech.ordinaryroad.live.chat.client.douyin.protobuf.dto.TextEffectOuterClass.TextEffect getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<TextEffect>
        PARSER = new com.google.protobuf.AbstractParser<TextEffect>() {
      @java.lang.Override
      public TextEffect parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        Builder builder = newBuilder();
        try {
          builder.mergeFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          throw e.setUnfinishedMessage(builder.buildPartial());
        } catch (com.google.protobuf.UninitializedMessageException e) {
          throw e.asInvalidProtocolBufferException().setUnfinishedMessage(builder.buildPartial());
        } catch (java.io.IOException e) {
          throw new com.google.protobuf.InvalidProtocolBufferException(e)
              .setUnfinishedMessage(builder.buildPartial());
        }
        return builder.buildPartial();
      }
    };

    public static com.google.protobuf.Parser<TextEffect> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<TextEffect> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public tech.ordinaryroad.live.chat.client.douyin.protobuf.dto.TextEffectOuterClass.TextEffect getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_TextEffect_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_TextEffect_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\020TextEffect.proto\032\026TextEffectDetail.pro" +
      "to\"W\n\nTextEffect\022#\n\010portrait\030\001 \001(\0132\021.Tex" +
      "tEffectDetail\022$\n\tlandscape\030\002 \001(\0132\021.TextE" +
      "ffectDetailB8\n6tech.ordinaryroad.live.ch" +
      "at.client.douyin.protobuf.dtob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          tech.ordinaryroad.live.chat.client.douyin.protobuf.dto.TextEffectDetailOuterClass.getDescriptor(),
        });
    internal_static_TextEffect_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_TextEffect_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_TextEffect_descriptor,
        new java.lang.String[] { "Portrait", "Landscape", });
    tech.ordinaryroad.live.chat.client.douyin.protobuf.dto.TextEffectDetailOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
