package dev.scottpierce.html.generate.model

import com.squareup.kotlinpoet.ClassName
import com.squareup.kotlinpoet.ITERABLE
import com.squareup.kotlinpoet.MemberName
import com.squareup.kotlinpoet.ParameterizedTypeName.Companion.parameterizedBy
import com.squareup.kotlinpoet.STRING

val HTML_WRITER = ClassName("dev.scottpierce.html.write", "HtmlWriter")
val STYLE = ClassName("dev.scottpierce.html.style", "Style")
val ATTRIBUTE = ClassName("kotlin", "Pair").parameterizedBy(STRING, STRING.copy(nullable = true))
val ATTRIBUTE_LIST = ITERABLE.parameterizedBy(ATTRIBUTE)

val WRITE_NORMAL_ELEMENT_START = MemberName("dev.scottpierce.html.element", "writeNormalElementStart")
val WRITE_NORMAL_ELEMENT_END = MemberName("dev.scottpierce.html.element", "writeNormalElementEnd")
val WRITE_VOID_ELEMENT = MemberName("dev.scottpierce.html.element", "writeVoidElement")