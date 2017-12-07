/*
 * Copyright 2017, Bloombox, LLC.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: identity/ids/USDL.proto

package io.bloombox.schema.identity.ids;

/**
 * <pre>
 * Specifies an individual raw field value read or scanned from a United States Driver's License.
 * </pre>
 *
 * Protobuf type {@code identity.ids.USDLFieldValue}
 */
public  final class USDLFieldValue extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:identity.ids.USDLFieldValue)
    USDLFieldValueOrBuilder {
private static final long serialVersionUID = 0L;
  // Use USDLFieldValue.newBuilder() to construct.
  private USDLFieldValue(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private USDLFieldValue() {
    field_ = 0;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private USDLFieldValue(
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

            field_ = rawValue;
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();
            dataCase_ = 2;
            data_ = s;
            break;
          }
          case 26: {
            dataCase_ = 3;
            data_ = input.readBytes();
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
    return io.bloombox.schema.identity.ids.USDLOuterClass.internal_static_identity_ids_USDLFieldValue_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return io.bloombox.schema.identity.ids.USDLOuterClass.internal_static_identity_ids_USDLFieldValue_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            io.bloombox.schema.identity.ids.USDLFieldValue.class, io.bloombox.schema.identity.ids.USDLFieldValue.Builder.class);
  }

  private int dataCase_ = 0;
  private java.lang.Object data_;
  public enum DataCase
      implements com.google.protobuf.Internal.EnumLite {
    VALUE(2),
    RAW_VALUE(3),
    DATA_NOT_SET(0);
    private final int value;
    private DataCase(int value) {
      this.value = value;
    }
    /**
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static DataCase valueOf(int value) {
      return forNumber(value);
    }

    public static DataCase forNumber(int value) {
      switch (value) {
        case 2: return VALUE;
        case 3: return RAW_VALUE;
        case 0: return DATA_NOT_SET;
        default: return null;
      }
    }
    public int getNumber() {
      return this.value;
    }
  };

  public DataCase
  getDataCase() {
    return DataCase.forNumber(
        dataCase_);
  }

  public static final int FIELD_FIELD_NUMBER = 1;
  private int field_;
  /**
   * <pre>
   * Field that we are storing data for.
   * </pre>
   *
   * <code>.identity.ids.USDLField field = 1;</code>
   */
  public int getFieldValue() {
    return field_;
  }
  /**
   * <pre>
   * Field that we are storing data for.
   * </pre>
   *
   * <code>.identity.ids.USDLField field = 1;</code>
   */
  public io.bloombox.schema.identity.ids.USDLField getField() {
    io.bloombox.schema.identity.ids.USDLField result = io.bloombox.schema.identity.ids.USDLField.valueOf(field_);
    return result == null ? io.bloombox.schema.identity.ids.USDLField.UNRECOGNIZED : result;
  }

  public static final int VALUE_FIELD_NUMBER = 2;
  /**
   * <pre>
   * String data for this field.
   * </pre>
   *
   * <code>string value = 2;</code>
   */
  public java.lang.String getValue() {
    java.lang.Object ref = "";
    if (dataCase_ == 2) {
      ref = data_;
    }
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      if (dataCase_ == 2) {
        data_ = s;
      }
      return s;
    }
  }
  /**
   * <pre>
   * String data for this field.
   * </pre>
   *
   * <code>string value = 2;</code>
   */
  public com.google.protobuf.ByteString
      getValueBytes() {
    java.lang.Object ref = "";
    if (dataCase_ == 2) {
      ref = data_;
    }
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      if (dataCase_ == 2) {
        data_ = b;
      }
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int RAW_VALUE_FIELD_NUMBER = 3;
  /**
   * <pre>
   * Byte data for this field.
   * </pre>
   *
   * <code>bytes raw_value = 3;</code>
   */
  public com.google.protobuf.ByteString getRawValue() {
    if (dataCase_ == 3) {
      return (com.google.protobuf.ByteString) data_;
    }
    return com.google.protobuf.ByteString.EMPTY;
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
    if (field_ != io.bloombox.schema.identity.ids.USDLField.BACK_BARCODE.getNumber()) {
      output.writeEnum(1, field_);
    }
    if (dataCase_ == 2) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, data_);
    }
    if (dataCase_ == 3) {
      output.writeBytes(
          3, (com.google.protobuf.ByteString) data_);
    }
    unknownFields.writeTo(output);
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (field_ != io.bloombox.schema.identity.ids.USDLField.BACK_BARCODE.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(1, field_);
    }
    if (dataCase_ == 2) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, data_);
    }
    if (dataCase_ == 3) {
      size += com.google.protobuf.CodedOutputStream
        .computeBytesSize(
            3, (com.google.protobuf.ByteString) data_);
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
    if (!(obj instanceof io.bloombox.schema.identity.ids.USDLFieldValue)) {
      return super.equals(obj);
    }
    io.bloombox.schema.identity.ids.USDLFieldValue other = (io.bloombox.schema.identity.ids.USDLFieldValue) obj;

    boolean result = true;
    result = result && field_ == other.field_;
    result = result && getDataCase().equals(
        other.getDataCase());
    if (!result) return false;
    switch (dataCase_) {
      case 2:
        result = result && getValue()
            .equals(other.getValue());
        break;
      case 3:
        result = result && getRawValue()
            .equals(other.getRawValue());
        break;
      case 0:
      default:
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
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + FIELD_FIELD_NUMBER;
    hash = (53 * hash) + field_;
    switch (dataCase_) {
      case 2:
        hash = (37 * hash) + VALUE_FIELD_NUMBER;
        hash = (53 * hash) + getValue().hashCode();
        break;
      case 3:
        hash = (37 * hash) + RAW_VALUE_FIELD_NUMBER;
        hash = (53 * hash) + getRawValue().hashCode();
        break;
      case 0:
      default:
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static io.bloombox.schema.identity.ids.USDLFieldValue parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.bloombox.schema.identity.ids.USDLFieldValue parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.bloombox.schema.identity.ids.USDLFieldValue parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.bloombox.schema.identity.ids.USDLFieldValue parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.bloombox.schema.identity.ids.USDLFieldValue parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.bloombox.schema.identity.ids.USDLFieldValue parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.bloombox.schema.identity.ids.USDLFieldValue parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.bloombox.schema.identity.ids.USDLFieldValue parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.bloombox.schema.identity.ids.USDLFieldValue parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static io.bloombox.schema.identity.ids.USDLFieldValue parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.bloombox.schema.identity.ids.USDLFieldValue parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.bloombox.schema.identity.ids.USDLFieldValue parseFrom(
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
  public static Builder newBuilder(io.bloombox.schema.identity.ids.USDLFieldValue prototype) {
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
   * Specifies an individual raw field value read or scanned from a United States Driver's License.
   * </pre>
   *
   * Protobuf type {@code identity.ids.USDLFieldValue}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:identity.ids.USDLFieldValue)
      io.bloombox.schema.identity.ids.USDLFieldValueOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return io.bloombox.schema.identity.ids.USDLOuterClass.internal_static_identity_ids_USDLFieldValue_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.bloombox.schema.identity.ids.USDLOuterClass.internal_static_identity_ids_USDLFieldValue_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.bloombox.schema.identity.ids.USDLFieldValue.class, io.bloombox.schema.identity.ids.USDLFieldValue.Builder.class);
    }

    // Construct using io.bloombox.schema.identity.ids.USDLFieldValue.newBuilder()
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
      field_ = 0;

      dataCase_ = 0;
      data_ = null;
      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return io.bloombox.schema.identity.ids.USDLOuterClass.internal_static_identity_ids_USDLFieldValue_descriptor;
    }

    public io.bloombox.schema.identity.ids.USDLFieldValue getDefaultInstanceForType() {
      return io.bloombox.schema.identity.ids.USDLFieldValue.getDefaultInstance();
    }

    public io.bloombox.schema.identity.ids.USDLFieldValue build() {
      io.bloombox.schema.identity.ids.USDLFieldValue result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public io.bloombox.schema.identity.ids.USDLFieldValue buildPartial() {
      io.bloombox.schema.identity.ids.USDLFieldValue result = new io.bloombox.schema.identity.ids.USDLFieldValue(this);
      result.field_ = field_;
      if (dataCase_ == 2) {
        result.data_ = data_;
      }
      if (dataCase_ == 3) {
        result.data_ = data_;
      }
      result.dataCase_ = dataCase_;
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
      if (other instanceof io.bloombox.schema.identity.ids.USDLFieldValue) {
        return mergeFrom((io.bloombox.schema.identity.ids.USDLFieldValue)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(io.bloombox.schema.identity.ids.USDLFieldValue other) {
      if (other == io.bloombox.schema.identity.ids.USDLFieldValue.getDefaultInstance()) return this;
      if (other.field_ != 0) {
        setFieldValue(other.getFieldValue());
      }
      switch (other.getDataCase()) {
        case VALUE: {
          dataCase_ = 2;
          data_ = other.data_;
          onChanged();
          break;
        }
        case RAW_VALUE: {
          setRawValue(other.getRawValue());
          break;
        }
        case DATA_NOT_SET: {
          break;
        }
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
      io.bloombox.schema.identity.ids.USDLFieldValue parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (io.bloombox.schema.identity.ids.USDLFieldValue) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int dataCase_ = 0;
    private java.lang.Object data_;
    public DataCase
        getDataCase() {
      return DataCase.forNumber(
          dataCase_);
    }

    public Builder clearData() {
      dataCase_ = 0;
      data_ = null;
      onChanged();
      return this;
    }


    private int field_ = 0;
    /**
     * <pre>
     * Field that we are storing data for.
     * </pre>
     *
     * <code>.identity.ids.USDLField field = 1;</code>
     */
    public int getFieldValue() {
      return field_;
    }
    /**
     * <pre>
     * Field that we are storing data for.
     * </pre>
     *
     * <code>.identity.ids.USDLField field = 1;</code>
     */
    public Builder setFieldValue(int value) {
      field_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Field that we are storing data for.
     * </pre>
     *
     * <code>.identity.ids.USDLField field = 1;</code>
     */
    public io.bloombox.schema.identity.ids.USDLField getField() {
      io.bloombox.schema.identity.ids.USDLField result = io.bloombox.schema.identity.ids.USDLField.valueOf(field_);
      return result == null ? io.bloombox.schema.identity.ids.USDLField.UNRECOGNIZED : result;
    }
    /**
     * <pre>
     * Field that we are storing data for.
     * </pre>
     *
     * <code>.identity.ids.USDLField field = 1;</code>
     */
    public Builder setField(io.bloombox.schema.identity.ids.USDLField value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      field_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Field that we are storing data for.
     * </pre>
     *
     * <code>.identity.ids.USDLField field = 1;</code>
     */
    public Builder clearField() {
      
      field_ = 0;
      onChanged();
      return this;
    }

    /**
     * <pre>
     * String data for this field.
     * </pre>
     *
     * <code>string value = 2;</code>
     */
    public java.lang.String getValue() {
      java.lang.Object ref = "";
      if (dataCase_ == 2) {
        ref = data_;
      }
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (dataCase_ == 2) {
          data_ = s;
        }
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * String data for this field.
     * </pre>
     *
     * <code>string value = 2;</code>
     */
    public com.google.protobuf.ByteString
        getValueBytes() {
      java.lang.Object ref = "";
      if (dataCase_ == 2) {
        ref = data_;
      }
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        if (dataCase_ == 2) {
          data_ = b;
        }
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * String data for this field.
     * </pre>
     *
     * <code>string value = 2;</code>
     */
    public Builder setValue(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  dataCase_ = 2;
      data_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * String data for this field.
     * </pre>
     *
     * <code>string value = 2;</code>
     */
    public Builder clearValue() {
      if (dataCase_ == 2) {
        dataCase_ = 0;
        data_ = null;
        onChanged();
      }
      return this;
    }
    /**
     * <pre>
     * String data for this field.
     * </pre>
     *
     * <code>string value = 2;</code>
     */
    public Builder setValueBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      dataCase_ = 2;
      data_ = value;
      onChanged();
      return this;
    }

    /**
     * <pre>
     * Byte data for this field.
     * </pre>
     *
     * <code>bytes raw_value = 3;</code>
     */
    public com.google.protobuf.ByteString getRawValue() {
      if (dataCase_ == 3) {
        return (com.google.protobuf.ByteString) data_;
      }
      return com.google.protobuf.ByteString.EMPTY;
    }
    /**
     * <pre>
     * Byte data for this field.
     * </pre>
     *
     * <code>bytes raw_value = 3;</code>
     */
    public Builder setRawValue(com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  dataCase_ = 3;
      data_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Byte data for this field.
     * </pre>
     *
     * <code>bytes raw_value = 3;</code>
     */
    public Builder clearRawValue() {
      if (dataCase_ == 3) {
        dataCase_ = 0;
        data_ = null;
        onChanged();
      }
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


    // @@protoc_insertion_point(builder_scope:identity.ids.USDLFieldValue)
  }

  // @@protoc_insertion_point(class_scope:identity.ids.USDLFieldValue)
  private static final io.bloombox.schema.identity.ids.USDLFieldValue DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new io.bloombox.schema.identity.ids.USDLFieldValue();
  }

  public static io.bloombox.schema.identity.ids.USDLFieldValue getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<USDLFieldValue>
      PARSER = new com.google.protobuf.AbstractParser<USDLFieldValue>() {
    public USDLFieldValue parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return new USDLFieldValue(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<USDLFieldValue> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<USDLFieldValue> getParserForType() {
    return PARSER;
  }

  public io.bloombox.schema.identity.ids.USDLFieldValue getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
