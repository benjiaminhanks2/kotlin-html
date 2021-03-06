package dev.scottpierce.html.writer.style

import dev.scottpierce.html.writer.WriteOptions
import dev.scottpierce.html.writer.util.assertEquals
import dev.scottpierce.html.writer.util.writeStyle
import kotlin.test.Test

class LineHeightTests {
    @Test
    fun multiplier() {
        writeStyle {
            lineHeight(2)
        } assertEquals {
            """line-height: 2;"""
        }
    }

    @Test
    fun dimension() {
        writeStyle {
            lineHeight(2.px)
        } assertEquals {
            """line-height: 2px;"""
        }
    }

    @Test
    fun inherit() {
        writeStyle {
            lineHeight(LineHeight.INHERIT)
        } assertEquals {
            """line-height: inherit;"""
        }
    }

    @Test
    fun normal() {
        writeStyle {
            lineHeight(LineHeight.NORMAL)
        } assertEquals {
            """line-height: normal;"""
        }
    }

    @Test
    fun minimal() {
        writeStyle(WriteOptions.minified) {
            lineHeight(2.px)
        } assertEquals {
            """line-height:2px;"""
        }
    }
}
