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

/**
 * <pre>
 * Channel through which a partner interacts with Bloombox.
 * </pre>
 *
 * Protobuf enum {@code partner.PartnerChannel}
 */
public enum PartnerChannel
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <pre>
   * Direct customers of Bloombox.
   * </pre>
   *
   * <code>DIRECT = 0;</code>
   */
  DIRECT(0),
  UNRECOGNIZED(-1),
  ;

  /**
   * <pre>
   * Direct customers of Bloombox.
   * </pre>
   *
   * <code>DIRECT = 0;</code>
   */
  public static final int DIRECT_VALUE = 0;


  public final int getNumber() {
    if (this == UNRECOGNIZED) {
      throw new java.lang.IllegalArgumentException(
          "Can't get the number of an unknown enum value.");
    }
    return value;
  }

  /**
   * @deprecated Use {@link #forNumber(int)} instead.
   */
  @java.lang.Deprecated
  public static PartnerChannel valueOf(int value) {
    return forNumber(value);
  }

  public static PartnerChannel forNumber(int value) {
    switch (value) {
      case 0: return DIRECT;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<PartnerChannel>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      PartnerChannel> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<PartnerChannel>() {
          public PartnerChannel findValueByNumber(int number) {
            return PartnerChannel.forNumber(number);
          }
        };

  public final com.google.protobuf.Descriptors.EnumValueDescriptor
      getValueDescriptor() {
    return getDescriptor().getValues().get(ordinal());
  }
  public final com.google.protobuf.Descriptors.EnumDescriptor
      getDescriptorForType() {
    return getDescriptor();
  }
  public static final com.google.protobuf.Descriptors.EnumDescriptor
      getDescriptor() {
    return io.bloombox.schema.partner.PartnerOuterClass.getDescriptor().getEnumTypes().get(0);
  }

  private static final PartnerChannel[] VALUES = values();

  public static PartnerChannel valueOf(
      com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
    if (desc.getType() != getDescriptor()) {
      throw new java.lang.IllegalArgumentException(
        "EnumValueDescriptor is not for this type.");
    }
    if (desc.getIndex() == -1) {
      return UNRECOGNIZED;
    }
    return VALUES[desc.getIndex()];
  }

  private final int value;

  private PartnerChannel(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:partner.PartnerChannel)
}

