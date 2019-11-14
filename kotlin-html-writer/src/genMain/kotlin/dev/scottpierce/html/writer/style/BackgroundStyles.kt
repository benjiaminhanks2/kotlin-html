// This file was generated using the `kotlin-html-generator` module. Instead of modifying it, modify the
// `html-builder-generator` and run it again.
@file:Suppress("unused")

package dev.scottpierce.html.writer.style

import kotlin.String
import kotlin.Suppress

fun StyleContext.background(color: Color) {
    writeStyleProperty("background", color)
}

fun StyleContext.background(color: Color, image: BackgroundImage) {
    writeStyleProperty("background", """$color $image""")
}

fun StyleContext.background(color: String) {
    writeStyleProperty("background", color)
}

fun InlineStyleContext.background(color: Color) {
    writeStyleProperty("background", color)
}

fun InlineStyleContext.background(color: Color, image: BackgroundImage) {
    writeStyleProperty("background", """$color $image""")
}

fun InlineStyleContext.background(color: String) {
    writeStyleProperty("background", color)
}