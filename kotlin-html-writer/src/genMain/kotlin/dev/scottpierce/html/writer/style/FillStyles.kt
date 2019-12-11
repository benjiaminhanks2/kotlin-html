// This file was generated using the `kotlin-html-generator` module. Instead of modifying it, modify the
// `html-builder-generator` and run it again.
@file:Suppress("unused")

package dev.scottpierce.html.writer.style

import dev.scottpierce.html.writer.BaseStyleContext
import dev.scottpierce.html.writer.InlineStyleContext
import dev.scottpierce.html.writer.StyleContext
import kotlin.Int
import kotlin.Number
import kotlin.String
import kotlin.Suppress

fun BaseStyleContext.fill(color: Color) {
    writeStyleProperty("fill", color)
}

fun BaseStyleContext.fill(hexString: String) {
    writeStyleProperty("fill", Color(hexString))
}

fun BaseStyleContext.fill(
    r: Int,
    g: Int,
    b: Int
) {
    writeStyleProperty("fill", Color(r, g, b))
}

fun BaseStyleContext.fill(
    r: Int,
    g: Int,
    b: Int,
    a: Number
) {
    writeStyleProperty("fill", Color(r, g, b, a))
}

fun StyleContext.fill(color: Color) {
    writeStyleProperty("fill", color)
}

fun StyleContext.fill(hexString: String) {
    writeStyleProperty("fill", Color(hexString))
}

fun StyleContext.fill(
    r: Int,
    g: Int,
    b: Int
) {
    writeStyleProperty("fill", Color(r, g, b))
}

fun StyleContext.fill(
    r: Int,
    g: Int,
    b: Int,
    a: Number
) {
    writeStyleProperty("fill", Color(r, g, b, a))
}

fun InlineStyleContext.fill(color: Color) {
    writeStyleProperty("fill", color)
}

fun InlineStyleContext.fill(hexString: String) {
    writeStyleProperty("fill", Color(hexString))
}

fun InlineStyleContext.fill(
    r: Int,
    g: Int,
    b: Int
) {
    writeStyleProperty("fill", Color(r, g, b))
}

fun InlineStyleContext.fill(
    r: Int,
    g: Int,
    b: Int,
    a: Number
) {
    writeStyleProperty("fill", Color(r, g, b, a))
}
