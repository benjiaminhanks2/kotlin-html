// This file was generated using the `kotlin-html-generator` module. Instead of modifying it, modify the
// `html-builder-generator` and run it again.
@file:Suppress("unused")

package dev.scottpierce.html.writer.style

import dev.scottpierce.html.writer.BaseStyleContext
import dev.scottpierce.html.writer.InlineStyleContext
import dev.scottpierce.html.writer.StyleContext
import kotlin.Boolean
import kotlin.Suppress

fun BaseStyleContext.minWidth(value: Dimension, important: Boolean = false) {
    writeStyleProperty("min-width", value, important)
}

fun BaseStyleContext.minWidth(value: CssValue, important: Boolean = false) {
    writeStyleProperty("min-width", value, important)
}

fun StyleContext.minWidth(value: Dimension, important: Boolean = false) {
    writeStyleProperty("min-width", value, important)
}

fun StyleContext.minWidth(value: CssValue, important: Boolean = false) {
    writeStyleProperty("min-width", value, important)
}

fun InlineStyleContext.minWidth(value: Dimension, important: Boolean = false) {
    writeStyleProperty("min-width", value, important)
}

fun InlineStyleContext.minWidth(value: CssValue, important: Boolean = false) {
    writeStyleProperty("min-width", value, important)
}
