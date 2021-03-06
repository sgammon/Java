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
// source: media/MediaType.proto

package io.bloombox.schema.media;

public final class MediaItemType {
  private MediaItemType() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_media_MediaType_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_media_MediaType_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_media_ImageType_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_media_ImageType_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_media_DocumentType_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_media_DocumentType_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_media_VideoType_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_media_VideoType_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\025media/MediaType.proto\022\005media\"\361\001\n\tMedia" +
      "Type\022#\n\004kind\030\001 \001(\0162\025.media.MediaType.Kin" +
      "d\022&\n\nimage_type\030e \001(\0132\020.media.ImageTypeH" +
      "\000\022-\n\rdocument_type\030\311\001 \001(\0132\023.media.Docume" +
      "ntTypeH\000\022\'\n\nvideo_type\030\255\002 \001(\0132\020.media.Vi" +
      "deoTypeH\000\"4\n\004Kind\022\010\n\004LINK\020\000\022\t\n\005IMAGE\020\001\022\014" +
      "\n\010DOCUMENT\020\002\022\t\n\005VIDEO\020\003B\t\n\007content\"p\n\tIm" +
      "ageType\022(\n\004kind\030\001 \001(\0162\032.media.ImageType." +
      "ImageKind\"9\n\tImageKind\022\007\n\003PNG\020\000\022\007\n\003JPG\020\001" +
      "\022\007\n\003GIF\020\002\022\007\n\003SVG\020\003\022\010\n\004WEBP\020\004\"\214\001\n\014Documen",
      "tType\022.\n\004kind\030\001 \001(\0162 .media.DocumentType" +
      ".DocumentKind\022\022\n\ncompressed\030\002 \001(\010\"8\n\014Doc" +
      "umentKind\022\007\n\003TXT\020\000\022\010\n\004HTML\020\001\022\007\n\003PDF\020\002\022\014\n" +
      "\010MARKDOWN\020\003\"]\n\tVideoType\022(\n\004kind\030\001 \001(\0162\032" +
      ".media.VideoType.VideoKind\"&\n\tVideoKind\022" +
      "\007\n\003MP4\020\000\022\007\n\003FLV\020\001\022\007\n\003HLS\020\002B0\n\030io.bloombo" +
      "x.schema.mediaB\rMediaItemTypeH\001P\001\370\001\001b\006pr" +
      "oto3"
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
        }, assigner);
    internal_static_media_MediaType_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_media_MediaType_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_media_MediaType_descriptor,
        new java.lang.String[] { "Kind", "ImageType", "DocumentType", "VideoType", "Content", });
    internal_static_media_ImageType_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_media_ImageType_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_media_ImageType_descriptor,
        new java.lang.String[] { "Kind", });
    internal_static_media_DocumentType_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_media_DocumentType_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_media_DocumentType_descriptor,
        new java.lang.String[] { "Kind", "Compressed", });
    internal_static_media_VideoType_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_media_VideoType_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_media_VideoType_descriptor,
        new java.lang.String[] { "Kind", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
