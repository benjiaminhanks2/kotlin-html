// This file was generated using the `kotlin-html-generator` module. Instead of modifying it, modify the
// `html-builder-generator` and run it again.
@file:Suppress("unused")

package dev.scottpierce.html.writer.style

import kotlin.Suppress

fun StyleContext.outline(
    width: Dimension,
    style: OutlineStyle,
    color: Color? = null
) {
    writeStyleProperty("outline", """$width $style${if (color == null) "" else " $color"}""")
}

fun StyleContext.outline(value: CssValue) {
    writeStyleProperty("outline", value)
}

fun InlineStyleContext.outline(
    width: Dimension,
    style: OutlineStyle,
    color: Color? = null
) {
    writeStyleProperty("outline", """$width $style${if (color == null) "" else " $color"}""")
}

fun InlineStyleContext.outline(value: CssValue) {
    writeStyleProperty("outline", value)
}