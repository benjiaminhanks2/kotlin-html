// This file was generated using the `kotlin-html-generator` module. Instead of modifying it, modify the
// `html-builder-generator` and run it again.
@file:Suppress("unused")

package dev.scottpierce.html.writer.style

import dev.scottpierce.html.writer.BaseStyleContext
import dev.scottpierce.html.writer.InlineStyleContext
import dev.scottpierce.html.writer.StyleContext
import kotlin.Boolean
import kotlin.Suppress

fun BaseStyleContext.paddingRight(value: Dimension, important: Boolean = false) {
    writeStyleProperty("padding-right", value, important)
}

fun BaseStyleContext.paddingRight(value: CssValue, important: Boolean = false) {
    writeStyleProperty("padding-right", value, important)
}

fun StyleContext.paddingRight(value: Dimension, important: Boolean = false) {
    writeStyleProperty("padding-right", value, important)
}

fun StyleContext.paddingRight(value: CssValue, important: Boolean = false) {
    writeStyleProperty("padding-right", value, important)
}

fun InlineStyleContext.paddingRight(value: Dimension, important: Boolean = false) {
    writeStyleProperty("padding-right", value, important)
}

fun InlineStyleContext.paddingRight(value: CssValue, important: Boolean = false) {
    writeStyleProperty("padding-right", value, important)
}
