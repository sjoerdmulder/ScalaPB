// Generated by the Scala Plugin for the Protocol Buffer Compiler.
// Do not edit!
//
// Protofile syntax: PROTO2

package scalapb.options

/** @param extends
  *   Additional classes and traits to mix in to the case class.
  * @param companionExtends
  *   Additional classes and traits to mix in to the companion object.
  * @param annotations
  *   Custom annotations to add to the generated case class.
  * @param type
  *   All instances of this message will be converted to this type. An implicit TypeMapper
  *   must be present.
  * @param companionAnnotations
  *   Custom annotations to add to the companion object of the generated class.
  * @param sealedOneofExtends
  *   Additional classes and traits to mix in to generated sealed_oneof base trait.
  * @param noBox
  *   If true, when this message is used as an optional field, do not wrap it in an `Option`.
  *   This is equivalent of setting `(field).no_box` to true on each field with the message type.
  * @param unknownFieldsAnnotations
  *   Custom annotations to add to the generated `unknownFields` case class field.
  * @param noDefaultValuesInConstructor
  *   If true, no default values will be generated in message constructors.
  *   If set (to true or false), the message-level setting overrides the
  *   file-level value, and can be overridden by the field-level setting.
  * @param sealedOneofCompanionExtends
  *   Additional classes and traits to mix in to generated sealed oneof base trait's companion object.
  * @param derives
  *   Adds a derives clause to the message case class
  * @param sealedOneofDerives
  *   Additional classes and traits to add to the derives clause of a sealed oneof.
  * @param sealedOneofEmptyExtends
  *   Additional traits to mixin for the empty case object of sealed oneofs.
  */
