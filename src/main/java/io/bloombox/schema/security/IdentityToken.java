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
// source: security/IdentityToken.proto

package io.bloombox.schema.security;

/**
 * Protobuf type {@code security.IdentityToken}
 */
public  final class IdentityToken extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:security.IdentityToken)
    IdentityTokenOrBuilder {
private static final long serialVersionUID = 0L;
  // Use IdentityToken.newBuilder() to construct.
  private IdentityToken(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private IdentityToken() {
    uid_ = "";
    encoded_ = "";
    issuer_ = 0;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private IdentityToken(
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
          case 10: {
            java.lang.String s = input.readStringRequireUtf8();

            uid_ = s;
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            encoded_ = s;
            break;
          }
          case 24: {
            int rawValue = input.readEnum();

            issuer_ = rawValue;
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
    return io.bloombox.schema.security.IdentityTokenOuterClass.internal_static_security_IdentityToken_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return io.bloombox.schema.security.IdentityTokenOuterClass.internal_static_security_IdentityToken_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            io.bloombox.schema.security.IdentityToken.class, io.bloombox.schema.security.IdentityToken.Builder.class);
  }

  public static final int UID_FIELD_NUMBER = 1;
  private volatile java.lang.Object uid_;
  /**
   * <code>string uid = 1;</code>
   */
  public java.lang.String getUid() {
    java.lang.Object ref = uid_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      uid_ = s;
      return s;
    }
  }
  /**
   * <code>string uid = 1;</code>
   */
  public com.google.protobuf.ByteString
      getUidBytes() {
    java.lang.Object ref = uid_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      uid_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int ENCODED_FIELD_NUMBER = 2;
  private volatile java.lang.Object encoded_;
  /**
   * <code>string encoded = 2;</code>
   */
  public java.lang.String getEncoded() {
    java.lang.Object ref = encoded_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      encoded_ = s;
      return s;
    }
  }
  /**
   * <code>string encoded = 2;</code>
   */
  public com.google.protobuf.ByteString
      getEncodedBytes() {
    java.lang.Object ref = encoded_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      encoded_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int ISSUER_FIELD_NUMBER = 3;
  private int issuer_;
  /**
   * <code>.security.IdentityTokenIssuer issuer = 3;</code>
   */
  public int getIssuerValue() {
    return issuer_;
  }
  /**
   * <code>.security.IdentityTokenIssuer issuer = 3;</code>
   */
  public io.bloombox.schema.security.IdentityTokenIssuer getIssuer() {
    io.bloombox.schema.security.IdentityTokenIssuer result = io.bloombox.schema.security.IdentityTokenIssuer.valueOf(issuer_);
    return result == null ? io.bloombox.schema.security.IdentityTokenIssuer.UNRECOGNIZED : result;
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
    if (!getUidBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, uid_);
    }
    if (!getEncodedBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, encoded_);
    }
    if (issuer_ != io.bloombox.schema.security.IdentityTokenIssuer.INTERNAL.getNumber()) {
      output.writeEnum(3, issuer_);
    }
    unknownFields.writeTo(output);
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getUidBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, uid_);
    }
    if (!getEncodedBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, encoded_);
    }
    if (issuer_ != io.bloombox.schema.security.IdentityTokenIssuer.INTERNAL.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(3, issuer_);
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
    if (!(obj instanceof io.bloombox.schema.security.IdentityToken)) {
      return super.equals(obj);
    }
    io.bloombox.schema.security.IdentityToken other = (io.bloombox.schema.security.IdentityToken) obj;

    boolean result = true;
    result = result && getUid()
        .equals(other.getUid());
    result = result && getEncoded()
        .equals(other.getEncoded());
    result = result && issuer_ == other.issuer_;
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
    hash = (37 * hash) + UID_FIELD_NUMBER;
    hash = (53 * hash) + getUid().hashCode();
    hash = (37 * hash) + ENCODED_FIELD_NUMBER;
    hash = (53 * hash) + getEncoded().hashCode();
    hash = (37 * hash) + ISSUER_FIELD_NUMBER;
    hash = (53 * hash) + issuer_;
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static io.bloombox.schema.security.IdentityToken parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.bloombox.schema.security.IdentityToken parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.bloombox.schema.security.IdentityToken parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.bloombox.schema.security.IdentityToken parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.bloombox.schema.security.IdentityToken parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.bloombox.schema.security.IdentityToken parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.bloombox.schema.security.IdentityToken parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.bloombox.schema.security.IdentityToken parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.bloombox.schema.security.IdentityToken parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static io.bloombox.schema.security.IdentityToken parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.bloombox.schema.security.IdentityToken parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.bloombox.schema.security.IdentityToken parseFrom(
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
  public static Builder newBuilder(io.bloombox.schema.security.IdentityToken prototype) {
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
   * Protobuf type {@code security.IdentityToken}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:security.IdentityToken)
      io.bloombox.schema.security.IdentityTokenOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return io.bloombox.schema.security.IdentityTokenOuterClass.internal_static_security_IdentityToken_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.bloombox.schema.security.IdentityTokenOuterClass.internal_static_security_IdentityToken_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.bloombox.schema.security.IdentityToken.class, io.bloombox.schema.security.IdentityToken.Builder.class);
    }

    // Construct using io.bloombox.schema.security.IdentityToken.newBuilder()
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
      uid_ = "";

      encoded_ = "";

      issuer_ = 0;

      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return io.bloombox.schema.security.IdentityTokenOuterClass.internal_static_security_IdentityToken_descriptor;
    }

    public io.bloombox.schema.security.IdentityToken getDefaultInstanceForType() {
      return io.bloombox.schema.security.IdentityToken.getDefaultInstance();
    }

    public io.bloombox.schema.security.IdentityToken build() {
      io.bloombox.schema.security.IdentityToken result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public io.bloombox.schema.security.IdentityToken buildPartial() {
      io.bloombox.schema.security.IdentityToken result = new io.bloombox.schema.security.IdentityToken(this);
      result.uid_ = uid_;
      result.encoded_ = encoded_;
      result.issuer_ = issuer_;
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
      if (other instanceof io.bloombox.schema.security.IdentityToken) {
        return mergeFrom((io.bloombox.schema.security.IdentityToken)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(io.bloombox.schema.security.IdentityToken other) {
      if (other == io.bloombox.schema.security.IdentityToken.getDefaultInstance()) return this;
      if (!other.getUid().isEmpty()) {
        uid_ = other.uid_;
        onChanged();
      }
      if (!other.getEncoded().isEmpty()) {
        encoded_ = other.encoded_;
        onChanged();
      }
      if (other.issuer_ != 0) {
        setIssuerValue(other.getIssuerValue());
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
      io.bloombox.schema.security.IdentityToken parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (io.bloombox.schema.security.IdentityToken) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object uid_ = "";
    /**
     * <code>string uid = 1;</code>
     */
    public java.lang.String getUid() {
      java.lang.Object ref = uid_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        uid_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string uid = 1;</code>
     */
    public com.google.protobuf.ByteString
        getUidBytes() {
      java.lang.Object ref = uid_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        uid_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string uid = 1;</code>
     */
    public Builder setUid(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      uid_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string uid = 1;</code>
     */
    public Builder clearUid() {
      
      uid_ = getDefaultInstance().getUid();
      onChanged();
      return this;
    }
    /**
     * <code>string uid = 1;</code>
     */
    public Builder setUidBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      uid_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object encoded_ = "";
    /**
     * <code>string encoded = 2;</code>
     */
    public java.lang.String getEncoded() {
      java.lang.Object ref = encoded_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        encoded_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string encoded = 2;</code>
     */
    public com.google.protobuf.ByteString
        getEncodedBytes() {
      java.lang.Object ref = encoded_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        encoded_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string encoded = 2;</code>
     */
    public Builder setEncoded(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      encoded_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string encoded = 2;</code>
     */
    public Builder clearEncoded() {
      
      encoded_ = getDefaultInstance().getEncoded();
      onChanged();
      return this;
    }
    /**
     * <code>string encoded = 2;</code>
     */
    public Builder setEncodedBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      encoded_ = value;
      onChanged();
      return this;
    }

    private int issuer_ = 0;
    /**
     * <code>.security.IdentityTokenIssuer issuer = 3;</code>
     */
    public int getIssuerValue() {
      return issuer_;
    }
    /**
     * <code>.security.IdentityTokenIssuer issuer = 3;</code>
     */
    public Builder setIssuerValue(int value) {
      issuer_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>.security.IdentityTokenIssuer issuer = 3;</code>
     */
    public io.bloombox.schema.security.IdentityTokenIssuer getIssuer() {
      io.bloombox.schema.security.IdentityTokenIssuer result = io.bloombox.schema.security.IdentityTokenIssuer.valueOf(issuer_);
      return result == null ? io.bloombox.schema.security.IdentityTokenIssuer.UNRECOGNIZED : result;
    }
    /**
     * <code>.security.IdentityTokenIssuer issuer = 3;</code>
     */
    public Builder setIssuer(io.bloombox.schema.security.IdentityTokenIssuer value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      issuer_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.security.IdentityTokenIssuer issuer = 3;</code>
     */
    public Builder clearIssuer() {
      
      issuer_ = 0;
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


    // @@protoc_insertion_point(builder_scope:security.IdentityToken)
  }

  // @@protoc_insertion_point(class_scope:security.IdentityToken)
  private static final io.bloombox.schema.security.IdentityToken DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new io.bloombox.schema.security.IdentityToken();
  }

  public static io.bloombox.schema.security.IdentityToken getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<IdentityToken>
      PARSER = new com.google.protobuf.AbstractParser<IdentityToken>() {
    public IdentityToken parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return new IdentityToken(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<IdentityToken> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<IdentityToken> getParserForType() {
    return PARSER;
  }

  public io.bloombox.schema.security.IdentityToken getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

