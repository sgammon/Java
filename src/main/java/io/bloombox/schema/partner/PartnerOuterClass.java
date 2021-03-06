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
// source: partner/Partner.proto

package io.bloombox.schema.partner;

public final class PartnerOuterClass {
  private PartnerOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_partner_PartnerKey_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_partner_PartnerKey_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_partner_Partner_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_partner_Partner_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_partner_PartnerFlags_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_partner_PartnerFlags_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\025partner/Partner.proto\022\007partner\032\016bq_fie" +
      "ld.proto\032\025media/MediaItem.proto\032\026tempora" +
      "l/Instant.proto\032\031contact/ContactInfo.pro" +
      "to\"\\\n\nPartnerKey\022N\n\004code\030\001 \001(\tB@\212@=Short" +
      " string that uniquely identifies a partn" +
      "er organization.\"\235\002\n\007Partner\022\014\n\004code\030\001 \001" +
      "(\t\022\014\n\004name\030\002 \001(\t\022$\n\005flags\030\003 \001(\0132\025.partne" +
      "r.PartnerFlags\022\022\n\nlegal_name\030\004 \001(\t\022%\n\007co" +
      "ntact\030\005 \001(\0132\024.contact.ContactInfo\022\"\n\010bra" +
      "nding\030\006 \001(\0132\020.media.MediaItem\022(\n\007channel",
      "\030\007 \001(\0162\027.partner.PartnerChannel\022\"\n\007creat" +
      "ed\030d \001(\0132\021.temporal.Instant\022#\n\010modified\030" +
      "e \001(\0132\021.temporal.Instant\"c\n\014PartnerFlags" +
      "\022\021\n\tsuspended\030\001 \001(\010\022\017\n\007pastdue\030\002 \001(\010\022\014\n\004" +
      "beta\030\003 \001(\010\022\017\n\007sandbox\030\004 \001(\010\022\020\n\010internal\030" +
      "\005 \001(\010*\034\n\016PartnerChannel\022\n\n\006DIRECT\020\000B \n\032i" +
      "o.bloombox.schema.partnerH\001P\001b\006proto3"
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
          gen_bq_schema.BqField.getDescriptor(),
          io.bloombox.schema.media.AttachedMedia.getDescriptor(),
          io.bloombox.schema.temporal.InstantOuterClass.getDescriptor(),
          io.bloombox.schema.contact.ContactInfoOuterClass.getDescriptor(),
        }, assigner);
    internal_static_partner_PartnerKey_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_partner_PartnerKey_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_partner_PartnerKey_descriptor,
        new java.lang.String[] { "Code", });
    internal_static_partner_Partner_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_partner_Partner_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_partner_Partner_descriptor,
        new java.lang.String[] { "Code", "Name", "Flags", "LegalName", "Contact", "Branding", "Channel", "Created", "Modified", });
    internal_static_partner_PartnerFlags_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_partner_PartnerFlags_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_partner_PartnerFlags_descriptor,
        new java.lang.String[] { "Suspended", "Pastdue", "Beta", "Sandbox", "Internal", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(gen_bq_schema.BqField.description);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    gen_bq_schema.BqField.getDescriptor();
    io.bloombox.schema.media.AttachedMedia.getDescriptor();
    io.bloombox.schema.temporal.InstantOuterClass.getDescriptor();
    io.bloombox.schema.contact.ContactInfoOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
