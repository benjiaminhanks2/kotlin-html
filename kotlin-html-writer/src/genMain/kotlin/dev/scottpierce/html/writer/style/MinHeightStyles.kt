// This file was generated using the `kotlin-html-generator` module. Instead of modifying it, modify the
// `html-builder-generator` and run it again.
@file:Suppress("unused")

package dev.scottpierce.html.writer.style

import dev.scottpierce.html.writer.BaseStyleContext
import dev.scottpierce.html.writer.InlineStyleContext
import dev.scottpierce.html.writer.StyleContext
import kotlin.Boolean
import kotlin.Suppress

fun BaseStyleContext.minHeight(value: Dimension, important: Boolean = false) {
    writeStyleProperty("min-height", value, important)
}

fun BaseStyleContext.minHeight(value: CssValue, important: Boolean = false) {
    writeStyleProperty("min-height", value, important)
}

fun StyleContext.minHeight(value: Dimension, important: Boolean = false) {
    writeStyleProperty("min-height", value, important)
}

fun StyleContext.minHeight(value: CssValue, important: Boolean = false) {
    writeStyleProperty("min-height", value, important)
}

fun InlineStyleContext.minHeight(value: Dimension, important: Boolean = false) {
    writeStyleProperty("min-height", value, important)
}

fun InlineStyleContext.minHeight(value: CssValue, important: Boolean = false) {
    writeStyleProperty("min-height", value, important)
}
