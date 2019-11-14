// This file was generated using the `kotlin-html-generator` module. Instead of modifying it, modify the
// `html-builder-generator` and run it again.
@file:Suppress("unused")

package dev.scottpierce.html.writer.style

import kotlin.Suppress

fun StyleContext.margin(value: Dimension) {
    writeStyleProperty("margin", value)
}

fun StyleContext.margin(y: Dimension, x: Dimension) {
    writeStyleProperty("margin", """$y $x""")
}

fun StyleContext.margin(
    top: Dimension,
    x: Dimension,
    bottom: Dimension
) {
    writeStyleProperty("margin", """$top $x $bottom""")
}

fun StyleContext.margin(
    top: Dimension,
    right: Dimension,
    bottom: Dimension,
    left: Dimension
) {
    writeStyleProperty("margin", """$top $right $bottom $left""")
}

fun StyleContext.margin(value: CssValue) {
    writeStyleProperty("margin", value)
}

fun InlineStyleContext.margin(value: Dimension) {
    writeStyleProperty("margin", value)
}

fun InlineStyleContext.margin(y: Dimension, x: Dimension) {
    writeStyleProperty("margin", """$y $x""")
}

fun InlineStyleContext.margin(
    top: Dimension,
    x: Dimension,
    bottom: Dimension
) {
    writeStyleProperty("margin", """$top $x $bottom""")
}

fun InlineStyleContext.margin(
    top: Dimension,
    right: Dimension,
    bottom: Dimension,
    left: Dimension
) {
    writeStyleProperty("margin", """$top $right $bottom $left""")
}

fun InlineStyleContext.margin(value: CssValue) {
    writeStyleProperty("margin", value)
}