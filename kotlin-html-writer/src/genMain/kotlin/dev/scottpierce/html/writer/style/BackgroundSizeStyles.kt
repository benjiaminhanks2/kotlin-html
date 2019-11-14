// This file was generated using the `kotlin-html-generator` module. Instead of modifying it, modify the
// `html-builder-generator` and run it again.
@file:Suppress("unused")

package dev.scottpierce.html.writer.style

import kotlin.String
import kotlin.Suppress

fun StyleContext.backgroundSize(value: Dimension) {
    writeStyleProperty("background-size", value)
}

fun StyleContext.backgroundSize(value: BackgroundSize) {
    writeStyleProperty("background-size", value)
}

fun InlineStyleContext.backgroundSize(value: Dimension) {
    writeStyleProperty("background-size", value)
}

fun InlineStyleContext.backgroundSize(value: BackgroundSize) {
    writeStyleProperty("background-size", value)
}

enum class BackgroundSize(
    val value: String
) {
    AUTO("auto"),

    COVER("cover"),

    CONTAIN("contain"),

    INITIAL("initial"),

    INHERIT("inherit");

    override fun toString() = value
}