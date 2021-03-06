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
// source: structs/labtesting/TestResults.proto

package io.bloombox.schema.product.struct.testing;

public final class LabTesting {
  private LabTesting() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_structs_labtesting_TestResults_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_structs_labtesting_TestResults_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_structs_labtesting_Cannabinoids_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_structs_labtesting_Cannabinoids_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_structs_labtesting_Cannabinoids_Result_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_structs_labtesting_Cannabinoids_Result_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_structs_labtesting_Subjective_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_structs_labtesting_Subjective_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_structs_labtesting_Terpenes_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_structs_labtesting_Terpenes_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_structs_labtesting_Terpenes_Result_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_structs_labtesting_Terpenes_Result_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_structs_labtesting_Pesticides_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_structs_labtesting_Pesticides_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_structs_labtesting_Pesticides_MeasurementsEntry_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_structs_labtesting_Pesticides_MeasurementsEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_structs_labtesting_Moisture_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_structs_labtesting_Moisture_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n$structs/labtesting/TestResults.proto\022\022" +
      "structs.labtesting\032\025content/Content.prot" +
      "o\032\026temporal/Instant.proto\032\"structs/labte" +
      "sting/TestValue.proto\"\245\003\n\013TestResults\022\021\n" +
      "\tavailable\030\001 \001(\010\022,\n\005media\030\002 \003(\0132\035.struct" +
      "s.labtesting.TestMedia\022\'\n\014last_updated\030\003" +
      " \001(\0132\021.temporal.Instant\0226\n\014cannabinoids\030" +
      "\036 \001(\0132 .structs.labtesting.Cannabinoids\022" +
      ".\n\010terpenes\030\037 \001(\0132\034.structs.labtesting.T" +
      "erpenes\0222\n\npesticides\030  \001(\0132\036.structs.la",
      "btesting.Pesticides\022.\n\010moisture\030! \001(\0132\034." +
      "structs.labtesting.Moisture\022,\n\005aroma\030\" \003" +
      "(\0162\035.structs.labtesting.TasteNote\0222\n\nsub" +
      "jective\030# \001(\0132\036.structs.labtesting.Subje" +
      "ctive\"\312\002\n\014Cannabinoids\022*\n\003thc\030\001 \001(\0132\035.st" +
      "ructs.labtesting.TestValue\022*\n\003cbd\030\002 \001(\0132" +
      "\035.structs.labtesting.TestValue\0228\n\007result" +
      "s\030\003 \003(\0132\'.structs.labtesting.Cannabinoid" +
      "s.Result\032\247\001\n\006Result\0224\n\013cannabinoid\030\001 \001(\016" +
      "2\037.structs.labtesting.Cannabinoid\0223\n\005rat",
      "io\030\002 \001(\0162$.structs.labtesting.Cannabinoi" +
      "dRatio\0222\n\013measurement\030\003 \001(\0132\035.structs.la" +
      "btesting.TestValue\"\363\001\n\nSubjective\022%\n\013des" +
      "cription\030\001 \001(\0132\020.content.Content\022\037\n\005tast" +
      "e\030\002 \001(\0132\020.content.Content\0224\n\007potency\030\003 \001" +
      "(\0162#.structs.labtesting.PotencyEstimate\022" +
      "1\n\014feeling_tags\030\004 \003(\0162\033.structs.labtesti" +
      "ng.Feeling\0224\n\rtasting_notes\030\005 \003(\0162\035.stru" +
      "cts.labtesting.TasteNote\"\300\001\n\010Terpenes\022\021\n" +
      "\tavailable\030\001 \001(\010\0225\n\010terpenes\030\n \003(\0132#.str",
      "ucts.labtesting.Terpenes.Result\032j\n\006Resul" +
      "t\022,\n\007terpene\030\001 \001(\0162\033.structs.labtesting." +
      "Terpene\0222\n\013measurement\030\002 \001(\0132\035.structs.l" +
      "abtesting.TestValue\"\300\001\n\nPesticides\022\026\n\016pe" +
      "sticide_free\030\001 \001(\010\022F\n\014measurements\030\002 \003(\013" +
      "20.structs.labtesting.Pesticides.Measure" +
      "mentsEntry\032R\n\021MeasurementsEntry\022\013\n\003key\030\001" +
      " \001(\t\022,\n\005value\030\002 \001(\0132\035.structs.labtesting" +
      ".TestValue:\0028\001\">\n\010Moisture\0222\n\013measuremen" +
      "t\030\001 \001(\0132\035.structs.labtesting.TestValue*\221",
      "\001\n\013Cannabinoid\022\007\n\003THC\020\000\022\t\n\005THC_A\020\001\022\t\n\005TH" +
      "C_V\020\002\022\007\n\003CBD\020\n\022\t\n\005CBD_A\020\013\022\t\n\005CBD_V\020\014\022\n\n\006" +
      "CBD_VA\020\r\022\007\n\003CBC\020\024\022\007\n\003CBG\020\036\022\t\n\005CBG_A\020\037\022\007\n" +
      "\003CBN\020(\022\007\n\003CBV\0202\022\t\n\005CBV_A\0203*|\n\020Cannabinoi" +
      "dRatio\022\035\n\031NO_CANNABINOID_PREFERENCE\020\000\022\014\n" +
      "\010THC_ONLY\020\001\022\020\n\014THC_OVER_CBD\020\002\022\t\n\005EQUAL\020\003" +
      "\022\020\n\014CBD_OVER_THC\020\004\022\014\n\010CBD_ONLY\020\005*\177\n\007Feel" +
      "ing\022\031\n\025NO_FEELING_PREFERENCE\020\000\022\r\n\tGROUND" +
      "ING\020\001\022\t\n\005SLEEP\020\002\022\013\n\007CALMING\020\003\022\017\n\013STIMULA" +
      "TING\020\004\022\t\n\005FUNNY\020\005\022\t\n\005FOCUS\020\006\022\013\n\007PASSION\020",
      "\007*\237\001\n\tTasteNote\022\027\n\023NO_TASTE_PREFERENCE\020\000" +
      "\022\t\n\005SWEET\020\001\022\010\n\004SOUR\020\002\022\t\n\005SPICE\020\003\022\n\n\006SMOO" +
      "TH\020\004\022\n\n\006CITRUS\020\005\022\010\n\004PINE\020\006\022\t\n\005FRUIT\020\007\022\013\n" +
      "\007TROPICS\020\010\022\n\n\006FLORAL\020\t\022\010\n\004HERB\020\n\022\t\n\005EART" +
      "H\020\013*>\n\017PotencyEstimate\022\t\n\005LIGHT\020\000\022\n\n\006MED" +
      "IUM\020\001\022\t\n\005HEAVY\020\002\022\t\n\005SUPER\020\003*\336\002\n\007Terpene\022" +
      "\014\n\010CAMPHENE\020\000\022\n\n\006CARENE\020\001\022\026\n\022BETA_CARYOP" +
      "HYLLENE\020\002\022\027\n\023CARYOPHYLLENE_OXIDE\020\003\022\016\n\nEU" +
      "CALYPTOL\020\004\022\013\n\007FENCHOL\020\005\022\022\n\016ALPHA_HUMULEN" +
      "E\020\006\022\014\n\010LIMONENE\020\007\022\014\n\010LINALOOL\020\010\022\013\n\007MYRCE",
      "NE\020\t\022\021\n\rALPHA_OCIMENE\020\n\022\020\n\014BETA_OCIMENE\020" +
      "\013\022\026\n\022ALPHA_PHELLANDRENE\020\014\022\020\n\014ALPHA_PINEN" +
      "E\020\r\022\017\n\013BETA_PINENE\020\016\022\023\n\017ALPHA_TERPINEOL\020" +
      "\017\022\023\n\017ALPHA_TERPININE\020\020\022\023\n\017GAMMA_TERPININ" +
      "E\020\021\022\017\n\013TERPINOLENE\020\022B>\n)io.bloombox.sche" +
      "ma.product.struct.testingB\nLabTestingH\001P" +
      "\001\370\001\001b\006proto3"
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
          io.bloombox.schema.content.GenericContent.getDescriptor(),
          io.bloombox.schema.temporal.InstantOuterClass.getDescriptor(),
          io.bloombox.schema.product.struct.testing.BaseTestingSpec.getDescriptor(),
        }, assigner);
    internal_static_structs_labtesting_TestResults_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_structs_labtesting_TestResults_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_structs_labtesting_TestResults_descriptor,
        new java.lang.String[] { "Available", "Media", "LastUpdated", "Cannabinoids", "Terpenes", "Pesticides", "Moisture", "Aroma", "Subjective", });
    internal_static_structs_labtesting_Cannabinoids_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_structs_labtesting_Cannabinoids_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_structs_labtesting_Cannabinoids_descriptor,
        new java.lang.String[] { "Thc", "Cbd", "Results", });
    internal_static_structs_labtesting_Cannabinoids_Result_descriptor =
      internal_static_structs_labtesting_Cannabinoids_descriptor.getNestedTypes().get(0);
    internal_static_structs_labtesting_Cannabinoids_Result_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_structs_labtesting_Cannabinoids_Result_descriptor,
        new java.lang.String[] { "Cannabinoid", "Ratio", "Measurement", });
    internal_static_structs_labtesting_Subjective_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_structs_labtesting_Subjective_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_structs_labtesting_Subjective_descriptor,
        new java.lang.String[] { "Description", "Taste", "Potency", "FeelingTags", "TastingNotes", });
    internal_static_structs_labtesting_Terpenes_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_structs_labtesting_Terpenes_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_structs_labtesting_Terpenes_descriptor,
        new java.lang.String[] { "Available", "Terpenes", });
    internal_static_structs_labtesting_Terpenes_Result_descriptor =
      internal_static_structs_labtesting_Terpenes_descriptor.getNestedTypes().get(0);
    internal_static_structs_labtesting_Terpenes_Result_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_structs_labtesting_Terpenes_Result_descriptor,
        new java.lang.String[] { "Terpene", "Measurement", });
    internal_static_structs_labtesting_Pesticides_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_structs_labtesting_Pesticides_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_structs_labtesting_Pesticides_descriptor,
        new java.lang.String[] { "PesticideFree", "Measurements", });
    internal_static_structs_labtesting_Pesticides_MeasurementsEntry_descriptor =
      internal_static_structs_labtesting_Pesticides_descriptor.getNestedTypes().get(0);
    internal_static_structs_labtesting_Pesticides_MeasurementsEntry_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_structs_labtesting_Pesticides_MeasurementsEntry_descriptor,
        new java.lang.String[] { "Key", "Value", });
    internal_static_structs_labtesting_Moisture_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_structs_labtesting_Moisture_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_structs_labtesting_Moisture_descriptor,
        new java.lang.String[] { "Measurement", });
    io.bloombox.schema.content.GenericContent.getDescriptor();
    io.bloombox.schema.temporal.InstantOuterClass.getDescriptor();
    io.bloombox.schema.product.struct.testing.BaseTestingSpec.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
