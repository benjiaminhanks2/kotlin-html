// This file was generated using the `kotlin-html-generator` module. Instead of modifying it, modify the
// `html-builder-generator` and run it again.
@file:Suppress("unused")

package dev.scottpierce.html.writer.style

import dev.scottpierce.html.writer.BaseStyleContext
import dev.scottpierce.html.writer.InlineStyleContext
import dev.scottpierce.html.writer.StyleContext
import kotlin.Boolean
import kotlin.String
import kotlin.Suppress

fun BaseStyleContext.width(value: Dimension, important: Boolean = false) {
    writeStyleProperty("width", value, important)
}

fun BaseStyleContext.width(value: Width, important: Boolean = false) {
    writeStyleProperty("width", value, important)
}

fun StyleContext.width(value: Dimension, important: Boolean = false) {
    writeStyleProperty("width", value, important)
}

fun StyleContext.width(value: Width, important: Boolean = false) {
    writeStyleProperty("width", value, important)
}

fun InlineStyleContext.width(value: Dimension, important: Boolean = false) {
    writeStyleProperty("width", value, important)
}

fun InlineStyleContext.width(value: Width, important: Boolean = false) {
    writeStyleProperty("width", value, important)
}

enum class Width(
    val value: String
) {
    AUTO("auto"),

    INITIAL("initial"),

    INHERIT("inherit");

    override fun toString() = value
}
