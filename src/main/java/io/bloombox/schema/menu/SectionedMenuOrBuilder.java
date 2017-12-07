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
// source: products/menu/Menu.proto

package io.bloombox.schema.menu;

public interface SectionedMenuOrBuilder extends
    // @@protoc_insertion_point(interface_extends:products.menu.SectionedMenu)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Count of all products included in this menu, all sections considered.
   * </pre>
   *
   * <code>int32 count = 1;</code>
   */
  int getCount();

  /**
   * <pre>
   * Specifies a payload of sectioned menu data.
   * </pre>
   *
   * <code>repeated .products.menu.SectionData payload = 2;</code>
   */
  java.util.List<io.bloombox.schema.menu.SectionData> 
      getPayloadList();
  /**
   * <pre>
   * Specifies a payload of sectioned menu data.
   * </pre>
   *
   * <code>repeated .products.menu.SectionData payload = 2;</code>
   */
  io.bloombox.schema.menu.SectionData getPayload(int index);
  /**
   * <pre>
   * Specifies a payload of sectioned menu data.
   * </pre>
   *
   * <code>repeated .products.menu.SectionData payload = 2;</code>
   */
  int getPayloadCount();
  /**
   * <pre>
   * Specifies a payload of sectioned menu data.
   * </pre>
   *
   * <code>repeated .products.menu.SectionData payload = 2;</code>
   */
  java.util.List<? extends io.bloombox.schema.menu.SectionDataOrBuilder> 
      getPayloadOrBuilderList();
  /**
   * <pre>
   * Specifies a payload of sectioned menu data.
   * </pre>
   *
   * <code>repeated .products.menu.SectionData payload = 2;</code>
   */
  io.bloombox.schema.menu.SectionDataOrBuilder getPayloadOrBuilder(
      int index);
}