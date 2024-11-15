// Generated by the Scala Plugin for the Protocol Buffer Compiler.
// Do not edit!

package com.google.protobuf.descriptor
import _root_.scalapb.internal.compat.JavaConverters._

/** Encapsulates information about the original source file from which a
  * FileDescriptorProto was generated.
  *
  * @param location
  *   A Location identifies a piece of source code in a .proto file which
  *   corresponds to a particular definition.  This information is intended
  *   to be useful to IDEs, code indexers, documentation generators, and similar
  *   tools.
  *  
  *   For example, say we have a file like:
  *     message Foo {
  *       optional string foo = 1;
  *     }
  *   Let's look at just the field definition:
  *     optional string foo = 1;
  *     ^       ^^     ^^  ^  ^^^
  *     a       bc     de  f  ghi
  *   We have the following locations:
  *     span   path               represents
  *     [a,i)  [ 4, 0, 2, 0 ]     The whole field definition.
  *     [a,b)  [ 4, 0, 2, 0, 4 ]  The label (optional).
  *     [c,d)  [ 4, 0, 2, 0, 5 ]  The type (string).
  *     [e,f)  [ 4, 0, 2, 0, 1 ]  The name (foo).
  *     [g,h)  [ 4, 0, 2, 0, 3 ]  The number (1).
  *  
  *   Notes:
  *   - A location may refer to a repeated field itself (i.e. not to any
  *     particular index within it).  This is used whenever a set of elements are
  *     logically enclosed in a single code segment.  For example, an entire
  *     extend block (possibly containing multiple extension definitions) will
  *     have an outer location whose path refers to the "extensions" repeated
  *     field without an index.
  *   - Multiple locations may have the same path.  This happens when a single
  *     logical declaration is spread out across multiple places.  The most
  *     obvious example is the "extend" block again -- there may be multiple
  *     extend blocks in the same scope, each of which will have the same path.
  *   - A location's span is not always a subset of its parent's span.  For
  *     example, the "extendee" of an extension declaration appears at the
  *     beginning of the "extend" block and is shared by all extensions within
  *     the block.
  *   - Just because a location's span is a subset of some other location's span
  *     does not mean that it is a descendant.  For example, a "group" defines
  *     both a type and a field in a single declaration.  Thus, the locations
  *     corresponding to the type and field and their components will overlap.
  *   - Code which tries to interpret locations should probably be designed to
  *     ignore those that it doesn't understand, as more types of locations could
  *     be recorded in the future.
  */
@SerialVersionUID(0L)
final case class SourceCodeInfo(
    location: _root_.scala.Seq[com.google.protobuf.descriptor.SourceCodeInfo.Location] = _root_.scala.Vector.empty,
    unknownFields: _root_.scalapb.UnknownFieldSet = _root_.scalapb.UnknownFieldSet.empty
    ) extends scalapb.GeneratedMessage with scalapb.lenses.Updatable[SourceCodeInfo] {
    @transient
    private[this] var __serializedSizeMemoized: _root_.scala.Int = 0
    private[this] def __computeSerializedSize(): _root_.scala.Int = {
      var __size = 0
      location.foreach { __item =>
        val __value = __item
        __size += 1 + _root_.com.google.protobuf.CodedOutputStream.computeUInt32SizeNoTag(__value.serializedSize) + __value.serializedSize
      }
      __size += unknownFields.serializedSize
      __size
    }
    override def serializedSize: _root_.scala.Int = {
      var __size = __serializedSizeMemoized
      if (__size == 0) {
        __size = __computeSerializedSize() + 1
        __serializedSizeMemoized = __size
      }
      __size - 1
      
    }
    def writeTo(`_output__`: _root_.com.google.protobuf.CodedOutputStream): _root_.scala.Unit = {
      location.foreach { __v =>
        val __m = __v
        _output__.writeTag(1, 2)
        _output__.writeUInt32NoTag(__m.serializedSize)
        __m.writeTo(_output__)
      };
      unknownFields.writeTo(_output__)
    }
    def clearLocation = copy(location = _root_.scala.Vector.empty)
    def addLocation(__vs: com.google.protobuf.descriptor.SourceCodeInfo.Location *): SourceCodeInfo = addAllLocation(__vs)
    def addAllLocation(__vs: Iterable[com.google.protobuf.descriptor.SourceCodeInfo.Location]): SourceCodeInfo = copy(location = location ++ __vs)
    def withLocation(__v: _root_.scala.Seq[com.google.protobuf.descriptor.SourceCodeInfo.Location]): SourceCodeInfo = copy(location = __v)
    def withUnknownFields(__v: _root_.scalapb.UnknownFieldSet) = copy(unknownFields = __v)
    def discardUnknownFields = copy(unknownFields = _root_.scalapb.UnknownFieldSet.empty)
    def getFieldByNumber(__fieldNumber: _root_.scala.Int): _root_.scala.Any = {
      (__fieldNumber: @_root_.scala.unchecked) match {
        case 1 => location
      }
    }
    def getField(__field: _root_.scalapb.descriptors.FieldDescriptor): _root_.scalapb.descriptors.PValue = {
      _root_.scala.Predef.require(__field.containingMessage eq companion.scalaDescriptor)
      (__field.number: @_root_.scala.unchecked) match {
        case 1 => _root_.scalapb.descriptors.PRepeated(location.iterator.map(_.toPMessage).toVector)
      }
    }
    def toProtoString: _root_.scala.Predef.String = _root_.scalapb.TextFormat.printToUnicodeString(this)
    def companion: com.google.protobuf.descriptor.SourceCodeInfo.type = com.google.protobuf.descriptor.SourceCodeInfo
    // @@protoc_insertion_point(GeneratedMessage[google.protobuf.SourceCodeInfo])
}

