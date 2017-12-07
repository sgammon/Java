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
// source: partner/PartnerDevice.proto

package io.bloombox.schema.partner;

/**
 * Protobuf enum {@code partner.PartnerDeviceType}
 */
public enum PartnerDeviceType
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <code>UNSPECIFIED_DEVICE_TYPE = 0;</code>
   */
  UNSPECIFIED_DEVICE_TYPE(0),
  /**
   * <code>INTERNAL = 1;</code>
   */
  INTERNAL(1),
  /**
   * <pre>
   * -- Menu Devices
   * </pre>
   *
   * <code>MENU_TABLET = 10;</code>
   */
  MENU_TABLET(10),
  /**
   * <code>MENU_TV = 11;</code>
   */
  MENU_TV(11),
  /**
   * <pre>
   * -- Checkin Devices
   * </pre>
   *
   * <code>CHECKIN_STATION = 20;</code>
   */
  CHECKIN_STATION(20),
  /**
   * <code>CHECKIN_TV = 21;</code>
   */
  CHECKIN_TV(21),
  /**
   * <pre>
   * -- Point of Sale
   * </pre>
   *
   * <code>POS_REGISTER = 30;</code>
   */
  POS_REGISTER(30),
  UNRECOGNIZED(-1),
  ;

  /**
   * <code>UNSPECIFIED_DEVICE_TYPE = 0;</code>
   */
  public static final int UNSPECIFIED_DEVICE_TYPE_VALUE = 0;
  /**
   * <code>INTERNAL = 1;</code>
   */
  public static final int INTERNAL_VALUE = 1;
  /**
   * <pre>
   * -- Menu Devices
   * </pre>
   *
   * <code>MENU_TABLET = 10;</code>
   */
  public static final int MENU_TABLET_VALUE = 10;
  /**
   * <code>MENU_TV = 11;</code>
   */
  public static final int MENU_TV_VALUE = 11;
  /**
   * <pre>
   * -- Checkin Devices
   * </pre>
   *
   * <code>CHECKIN_STATION = 20;</code>
   */
  public static final int CHECKIN_STATION_VALUE = 20;
  /**
   * <code>CHECKIN_TV = 21;</code>
   */
  public static final int CHECKIN_TV_VALUE = 21;
  /**
   * <pre>
   * -- Point of Sale
   * </pre>
   *
   * <code>POS_REGISTER = 30;</code>
   */
  public static final int POS_REGISTER_VALUE = 30;


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
  public static PartnerDeviceType valueOf(int value) {
    return forNumber(value);
  }

  public static PartnerDeviceType forNumber(int value) {
    switch (value) {
      case 0: return UNSPECIFIED_DEVICE_TYPE;
      case 1: return INTERNAL;
      case 10: return MENU_TABLET;
      case 11: return MENU_TV;
      case 20: return CHECKIN_STATION;
      case 21: return CHECKIN_TV;
      case 30: return POS_REGISTER;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<PartnerDeviceType>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      PartnerDeviceType> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<PartnerDeviceType>() {
          public PartnerDeviceType findValueByNumber(int number) {
            return PartnerDeviceType.forNumber(number);
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
    return io.bloombox.schema.partner.PartnerDeviceOuterClass.getDescriptor().getEnumTypes().get(0);
  }

  private static final PartnerDeviceType[] VALUES = values();

  public static PartnerDeviceType valueOf(
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

  private PartnerDeviceType(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:partner.PartnerDeviceType)
}
