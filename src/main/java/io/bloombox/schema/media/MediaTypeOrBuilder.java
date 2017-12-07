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

public interface MediaTypeOrBuilder extends
    // @@protoc_insertion_point(interface_extends:media.MediaType)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.media.MediaType.Kind kind = 1;</code>
   */
  int getKindValue();
  /**
   * <code>.media.MediaType.Kind kind = 1;</code>
   */
  io.bloombox.schema.media.MediaType.Kind getKind();

  /**
   * <code>.media.ImageType image_type = 101;</code>
   */
  boolean hasImageType();
  /**
   * <code>.media.ImageType image_type = 101;</code>
   */
  io.bloombox.schema.media.ImageType getImageType();
  /**
   * <code>.media.ImageType image_type = 101;</code>
   */
  io.bloombox.schema.media.ImageTypeOrBuilder getImageTypeOrBuilder();

  /**
   * <code>.media.DocumentType document_type = 201;</code>
   */
  boolean hasDocumentType();
  /**
   * <code>.media.DocumentType document_type = 201;</code>
   */
  io.bloombox.schema.media.DocumentType getDocumentType();
  /**
   * <code>.media.DocumentType document_type = 201;</code>
   */
  io.bloombox.schema.media.DocumentTypeOrBuilder getDocumentTypeOrBuilder();

  /**
   * <code>.media.VideoType video_type = 301;</code>
   */
  boolean hasVideoType();
  /**
   * <code>.media.VideoType video_type = 301;</code>
   */
  io.bloombox.schema.media.VideoType getVideoType();
  /**
   * <code>.media.VideoType video_type = 301;</code>
   */
  io.bloombox.schema.media.VideoTypeOrBuilder getVideoTypeOrBuilder();

  public io.bloombox.schema.media.MediaType.ContentCase getContentCase();
}