object SourceCodeInfo extends scalapb.GeneratedMessageCompanion[com.google.protobuf.descriptor.SourceCodeInfo] with scalapb.JavaProtoSupport[com.google.protobuf.descriptor.SourceCodeInfo, com.google.protobuf.DescriptorProtos.SourceCodeInfo] {
  implicit def messageCompanion: scalapb.GeneratedMessageCompanion[com.google.protobuf.descriptor.SourceCodeInfo] with scalapb.JavaProtoSupport[com.google.protobuf.descriptor.SourceCodeInfo, com.google.protobuf.DescriptorProtos.SourceCodeInfo] = this
  def toJavaProto(scalaPbSource: com.google.protobuf.descriptor.SourceCodeInfo): com.google.protobuf.DescriptorProtos.SourceCodeInfo = {
    val javaPbOut = com.google.protobuf.DescriptorProtos.SourceCodeInfo.newBuilder
    javaPbOut.addAllLocation(_root_.scalapb.internal.compat.toIterable(scalaPbSource.location.iterator.map(com.google.protobuf.descriptor.SourceCodeInfo.Location.toJavaProto(_))).asJava)
    javaPbOut.build
  }
  def fromJavaProto(javaPbSource: com.google.protobuf.DescriptorProtos.SourceCodeInfo): com.google.protobuf.descriptor.SourceCodeInfo = com.google.protobuf.descriptor.SourceCodeInfo(
    location = javaPbSource.getLocationList.asScala.iterator.map(com.google.protobuf.descriptor.SourceCodeInfo.Location.fromJavaProto(_)).toSeq
  )
  def parseFrom(`_input__`: _root_.com.google.protobuf.CodedInputStream): com.google.protobuf.descriptor.SourceCodeInfo = {
    val __location: _root_.scala.collection.immutable.VectorBuilder[com.google.protobuf.descriptor.SourceCodeInfo.Location] = new _root_.scala.collection.immutable.VectorBuilder[com.google.protobuf.descriptor.SourceCodeInfo.Location]
    var `_unknownFields__`: _root_.scalapb.UnknownFieldSet.Builder = null
    var _done__ = false
    while (!_done__) {
      val _tag__ = _input__.readTag()
      _tag__ match {
        case 0 => _done__ = true
        case 10 =>
          __location += _root_.scalapb.LiteParser.readMessage[com.google.protobuf.descriptor.SourceCodeInfo.Location](_input__)
        case tag =>
          if (_unknownFields__ == null) {
            _unknownFields__ = new _root_.scalapb.UnknownFieldSet.Builder()
          }
          _unknownFields__.parseField(tag, _input__)
      }
    }
    com.google.protobuf.descriptor.SourceCodeInfo(
        location = __location.result(),
        unknownFields = if (_unknownFields__ == null) _root_.scalapb.UnknownFieldSet.empty else _unknownFields__.result()
    )
  }
  implicit def messageReads: _root_.scalapb.descriptors.Reads[com.google.protobuf.descriptor.SourceCodeInfo] = _root_.scalapb.descriptors.Reads{
    case _root_.scalapb.descriptors.PMessage(__fieldsMap) =>
      _root_.scala.Predef.require(__fieldsMap.keys.forall(_.containingMessage eq scalaDescriptor), "FieldDescriptor does not match message type.")
      com.google.protobuf.descriptor.SourceCodeInfo(
        location = __fieldsMap.get(scalaDescriptor.findFieldByNumber(1).get).map(_.as[_root_.scala.Seq[com.google.protobuf.descriptor.SourceCodeInfo.Location]]).getOrElse(_root_.scala.Seq.empty)
      )
    case _ => throw new RuntimeException("Expected PMessage")
  }
  def javaDescriptor: _root_.com.google.protobuf.Descriptors.Descriptor = com.google.protobuf.descriptor.DescriptorProtoCompanion.javaDescriptor.getMessageTypes().get(21)
  def scalaDescriptor: _root_.scalapb.descriptors.Descriptor = com.google.protobuf.descriptor.DescriptorProtoCompanion.scalaDescriptor.messages(21)
  def messageCompanionForFieldNumber(__number: _root_.scala.Int): _root_.scalapb.GeneratedMessageCompanion[_] = {
    var __out: _root_.scalapb.GeneratedMessageCompanion[_] = null
    (__number: @_root_.scala.unchecked) match {
      case 1 => __out = com.google.protobuf.descriptor.SourceCodeInfo.Location
    }
    __out
  }
  lazy val nestedMessagesCompanions: Seq[_root_.scalapb.GeneratedMessageCompanion[_ <: _root_.scalapb.GeneratedMessage]] =
    Seq[_root_.scalapb.GeneratedMessageCompanion[_ <: _root_.scalapb.GeneratedMessage]](
      _root_.com.google.protobuf.descriptor.SourceCodeInfo.Location
    )
  def enumCompanionForFieldNumber(__fieldNumber: _root_.scala.Int): _root_.scalapb.GeneratedEnumCompanion[_] = throw new MatchError(__fieldNumber)
  lazy val defaultInstance = com.google.protobuf.descriptor.SourceCodeInfo(
    location = _root_.scala.Vector.empty
  )
  /** @param path
    *   Identifies which part of the FileDescriptorProto was defined at this
    *   location.
    *  
    *   Each element is a field number or an index.  They form a path from
    *   the root FileDescriptorProto to the place where the definition appears.
    *   For example, this path:
    *     [ 4, 3, 2, 7, 1 ]
    *   refers to:
    *     file.message_type(3)  // 4, 3
    *         .field(7)         // 2, 7
    *         .name()           // 1
    *   This is because FileDescriptorProto.message_type has field number 4:
    *     repeated DescriptorProto message_type = 4;
    *   and DescriptorProto.field has field number 2:
    *     repeated FieldDescriptorProto field = 2;
    *   and FieldDescriptorProto.name has field number 1:
    *     optional string name = 1;
    *  
    *   Thus, the above path gives the location of a field name.  If we removed
    *   the last element:
    *     [ 4, 3, 2, 7 ]
    *   this path refers to the whole field declaration (from the beginning
    *   of the label to the terminating semicolon).
    * @param span
    *   Always has exactly three or four elements: start line, start column,
    *   end line (optional, otherwise assumed same as start line), end column.
    *   These are packed into a single field for efficiency.  Note that line
    *   and column numbers are zero-based -- typically you will want to add
    *   1 to each before displaying to a user.
    * @param leadingComments
    *   If this SourceCodeInfo represents a complete declaration, these are any
    *   comments appearing before and after the declaration which appear to be
    *   attached to the declaration.
    *  
    *   A series of line comments appearing on consecutive lines, with no other
    *   tokens appearing on those lines, will be treated as a single comment.
    *  
    *   leading_detached_comments will keep paragraphs of comments that appear
    *   before (but not connected to) the current element. Each paragraph,
    *   separated by empty lines, will be one comment element in the repeated
    *   field.
    *  
    *   Only the comment content is provided; comment markers (e.g. //) are
    *   stripped out.  For block comments, leading whitespace and an asterisk
    *   will be stripped from the beginning of each line other than the first.
    *   Newlines are included in the output.
    *  
    *   Examples:
    *  
    *     optional int32 foo = 1;  // Comment attached to foo.
    *     // Comment attached to bar.
    *     optional int32 bar = 2;
    *  
    *     optional string baz = 3;
    *     // Comment attached to baz.
    *     // Another line attached to baz.
    *  
    *     // Comment attached to moo.
    *     //
    *     // Another line attached to moo.
    *     optional double moo = 4;
    *  
    *     // Detached comment for corge. This is not leading or trailing comments
    *     // to moo or corge because there are blank lines separating it from
    *     // both.
    *  
    *     // Detached comment for corge paragraph 2.
    *  
    *     optional string corge = 5;
    *     /&#42; Block comment attached
    *      * to corge.  Leading asterisks
    *      * will be removed. *&#47;
    *     /&#42; Block comment attached to
    *      * grault. *&#47;
    *     optional int32 grault = 6;
    *  
    *     // ignored detached comments.
    */
  @SerialVersionUID(0L)
  final case class Location(
      path: _root_.scala.Seq[_root_.scala.Int] = _root_.scala.Vector.empty,
      span: _root_.scala.Seq[_root_.scala.Int] = _root_.scala.Vector.empty,
      leadingComments: _root_.scala.Option[_root_.scala.Predef.String] = _root_.scala.None,
      trailingComments: _root_.scala.Option[_root_.scala.Predef.String] = _root_.scala.None,
      leadingDetachedComments: _root_.scala.Seq[_root_.scala.Predef.String] = _root_.scala.Vector.empty,
      unknownFields: _root_.scalapb.UnknownFieldSet = _root_.scalapb.UnknownFieldSet.empty
      ) extends scalapb.GeneratedMessage with scalapb.lenses.Updatable[Location] {
      private[this] def pathSerializedSize = {
        if (__pathSerializedSizeField == 0) __pathSerializedSizeField = {
          var __s: _root_.scala.Int = 0
          path.foreach(__i => __s += _root_.com.google.protobuf.CodedOutputStream.computeInt32SizeNoTag(__i))
          __s
        }
        __pathSerializedSizeField
      }
      @transient private[this] var __pathSerializedSizeField: _root_.scala.Int = 0
      private[this] def spanSerializedSize = {
        if (__spanSerializedSizeField == 0) __spanSerializedSizeField = {
          var __s: _root_.scala.Int = 0
          span.foreach(__i => __s += _root_.com.google.protobuf.CodedOutputStream.computeInt32SizeNoTag(__i))
          __s
        }
        __spanSerializedSizeField
      }
      @transient private[this] var __spanSerializedSizeField: _root_.scala.Int = 0
      @transient
      private[this] var __serializedSizeMemoized: _root_.scala.Int = 0
      private[this] def __computeSerializedSize(): _root_.scala.Int = {
        var __size = 0
        if (path.nonEmpty) {
          val __localsize = pathSerializedSize
          __size += 1 + _root_.com.google.protobuf.CodedOutputStream.computeUInt32SizeNoTag(__localsize) + __localsize
        }
        if (span.nonEmpty) {
          val __localsize = spanSerializedSize
          __size += 1 + _root_.com.google.protobuf.CodedOutputStream.computeUInt32SizeNoTag(__localsize) + __localsize
        }
        if (leadingComments.isDefined) {
          val __value = leadingComments.get
          __size += _root_.com.google.protobuf.CodedOutputStream.computeStringSize(3, __value)
        };
        if (trailingComments.isDefined) {
          val __value = trailingComments.get
          __size += _root_.com.google.protobuf.CodedOutputStream.computeStringSize(4, __value)
        };
        leadingDetachedComments.foreach { __item =>
          val __value = __item
          __size += _root_.com.google.protobuf.CodedOutputStream.computeStringSize(6, __value)
        }
        __size += unknownFields.serializedSize
        __size
      }
      override def serializedSize: _root_.scala.Int = {
        var __size = __serializedSizeMemoized
        if (__size == 0) {
          __size = __computeSerializedSize() + 1
          __serializedSizeMemoized = __size
        }
        __size - 1
        
      }
      def writeTo(`_output__`: _root_.com.google.protobuf.CodedOutputStream): _root_.scala.Unit = {
        if (path.nonEmpty) {
          _output__.writeTag(1, 2)
          _output__.writeUInt32NoTag(pathSerializedSize)
          path.foreach(_output__.writeInt32NoTag)
        };
        if (span.nonEmpty) {
          _output__.writeTag(2, 2)
          _output__.writeUInt32NoTag(spanSerializedSize)
          span.foreach(_output__.writeInt32NoTag)
        };
        leadingComments.foreach { __v =>
          val __m = __v
          _output__.writeString(3, __m)
        };
        trailingComments.foreach { __v =>
          val __m = __v
          _output__.writeString(4, __m)
        };
        leadingDetachedComments.foreach { __v =>
          val __m = __v
          _output__.writeString(6, __m)
        };
        unknownFields.writeTo(_output__)
      }
      def clearPath = copy(path = _root_.scala.Vector.empty)
      def addPath(__vs: _root_.scala.Int *): Location = addAllPath(__vs)
      def addAllPath(__vs: Iterable[_root_.scala.Int]): Location = copy(path = path ++ __vs)
      def withPath(__v: _root_.scala.Seq[_root_.scala.Int]): Location = copy(path = __v)
      def clearSpan = copy(span = _root_.scala.Vector.empty)
      def addSpan(__vs: _root_.scala.Int *): Location = addAllSpan(__vs)
      def addAllSpan(__vs: Iterable[_root_.scala.Int]): Location = copy(span = span ++ __vs)
      def withSpan(__v: _root_.scala.Seq[_root_.scala.Int]): Location = copy(span = __v)
      def getLeadingComments: _root_.scala.Predef.String = leadingComments.getOrElse("")
      def clearLeadingComments: Location = copy(leadingComments = _root_.scala.None)
      def withLeadingComments(__v: _root_.scala.Predef.String): Location = copy(leadingComments = _root_.scala.Option(__v))
      def getTrailingComments: _root_.scala.Predef.String = trailingComments.getOrElse("")
      def clearTrailingComments: Location = copy(trailingComments = _root_.scala.None)
      def withTrailingComments(__v: _root_.scala.Predef.String): Location = copy(trailingComments = _root_.scala.Option(__v))
      def clearLeadingDetachedComments = copy(leadingDetachedComments = _root_.scala.Vector.empty)
      def addLeadingDetachedComments(__vs: _root_.scala.Predef.String *): Location = addAllLeadingDetachedComments(__vs)
      def addAllLeadingDetachedComments(__vs: Iterable[_root_.scala.Predef.String]): Location = copy(leadingDetachedComments = leadingDetachedComments ++ __vs)
      def withLeadingDetachedComments(__v: _root_.scala.Seq[_root_.scala.Predef.String]): Location = copy(leadingDetachedComments = __v)
      def withUnknownFields(__v: _root_.scalapb.UnknownFieldSet) = copy(unknownFields = __v)
      def discardUnknownFields = copy(unknownFields = _root_.scalapb.UnknownFieldSet.empty)
      def getFieldByNumber(__fieldNumber: _root_.scala.Int): _root_.scala.Any = {
        (__fieldNumber: @_root_.scala.unchecked) match {
          case 1 => path
          case 2 => span
          case 3 => leadingComments.orNull
          case 4 => trailingComments.orNull
          case 6 => leadingDetachedComments
        }
      }
      def getField(__field: _root_.scalapb.descriptors.FieldDescriptor): _root_.scalapb.descriptors.PValue = {
        _root_.scala.Predef.require(__field.containingMessage eq companion.scalaDescriptor)
        (__field.number: @_root_.scala.unchecked) match {
          case 1 => _root_.scalapb.descriptors.PRepeated(path.iterator.map(_root_.scalapb.descriptors.PInt(_)).toVector)
          case 2 => _root_.scalapb.descriptors.PRepeated(span.iterator.map(_root_.scalapb.descriptors.PInt(_)).toVector)
          case 3 => leadingComments.map(_root_.scalapb.descriptors.PString(_)).getOrElse(_root_.scalapb.descriptors.PEmpty)
          case 4 => trailingComments.map(_root_.scalapb.descriptors.PString(_)).getOrElse(_root_.scalapb.descriptors.PEmpty)
          case 6 => _root_.scalapb.descriptors.PRepeated(leadingDetachedComments.iterator.map(_root_.scalapb.descriptors.PString(_)).toVector)
        }
      }
      def toProtoString: _root_.scala.Predef.String = _root_.scalapb.TextFormat.printToUnicodeString(this)
      def companion: com.google.protobuf.descriptor.SourceCodeInfo.Location.type = com.google.protobuf.descriptor.SourceCodeInfo.Location
      // @@protoc_insertion_point(GeneratedMessage[google.protobuf.SourceCodeInfo.Location])
  }
  
