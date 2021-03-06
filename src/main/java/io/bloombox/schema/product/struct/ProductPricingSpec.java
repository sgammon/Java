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
// source: structs/pricing/PricingDescriptor.proto

package io.bloombox.schema.product.struct;

public final class ProductPricingSpec {
  private ProductPricingSpec() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_structs_pricing_PricingTierAvailability_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_structs_pricing_PricingTierAvailability_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_structs_pricing_UnitPricingDescriptor_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_structs_pricing_UnitPricingDescriptor_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_structs_pricing_WeightedPricingDescriptor_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_structs_pricing_WeightedPricingDescriptor_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_structs_pricing_FreebiePricingDescriptor_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_structs_pricing_FreebiePricingDescriptor_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_structs_pricing_PricingDescriptor_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_structs_pricing_PricingDescriptor_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_structs_pricing_ProductPricing_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_structs_pricing_ProductPricing_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\'structs/pricing/PricingDescriptor.prot" +
      "o\022\017structs.pricing\032$structs/pricing/Sale" +
      "Descriptor.proto\"=\n\027PricingTierAvailabil" +
      "ity\022\017\n\007offered\030\001 \001(\010\022\021\n\tavailable\030\002 \001(\010\"" +
      "\232\001\n\025UnitPricingDescriptor\022\023\n\013price_value" +
      "\030\001 \001(\002\0228\n\006status\030\002 \001(\0132(.structs.pricing" +
      ".PricingTierAvailability\0222\n\tdiscounts\030\003 " +
      "\003(\0132\037.structs.pricing.SaleDescriptor\"\236\001\n" +
      "\031WeightedPricingDescriptor\0222\n\006weight\030\001 \001" +
      "(\0162\".structs.pricing.PricingWeightTier\0224",
      "\n\004tier\030\002 \001(\0132&.structs.pricing.UnitPrici" +
      "ngDescriptor\022\027\n\017weight_in_grams\030\003 \001(\002\"\032\n" +
      "\030FreebiePricingDescriptor\"\200\002\n\021PricingDes" +
      "criptor\022*\n\004type\030\001 \001(\0162\034.structs.pricing." +
      "PricingType\0226\n\004unit\030\024 \001(\0132&.structs.pric" +
      "ing.UnitPricingDescriptorH\000\022>\n\010weighted\030" +
      "\025 \001(\0132*.structs.pricing.WeightedPricingD" +
      "escriptorH\000\022<\n\007freebie\030\026 \001(\0132).structs.p" +
      "ricing.FreebiePricingDescriptorH\000B\t\n\007pri" +
      "cing\"z\n\016ProductPricing\0222\n\tdiscounts\030\001 \003(",
      "\0132\037.structs.pricing.SaleDescriptor\0224\n\010ma" +
      "nifest\030\002 \003(\0132\".structs.pricing.PricingDe" +
      "scriptor*2\n\013PricingType\022\010\n\004UNIT\020\000\022\014\n\010WEI" +
      "GHTED\020\001\022\013\n\007FREEBIE\020\002*\211\001\n\021PricingWeightTi" +
      "er\022\t\n\005OTHER\020\000\022\010\n\004GRAM\020\001\022\014\n\010HALFGRAM\020\002\022\017\n" +
      "\013QUARTERGRAM\020\003\022\007\n\003DUB\020\004\022\n\n\006EIGHTH\020\005\022\013\n\007Q" +
      "UARTER\020\006\022\010\n\004HALF\020\007\022\t\n\005OUNCE\020\010\022\t\n\005POUND\020\t" +
      "B>\n!io.bloombox.schema.product.structB\022P" +
      "roductPricingSpecH\001P\001\370\001\001b\006proto3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          io.bloombox.schema.product.struct.ProductDiscount.getDescriptor(),
        }, assigner);
    internal_static_structs_pricing_PricingTierAvailability_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_structs_pricing_PricingTierAvailability_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_structs_pricing_PricingTierAvailability_descriptor,
        new java.lang.String[] { "Offered", "Available", });
    internal_static_structs_pricing_UnitPricingDescriptor_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_structs_pricing_UnitPricingDescriptor_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_structs_pricing_UnitPricingDescriptor_descriptor,
        new java.lang.String[] { "PriceValue", "Status", "Discounts", });
    internal_static_structs_pricing_WeightedPricingDescriptor_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_structs_pricing_WeightedPricingDescriptor_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_structs_pricing_WeightedPricingDescriptor_descriptor,
        new java.lang.String[] { "Weight", "Tier", "WeightInGrams", });
    internal_static_structs_pricing_FreebiePricingDescriptor_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_structs_pricing_FreebiePricingDescriptor_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_structs_pricing_FreebiePricingDescriptor_descriptor,
        new java.lang.String[] { });
    internal_static_structs_pricing_PricingDescriptor_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_structs_pricing_PricingDescriptor_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_structs_pricing_PricingDescriptor_descriptor,
        new java.lang.String[] { "Type", "Unit", "Weighted", "Freebie", "Pricing", });
    internal_static_structs_pricing_ProductPricing_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_structs_pricing_ProductPricing_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_structs_pricing_ProductPricing_descriptor,
        new java.lang.String[] { "Discounts", "Manifest", });
    io.bloombox.schema.product.struct.ProductDiscount.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
