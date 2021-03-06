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

public final class MenuOuterClass {
  private MenuOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_products_menu_Metadata_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_products_menu_Metadata_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_products_menu_MenuProduct_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_products_menu_MenuProduct_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_products_menu_SectionData_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_products_menu_SectionData_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_products_menu_SectionedMenu_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_products_menu_SectionedMenu_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_products_menu_StaticMenu_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_products_menu_StaticMenu_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_products_menu_StaticMenu_ApothecaryEntry_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_products_menu_StaticMenu_ApothecaryEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_products_menu_StaticMenu_CartridgesEntry_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_products_menu_StaticMenu_CartridgesEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_products_menu_StaticMenu_EdiblesEntry_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_products_menu_StaticMenu_EdiblesEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_products_menu_StaticMenu_ExtractsEntry_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_products_menu_StaticMenu_ExtractsEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_products_menu_StaticMenu_FlowersEntry_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_products_menu_StaticMenu_FlowersEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_products_menu_StaticMenu_MerchandiseEntry_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_products_menu_StaticMenu_MerchandiseEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_products_menu_StaticMenu_PlantsEntry_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_products_menu_StaticMenu_PlantsEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_products_menu_StaticMenu_PrerollsEntry_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_products_menu_StaticMenu_PrerollsEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_products_menu_Menu_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_products_menu_Menu_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\030products/menu/Menu.proto\022\rproducts.men" +
      "u\032\025base/ProductKey.proto\032\026temporal/Insta" +
      "nt.proto\032\033products/menu/Section.proto\032\035p" +
      "artner/PartnerLocation.proto\032\031products/A" +
      "pothecary.proto\032\030products/Cartridge.prot" +
      "o\032\025products/Edible.proto\032\026products/Extra" +
      "ct.proto\032\025products/Flower.proto\032\032product" +
      "s/Merchandise.proto\032\024products/Plant.prot" +
      "o\032\026products/Preroll.proto\"\270\001\n\010Metadata\022*" +
      "\n\010location\030\001 \001(\0132\030.partner.PartnerLocati",
      "on\022\017\n\007version\030\002 \001(\004\022%\n\006status\030\003 \001(\0162\025.pr" +
      "oducts.menu.Status\022\"\n\005flags\030\004 \003(\0162\023.prod" +
      "ucts.menu.Flag\022$\n\tpublished\030\005 \001(\0132\021.temp" +
      "oral.Instant\",\n\013MenuProduct\022\035\n\003key\030\001 \001(\013" +
      "2\020.base.ProductKey\"~\n\013SectionData\022\r\n\005cou" +
      "nt\030\001 \001(\005\0223\n\007section\030\002 \001(\0132\".products.men" +
      "u.section.SectionSpec\022+\n\007product\030\003 \003(\0132\032" +
      ".products.menu.MenuProduct\"K\n\rSectionedM" +
      "enu\022\r\n\005count\030\001 \001(\005\022+\n\007payload\030\002 \003(\0132\032.pr" +
      "oducts.menu.SectionData\"\222\010\n\nStaticMenu\022=",
      "\n\napothecary\030\001 \003(\0132).products.menu.Stati" +
      "cMenu.ApothecaryEntry\022=\n\ncartridges\030\002 \003(" +
      "\0132).products.menu.StaticMenu.CartridgesE" +
      "ntry\0227\n\007edibles\030\003 \003(\0132&.products.menu.St" +
      "aticMenu.EdiblesEntry\0229\n\010extracts\030\004 \003(\0132" +
      "\'.products.menu.StaticMenu.ExtractsEntry" +
      "\0227\n\007flowers\030\005 \003(\0132&.products.menu.Static" +
      "Menu.FlowersEntry\022?\n\013merchandise\030\006 \003(\0132*" +
      ".products.menu.StaticMenu.MerchandiseEnt" +
      "ry\0225\n\006plants\030\007 \003(\0132%.products.menu.Stati",
      "cMenu.PlantsEntry\0229\n\010prerolls\030\010 \003(\0132\'.pr" +
      "oducts.menu.StaticMenu.PrerollsEntry\032G\n\017" +
      "ApothecaryEntry\022\013\n\003key\030\001 \001(\t\022#\n\005value\030\002 " +
      "\001(\0132\024.products.Apothecary:\0028\001\032F\n\017Cartrid" +
      "gesEntry\022\013\n\003key\030\001 \001(\t\022\"\n\005value\030\002 \001(\0132\023.p" +
      "roducts.Cartridge:\0028\001\032@\n\014EdiblesEntry\022\013\n" +
      "\003key\030\001 \001(\t\022\037\n\005value\030\002 \001(\0132\020.products.Edi" +
      "ble:\0028\001\032B\n\rExtractsEntry\022\013\n\003key\030\001 \001(\t\022 \n" +
      "\005value\030\002 \001(\0132\021.products.Extract:\0028\001\032@\n\014F" +
      "lowersEntry\022\013\n\003key\030\001 \001(\t\022\037\n\005value\030\002 \001(\0132",
      "\020.products.Flower:\0028\001\032I\n\020MerchandiseEntr" +
      "y\022\013\n\003key\030\001 \001(\t\022$\n\005value\030\002 \001(\0132\025.products" +
      ".Merchandise:\0028\001\032>\n\013PlantsEntry\022\013\n\003key\030\001" +
      " \001(\t\022\036\n\005value\030\002 \001(\0132\017.products.Plant:\0028\001" +
      "\032B\n\rPrerollsEntry\022\013\n\003key\030\001 \001(\t\022 \n\005value\030" +
      "\002 \001(\0132\021.products.Preroll:\0028\001\"\230\001\n\004Menu\022)\n" +
      "\010metadata\030\001 \001(\0132\027.products.menu.Metadata" +
      "\022/\n\007payload\030\003 \001(\0132\034.products.menu.Sectio" +
      "nedMenuH\000\022)\n\004menu\030\004 \001(\0132\031.products.menu." +
      "StaticMenuH\000B\t\n\007content*#\n\006Status\022\017\n\013UNP",
      "UBLISHED\020\000\022\010\n\004LIVE\020\001*/\n\004Flag\022\t\n\005DRAFT\020\000\022" +
      "\013\n\007PRIVATE\020\001\022\017\n\013OUT_OF_DATE\020\002B\035\n\027io.bloo" +
      "mbox.schema.menuH\001P\001b\006proto3"
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
          io.bloombox.schema.base.BaseProductKey.getDescriptor(),
          io.bloombox.schema.temporal.InstantOuterClass.getDescriptor(),
          io.bloombox.schema.menu.section.SectionOuterClass.getDescriptor(),
          io.bloombox.schema.partner.PartnerLocationOuterClass.getDescriptor(),
          io.bloombox.schema.product.ApothecaryProduct.getDescriptor(),
          io.bloombox.schema.product.CartridgeProduct.getDescriptor(),
          io.bloombox.schema.product.EdibleProduct.getDescriptor(),
          io.bloombox.schema.product.ExtractProduct.getDescriptor(),
          io.bloombox.schema.product.FlowerProduct.getDescriptor(),
          io.bloombox.schema.product.MerchandiseProduct.getDescriptor(),
          io.bloombox.schema.product.PlantProduct.getDescriptor(),
          io.bloombox.schema.product.PrerollProduct.getDescriptor(),
        }, assigner);
    internal_static_products_menu_Metadata_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_products_menu_Metadata_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_products_menu_Metadata_descriptor,
        new java.lang.String[] { "Location", "Version", "Status", "Flags", "Published", });
    internal_static_products_menu_MenuProduct_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_products_menu_MenuProduct_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_products_menu_MenuProduct_descriptor,
        new java.lang.String[] { "Key", });
    internal_static_products_menu_SectionData_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_products_menu_SectionData_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_products_menu_SectionData_descriptor,
        new java.lang.String[] { "Count", "Section", "Product", });
    internal_static_products_menu_SectionedMenu_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_products_menu_SectionedMenu_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_products_menu_SectionedMenu_descriptor,
        new java.lang.String[] { "Count", "Payload", });
    internal_static_products_menu_StaticMenu_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_products_menu_StaticMenu_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_products_menu_StaticMenu_descriptor,
        new java.lang.String[] { "Apothecary", "Cartridges", "Edibles", "Extracts", "Flowers", "Merchandise", "Plants", "Prerolls", });
    internal_static_products_menu_StaticMenu_ApothecaryEntry_descriptor =
      internal_static_products_menu_StaticMenu_descriptor.getNestedTypes().get(0);
    internal_static_products_menu_StaticMenu_ApothecaryEntry_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_products_menu_StaticMenu_ApothecaryEntry_descriptor,
        new java.lang.String[] { "Key", "Value", });
    internal_static_products_menu_StaticMenu_CartridgesEntry_descriptor =
      internal_static_products_menu_StaticMenu_descriptor.getNestedTypes().get(1);
    internal_static_products_menu_StaticMenu_CartridgesEntry_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_products_menu_StaticMenu_CartridgesEntry_descriptor,
        new java.lang.String[] { "Key", "Value", });
    internal_static_products_menu_StaticMenu_EdiblesEntry_descriptor =
      internal_static_products_menu_StaticMenu_descriptor.getNestedTypes().get(2);
    internal_static_products_menu_StaticMenu_EdiblesEntry_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_products_menu_StaticMenu_EdiblesEntry_descriptor,
        new java.lang.String[] { "Key", "Value", });
    internal_static_products_menu_StaticMenu_ExtractsEntry_descriptor =
      internal_static_products_menu_StaticMenu_descriptor.getNestedTypes().get(3);
    internal_static_products_menu_StaticMenu_ExtractsEntry_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_products_menu_StaticMenu_ExtractsEntry_descriptor,
        new java.lang.String[] { "Key", "Value", });
    internal_static_products_menu_StaticMenu_FlowersEntry_descriptor =
      internal_static_products_menu_StaticMenu_descriptor.getNestedTypes().get(4);
    internal_static_products_menu_StaticMenu_FlowersEntry_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_products_menu_StaticMenu_FlowersEntry_descriptor,
        new java.lang.String[] { "Key", "Value", });
    internal_static_products_menu_StaticMenu_MerchandiseEntry_descriptor =
      internal_static_products_menu_StaticMenu_descriptor.getNestedTypes().get(5);
    internal_static_products_menu_StaticMenu_MerchandiseEntry_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_products_menu_StaticMenu_MerchandiseEntry_descriptor,
        new java.lang.String[] { "Key", "Value", });
    internal_static_products_menu_StaticMenu_PlantsEntry_descriptor =
      internal_static_products_menu_StaticMenu_descriptor.getNestedTypes().get(6);
    internal_static_products_menu_StaticMenu_PlantsEntry_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_products_menu_StaticMenu_PlantsEntry_descriptor,
        new java.lang.String[] { "Key", "Value", });
    internal_static_products_menu_StaticMenu_PrerollsEntry_descriptor =
      internal_static_products_menu_StaticMenu_descriptor.getNestedTypes().get(7);
    internal_static_products_menu_StaticMenu_PrerollsEntry_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_products_menu_StaticMenu_PrerollsEntry_descriptor,
        new java.lang.String[] { "Key", "Value", });
    internal_static_products_menu_Menu_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_products_menu_Menu_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_products_menu_Menu_descriptor,
        new java.lang.String[] { "Metadata", "Payload", "Menu", "Content", });
    io.bloombox.schema.base.BaseProductKey.getDescriptor();
    io.bloombox.schema.temporal.InstantOuterClass.getDescriptor();
    io.bloombox.schema.menu.section.SectionOuterClass.getDescriptor();
    io.bloombox.schema.partner.PartnerLocationOuterClass.getDescriptor();
    io.bloombox.schema.product.ApothecaryProduct.getDescriptor();
    io.bloombox.schema.product.CartridgeProduct.getDescriptor();
    io.bloombox.schema.product.EdibleProduct.getDescriptor();
    io.bloombox.schema.product.ExtractProduct.getDescriptor();
    io.bloombox.schema.product.FlowerProduct.getDescriptor();
    io.bloombox.schema.product.MerchandiseProduct.getDescriptor();
    io.bloombox.schema.product.PlantProduct.getDescriptor();
    io.bloombox.schema.product.PrerollProduct.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
