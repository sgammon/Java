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
// source: identity/IDMedia.proto

package io.bloombox.schema.identity;

public interface IDMediaAttachmentOrBuilder extends
    // @@protoc_insertion_point(interface_extends:identity.IDMediaAttachment)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.identity.IDMedia type = 1;</code>
   */
  int getTypeValue();
  /**
   * <code>.identity.IDMedia type = 1;</code>
   */
  io.bloombox.schema.identity.IDMedia getType();

  /**
   * <code>.media.MediaOrientation orientation = 2;</code>
   */
  int getOrientationValue();
  /**
   * <code>.media.MediaOrientation orientation = 2;</code>
   */
  io.bloombox.schema.media.MediaOrientation getOrientation();

  /**
   * <code>bytes data = 3;</code>
   */
  com.google.protobuf.ByteString getData();

  /**
   * <code>uint32 image_type = 4;</code>
   */
  int getImageType();

  /**
   * <code>double quality = 5;</code>
   */
  double getQuality();
}
