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
// source: content/MaterialsData.proto

package io.bloombox.schema.content;

public interface MaterialsDataOrBuilder extends
    // @@protoc_insertion_point(interface_extends:content.MaterialsData)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Species of an item, if known.
   * </pre>
   *
   * <code>.structs.Species species = 1;</code>
   */
  int getSpeciesValue();
  /**
   * <pre>
   * Species of an item, if known.
   * </pre>
   *
   * <code>.structs.Species species = 1;</code>
   */
  io.bloombox.schema.product.struct.Species getSpecies();

  /**
   * <pre>
   * Specifies the genetics of an item, if known.
   * </pre>
   *
   * <code>.structs.Genetics genetics = 2;</code>
   */
  boolean hasGenetics();
  /**
   * <pre>
   * Specifies the genetics of an item, if known.
   * </pre>
   *
   * <code>.structs.Genetics genetics = 2;</code>
   */
  io.bloombox.schema.product.struct.Genetics getGenetics();
  /**
   * <pre>
   * Specifies the genetics of an item, if known.
   * </pre>
   *
   * <code>.structs.Genetics genetics = 2;</code>
   */
  io.bloombox.schema.product.struct.GeneticsOrBuilder getGeneticsOrBuilder();

  /**
   * <pre>
   * Specifies how this item was grown.
   * </pre>
   *
   * <code>.structs.Grow grow = 3;</code>
   */
  int getGrowValue();
  /**
   * <pre>
   * Specifies how this item was grown.
   * </pre>
   *
   * <code>.structs.Grow grow = 3;</code>
   */
  io.bloombox.schema.product.struct.Grow getGrow();

  /**
   * <pre>
   * Shelf status of this pre-rolled product.
   * </pre>
   *
   * <code>.structs.Shelf shelf = 4;</code>
   */
  int getShelfValue();
  /**
   * <pre>
   * Shelf status of this pre-rolled product.
   * </pre>
   *
   * <code>.structs.Shelf shelf = 4;</code>
   */
  io.bloombox.schema.product.struct.Shelf getShelf();

  /**
   * <pre>
   * Specifies distribution policy for this material.
   * </pre>
   *
   * <code>repeated .products.distribution.DistributionPolicy channels = 5;</code>
   */
  java.util.List<io.bloombox.schema.product.DistributionChannel.DistributionPolicy> 
      getChannelsList();
  /**
   * <pre>
   * Specifies distribution policy for this material.
   * </pre>
   *
   * <code>repeated .products.distribution.DistributionPolicy channels = 5;</code>
   */
  io.bloombox.schema.product.DistributionChannel.DistributionPolicy getChannels(int index);
  /**
   * <pre>
   * Specifies distribution policy for this material.
   * </pre>
   *
   * <code>repeated .products.distribution.DistributionPolicy channels = 5;</code>
   */
  int getChannelsCount();
  /**
   * <pre>
   * Specifies distribution policy for this material.
   * </pre>
   *
   * <code>repeated .products.distribution.DistributionPolicy channels = 5;</code>
   */
  java.util.List<? extends io.bloombox.schema.product.DistributionChannel.DistributionPolicyOrBuilder> 
      getChannelsOrBuilderList();
  /**
   * <pre>
   * Specifies distribution policy for this material.
   * </pre>
   *
   * <code>repeated .products.distribution.DistributionPolicy channels = 5;</code>
   */
  io.bloombox.schema.product.DistributionChannel.DistributionPolicyOrBuilder getChannelsOrBuilder(
      int index);
}
