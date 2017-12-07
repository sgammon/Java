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

public interface MenuOrBuilder extends
    // @@protoc_insertion_point(interface_extends:products.menu.Menu)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Metadata for the menu.
   * </pre>
   *
   * <code>.products.menu.Metadata metadata = 1;</code>
   */
  boolean hasMetadata();
  /**
   * <pre>
   * Metadata for the menu.
   * </pre>
   *
   * <code>.products.menu.Metadata metadata = 1;</code>
   */
  io.bloombox.schema.menu.Metadata getMetadata();
  /**
   * <pre>
   * Metadata for the menu.
   * </pre>
   *
   * <code>.products.menu.Metadata metadata = 1;</code>
   */
  io.bloombox.schema.menu.MetadataOrBuilder getMetadataOrBuilder();

  /**
   * <pre>
   * Data payloads attached to this menu.
   * </pre>
   *
   * <code>.products.menu.SectionedMenu payload = 3;</code>
   */
  boolean hasPayload();
  /**
   * <pre>
   * Data payloads attached to this menu.
   * </pre>
   *
   * <code>.products.menu.SectionedMenu payload = 3;</code>
   */
  io.bloombox.schema.menu.SectionedMenu getPayload();
  /**
   * <pre>
   * Data payloads attached to this menu.
   * </pre>
   *
   * <code>.products.menu.SectionedMenu payload = 3;</code>
   */
  io.bloombox.schema.menu.SectionedMenuOrBuilder getPayloadOrBuilder();

  /**
   * <pre>
   * Specifies a static menu, where each section is specified as a typed map, with keys mapped to products.
   * </pre>
   *
   * <code>.products.menu.StaticMenu menu = 4;</code>
   */
  boolean hasMenu();
  /**
   * <pre>
   * Specifies a static menu, where each section is specified as a typed map, with keys mapped to products.
   * </pre>
   *
   * <code>.products.menu.StaticMenu menu = 4;</code>
   */
  io.bloombox.schema.menu.StaticMenu getMenu();
  /**
   * <pre>
   * Specifies a static menu, where each section is specified as a typed map, with keys mapped to products.
   * </pre>
   *
   * <code>.products.menu.StaticMenu menu = 4;</code>
   */
  io.bloombox.schema.menu.StaticMenuOrBuilder getMenuOrBuilder();

  public io.bloombox.schema.menu.Menu.ContentCase getContentCase();
}