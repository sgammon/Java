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
// source: identity/pass/Pass.proto

package io.bloombox.schema.pass;

public interface PassOrBuilder extends
    // @@protoc_insertion_point(interface_extends:identity.pass.Pass)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.identity.pass.PassKey key = 1;</code>
   */
  boolean hasKey();
  /**
   * <code>.identity.pass.PassKey key = 1;</code>
   */
  io.bloombox.schema.pass.PassKey getKey();
  /**
   * <code>.identity.pass.PassKey key = 1;</code>
   */
  io.bloombox.schema.pass.PassKeyOrBuilder getKeyOrBuilder();

  /**
   * <code>string token = 2;</code>
   */
  java.lang.String getToken();
  /**
   * <code>string token = 2;</code>
   */
  com.google.protobuf.ByteString
      getTokenBytes();

  /**
   * <code>string uri = 3;</code>
   */
  java.lang.String getUri();
  /**
   * <code>string uri = 3;</code>
   */
  com.google.protobuf.ByteString
      getUriBytes();

  /**
   * <code>bool active = 4;</code>
   */
  boolean getActive();

  /**
   * <code>.temporal.Instant issued = 5;</code>
   */
  boolean hasIssued();
  /**
   * <code>.temporal.Instant issued = 5;</code>
   */
  io.bloombox.schema.temporal.Instant getIssued();
  /**
   * <code>.temporal.Instant issued = 5;</code>
   */
  io.bloombox.schema.temporal.InstantOrBuilder getIssuedOrBuilder();

  /**
   * <code>.temporal.Instant suspended = 6;</code>
   */
  boolean hasSuspended();
  /**
   * <code>.temporal.Instant suspended = 6;</code>
   */
  io.bloombox.schema.temporal.Instant getSuspended();
  /**
   * <code>.temporal.Instant suspended = 6;</code>
   */
  io.bloombox.schema.temporal.InstantOrBuilder getSuspendedOrBuilder();
}