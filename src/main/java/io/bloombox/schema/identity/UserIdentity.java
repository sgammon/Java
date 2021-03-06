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
// source: identity/User.proto

package io.bloombox.schema.identity;

/**
 * <pre>
 * Represents an identity that may be associated with a user account.
 * </pre>
 *
 * Protobuf type {@code identity.UserIdentity}
 */
public  final class UserIdentity extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:identity.UserIdentity)
    UserIdentityOrBuilder {
private static final long serialVersionUID = 0L;
  // Use UserIdentity.newBuilder() to construct.
  private UserIdentity(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private UserIdentity() {
    provider_ = 0;
    id_ = "";
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private UserIdentity(
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

            provider_ = rawValue;
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            id_ = s;
            break;
          }
          case 26: {
            io.bloombox.schema.temporal.Instant.Builder subBuilder = null;
            if (seen_ != null) {
              subBuilder = seen_.toBuilder();
            }
            seen_ = input.readMessage(io.bloombox.schema.temporal.Instant.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(seen_);
              seen_ = subBuilder.buildPartial();
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
    return io.bloombox.schema.identity.UserOuterClass.internal_static_identity_UserIdentity_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return io.bloombox.schema.identity.UserOuterClass.internal_static_identity_UserIdentity_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            io.bloombox.schema.identity.UserIdentity.class, io.bloombox.schema.identity.UserIdentity.Builder.class);
  }

  public static final int PROVIDER_FIELD_NUMBER = 1;
  private int provider_;
  /**
   * <pre>
   * Provider for this external/foreign account.
   * </pre>
   *
   * <code>.identity.IdentityProvider provider = 1;</code>
   */
  public int getProviderValue() {
    return provider_;
  }
  /**
   * <pre>
   * Provider for this external/foreign account.
   * </pre>
   *
   * <code>.identity.IdentityProvider provider = 1;</code>
   */
  public io.bloombox.schema.identity.IdentityProvider getProvider() {
    io.bloombox.schema.identity.IdentityProvider result = io.bloombox.schema.identity.IdentityProvider.valueOf(provider_);
    return result == null ? io.bloombox.schema.identity.IdentityProvider.UNRECOGNIZED : result;
  }

  public static final int ID_FIELD_NUMBER = 2;
  private volatile java.lang.Object id_;
  /**
   * <pre>
   * Unique ID for this account with the specified provider.
   * </pre>
   *
   * <code>string id = 2;</code>
   */
  public java.lang.String getId() {
    java.lang.Object ref = id_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      id_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Unique ID for this account with the specified provider.
   * </pre>
   *
   * <code>string id = 2;</code>
   */
  public com.google.protobuf.ByteString
      getIdBytes() {
    java.lang.Object ref = id_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      id_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int SEEN_FIELD_NUMBER = 3;
  private io.bloombox.schema.temporal.Instant seen_;
  /**
   * <pre>
   * Timestamp for when this identity was last user to authenticate the underlying user.
   * </pre>
   *
   * <code>.temporal.Instant seen = 3;</code>
   */
  public boolean hasSeen() {
    return seen_ != null;
  }
  /**
   * <pre>
   * Timestamp for when this identity was last user to authenticate the underlying user.
   * </pre>
   *
   * <code>.temporal.Instant seen = 3;</code>
   */
  public io.bloombox.schema.temporal.Instant getSeen() {
    return seen_ == null ? io.bloombox.schema.temporal.Instant.getDefaultInstance() : seen_;
  }
  /**
   * <pre>
   * Timestamp for when this identity was last user to authenticate the underlying user.
   * </pre>
   *
   * <code>.temporal.Instant seen = 3;</code>
   */
  public io.bloombox.schema.temporal.InstantOrBuilder getSeenOrBuilder() {
    return getSeen();
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
    if (provider_ != io.bloombox.schema.identity.IdentityProvider.EMAIL.getNumber()) {
      output.writeEnum(1, provider_);
    }
    if (!getIdBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, id_);
    }
    if (seen_ != null) {
      output.writeMessage(3, getSeen());
    }
    unknownFields.writeTo(output);
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (provider_ != io.bloombox.schema.identity.IdentityProvider.EMAIL.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(1, provider_);
    }
    if (!getIdBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, id_);
    }
    if (seen_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(3, getSeen());
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
    if (!(obj instanceof io.bloombox.schema.identity.UserIdentity)) {
      return super.equals(obj);
    }
    io.bloombox.schema.identity.UserIdentity other = (io.bloombox.schema.identity.UserIdentity) obj;

    boolean result = true;
    result = result && provider_ == other.provider_;
    result = result && getId()
        .equals(other.getId());
    result = result && (hasSeen() == other.hasSeen());
    if (hasSeen()) {
      result = result && getSeen()
          .equals(other.getSeen());
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
    hash = (37 * hash) + PROVIDER_FIELD_NUMBER;
    hash = (53 * hash) + provider_;
    hash = (37 * hash) + ID_FIELD_NUMBER;
    hash = (53 * hash) + getId().hashCode();
    if (hasSeen()) {
      hash = (37 * hash) + SEEN_FIELD_NUMBER;
      hash = (53 * hash) + getSeen().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static io.bloombox.schema.identity.UserIdentity parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.bloombox.schema.identity.UserIdentity parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.bloombox.schema.identity.UserIdentity parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.bloombox.schema.identity.UserIdentity parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.bloombox.schema.identity.UserIdentity parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.bloombox.schema.identity.UserIdentity parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.bloombox.schema.identity.UserIdentity parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.bloombox.schema.identity.UserIdentity parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.bloombox.schema.identity.UserIdentity parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static io.bloombox.schema.identity.UserIdentity parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.bloombox.schema.identity.UserIdentity parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.bloombox.schema.identity.UserIdentity parseFrom(
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
  public static Builder newBuilder(io.bloombox.schema.identity.UserIdentity prototype) {
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
   * Represents an identity that may be associated with a user account.
   * </pre>
   *
   * Protobuf type {@code identity.UserIdentity}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:identity.UserIdentity)
      io.bloombox.schema.identity.UserIdentityOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return io.bloombox.schema.identity.UserOuterClass.internal_static_identity_UserIdentity_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.bloombox.schema.identity.UserOuterClass.internal_static_identity_UserIdentity_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.bloombox.schema.identity.UserIdentity.class, io.bloombox.schema.identity.UserIdentity.Builder.class);
    }

    // Construct using io.bloombox.schema.identity.UserIdentity.newBuilder()
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
      provider_ = 0;

      id_ = "";

      if (seenBuilder_ == null) {
        seen_ = null;
      } else {
        seen_ = null;
        seenBuilder_ = null;
      }
      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return io.bloombox.schema.identity.UserOuterClass.internal_static_identity_UserIdentity_descriptor;
    }

    public io.bloombox.schema.identity.UserIdentity getDefaultInstanceForType() {
      return io.bloombox.schema.identity.UserIdentity.getDefaultInstance();
    }

    public io.bloombox.schema.identity.UserIdentity build() {
      io.bloombox.schema.identity.UserIdentity result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public io.bloombox.schema.identity.UserIdentity buildPartial() {
      io.bloombox.schema.identity.UserIdentity result = new io.bloombox.schema.identity.UserIdentity(this);
      result.provider_ = provider_;
      result.id_ = id_;
      if (seenBuilder_ == null) {
        result.seen_ = seen_;
      } else {
        result.seen_ = seenBuilder_.build();
      }
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
      if (other instanceof io.bloombox.schema.identity.UserIdentity) {
        return mergeFrom((io.bloombox.schema.identity.UserIdentity)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(io.bloombox.schema.identity.UserIdentity other) {
      if (other == io.bloombox.schema.identity.UserIdentity.getDefaultInstance()) return this;
      if (other.provider_ != 0) {
        setProviderValue(other.getProviderValue());
      }
      if (!other.getId().isEmpty()) {
        id_ = other.id_;
        onChanged();
      }
      if (other.hasSeen()) {
        mergeSeen(other.getSeen());
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
      io.bloombox.schema.identity.UserIdentity parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (io.bloombox.schema.identity.UserIdentity) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int provider_ = 0;
    /**
     * <pre>
     * Provider for this external/foreign account.
     * </pre>
     *
     * <code>.identity.IdentityProvider provider = 1;</code>
     */
    public int getProviderValue() {
      return provider_;
    }
    /**
     * <pre>
     * Provider for this external/foreign account.
     * </pre>
     *
     * <code>.identity.IdentityProvider provider = 1;</code>
     */
    public Builder setProviderValue(int value) {
      provider_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Provider for this external/foreign account.
     * </pre>
     *
     * <code>.identity.IdentityProvider provider = 1;</code>
     */
    public io.bloombox.schema.identity.IdentityProvider getProvider() {
      io.bloombox.schema.identity.IdentityProvider result = io.bloombox.schema.identity.IdentityProvider.valueOf(provider_);
      return result == null ? io.bloombox.schema.identity.IdentityProvider.UNRECOGNIZED : result;
    }
    /**
     * <pre>
     * Provider for this external/foreign account.
     * </pre>
     *
     * <code>.identity.IdentityProvider provider = 1;</code>
     */
    public Builder setProvider(io.bloombox.schema.identity.IdentityProvider value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      provider_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Provider for this external/foreign account.
     * </pre>
     *
     * <code>.identity.IdentityProvider provider = 1;</code>
     */
    public Builder clearProvider() {
      
      provider_ = 0;
      onChanged();
      return this;
    }

    private java.lang.Object id_ = "";
    /**
     * <pre>
     * Unique ID for this account with the specified provider.
     * </pre>
     *
     * <code>string id = 2;</code>
     */
    public java.lang.String getId() {
      java.lang.Object ref = id_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        id_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Unique ID for this account with the specified provider.
     * </pre>
     *
     * <code>string id = 2;</code>
     */
    public com.google.protobuf.ByteString
        getIdBytes() {
      java.lang.Object ref = id_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        id_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Unique ID for this account with the specified provider.
     * </pre>
     *
     * <code>string id = 2;</code>
     */
    public Builder setId(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      id_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Unique ID for this account with the specified provider.
     * </pre>
     *
     * <code>string id = 2;</code>
     */
    public Builder clearId() {
      
      id_ = getDefaultInstance().getId();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Unique ID for this account with the specified provider.
     * </pre>
     *
     * <code>string id = 2;</code>
     */
    public Builder setIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      id_ = value;
      onChanged();
      return this;
    }

    private io.bloombox.schema.temporal.Instant seen_ = null;
    private com.google.protobuf.SingleFieldBuilderV3<
        io.bloombox.schema.temporal.Instant, io.bloombox.schema.temporal.Instant.Builder, io.bloombox.schema.temporal.InstantOrBuilder> seenBuilder_;
    /**
     * <pre>
     * Timestamp for when this identity was last user to authenticate the underlying user.
     * </pre>
     *
     * <code>.temporal.Instant seen = 3;</code>
     */
    public boolean hasSeen() {
      return seenBuilder_ != null || seen_ != null;
    }
    /**
     * <pre>
     * Timestamp for when this identity was last user to authenticate the underlying user.
     * </pre>
     *
     * <code>.temporal.Instant seen = 3;</code>
     */
    public io.bloombox.schema.temporal.Instant getSeen() {
      if (seenBuilder_ == null) {
        return seen_ == null ? io.bloombox.schema.temporal.Instant.getDefaultInstance() : seen_;
      } else {
        return seenBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * Timestamp for when this identity was last user to authenticate the underlying user.
     * </pre>
     *
     * <code>.temporal.Instant seen = 3;</code>
     */
    public Builder setSeen(io.bloombox.schema.temporal.Instant value) {
      if (seenBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        seen_ = value;
        onChanged();
      } else {
        seenBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * Timestamp for when this identity was last user to authenticate the underlying user.
     * </pre>
     *
     * <code>.temporal.Instant seen = 3;</code>
     */
    public Builder setSeen(
        io.bloombox.schema.temporal.Instant.Builder builderForValue) {
      if (seenBuilder_ == null) {
        seen_ = builderForValue.build();
        onChanged();
      } else {
        seenBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * Timestamp for when this identity was last user to authenticate the underlying user.
     * </pre>
     *
     * <code>.temporal.Instant seen = 3;</code>
     */
    public Builder mergeSeen(io.bloombox.schema.temporal.Instant value) {
      if (seenBuilder_ == null) {
        if (seen_ != null) {
          seen_ =
            io.bloombox.schema.temporal.Instant.newBuilder(seen_).mergeFrom(value).buildPartial();
        } else {
          seen_ = value;
        }
        onChanged();
      } else {
        seenBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * Timestamp for when this identity was last user to authenticate the underlying user.
     * </pre>
     *
     * <code>.temporal.Instant seen = 3;</code>
     */
    public Builder clearSeen() {
      if (seenBuilder_ == null) {
        seen_ = null;
        onChanged();
      } else {
        seen_ = null;
        seenBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * Timestamp for when this identity was last user to authenticate the underlying user.
     * </pre>
     *
     * <code>.temporal.Instant seen = 3;</code>
     */
    public io.bloombox.schema.temporal.Instant.Builder getSeenBuilder() {
      
      onChanged();
      return getSeenFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Timestamp for when this identity was last user to authenticate the underlying user.
     * </pre>
     *
     * <code>.temporal.Instant seen = 3;</code>
     */
    public io.bloombox.schema.temporal.InstantOrBuilder getSeenOrBuilder() {
      if (seenBuilder_ != null) {
        return seenBuilder_.getMessageOrBuilder();
      } else {
        return seen_ == null ?
            io.bloombox.schema.temporal.Instant.getDefaultInstance() : seen_;
      }
    }
    /**
     * <pre>
     * Timestamp for when this identity was last user to authenticate the underlying user.
     * </pre>
     *
     * <code>.temporal.Instant seen = 3;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        io.bloombox.schema.temporal.Instant, io.bloombox.schema.temporal.Instant.Builder, io.bloombox.schema.temporal.InstantOrBuilder> 
        getSeenFieldBuilder() {
      if (seenBuilder_ == null) {
        seenBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            io.bloombox.schema.temporal.Instant, io.bloombox.schema.temporal.Instant.Builder, io.bloombox.schema.temporal.InstantOrBuilder>(
                getSeen(),
                getParentForChildren(),
                isClean());
        seen_ = null;
      }
      return seenBuilder_;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFieldsProto3(unknownFields);
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:identity.UserIdentity)
  }

  // @@protoc_insertion_point(class_scope:identity.UserIdentity)
  private static final io.bloombox.schema.identity.UserIdentity DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new io.bloombox.schema.identity.UserIdentity();
  }

  public static io.bloombox.schema.identity.UserIdentity getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<UserIdentity>
      PARSER = new com.google.protobuf.AbstractParser<UserIdentity>() {
    public UserIdentity parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return new UserIdentity(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<UserIdentity> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<UserIdentity> getParserForType() {
    return PARSER;
  }

  public io.bloombox.schema.identity.UserIdentity getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

