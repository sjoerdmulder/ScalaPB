// Generated by the Scala Plugin for the Protocol Buffer Compiler.
// Do not edit!
//
// Protofile syntax: PROTO2

package scalapb.options

object ScalapbProto extends _root_.scalapb.GeneratedFileObject {
  lazy val dependencies: Seq[_root_.scalapb.GeneratedFileObject] = Seq(
    com.google.protobuf.descriptor.DescriptorProtoCompanion
  )
  lazy val messagesCompanions: Seq[_root_.scalapb.GeneratedMessageCompanion[_]] = Seq(
    scalapb.options.ScalaPbOptions,
    scalapb.options.MessageOptions,
    scalapb.options.FieldOptions,
    scalapb.options.EnumOptions,
    scalapb.options.EnumValueOptions,
    scalapb.options.OneofOptions
  )
  private lazy val ProtoBytes: Array[Byte] =
      scalapb.Encoding.fromBase64(scala.collection.Seq(
  """ChVzY2FsYXBiL3NjYWxhcGIucHJvdG8SB3NjYWxhcGIaIGdvb2dsZS9wcm90b2J1Zi9kZXNjcmlwdG9yLnByb3RvIrMDCg5TY
  2FsYVBiT3B0aW9ucxIhCgxwYWNrYWdlX25hbWUYASABKAlSC3BhY2thZ2VOYW1lEiEKDGZsYXRfcGFja2FnZRgCIAEoCFILZmxhd
  FBhY2thZ2USFgoGaW1wb3J0GAMgAygJUgZpbXBvcnQSGgoIcHJlYW1ibGUYBCADKAlSCHByZWFtYmxlEh8KC3NpbmdsZV9maWxlG
  AUgASgIUgpzaW5nbGVGaWxlEjIKFW5vX3ByaW1pdGl2ZV93cmFwcGVycxgHIAEoCFITbm9QcmltaXRpdmVXcmFwcGVycxItChJwc
  mltaXRpdmVfd3JhcHBlcnMYBiABKAhSEXByaW1pdGl2ZVdyYXBwZXJzEicKD2NvbGxlY3Rpb25fdHlwZRgIIAEoCVIOY29sbGVjd
  GlvblR5cGUSNgoXcHJlc2VydmVfdW5rbm93bl9maWVsZHMYCSABKAhSFXByZXNlcnZlVW5rbm93bkZpZWxkcxJCCh10ZXN0X29ub
  Hlfbm9famF2YV9jb252ZXJzaW9ucxihjQYgASgIUhl0ZXN0T25seU5vSmF2YUNvbnZlcnNpb25zIsIBCg5NZXNzYWdlT3B0aW9uc
  xIYCgdleHRlbmRzGAEgAygJUgdleHRlbmRzEisKEWNvbXBhbmlvbl9leHRlbmRzGAIgAygJUhBjb21wYW5pb25FeHRlbmRzEiAKC
  2Fubm90YXRpb25zGAMgAygJUgthbm5vdGF0aW9ucxISCgR0eXBlGAQgASgJUgR0eXBlEjMKFWNvbXBhbmlvbl9hbm5vdGF0aW9uc
  xgFIAMoCVIUY29tcGFuaW9uQW5ub3RhdGlvbnMi3QEKDEZpZWxkT3B0aW9ucxISCgR0eXBlGAEgASgJUgR0eXBlEh0KCnNjYWxhX
  25hbWUYAiABKAlSCXNjYWxhTmFtZRInCg9jb2xsZWN0aW9uX3R5cGUYAyABKAlSDmNvbGxlY3Rpb25UeXBlEhkKCGtleV90eXBlG
  AQgASgJUgdrZXlUeXBlEh0KCnZhbHVlX3R5cGUYBSABKAlSCXZhbHVlVHlwZRIgCgthbm5vdGF0aW9ucxgGIAMoCVILYW5ub3Rhd
  GlvbnMSFQoGbm9fYm94GB4gASgIUgVub0JveCJoCgtFbnVtT3B0aW9ucxIYCgdleHRlbmRzGAEgAygJUgdleHRlbmRzEisKEWNvb
  XBhbmlvbl9leHRlbmRzGAIgAygJUhBjb21wYW5pb25FeHRlbmRzEhIKBHR5cGUYAyABKAlSBHR5cGUiLAoQRW51bVZhbHVlT3B0a
  W9ucxIYCgdleHRlbmRzGAEgAygJUgdleHRlbmRzIigKDE9uZW9mT3B0aW9ucxIYCgdleHRlbmRzGAEgAygJUgdleHRlbmRzOlAKB
  29wdGlvbnMSHC5nb29nbGUucHJvdG9idWYuRmlsZU9wdGlvbnMY/AcgASgLMhcuc2NhbGFwYi5TY2FsYVBiT3B0aW9uc1IHb3B0a
  W9uczpTCgdtZXNzYWdlEh8uZ29vZ2xlLnByb3RvYnVmLk1lc3NhZ2VPcHRpb25zGPwHIAEoCzIXLnNjYWxhcGIuTWVzc2FnZU9wd
  GlvbnNSB21lc3NhZ2U6SwoFZmllbGQSHS5nb29nbGUucHJvdG9idWYuRmllbGRPcHRpb25zGPwHIAEoCzIVLnNjYWxhcGIuRmllb
  GRPcHRpb25zUgVmaWVsZDpWCgxlbnVtX29wdGlvbnMSHC5nb29nbGUucHJvdG9idWYuRW51bU9wdGlvbnMY/AcgASgLMhQuc2Nhb
  GFwYi5FbnVtT3B0aW9uc1ILZW51bU9wdGlvbnM6XAoKZW51bV92YWx1ZRIhLmdvb2dsZS5wcm90b2J1Zi5FbnVtVmFsdWVPcHRpb
  25zGPwHIAEoCzIZLnNjYWxhcGIuRW51bVZhbHVlT3B0aW9uc1IJZW51bVZhbHVlOksKBW9uZW9mEh0uZ29vZ2xlLnByb3RvYnVmL
  k9uZW9mT3B0aW9ucxj8ByABKAsyFS5zY2FsYXBiLk9uZW9mT3B0aW9uc1IFb25lb2ZCJwoPc2NhbGFwYi5vcHRpb25z4j8TCg9zY
  2FsYXBiLm9wdGlvbnMQAQ=="""
      ).mkString)
  lazy val scalaDescriptor: _root_.scalapb.descriptors.FileDescriptor = {
    val scalaProto = com.google.protobuf.descriptor.FileDescriptorProto.parseFrom(ProtoBytes)
    _root_.scalapb.descriptors.FileDescriptor.buildFrom(scalaProto, dependencies.map(_.scalaDescriptor))
  }
  lazy val javaDescriptor: com.google.protobuf.Descriptors.FileDescriptor = {
    val javaProto = com.google.protobuf.DescriptorProtos.FileDescriptorProto.parseFrom(ProtoBytes)
    com.google.protobuf.Descriptors.FileDescriptor.buildFrom(javaProto, Array(
      com.google.protobuf.descriptor.DescriptorProtoCompanion.javaDescriptor
    ))
  }
  @deprecated("Use javaDescriptor instead. In a future version this will refer to scalaDescriptor.", "ScalaPB 0.5.47")
  def descriptor: com.google.protobuf.Descriptors.FileDescriptor = javaDescriptor
  val options: _root_.scalapb.GeneratedExtension[com.google.protobuf.descriptor.FileOptions, scala.Option[scalapb.options.ScalaPbOptions]] =
    _root_.scalapb.GeneratedExtension.forOptionalUnknownField(1020, _root_.scalapb.UnknownFieldSet.Field.lengthDelimitedLens)({__valueIn => _root_.scalapb.GeneratedExtension.readMessageFromByteString(scalapb.options.ScalaPbOptions)(__valueIn)}, {__valueIn => __valueIn.toByteString})
  val message: _root_.scalapb.GeneratedExtension[com.google.protobuf.descriptor.MessageOptions, scala.Option[scalapb.options.MessageOptions]] =
    _root_.scalapb.GeneratedExtension.forOptionalUnknownField(1020, _root_.scalapb.UnknownFieldSet.Field.lengthDelimitedLens)({__valueIn => _root_.scalapb.GeneratedExtension.readMessageFromByteString(scalapb.options.MessageOptions)(__valueIn)}, {__valueIn => __valueIn.toByteString})
  val field: _root_.scalapb.GeneratedExtension[com.google.protobuf.descriptor.FieldOptions, scala.Option[scalapb.options.FieldOptions]] =
    _root_.scalapb.GeneratedExtension.forOptionalUnknownField(1020, _root_.scalapb.UnknownFieldSet.Field.lengthDelimitedLens)({__valueIn => _root_.scalapb.GeneratedExtension.readMessageFromByteString(scalapb.options.FieldOptions)(__valueIn)}, {__valueIn => __valueIn.toByteString})
  val enumOptions: _root_.scalapb.GeneratedExtension[com.google.protobuf.descriptor.EnumOptions, scala.Option[scalapb.options.EnumOptions]] =
    _root_.scalapb.GeneratedExtension.forOptionalUnknownField(1020, _root_.scalapb.UnknownFieldSet.Field.lengthDelimitedLens)({__valueIn => _root_.scalapb.GeneratedExtension.readMessageFromByteString(scalapb.options.EnumOptions)(__valueIn)}, {__valueIn => __valueIn.toByteString})
  val enumValue: _root_.scalapb.GeneratedExtension[com.google.protobuf.descriptor.EnumValueOptions, scala.Option[scalapb.options.EnumValueOptions]] =
    _root_.scalapb.GeneratedExtension.forOptionalUnknownField(1020, _root_.scalapb.UnknownFieldSet.Field.lengthDelimitedLens)({__valueIn => _root_.scalapb.GeneratedExtension.readMessageFromByteString(scalapb.options.EnumValueOptions)(__valueIn)}, {__valueIn => __valueIn.toByteString})
  val oneof: _root_.scalapb.GeneratedExtension[com.google.protobuf.descriptor.OneofOptions, scala.Option[scalapb.options.OneofOptions]] =
    _root_.scalapb.GeneratedExtension.forOptionalUnknownField(1020, _root_.scalapb.UnknownFieldSet.Field.lengthDelimitedLens)({__valueIn => _root_.scalapb.GeneratedExtension.readMessageFromByteString(scalapb.options.OneofOptions)(__valueIn)}, {__valueIn => __valueIn.toByteString})
}