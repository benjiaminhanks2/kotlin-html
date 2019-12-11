// This file was generated using the `kotlin-html-generator` module. Instead of modifying it, modify the
// `html-builder-generator` and run it again.
@file:Suppress("unused")

package dev.scottpierce.html.writer.style

import dev.scottpierce.html.writer.BaseStyleContext
import dev.scottpierce.html.writer.InlineStyleContext
import dev.scottpierce.html.writer.StyleContext
import kotlin.Suppress

fun BaseStyleContext.paddingTop(value: Dimension) {
    writeStyleProperty("padding-top", value)
}

fun BaseStyleContext.paddingTop(value: CssValue) {
    writeStyleProperty("padding-top", value)
}

fun StyleContext.paddingTop(value: Dimension) {
    writeStyleProperty("padding-top", value)
}

fun StyleContext.paddingTop(value: CssValue) {
    writeStyleProperty("padding-top", value)
}

fun InlineStyleContext.paddingTop(value: Dimension) {
    writeStyleProperty("padding-top", value)
}

fun InlineStyleContext.paddingTop(value: CssValue) {
    writeStyleProperty("padding-top", value)
}
