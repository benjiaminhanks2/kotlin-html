// This file was generated using the `kotlin-html-generator` module. Instead of modifying it, modify the
// `html-builder-generator` and run it again.
@file:Suppress("unused")

package dev.scottpierce.html.writer.style

import kotlin.String
import kotlin.Suppress

fun StyleContext.width(value: Dimension) {
    writeStyleProperty("width", value)
}

fun StyleContext.width(value: Width) {
    writeStyleProperty("width", value)
}

fun InlineStyleContext.width(value: Dimension) {
    writeStyleProperty("width", value)
}

fun InlineStyleContext.width(value: Width) {
    writeStyleProperty("width", value)
}

enum class Width(
    val value: String
) {
    AUTO("auto"),

    INITIAL("initial"),

    INHERIT("inherit");

    override fun toString() = value
}