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
// source: shop/v1/ShopService_v1.proto

package io.bloombox.schema.services.shop;

/**
 * <pre>
 * Enumerates errors that may prevent a user from being considered eligible for express and delivery orders.
 * </pre>
 *
 * Protobuf enum {@code services.shop.v1.VerifyError}
 */
public enum VerifyError
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <pre>
   * The user could not be found at all.
   * </pre>
   *
   * <code>NOT_FOUND = 0;</code>
   */
  NOT_FOUND(0),
  /**
   * <pre>
   * The user was found, but their rec was expired.
   * </pre>
   *
   * <code>REC_EXPIRED = 1;</code>
   */
  REC_EXPIRED(1),
  /**
   * <pre>
   * The user was found, but their ID was expired.
   * </pre>
   *
   * <code>ID_EXPIRED = 2;</code>
   */
  ID_EXPIRED(2),
  /**
   * <pre>
   * The payload was invalid - usually an invalid email address.
   * </pre>
   *
   * <code>INVALID_PAYLOAD = 3;</code>
   */
  INVALID_PAYLOAD(3),
  /**
   * <pre>
   * Generic error that indicates the user is not eligible.
   * </pre>
   *
   * <code>NOT_ELIGIBLE = 4;</code>
   */
  NOT_ELIGIBLE(4),
  UNRECOGNIZED(-1),
  ;

  /**
   * <pre>
   * The user could not be found at all.
   * </pre>
   *
   * <code>NOT_FOUND = 0;</code>
   */
  public static final int NOT_FOUND_VALUE = 0;
  /**
   * <pre>
   * The user was found, but their rec was expired.
   * </pre>
   *
   * <code>REC_EXPIRED = 1;</code>
   */
  public static final int REC_EXPIRED_VALUE = 1;
  /**
   * <pre>
   * The user was found, but their ID was expired.
   * </pre>
   *
   * <code>ID_EXPIRED = 2;</code>
   */
  public static final int ID_EXPIRED_VALUE = 2;
  /**
   * <pre>
   * The payload was invalid - usually an invalid email address.
   * </pre>
   *
   * <code>INVALID_PAYLOAD = 3;</code>
   */
  public static final int INVALID_PAYLOAD_VALUE = 3;
  /**
   * <pre>
   * Generic error that indicates the user is not eligible.
   * </pre>
   *
   * <code>NOT_ELIGIBLE = 4;</code>
   */
  public static final int NOT_ELIGIBLE_VALUE = 4;


  public final int getNumber() {
    if (this == UNRECOGNIZED) {
      throw new java.lang.IllegalArgumentException(
          "Can't get the number of an unknown enum value.");
    }
    return value;
  }

  /**
   * @deprecated Use {@link #forNumber(int)} instead.
   */
  @java.lang.Deprecated
  public static VerifyError valueOf(int value) {
    return forNumber(value);
  }

  public static VerifyError forNumber(int value) {
    switch (value) {
      case 0: return NOT_FOUND;
      case 1: return REC_EXPIRED;
      case 2: return ID_EXPIRED;
      case 3: return INVALID_PAYLOAD;
      case 4: return NOT_ELIGIBLE;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<VerifyError>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      VerifyError> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<VerifyError>() {
          public VerifyError findValueByNumber(int number) {
            return VerifyError.forNumber(number);
          }
        };

  public final com.google.protobuf.Descriptors.EnumValueDescriptor
      getValueDescriptor() {
    return getDescriptor().getValues().get(ordinal());
  }
  public final com.google.protobuf.Descriptors.EnumDescriptor
      getDescriptorForType() {
    return getDescriptor();
  }
  public static final com.google.protobuf.Descriptors.EnumDescriptor
      getDescriptor() {
    return io.bloombox.schema.services.shop.ShopServiceV1.getDescriptor().getEnumTypes().get(0);
  }

  private static final VerifyError[] VALUES = values();

  public static VerifyError valueOf(
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

  private VerifyError(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:services.shop.v1.VerifyError)
}