@SerialVersionUID(0L)
final case class MessageOptions(
    `extends`: _root_.scala.Seq[_root_.scala.Predef.String] = _root_.scala.Seq.empty,
    companionExtends: _root_.scala.Seq[_root_.scala.Predef.String] = _root_.scala.Seq.empty,
    annotations: _root_.scala.Seq[_root_.scala.Predef.String] = _root_.scala.Seq.empty,
    `type`: _root_.scala.Option[_root_.scala.Predef.String] = _root_.scala.None,
    companionAnnotations: _root_.scala.Seq[_root_.scala.Predef.String] = _root_.scala.Seq.empty,
    sealedOneofExtends: _root_.scala.Seq[_root_.scala.Predef.String] = _root_.scala.Seq.empty,
    noBox: _root_.scala.Option[_root_.scala.Boolean] = _root_.scala.None,
    unknownFieldsAnnotations: _root_.scala.Seq[_root_.scala.Predef.String] = _root_.scala.Seq.empty,
    noDefaultValuesInConstructor: _root_.scala.Option[_root_.scala.Boolean] = _root_.scala.None,
    sealedOneofCompanionExtends: _root_.scala.Seq[_root_.scala.Predef.String] = _root_.scala.Seq.empty,
    derives: _root_.scala.Seq[_root_.scala.Predef.String] = _root_.scala.Seq.empty,
    sealedOneofDerives: _root_.scala.Seq[_root_.scala.Predef.String] = _root_.scala.Seq.empty,
    sealedOneofEmptyExtends: _root_.scala.Seq[_root_.scala.Predef.String] = _root_.scala.Seq.empty,
    unknownFields: _root_.scalapb.UnknownFieldSet = _root_.scalapb.UnknownFieldSet.empty
    ) extends scalapb.GeneratedMessage with scalapb.lenses.Updatable[MessageOptions] with _root_.scalapb.ExtendableMessage[MessageOptions] {
    @transient
    private[this] var __serializedSizeMemoized: _root_.scala.Int = 0
    private[this] def __computeSerializedSize(): _root_.scala.Int = {
      var __size = 0
      `extends`.foreach { __item =>
        val __value = __item
        __size += _root_.com.google.protobuf.CodedOutputStream.computeStringSize(1, __value)
      }
      companionExtends.foreach { __item =>
        val __value = __item
        __size += _root_.com.google.protobuf.CodedOutputStream.computeStringSize(2, __value)
      }
      annotations.foreach { __item =>
        val __value = __item
        __size += _root_.com.google.protobuf.CodedOutputStream.computeStringSize(3, __value)
      }
      if (`type`.isDefined) {
        val __value = `type`.get
        __size += _root_.com.google.protobuf.CodedOutputStream.computeStringSize(4, __value)
      };
      companionAnnotations.foreach { __item =>
        val __value = __item
        __size += _root_.com.google.protobuf.CodedOutputStream.computeStringSize(5, __value)
      }
      sealedOneofExtends.foreach { __item =>
        val __value = __item
        __size += _root_.com.google.protobuf.CodedOutputStream.computeStringSize(6, __value)
      }
      if (noBox.isDefined) {
        val __value = noBox.get
        __size += _root_.com.google.protobuf.CodedOutputStream.computeBoolSize(7, __value)
      };
      unknownFieldsAnnotations.foreach { __item =>
        val __value = __item
        __size += _root_.com.google.protobuf.CodedOutputStream.computeStringSize(8, __value)
      }
      if (noDefaultValuesInConstructor.isDefined) {
        val __value = noDefaultValuesInConstructor.get
        __size += _root_.com.google.protobuf.CodedOutputStream.computeBoolSize(9, __value)
      };
      sealedOneofCompanionExtends.foreach { __item =>
        val __value = __item
        __size += _root_.com.google.protobuf.CodedOutputStream.computeStringSize(10, __value)
      }
      derives.foreach { __item =>
        val __value = __item
        __size += _root_.com.google.protobuf.CodedOutputStream.computeStringSize(11, __value)
      }
      sealedOneofDerives.foreach { __item =>
        val __value = __item
        __size += _root_.com.google.protobuf.CodedOutputStream.computeStringSize(12, __value)
      }
      sealedOneofEmptyExtends.foreach { __item =>
        val __value = __item
        __size += _root_.com.google.protobuf.CodedOutputStream.computeStringSize(13, __value)
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
      `extends`.foreach { __v =>
        val __m = __v
        _output__.writeString(1, __m)
      };
      companionExtends.foreach { __v =>
        val __m = __v
        _output__.writeString(2, __m)
      };
      annotations.foreach { __v =>
        val __m = __v
        _output__.writeString(3, __m)
      };
      `type`.foreach { __v =>
        val __m = __v
        _output__.writeString(4, __m)
      };
      companionAnnotations.foreach { __v =>
        val __m = __v
        _output__.writeString(5, __m)
      };
      sealedOneofExtends.foreach { __v =>
        val __m = __v
        _output__.writeString(6, __m)
      };
      noBox.foreach { __v =>
        val __m = __v
        _output__.writeBool(7, __m)
      };
      unknownFieldsAnnotations.foreach { __v =>
        val __m = __v
        _output__.writeString(8, __m)
      };
      noDefaultValuesInConstructor.foreach { __v =>
        val __m = __v
        _output__.writeBool(9, __m)
      };
      sealedOneofCompanionExtends.foreach { __v =>
        val __m = __v
        _output__.writeString(10, __m)
      };
      derives.foreach { __v =>
        val __m = __v
        _output__.writeString(11, __m)
      };
      sealedOneofDerives.foreach { __v =>
        val __m = __v
        _output__.writeString(12, __m)
      };
      sealedOneofEmptyExtends.foreach { __v =>
        val __m = __v
        _output__.writeString(13, __m)
      };
      unknownFields.writeTo(_output__)
    }
    def clearExtends = copy(`extends` = _root_.scala.Seq.empty)
    def addExtends(__vs: _root_.scala.Predef.String *): MessageOptions = addAllExtends(__vs)
    def addAllExtends(__vs: Iterable[_root_.scala.Predef.String]): MessageOptions = copy(`extends` = `extends` ++ __vs)
    def withExtends(__v: _root_.scala.Seq[_root_.scala.Predef.String]): MessageOptions = copy(`extends` = __v)
    def clearCompanionExtends = copy(companionExtends = _root_.scala.Seq.empty)
    def addCompanionExtends(__vs: _root_.scala.Predef.String *): MessageOptions = addAllCompanionExtends(__vs)
    def addAllCompanionExtends(__vs: Iterable[_root_.scala.Predef.String]): MessageOptions = copy(companionExtends = companionExtends ++ __vs)
    def withCompanionExtends(__v: _root_.scala.Seq[_root_.scala.Predef.String]): MessageOptions = copy(companionExtends = __v)
    def clearAnnotations = copy(annotations = _root_.scala.Seq.empty)
    def addAnnotations(__vs: _root_.scala.Predef.String *): MessageOptions = addAllAnnotations(__vs)
    def addAllAnnotations(__vs: Iterable[_root_.scala.Predef.String]): MessageOptions = copy(annotations = annotations ++ __vs)
    def withAnnotations(__v: _root_.scala.Seq[_root_.scala.Predef.String]): MessageOptions = copy(annotations = __v)
    def getType: _root_.scala.Predef.String = `type`.getOrElse("")
    def clearType: MessageOptions = copy(`type` = _root_.scala.None)
    def withType(__v: _root_.scala.Predef.String): MessageOptions = copy(`type` = Option(__v))
    def clearCompanionAnnotations = copy(companionAnnotations = _root_.scala.Seq.empty)
    def addCompanionAnnotations(__vs: _root_.scala.Predef.String *): MessageOptions = addAllCompanionAnnotations(__vs)
    def addAllCompanionAnnotations(__vs: Iterable[_root_.scala.Predef.String]): MessageOptions = copy(companionAnnotations = companionAnnotations ++ __vs)
    def withCompanionAnnotations(__v: _root_.scala.Seq[_root_.scala.Predef.String]): MessageOptions = copy(companionAnnotations = __v)
    def clearSealedOneofExtends = copy(sealedOneofExtends = _root_.scala.Seq.empty)
    def addSealedOneofExtends(__vs: _root_.scala.Predef.String *): MessageOptions = addAllSealedOneofExtends(__vs)
    def addAllSealedOneofExtends(__vs: Iterable[_root_.scala.Predef.String]): MessageOptions = copy(sealedOneofExtends = sealedOneofExtends ++ __vs)
    def withSealedOneofExtends(__v: _root_.scala.Seq[_root_.scala.Predef.String]): MessageOptions = copy(sealedOneofExtends = __v)
    def getNoBox: _root_.scala.Boolean = noBox.getOrElse(false)
    def clearNoBox: MessageOptions = copy(noBox = _root_.scala.None)
    def withNoBox(__v: _root_.scala.Boolean): MessageOptions = copy(noBox = Option(__v))
    def clearUnknownFieldsAnnotations = copy(unknownFieldsAnnotations = _root_.scala.Seq.empty)
    def addUnknownFieldsAnnotations(__vs: _root_.scala.Predef.String *): MessageOptions = addAllUnknownFieldsAnnotations(__vs)
    def addAllUnknownFieldsAnnotations(__vs: Iterable[_root_.scala.Predef.String]): MessageOptions = copy(unknownFieldsAnnotations = unknownFieldsAnnotations ++ __vs)
    def withUnknownFieldsAnnotations(__v: _root_.scala.Seq[_root_.scala.Predef.String]): MessageOptions = copy(unknownFieldsAnnotations = __v)
    def getNoDefaultValuesInConstructor: _root_.scala.Boolean = noDefaultValuesInConstructor.getOrElse(false)
    def clearNoDefaultValuesInConstructor: MessageOptions = copy(noDefaultValuesInConstructor = _root_.scala.None)
    def withNoDefaultValuesInConstructor(__v: _root_.scala.Boolean): MessageOptions = copy(noDefaultValuesInConstructor = Option(__v))
    def clearSealedOneofCompanionExtends = copy(sealedOneofCompanionExtends = _root_.scala.Seq.empty)
    def addSealedOneofCompanionExtends(__vs: _root_.scala.Predef.String *): MessageOptions = addAllSealedOneofCompanionExtends(__vs)
    def addAllSealedOneofCompanionExtends(__vs: Iterable[_root_.scala.Predef.String]): MessageOptions = copy(sealedOneofCompanionExtends = sealedOneofCompanionExtends ++ __vs)
    def withSealedOneofCompanionExtends(__v: _root_.scala.Seq[_root_.scala.Predef.String]): MessageOptions = copy(sealedOneofCompanionExtends = __v)
    def clearDerives = copy(derives = _root_.scala.Seq.empty)
    def addDerives(__vs: _root_.scala.Predef.String *): MessageOptions = addAllDerives(__vs)
    def addAllDerives(__vs: Iterable[_root_.scala.Predef.String]): MessageOptions = copy(derives = derives ++ __vs)
    def withDerives(__v: _root_.scala.Seq[_root_.scala.Predef.String]): MessageOptions = copy(derives = __v)
    def clearSealedOneofDerives = copy(sealedOneofDerives = _root_.scala.Seq.empty)
    def addSealedOneofDerives(__vs: _root_.scala.Predef.String *): MessageOptions = addAllSealedOneofDerives(__vs)
    def addAllSealedOneofDerives(__vs: Iterable[_root_.scala.Predef.String]): MessageOptions = copy(sealedOneofDerives = sealedOneofDerives ++ __vs)
    def withSealedOneofDerives(__v: _root_.scala.Seq[_root_.scala.Predef.String]): MessageOptions = copy(sealedOneofDerives = __v)
    def clearSealedOneofEmptyExtends = copy(sealedOneofEmptyExtends = _root_.scala.Seq.empty)
    def addSealedOneofEmptyExtends(__vs: _root_.scala.Predef.String *): MessageOptions = addAllSealedOneofEmptyExtends(__vs)
    def addAllSealedOneofEmptyExtends(__vs: Iterable[_root_.scala.Predef.String]): MessageOptions = copy(sealedOneofEmptyExtends = sealedOneofEmptyExtends ++ __vs)
    def withSealedOneofEmptyExtends(__v: _root_.scala.Seq[_root_.scala.Predef.String]): MessageOptions = copy(sealedOneofEmptyExtends = __v)
    def withUnknownFields(__v: _root_.scalapb.UnknownFieldSet) = copy(unknownFields = __v)
    def discardUnknownFields = copy(unknownFields = _root_.scalapb.UnknownFieldSet.empty)
    def getFieldByNumber(__fieldNumber: _root_.scala.Int): _root_.scala.Any = {
      (__fieldNumber: @_root_.scala.unchecked) match {
        case 1 => `extends`
        case 2 => companionExtends
        case 3 => annotations
        case 4 => `type`.orNull
        case 5 => companionAnnotations
        case 6 => sealedOneofExtends
        case 7 => noBox.orNull
        case 8 => unknownFieldsAnnotations
        case 9 => noDefaultValuesInConstructor.orNull
        case 10 => sealedOneofCompanionExtends
        case 11 => derives
        case 12 => sealedOneofDerives
        case 13 => sealedOneofEmptyExtends
      }
    }
    def getField(__field: _root_.scalapb.descriptors.FieldDescriptor): _root_.scalapb.descriptors.PValue = {
      _root_.scala.Predef.require(__field.containingMessage eq companion.scalaDescriptor)
      (__field.number: @_root_.scala.unchecked) match {
        case 1 => _root_.scalapb.descriptors.PRepeated(`extends`.iterator.map(_root_.scalapb.descriptors.PString(_)).toVector)
        case 2 => _root_.scalapb.descriptors.PRepeated(companionExtends.iterator.map(_root_.scalapb.descriptors.PString(_)).toVector)
        case 3 => _root_.scalapb.descriptors.PRepeated(annotations.iterator.map(_root_.scalapb.descriptors.PString(_)).toVector)
        case 4 => `type`.map(_root_.scalapb.descriptors.PString(_)).getOrElse(_root_.scalapb.descriptors.PEmpty)
        case 5 => _root_.scalapb.descriptors.PRepeated(companionAnnotations.iterator.map(_root_.scalapb.descriptors.PString(_)).toVector)
        case 6 => _root_.scalapb.descriptors.PRepeated(sealedOneofExtends.iterator.map(_root_.scalapb.descriptors.PString(_)).toVector)
        case 7 => noBox.map(_root_.scalapb.descriptors.PBoolean(_)).getOrElse(_root_.scalapb.descriptors.PEmpty)
        case 8 => _root_.scalapb.descriptors.PRepeated(unknownFieldsAnnotations.iterator.map(_root_.scalapb.descriptors.PString(_)).toVector)
        case 9 => noDefaultValuesInConstructor.map(_root_.scalapb.descriptors.PBoolean(_)).getOrElse(_root_.scalapb.descriptors.PEmpty)
        case 10 => _root_.scalapb.descriptors.PRepeated(sealedOneofCompanionExtends.iterator.map(_root_.scalapb.descriptors.PString(_)).toVector)
        case 11 => _root_.scalapb.descriptors.PRepeated(derives.iterator.map(_root_.scalapb.descriptors.PString(_)).toVector)
        case 12 => _root_.scalapb.descriptors.PRepeated(sealedOneofDerives.iterator.map(_root_.scalapb.descriptors.PString(_)).toVector)
        case 13 => _root_.scalapb.descriptors.PRepeated(sealedOneofEmptyExtends.iterator.map(_root_.scalapb.descriptors.PString(_)).toVector)
      }
    }
    def toProtoString: _root_.scala.Predef.String = _root_.scalapb.TextFormat.printToUnicodeString(this)
    def companion: scalapb.options.MessageOptions.type = scalapb.options.MessageOptions
    // @@protoc_insertion_point(GeneratedMessage[scalapb.MessageOptions])
}

object MessageOptions extends scalapb.GeneratedMessageCompanion[scalapb.options.MessageOptions] {
  implicit def messageCompanion: scalapb.GeneratedMessageCompanion[scalapb.options.MessageOptions] = this
  def parseFrom(`_input__`: _root_.com.google.protobuf.CodedInputStream): scalapb.options.MessageOptions = {
    val __extends: _root_.scala.collection.immutable.VectorBuilder[_root_.scala.Predef.String] = new _root_.scala.collection.immutable.VectorBuilder[_root_.scala.Predef.String]
    val __companionExtends: _root_.scala.collection.immutable.VectorBuilder[_root_.scala.Predef.String] = new _root_.scala.collection.immutable.VectorBuilder[_root_.scala.Predef.String]
    val __annotations: _root_.scala.collection.immutable.VectorBuilder[_root_.scala.Predef.String] = new _root_.scala.collection.immutable.VectorBuilder[_root_.scala.Predef.String]
    var __type: _root_.scala.Option[_root_.scala.Predef.String] = _root_.scala.None
    val __companionAnnotations: _root_.scala.collection.immutable.VectorBuilder[_root_.scala.Predef.String] = new _root_.scala.collection.immutable.VectorBuilder[_root_.scala.Predef.String]
    val __sealedOneofExtends: _root_.scala.collection.immutable.VectorBuilder[_root_.scala.Predef.String] = new _root_.scala.collection.immutable.VectorBuilder[_root_.scala.Predef.String]
    var __noBox: _root_.scala.Option[_root_.scala.Boolean] = _root_.scala.None
    val __unknownFieldsAnnotations: _root_.scala.collection.immutable.VectorBuilder[_root_.scala.Predef.String] = new _root_.scala.collection.immutable.VectorBuilder[_root_.scala.Predef.String]
    var __noDefaultValuesInConstructor: _root_.scala.Option[_root_.scala.Boolean] = _root_.scala.None
    val __sealedOneofCompanionExtends: _root_.scala.collection.immutable.VectorBuilder[_root_.scala.Predef.String] = new _root_.scala.collection.immutable.VectorBuilder[_root_.scala.Predef.String]
    val __derives: _root_.scala.collection.immutable.VectorBuilder[_root_.scala.Predef.String] = new _root_.scala.collection.immutable.VectorBuilder[_root_.scala.Predef.String]
    val __sealedOneofDerives: _root_.scala.collection.immutable.VectorBuilder[_root_.scala.Predef.String] = new _root_.scala.collection.immutable.VectorBuilder[_root_.scala.Predef.String]
    val __sealedOneofEmptyExtends: _root_.scala.collection.immutable.VectorBuilder[_root_.scala.Predef.String] = new _root_.scala.collection.immutable.VectorBuilder[_root_.scala.Predef.String]
    var `_unknownFields__`: _root_.scalapb.UnknownFieldSet.Builder = null
    var _done__ = false
    while (!_done__) {
      val _tag__ = _input__.readTag()
      _tag__ match {
        case 0 => _done__ = true
        case 10 =>
          __extends += _input__.readStringRequireUtf8()
        case 18 =>
          __companionExtends += _input__.readStringRequireUtf8()
        case 26 =>
          __annotations += _input__.readStringRequireUtf8()
        case 34 =>
          __type = _root_.scala.Option(_input__.readStringRequireUtf8())
        case 42 =>
          __companionAnnotations += _input__.readStringRequireUtf8()
        case 50 =>
          __sealedOneofExtends += _input__.readStringRequireUtf8()
        case 56 =>
          __noBox = _root_.scala.Option(_input__.readBool())
        case 66 =>
          __unknownFieldsAnnotations += _input__.readStringRequireUtf8()
        case 72 =>
          __noDefaultValuesInConstructor = _root_.scala.Option(_input__.readBool())
        case 82 =>
          __sealedOneofCompanionExtends += _input__.readStringRequireUtf8()
        case 90 =>
          __derives += _input__.readStringRequireUtf8()
        case 98 =>
          __sealedOneofDerives += _input__.readStringRequireUtf8()
        case 106 =>
          __sealedOneofEmptyExtends += _input__.readStringRequireUtf8()
        case tag =>
          if (_unknownFields__ == null) {
            _unknownFields__ = new _root_.scalapb.UnknownFieldSet.Builder()
          }
          _unknownFields__.parseField(tag, _input__)
      }
    }
    scalapb.options.MessageOptions(
        `extends` = __extends.result(),
        companionExtends = __companionExtends.result(),
        annotations = __annotations.result(),
        `type` = __type,
        companionAnnotations = __companionAnnotations.result(),
        sealedOneofExtends = __sealedOneofExtends.result(),
        noBox = __noBox,
        unknownFieldsAnnotations = __unknownFieldsAnnotations.result(),
        noDefaultValuesInConstructor = __noDefaultValuesInConstructor,
        sealedOneofCompanionExtends = __sealedOneofCompanionExtends.result(),
        derives = __derives.result(),
        sealedOneofDerives = __sealedOneofDerives.result(),
        sealedOneofEmptyExtends = __sealedOneofEmptyExtends.result(),
        unknownFields = if (_unknownFields__ == null) _root_.scalapb.UnknownFieldSet.empty else _unknownFields__.result()
    )
  }
  implicit def messageReads: _root_.scalapb.descriptors.Reads[scalapb.options.MessageOptions] = _root_.scalapb.descriptors.Reads{
    case _root_.scalapb.descriptors.PMessage(__fieldsMap) =>
      _root_.scala.Predef.require(__fieldsMap.keys.forall(_.containingMessage eq scalaDescriptor), "FieldDescriptor does not match message type.")
      scalapb.options.MessageOptions(
        `extends` = __fieldsMap.get(scalaDescriptor.findFieldByNumber(1).get).map(_.as[_root_.scala.Seq[_root_.scala.Predef.String]]).getOrElse(_root_.scala.Seq.empty),
        companionExtends = __fieldsMap.get(scalaDescriptor.findFieldByNumber(2).get).map(_.as[_root_.scala.Seq[_root_.scala.Predef.String]]).getOrElse(_root_.scala.Seq.empty),
        annotations = __fieldsMap.get(scalaDescriptor.findFieldByNumber(3).get).map(_.as[_root_.scala.Seq[_root_.scala.Predef.String]]).getOrElse(_root_.scala.Seq.empty),
        `type` = __fieldsMap.get(scalaDescriptor.findFieldByNumber(4).get).flatMap(_.as[_root_.scala.Option[_root_.scala.Predef.String]]),
        companionAnnotations = __fieldsMap.get(scalaDescriptor.findFieldByNumber(5).get).map(_.as[_root_.scala.Seq[_root_.scala.Predef.String]]).getOrElse(_root_.scala.Seq.empty),
        sealedOneofExtends = __fieldsMap.get(scalaDescriptor.findFieldByNumber(6).get).map(_.as[_root_.scala.Seq[_root_.scala.Predef.String]]).getOrElse(_root_.scala.Seq.empty),
        noBox = __fieldsMap.get(scalaDescriptor.findFieldByNumber(7).get).flatMap(_.as[_root_.scala.Option[_root_.scala.Boolean]]),
        unknownFieldsAnnotations = __fieldsMap.get(scalaDescriptor.findFieldByNumber(8).get).map(_.as[_root_.scala.Seq[_root_.scala.Predef.String]]).getOrElse(_root_.scala.Seq.empty),
        noDefaultValuesInConstructor = __fieldsMap.get(scalaDescriptor.findFieldByNumber(9).get).flatMap(_.as[_root_.scala.Option[_root_.scala.Boolean]]),
        sealedOneofCompanionExtends = __fieldsMap.get(scalaDescriptor.findFieldByNumber(10).get).map(_.as[_root_.scala.Seq[_root_.scala.Predef.String]]).getOrElse(_root_.scala.Seq.empty),
        derives = __fieldsMap.get(scalaDescriptor.findFieldByNumber(11).get).map(_.as[_root_.scala.Seq[_root_.scala.Predef.String]]).getOrElse(_root_.scala.Seq.empty),
        sealedOneofDerives = __fieldsMap.get(scalaDescriptor.findFieldByNumber(12).get).map(_.as[_root_.scala.Seq[_root_.scala.Predef.String]]).getOrElse(_root_.scala.Seq.empty),
        sealedOneofEmptyExtends = __fieldsMap.get(scalaDescriptor.findFieldByNumber(13).get).map(_.as[_root_.scala.Seq[_root_.scala.Predef.String]]).getOrElse(_root_.scala.Seq.empty)
      )
    case _ => throw new RuntimeException("Expected PMessage")
  }
  def javaDescriptor: _root_.com.google.protobuf.Descriptors.Descriptor = ScalapbProto.javaDescriptor.getMessageTypes().get(1)
  def scalaDescriptor: _root_.scalapb.descriptors.Descriptor = ScalapbProto.scalaDescriptor.messages(1)
  def messageCompanionForFieldNumber(__number: _root_.scala.Int): _root_.scalapb.GeneratedMessageCompanion[_] = throw new MatchError(__number)
  lazy val nestedMessagesCompanions: Seq[_root_.scalapb.GeneratedMessageCompanion[_ <: _root_.scalapb.GeneratedMessage]] = Seq.empty
  def enumCompanionForFieldNumber(__fieldNumber: _root_.scala.Int): _root_.scalapb.GeneratedEnumCompanion[_] = throw new MatchError(__fieldNumber)
  lazy val defaultInstance = scalapb.options.MessageOptions(
    `extends` = _root_.scala.Seq.empty,
    companionExtends = _root_.scala.Seq.empty,
    annotations = _root_.scala.Seq.empty,
    `type` = _root_.scala.None,
    companionAnnotations = _root_.scala.Seq.empty,
    sealedOneofExtends = _root_.scala.Seq.empty,
    noBox = _root_.scala.None,
    unknownFieldsAnnotations = _root_.scala.Seq.empty,
    noDefaultValuesInConstructor = _root_.scala.None,
    sealedOneofCompanionExtends = _root_.scala.Seq.empty,
    derives = _root_.scala.Seq.empty,
    sealedOneofDerives = _root_.scala.Seq.empty,
    sealedOneofEmptyExtends = _root_.scala.Seq.empty
  )
  implicit class MessageOptionsLens[UpperPB](_l: _root_.scalapb.lenses.Lens[UpperPB, scalapb.options.MessageOptions]) extends _root_.scalapb.lenses.ObjectLens[UpperPB, scalapb.options.MessageOptions](_l) {
    def `extends`: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Seq[_root_.scala.Predef.String]] = field(_.`extends`)((c_, f_) => c_.copy(`extends` = f_))
    def companionExtends: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Seq[_root_.scala.Predef.String]] = field(_.companionExtends)((c_, f_) => c_.copy(companionExtends = f_))
    def annotations: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Seq[_root_.scala.Predef.String]] = field(_.annotations)((c_, f_) => c_.copy(annotations = f_))
    def `type`: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Predef.String] = field(_.getType)((c_, f_) => c_.copy(`type` = _root_.scala.Option(f_)))
    def optionalType: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Option[_root_.scala.Predef.String]] = field(_.`type`)((c_, f_) => c_.copy(`type` = f_))
    def companionAnnotations: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Seq[_root_.scala.Predef.String]] = field(_.companionAnnotations)((c_, f_) => c_.copy(companionAnnotations = f_))
    def sealedOneofExtends: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Seq[_root_.scala.Predef.String]] = field(_.sealedOneofExtends)((c_, f_) => c_.copy(sealedOneofExtends = f_))
    def noBox: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Boolean] = field(_.getNoBox)((c_, f_) => c_.copy(noBox = _root_.scala.Option(f_)))
    def optionalNoBox: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Option[_root_.scala.Boolean]] = field(_.noBox)((c_, f_) => c_.copy(noBox = f_))
    def unknownFieldsAnnotations: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Seq[_root_.scala.Predef.String]] = field(_.unknownFieldsAnnotations)((c_, f_) => c_.copy(unknownFieldsAnnotations = f_))
    def noDefaultValuesInConstructor: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Boolean] = field(_.getNoDefaultValuesInConstructor)((c_, f_) => c_.copy(noDefaultValuesInConstructor = _root_.scala.Option(f_)))
    def optionalNoDefaultValuesInConstructor: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Option[_root_.scala.Boolean]] = field(_.noDefaultValuesInConstructor)((c_, f_) => c_.copy(noDefaultValuesInConstructor = f_))
    def sealedOneofCompanionExtends: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Seq[_root_.scala.Predef.String]] = field(_.sealedOneofCompanionExtends)((c_, f_) => c_.copy(sealedOneofCompanionExtends = f_))
    def derives: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Seq[_root_.scala.Predef.String]] = field(_.derives)((c_, f_) => c_.copy(derives = f_))
    def sealedOneofDerives: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Seq[_root_.scala.Predef.String]] = field(_.sealedOneofDerives)((c_, f_) => c_.copy(sealedOneofDerives = f_))
    def sealedOneofEmptyExtends: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Seq[_root_.scala.Predef.String]] = field(_.sealedOneofEmptyExtends)((c_, f_) => c_.copy(sealedOneofEmptyExtends = f_))
  }
  final val EXTENDS_FIELD_NUMBER = 1
  final val COMPANION_EXTENDS_FIELD_NUMBER = 2
  final val ANNOTATIONS_FIELD_NUMBER = 3
  final val TYPE_FIELD_NUMBER = 4
  final val COMPANION_ANNOTATIONS_FIELD_NUMBER = 5
  final val SEALED_ONEOF_EXTENDS_FIELD_NUMBER = 6
  final val NO_BOX_FIELD_NUMBER = 7
  final val UNKNOWN_FIELDS_ANNOTATIONS_FIELD_NUMBER = 8
  final val NO_DEFAULT_VALUES_IN_CONSTRUCTOR_FIELD_NUMBER = 9
  final val SEALED_ONEOF_COMPANION_EXTENDS_FIELD_NUMBER = 10
  final val DERIVES_FIELD_NUMBER = 11
  final val SEALED_ONEOF_DERIVES_FIELD_NUMBER = 12
  final val SEALED_ONEOF_EMPTY_EXTENDS_FIELD_NUMBER = 13
  def of(
    `extends`: _root_.scala.Seq[_root_.scala.Predef.String],
    companionExtends: _root_.scala.Seq[_root_.scala.Predef.String],
    annotations: _root_.scala.Seq[_root_.scala.Predef.String],
    `type`: _root_.scala.Option[_root_.scala.Predef.String],
    companionAnnotations: _root_.scala.Seq[_root_.scala.Predef.String],
    sealedOneofExtends: _root_.scala.Seq[_root_.scala.Predef.String],
    noBox: _root_.scala.Option[_root_.scala.Boolean],
    unknownFieldsAnnotations: _root_.scala.Seq[_root_.scala.Predef.String],
    noDefaultValuesInConstructor: _root_.scala.Option[_root_.scala.Boolean],
    sealedOneofCompanionExtends: _root_.scala.Seq[_root_.scala.Predef.String],
    derives: _root_.scala.Seq[_root_.scala.Predef.String],
    sealedOneofDerives: _root_.scala.Seq[_root_.scala.Predef.String],
    sealedOneofEmptyExtends: _root_.scala.Seq[_root_.scala.Predef.String]
  ): _root_.scalapb.options.MessageOptions = _root_.scalapb.options.MessageOptions(
    `extends`,
    companionExtends,
    annotations,
    `type`,
    companionAnnotations,
    sealedOneofExtends,
    noBox,
    unknownFieldsAnnotations,
    noDefaultValuesInConstructor,
    sealedOneofCompanionExtends,
    derives,
    sealedOneofDerives,
    sealedOneofEmptyExtends
  )
  // @@protoc_insertion_point(GeneratedMessageCompanion[scalapb.MessageOptions])
}
