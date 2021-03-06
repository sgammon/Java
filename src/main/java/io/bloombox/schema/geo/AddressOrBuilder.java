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
// source: geo/Address.proto

package io.bloombox.schema.geo;

public interface AddressOrBuilder extends
    // @@protoc_insertion_point(interface_extends:geo.Address)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string first_line = 1;</code>
   */
  java.lang.String getFirstLine();
  /**
   * <code>string first_line = 1;</code>
   */
  com.google.protobuf.ByteString
      getFirstLineBytes();

  /**
   * <code>string second_line = 2;</code>
   */
  java.lang.String getSecondLine();
  /**
   * <code>string second_line = 2;</code>
   */
  com.google.protobuf.ByteString
      getSecondLineBytes();

  /**
   * <code>string city = 3;</code>
   */
  java.lang.String getCity();
  /**
   * <code>string city = 3;</code>
   */
  com.google.protobuf.ByteString
      getCityBytes();

  /**
   * <code>string state = 4;</code>
   */
  java.lang.String getState();
  /**
   * <code>string state = 4;</code>
   */
  com.google.protobuf.ByteString
      getStateBytes();

  /**
   * <code>string zipcode = 5;</code>
   */
  java.lang.String getZipcode();
  /**
   * <code>string zipcode = 5;</code>
   */
  com.google.protobuf.ByteString
      getZipcodeBytes();

  /**
   * <code>string country = 6;</code>
   */
  java.lang.String getCountry();
  /**
   * <code>string country = 6;</code>
   */
  com.google.protobuf.ByteString
      getCountryBytes();
}
