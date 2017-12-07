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

public interface PartnerDeviceOrBuilder extends
    // @@protoc_insertion_point(interface_extends:partner.PartnerDevice)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string uuid = 1;</code>
   */
  java.lang.String getUuid();
  /**
   * <code>string uuid = 1;</code>
   */
  com.google.protobuf.ByteString
      getUuidBytes();

  /**
   * <code>.partner.Partner partner = 2;</code>
   */
  boolean hasPartner();
  /**
   * <code>.partner.Partner partner = 2;</code>
   */
  io.bloombox.schema.partner.Partner getPartner();
  /**
   * <code>.partner.Partner partner = 2;</code>
   */
  io.bloombox.schema.partner.PartnerOrBuilder getPartnerOrBuilder();

  /**
   * <code>.partner.PartnerLocation location = 3;</code>
   */
  boolean hasLocation();
  /**
   * <code>.partner.PartnerLocation location = 3;</code>
   */
  io.bloombox.schema.partner.PartnerLocation getLocation();
  /**
   * <code>.partner.PartnerLocation location = 3;</code>
   */
  io.bloombox.schema.partner.PartnerLocationOrBuilder getLocationOrBuilder();

  /**
   * <code>.partner.PartnerDeviceType type = 4;</code>
   */
  int getTypeValue();
  /**
   * <code>.partner.PartnerDeviceType type = 4;</code>
   */
  io.bloombox.schema.partner.PartnerDeviceType getType();

  /**
   * <code>.partner.PartnerDeviceFlags flags = 5;</code>
   */
  boolean hasFlags();
  /**
   * <code>.partner.PartnerDeviceFlags flags = 5;</code>
   */
  io.bloombox.schema.partner.PartnerDeviceFlags getFlags();
  /**
   * <code>.partner.PartnerDeviceFlags flags = 5;</code>
   */
  io.bloombox.schema.partner.PartnerDeviceFlagsOrBuilder getFlagsOrBuilder();

  /**
   * <code>.device.Device device = 6;</code>
   */
  boolean hasDevice();
  /**
   * <code>.device.Device device = 6;</code>
   */
  io.bloombox.schema.device.Device getDevice();
  /**
   * <code>.device.Device device = 6;</code>
   */
  io.bloombox.schema.device.DeviceOrBuilder getDeviceOrBuilder();

  /**
   * <code>.temporal.Instant seen = 7;</code>
   */
  boolean hasSeen();
  /**
   * <code>.temporal.Instant seen = 7;</code>
   */
  io.bloombox.schema.temporal.Instant getSeen();
  /**
   * <code>.temporal.Instant seen = 7;</code>
   */
  io.bloombox.schema.temporal.InstantOrBuilder getSeenOrBuilder();

  /**
   * <code>.temporal.Instant registered = 8;</code>
   */
  boolean hasRegistered();
  /**
   * <code>.temporal.Instant registered = 8;</code>
   */
  io.bloombox.schema.temporal.Instant getRegistered();
  /**
   * <code>.temporal.Instant registered = 8;</code>
   */
  io.bloombox.schema.temporal.InstantOrBuilder getRegisteredOrBuilder();
}