  object Location extends scalapb.GeneratedMessageCompanion[com.google.protobuf.descriptor.SourceCodeInfo.Location] with scalapb.JavaProtoSupport[com.google.protobuf.descriptor.SourceCodeInfo.Location, com.google.protobuf.DescriptorProtos.SourceCodeInfo.Location] {
    implicit def messageCompanion: scalapb.GeneratedMessageCompanion[com.google.protobuf.descriptor.SourceCodeInfo.Location] with scalapb.JavaProtoSupport[com.google.protobuf.descriptor.SourceCodeInfo.Location, com.google.protobuf.DescriptorProtos.SourceCodeInfo.Location] = this
    def toJavaProto(scalaPbSource: com.google.protobuf.descriptor.SourceCodeInfo.Location): com.google.protobuf.DescriptorProtos.SourceCodeInfo.Location = {
      val javaPbOut = com.google.protobuf.DescriptorProtos.SourceCodeInfo.Location.newBuilder
      javaPbOut.addAllPath(_root_.scalapb.internal.compat.toIterable(scalaPbSource.path.iterator.map(_root_.scala.Int.box(_))).asJava)
      javaPbOut.addAllSpan(_root_.scalapb.internal.compat.toIterable(scalaPbSource.span.iterator.map(_root_.scala.Int.box(_))).asJava)
      scalaPbSource.leadingComments.foreach(javaPbOut.setLeadingComments)
      scalaPbSource.trailingComments.foreach(javaPbOut.setTrailingComments)
      javaPbOut.addAllLeadingDetachedComments(scalaPbSource.leadingDetachedComments.asJava)
      javaPbOut.build
    }
    def fromJavaProto(javaPbSource: com.google.protobuf.DescriptorProtos.SourceCodeInfo.Location): com.google.protobuf.descriptor.SourceCodeInfo.Location = com.google.protobuf.descriptor.SourceCodeInfo.Location(
      path = javaPbSource.getPathList.asScala.iterator.map(_.intValue).toSeq,
      span = javaPbSource.getSpanList.asScala.iterator.map(_.intValue).toSeq,
      leadingComments = if (javaPbSource.hasLeadingComments) Some(javaPbSource.getLeadingComments) else _root_.scala.None,
      trailingComments = if (javaPbSource.hasTrailingComments) Some(javaPbSource.getTrailingComments) else _root_.scala.None,
      leadingDetachedComments = javaPbSource.getLeadingDetachedCommentsList.asScala.iterator.map(_root_.scala.Predef.identity).toSeq
    )
    def parseFrom(`_input__`: _root_.com.google.protobuf.CodedInputStream): com.google.protobuf.descriptor.SourceCodeInfo.Location = {
      val __path: _root_.scala.collection.immutable.VectorBuilder[_root_.scala.Int] = new _root_.scala.collection.immutable.VectorBuilder[_root_.scala.Int]
      val __span: _root_.scala.collection.immutable.VectorBuilder[_root_.scala.Int] = new _root_.scala.collection.immutable.VectorBuilder[_root_.scala.Int]
      var __leadingComments: _root_.scala.Option[_root_.scala.Predef.String] = _root_.scala.None
      var __trailingComments: _root_.scala.Option[_root_.scala.Predef.String] = _root_.scala.None
      val __leadingDetachedComments: _root_.scala.collection.immutable.VectorBuilder[_root_.scala.Predef.String] = new _root_.scala.collection.immutable.VectorBuilder[_root_.scala.Predef.String]
      var `_unknownFields__`: _root_.scalapb.UnknownFieldSet.Builder = null
      var _done__ = false
      while (!_done__) {
        val _tag__ = _input__.readTag()
        _tag__ match {
          case 0 => _done__ = true
          case 8 =>
            __path += _input__.readInt32()
          case 10 => {
            val length = _input__.readRawVarint32()
            val oldLimit = _input__.pushLimit(length)
            while (_input__.getBytesUntilLimit > 0) {
              __path += _input__.readInt32()
            }
            _input__.popLimit(oldLimit)
          }
          case 16 =>
            __span += _input__.readInt32()
          case 18 => {
            val length = _input__.readRawVarint32()
            val oldLimit = _input__.pushLimit(length)
            while (_input__.getBytesUntilLimit > 0) {
              __span += _input__.readInt32()
            }
            _input__.popLimit(oldLimit)
          }
          case 26 =>
            __leadingComments = _root_.scala.Option(_input__.readStringRequireUtf8())
          case 34 =>
            __trailingComments = _root_.scala.Option(_input__.readStringRequireUtf8())
          case 50 =>
            __leadingDetachedComments += _input__.readStringRequireUtf8()
          case tag =>
            if (_unknownFields__ == null) {
              _unknownFields__ = new _root_.scalapb.UnknownFieldSet.Builder()
            }
            _unknownFields__.parseField(tag, _input__)
        }
      }
      com.google.protobuf.descriptor.SourceCodeInfo.Location(
          path = __path.result(),
          span = __span.result(),
          leadingComments = __leadingComments,
          trailingComments = __trailingComments,
          leadingDetachedComments = __leadingDetachedComments.result(),
          unknownFields = if (_unknownFields__ == null) _root_.scalapb.UnknownFieldSet.empty else _unknownFields__.result()
      )
    }
    implicit def messageReads: _root_.scalapb.descriptors.Reads[com.google.protobuf.descriptor.SourceCodeInfo.Location] = _root_.scalapb.descriptors.Reads{
      case _root_.scalapb.descriptors.PMessage(__fieldsMap) =>
        _root_.scala.Predef.require(__fieldsMap.keys.forall(_.containingMessage eq scalaDescriptor), "FieldDescriptor does not match message type.")
        com.google.protobuf.descriptor.SourceCodeInfo.Location(
          path = __fieldsMap.get(scalaDescriptor.findFieldByNumber(1).get).map(_.as[_root_.scala.Seq[_root_.scala.Int]]).getOrElse(_root_.scala.Seq.empty),
          span = __fieldsMap.get(scalaDescriptor.findFieldByNumber(2).get).map(_.as[_root_.scala.Seq[_root_.scala.Int]]).getOrElse(_root_.scala.Seq.empty),
          leadingComments = __fieldsMap.get(scalaDescriptor.findFieldByNumber(3).get).flatMap(_.as[_root_.scala.Option[_root_.scala.Predef.String]]),
          trailingComments = __fieldsMap.get(scalaDescriptor.findFieldByNumber(4).get).flatMap(_.as[_root_.scala.Option[_root_.scala.Predef.String]]),
          leadingDetachedComments = __fieldsMap.get(scalaDescriptor.findFieldByNumber(6).get).map(_.as[_root_.scala.Seq[_root_.scala.Predef.String]]).getOrElse(_root_.scala.Seq.empty)
        )
      case _ => throw new RuntimeException("Expected PMessage")
    }
    def javaDescriptor: _root_.com.google.protobuf.Descriptors.Descriptor = com.google.protobuf.descriptor.SourceCodeInfo.javaDescriptor.getNestedTypes().get(0)
    def scalaDescriptor: _root_.scalapb.descriptors.Descriptor = com.google.protobuf.descriptor.SourceCodeInfo.scalaDescriptor.nestedMessages(0)
    def messageCompanionForFieldNumber(__number: _root_.scala.Int): _root_.scalapb.GeneratedMessageCompanion[_] = throw new MatchError(__number)
    lazy val nestedMessagesCompanions: Seq[_root_.scalapb.GeneratedMessageCompanion[_ <: _root_.scalapb.GeneratedMessage]] = Seq.empty
    def enumCompanionForFieldNumber(__fieldNumber: _root_.scala.Int): _root_.scalapb.GeneratedEnumCompanion[_] = throw new MatchError(__fieldNumber)
    lazy val defaultInstance = com.google.protobuf.descriptor.SourceCodeInfo.Location(
      path = _root_.scala.Vector.empty,
      span = _root_.scala.Vector.empty,
      leadingComments = _root_.scala.None,
      trailingComments = _root_.scala.None,
      leadingDetachedComments = _root_.scala.Vector.empty
    )
    implicit class LocationLens[UpperPB](_l: _root_.scalapb.lenses.Lens[UpperPB, com.google.protobuf.descriptor.SourceCodeInfo.Location]) extends _root_.scalapb.lenses.ObjectLens[UpperPB, com.google.protobuf.descriptor.SourceCodeInfo.Location](_l) {
      def path: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Seq[_root_.scala.Int]] = field(_.path)((c_, f_) => c_.copy(path = f_))
      def span: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Seq[_root_.scala.Int]] = field(_.span)((c_, f_) => c_.copy(span = f_))
      def leadingComments: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Predef.String] = field(_.getLeadingComments)((c_, f_) => c_.copy(leadingComments = _root_.scala.Option(f_)))
      def optionalLeadingComments: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Option[_root_.scala.Predef.String]] = field(_.leadingComments)((c_, f_) => c_.copy(leadingComments = f_))
      def trailingComments: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Predef.String] = field(_.getTrailingComments)((c_, f_) => c_.copy(trailingComments = _root_.scala.Option(f_)))
      def optionalTrailingComments: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Option[_root_.scala.Predef.String]] = field(_.trailingComments)((c_, f_) => c_.copy(trailingComments = f_))
      def leadingDetachedComments: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Seq[_root_.scala.Predef.String]] = field(_.leadingDetachedComments)((c_, f_) => c_.copy(leadingDetachedComments = f_))
    }
    final val PATH_FIELD_NUMBER = 1
    final val SPAN_FIELD_NUMBER = 2
    final val LEADING_COMMENTS_FIELD_NUMBER = 3
    final val TRAILING_COMMENTS_FIELD_NUMBER = 4
    final val LEADING_DETACHED_COMMENTS_FIELD_NUMBER = 6
    def of(
      path: _root_.scala.Seq[_root_.scala.Int],
      span: _root_.scala.Seq[_root_.scala.Int],
      leadingComments: _root_.scala.Option[_root_.scala.Predef.String],
      trailingComments: _root_.scala.Option[_root_.scala.Predef.String],
      leadingDetachedComments: _root_.scala.Seq[_root_.scala.Predef.String]
    ): _root_.com.google.protobuf.descriptor.SourceCodeInfo.Location = _root_.com.google.protobuf.descriptor.SourceCodeInfo.Location(
      path,
      span,
      leadingComments,
      trailingComments,
      leadingDetachedComments
    )
    // @@protoc_insertion_point(GeneratedMessageCompanion[google.protobuf.SourceCodeInfo.Location])
  }
  
  implicit class SourceCodeInfoLens[UpperPB](_l: _root_.scalapb.lenses.Lens[UpperPB, com.google.protobuf.descriptor.SourceCodeInfo]) extends _root_.scalapb.lenses.ObjectLens[UpperPB, com.google.protobuf.descriptor.SourceCodeInfo](_l) {
    def location: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Seq[com.google.protobuf.descriptor.SourceCodeInfo.Location]] = field(_.location)((c_, f_) => c_.copy(location = f_))
  }
  final val LOCATION_FIELD_NUMBER = 1
  def of(
    location: _root_.scala.Seq[com.google.protobuf.descriptor.SourceCodeInfo.Location]
  ): _root_.com.google.protobuf.descriptor.SourceCodeInfo = _root_.com.google.protobuf.descriptor.SourceCodeInfo(
    location
  )
  // @@protoc_insertion_point(GeneratedMessageCompanion[google.protobuf.SourceCodeInfo])
}
