/*
 * Copyright 2017, Bloombox, LLC. All rights reserved.
 *
 * Source and object computer code contained herein is the private intellectual property
 * of Bloombox, a California Limited Liability Corporation. Use of this code in source form
 * requires permission in writing before use or the publishing of derivative works, for
 * commercial purposes or any other purpose, from a duly authorized officer of Momentum
 * Ideas Co.
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: identity/ids/USDL.proto

package io.bloombox.schema.identity.ids;

public final class USDLOuterClass {
  private USDLOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_identity_ids_USDLFieldValue_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_identity_ids_USDLFieldValue_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_identity_ids_USDL_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_identity_ids_USDL_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\027identity/ids/USDL.proto\022\014identity.ids\032" +
      "\021geo/USState.proto\"f\n\016USDLFieldValue\022&\n\005" +
      "field\030\001 \001(\0162\027.identity.ids.USDLField\022\017\n\005" +
      "value\030\002 \001(\tH\000\022\023\n\traw_value\030\003 \001(\014H\000B\006\n\004da" +
      "ta\"m\n\004USDL\022\017\n\007barcode\030\001 \001(\014\022&\n\014jurisdict" +
      "ion\030\005 \001(\0162\020.geo.usa.USState\022,\n\006fields\030d " +
      "\003(\0132\034.identity.ids.USDLFieldValue*\270\005\n\tUS" +
      "DLField\022\020\n\014BACK_BARCODE\020\000\022\017\n\013FAMILY_NAME" +
      "\020\001\022\016\n\nGIVEN_NAME\020\002\022\017\n\013MIDDLE_NAME\020\003\022\r\n\tF" +
      "ULL_NAME\020\004\022\017\n\013NAME_PREFIX\020\005\022\017\n\013NAME_SUFF",
      "IX\020\006\022\021\n\rDATE_OF_BIRTH\020\n\022\007\n\003SEX\020\013\022\n\n\006HEIG" +
      "HT\020\014\022\n\n\006WEIGHT\020\r\022\r\n\tEYE_COLOR\020\016\022\016\n\nHAIR_" +
      "COLOR\020\017\022\020\n\014FULL_ADDRESS\020\024\022\020\n\014ADDRESS_LIN" +
      "E\020\025\022\021\n\rADDRESS_LINE2\020\026\022\020\n\014ADDRESS_CITY\020\027" +
      "\022\017\n\013POSTAL_CODE\020\030\022\026\n\022STATE_JURISDICTION\020" +
      "\031\022\016\n\nLICENSE_ID\020\036\022\026\n\022LICENSE_ISSUE_DATE\020" +
      "\037\022\027\n\023LICENSE_EXPIRY_DATE\020 \022\027\n\023ISSUER_JUR" +
      "ISDICTION\020!\022&\n\"ISSUER_JURISDICTION_FORMA" +
      "T_VERSION\020\"\022\030\n\024UNIQUE_DOCUMENT_CODE\020(\022\032\n" +
      "\026INVENTORY_CONTROL_CODE\020)\022\021\n\rUNDER_18_DA",
      "TE\0202\022\021\n\rUNDER_19_DATE\0203\022\021\n\rUNDER_21_DATE" +
      "\0204\022\014\n\010UNDER_18\020<\022\014\n\010UNDER_19\020=\022\014\n\010UNDER_" +
      "21\020>\022\017\n\013ORGAN_DONOR\020?\022\013\n\007VETERAN\020@\022\017\n\013NO" +
      "NRESIDENT\020A\022\022\n\016RACE_ETHNICITY\020F\022\023\n\017COMPL" +
      "IANCE_TYPE\020GB%\n\037io.bloombox.schema.ident" +
      "ity.idsH\001P\001b\006proto3"
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
          io.bloombox.schema.geo.usa.USStateOuterClass.getDescriptor(),
        }, assigner);
    internal_static_identity_ids_USDLFieldValue_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_identity_ids_USDLFieldValue_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_identity_ids_USDLFieldValue_descriptor,
        new java.lang.String[] { "Field", "Value", "RawValue", "Data", });
    internal_static_identity_ids_USDL_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_identity_ids_USDL_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_identity_ids_USDL_descriptor,
        new java.lang.String[] { "Barcode", "Jurisdiction", "Fields", });
    io.bloombox.schema.geo.usa.USStateOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
