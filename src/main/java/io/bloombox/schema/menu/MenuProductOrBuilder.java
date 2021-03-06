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

public interface MenuProductOrBuilder extends
    // @@protoc_insertion_point(interface_extends:products.menu.MenuProduct)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Section that this data is attached to.
   * </pre>
   *
   * <code>.base.ProductKey key = 1;</code>
   */
  boolean hasKey();
  /**
   * <pre>
   * Section that this data is attached to.
   * </pre>
   *
   * <code>.base.ProductKey key = 1;</code>
   */
  io.bloombox.schema.base.ProductKey getKey();
  /**
   * <pre>
   * Section that this data is attached to.
   * </pre>
   *
   * <code>.base.ProductKey key = 1;</code>
   */
  io.bloombox.schema.base.ProductKeyOrBuilder getKeyOrBuilder();
}
