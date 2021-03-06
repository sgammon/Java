/*
 * Copyright 2017, Bloombox, LLC. All rights reserved.
 *
 * Source and object computer code contained herein is the private intellectual property
 * of Bloombox, a California Limited Liability Corporation. Use of this code in source form
 * requires permission in writing before use or the publishing of derivative works, for
 * commercial purposes or any other purpose, from a duly authorized officer of Momentum
 * Ideas Co.
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: identity/IDMedia.proto

package io.bloombox.schema.identity;

/**
 * <pre>
 * Media attachment that binds some document media to a particular driver's license.
 * </pre>
 *
 * Protobuf type {@code identity.IDMediaAttachment}
 */
public  final class IDMediaAttachment extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:identity.IDMediaAttachment)
    IDMediaAttachmentOrBuilder {
private static final long serialVersionUID = 0L;
  // Use IDMediaAttachment.newBuilder() to construct.
  private IDMediaAttachment(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private IDMediaAttachment() {
    type_ = 0;
    orientation_ = 0;
    data_ = com.google.protobuf.ByteString.EMPTY;
    imageType_ = 0;
    quality_ = 0D;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private IDMediaAttachment(
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
            if (!parseUnknownFieldProto3(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
          case 8: {
            int rawValue = input.readEnum();

            type_ = rawValue;
            break;
          }
          case 16: {
            int rawValue = input.readEnum();

            orientation_ = rawValue;
            break;
          }
          case 26: {

            data_ = input.readBytes();
            break;
          }
          case 32: {

            imageType_ = input.readUInt32();
            break;
          }
          case 41: {

            quality_ = input.readDouble();
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
    return io.bloombox.schema.identity.IDMediaOuterClass.internal_static_identity_IDMediaAttachment_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return io.bloombox.schema.identity.IDMediaOuterClass.internal_static_identity_IDMediaAttachment_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            io.bloombox.schema.identity.IDMediaAttachment.class, io.bloombox.schema.identity.IDMediaAttachment.Builder.class);
  }

  public static final int TYPE_FIELD_NUMBER = 1;
  private int type_;
  /**
   * <code>.identity.IDMedia type = 1;</code>
   */
  public int getTypeValue() {
    return type_;
  }
  /**
   * <code>.identity.IDMedia type = 1;</code>
   */
  public io.bloombox.schema.identity.IDMedia getType() {
    io.bloombox.schema.identity.IDMedia result = io.bloombox.schema.identity.IDMedia.valueOf(type_);
    return result == null ? io.bloombox.schema.identity.IDMedia.UNRECOGNIZED : result;
  }

  public static final int ORIENTATION_FIELD_NUMBER = 2;
  private int orientation_;
  /**
   * <code>.media.MediaOrientation orientation = 2;</code>
   */
  public int getOrientationValue() {
    return orientation_;
  }
  /**
   * <code>.media.MediaOrientation orientation = 2;</code>
   */
  public io.bloombox.schema.media.MediaOrientation getOrientation() {
    io.bloombox.schema.media.MediaOrientation result = io.bloombox.schema.media.MediaOrientation.valueOf(orientation_);
    return result == null ? io.bloombox.schema.media.MediaOrientation.UNRECOGNIZED : result;
  }

  public static final int DATA_FIELD_NUMBER = 3;
  private com.google.protobuf.ByteString data_;
  /**
   * <code>bytes data = 3;</code>
   */
  public com.google.protobuf.ByteString getData() {
    return data_;
  }

  public static final int IMAGE_TYPE_FIELD_NUMBER = 4;
  private int imageType_;
  /**
   * <code>uint32 image_type = 4;</code>
   */
  public int getImageType() {
    return imageType_;
  }

  public static final int QUALITY_FIELD_NUMBER = 5;
  private double quality_;
  /**
   * <code>double quality = 5;</code>
   */
  public double getQuality() {
    return quality_;
  }

  private byte memoizedIsInitialized = -1;
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (type_ != io.bloombox.schema.identity.IDMedia.DOCUMENT_FRONT.getNumber()) {
      output.writeEnum(1, type_);
    }
    if (orientation_ != io.bloombox.schema.media.MediaOrientation.UP.getNumber()) {
      output.writeEnum(2, orientation_);
    }
    if (!data_.isEmpty()) {
      output.writeBytes(3, data_);
    }
    if (imageType_ != 0) {
      output.writeUInt32(4, imageType_);
    }
    if (quality_ != 0D) {
      output.writeDouble(5, quality_);
    }
    unknownFields.writeTo(output);
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (type_ != io.bloombox.schema.identity.IDMedia.DOCUMENT_FRONT.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(1, type_);
    }
    if (orientation_ != io.bloombox.schema.media.MediaOrientation.UP.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(2, orientation_);
    }
    if (!data_.isEmpty()) {
      size += com.google.protobuf.CodedOutputStream
        .computeBytesSize(3, data_);
    }
    if (imageType_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt32Size(4, imageType_);
    }
    if (quality_ != 0D) {
      size += com.google.protobuf.CodedOutputStream
        .computeDoubleSize(5, quality_);
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
    if (!(obj instanceof io.bloombox.schema.identity.IDMediaAttachment)) {
      return super.equals(obj);
    }
    io.bloombox.schema.identity.IDMediaAttachment other = (io.bloombox.schema.identity.IDMediaAttachment) obj;

    boolean result = true;
    result = result && type_ == other.type_;
    result = result && orientation_ == other.orientation_;
    result = result && getData()
        .equals(other.getData());
    result = result && (getImageType()
        == other.getImageType());
    result = result && (
        java.lang.Double.doubleToLongBits(getQuality())
        == java.lang.Double.doubleToLongBits(
            other.getQuality()));
    result = result && unknownFields.equals(other.unknownFields);
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + TYPE_FIELD_NUMBER;
    hash = (53 * hash) + type_;
    hash = (37 * hash) + ORIENTATION_FIELD_NUMBER;
    hash = (53 * hash) + orientation_;
    hash = (37 * hash) + DATA_FIELD_NUMBER;
    hash = (53 * hash) + getData().hashCode();
    hash = (37 * hash) + IMAGE_TYPE_FIELD_NUMBER;
    hash = (53 * hash) + getImageType();
    hash = (37 * hash) + QUALITY_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        java.lang.Double.doubleToLongBits(getQuality()));
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static io.bloombox.schema.identity.IDMediaAttachment parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.bloombox.schema.identity.IDMediaAttachment parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.bloombox.schema.identity.IDMediaAttachment parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.bloombox.schema.identity.IDMediaAttachment parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.bloombox.schema.identity.IDMediaAttachment parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.bloombox.schema.identity.IDMediaAttachment parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.bloombox.schema.identity.IDMediaAttachment parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.bloombox.schema.identity.IDMediaAttachment parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.bloombox.schema.identity.IDMediaAttachment parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static io.bloombox.schema.identity.IDMediaAttachment parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.bloombox.schema.identity.IDMediaAttachment parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.bloombox.schema.identity.IDMediaAttachment parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(io.bloombox.schema.identity.IDMediaAttachment prototype) {
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
   * <pre>
   * Media attachment that binds some document media to a particular driver's license.
   * </pre>
   *
   * Protobuf type {@code identity.IDMediaAttachment}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:identity.IDMediaAttachment)
      io.bloombox.schema.identity.IDMediaAttachmentOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return io.bloombox.schema.identity.IDMediaOuterClass.internal_static_identity_IDMediaAttachment_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.bloombox.schema.identity.IDMediaOuterClass.internal_static_identity_IDMediaAttachment_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.bloombox.schema.identity.IDMediaAttachment.class, io.bloombox.schema.identity.IDMediaAttachment.Builder.class);
    }

    // Construct using io.bloombox.schema.identity.IDMediaAttachment.newBuilder()
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
      type_ = 0;

      orientation_ = 0;

      data_ = com.google.protobuf.ByteString.EMPTY;

      imageType_ = 0;

      quality_ = 0D;

      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return io.bloombox.schema.identity.IDMediaOuterClass.internal_static_identity_IDMediaAttachment_descriptor;
    }

    public io.bloombox.schema.identity.IDMediaAttachment getDefaultInstanceForType() {
      return io.bloombox.schema.identity.IDMediaAttachment.getDefaultInstance();
    }

    public io.bloombox.schema.identity.IDMediaAttachment build() {
      io.bloombox.schema.identity.IDMediaAttachment result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public io.bloombox.schema.identity.IDMediaAttachment buildPartial() {
      io.bloombox.schema.identity.IDMediaAttachment result = new io.bloombox.schema.identity.IDMediaAttachment(this);
      result.type_ = type_;
      result.orientation_ = orientation_;
      result.data_ = data_;
      result.imageType_ = imageType_;
      result.quality_ = quality_;
      onBuilt();
      return result;
    }

    public Builder clone() {
      return (Builder) super.clone();
    }
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
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
        int index, java.lang.Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof io.bloombox.schema.identity.IDMediaAttachment) {
        return mergeFrom((io.bloombox.schema.identity.IDMediaAttachment)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(io.bloombox.schema.identity.IDMediaAttachment other) {
      if (other == io.bloombox.schema.identity.IDMediaAttachment.getDefaultInstance()) return this;
      if (other.type_ != 0) {
        setTypeValue(other.getTypeValue());
      }
      if (other.orientation_ != 0) {
        setOrientationValue(other.getOrientationValue());
      }
      if (other.getData() != com.google.protobuf.ByteString.EMPTY) {
        setData(other.getData());
      }
      if (other.getImageType() != 0) {
        setImageType(other.getImageType());
      }
      if (other.getQuality() != 0D) {
        setQuality(other.getQuality());
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    public final boolean isInitialized() {
      return true;
    }

    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      io.bloombox.schema.identity.IDMediaAttachment parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (io.bloombox.schema.identity.IDMediaAttachment) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int type_ = 0;
    /**
     * <code>.identity.IDMedia type = 1;</code>
     */
    public int getTypeValue() {
      return type_;
    }
    /**
     * <code>.identity.IDMedia type = 1;</code>
     */
    public Builder setTypeValue(int value) {
      type_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>.identity.IDMedia type = 1;</code>
     */
    public io.bloombox.schema.identity.IDMedia getType() {
      io.bloombox.schema.identity.IDMedia result = io.bloombox.schema.identity.IDMedia.valueOf(type_);
      return result == null ? io.bloombox.schema.identity.IDMedia.UNRECOGNIZED : result;
    }
    /**
     * <code>.identity.IDMedia type = 1;</code>
     */
    public Builder setType(io.bloombox.schema.identity.IDMedia value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      type_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.identity.IDMedia type = 1;</code>
     */
    public Builder clearType() {
      
      type_ = 0;
      onChanged();
      return this;
    }

    private int orientation_ = 0;
    /**
     * <code>.media.MediaOrientation orientation = 2;</code>
     */
    public int getOrientationValue() {
      return orientation_;
    }
    /**
     * <code>.media.MediaOrientation orientation = 2;</code>
     */
    public Builder setOrientationValue(int value) {
      orientation_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>.media.MediaOrientation orientation = 2;</code>
     */
    public io.bloombox.schema.media.MediaOrientation getOrientation() {
      io.bloombox.schema.media.MediaOrientation result = io.bloombox.schema.media.MediaOrientation.valueOf(orientation_);
      return result == null ? io.bloombox.schema.media.MediaOrientation.UNRECOGNIZED : result;
    }
    /**
     * <code>.media.MediaOrientation orientation = 2;</code>
     */
    public Builder setOrientation(io.bloombox.schema.media.MediaOrientation value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      orientation_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.media.MediaOrientation orientation = 2;</code>
     */
    public Builder clearOrientation() {
      
      orientation_ = 0;
      onChanged();
      return this;
    }

    private com.google.protobuf.ByteString data_ = com.google.protobuf.ByteString.EMPTY;
    /**
     * <code>bytes data = 3;</code>
     */
    public com.google.protobuf.ByteString getData() {
      return data_;
    }
    /**
     * <code>bytes data = 3;</code>
     */
    public Builder setData(com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      data_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>bytes data = 3;</code>
     */
    public Builder clearData() {
      
      data_ = getDefaultInstance().getData();
      onChanged();
      return this;
    }

    private int imageType_ ;
    /**
     * <code>uint32 image_type = 4;</code>
     */
    public int getImageType() {
      return imageType_;
    }
    /**
     * <code>uint32 image_type = 4;</code>
     */
    public Builder setImageType(int value) {
      
      imageType_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>uint32 image_type = 4;</code>
     */
    public Builder clearImageType() {
      
      imageType_ = 0;
      onChanged();
      return this;
    }

    private double quality_ ;
    /**
     * <code>double quality = 5;</code>
     */
    public double getQuality() {
      return quality_;
    }
    /**
     * <code>double quality = 5;</code>
     */
    public Builder setQuality(double value) {
      
      quality_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>double quality = 5;</code>
     */
    public Builder clearQuality() {
      
      quality_ = 0D;
      onChanged();
      return this;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFieldsProto3(unknownFields);
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:identity.IDMediaAttachment)
  }

  // @@protoc_insertion_point(class_scope:identity.IDMediaAttachment)
  private static final io.bloombox.schema.identity.IDMediaAttachment DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new io.bloombox.schema.identity.IDMediaAttachment();
  }

  public static io.bloombox.schema.identity.IDMediaAttachment getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<IDMediaAttachment>
      PARSER = new com.google.protobuf.AbstractParser<IDMediaAttachment>() {
    public IDMediaAttachment parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return new IDMediaAttachment(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<IDMediaAttachment> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<IDMediaAttachment> getParserForType() {
    return PARSER;
  }

  public io.bloombox.schema.identity.IDMediaAttachment getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

