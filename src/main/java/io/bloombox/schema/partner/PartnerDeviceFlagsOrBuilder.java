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

public interface PartnerDeviceFlagsOrBuilder extends
    // @@protoc_insertion_point(interface_extends:partner.PartnerDeviceFlags)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>bool active = 1;</code>
   */
  boolean getActive();

  /**
   * <code>bool suspended = 2;</code>
   */
  boolean getSuspended();

  /**
   * <code>bool beta = 3;</code>
   */
  boolean getBeta();

  /**
   * <code>bool sandbox = 4;</code>
   */
  boolean getSandbox();
}