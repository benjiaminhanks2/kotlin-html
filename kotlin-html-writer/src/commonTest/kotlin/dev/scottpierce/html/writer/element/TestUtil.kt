package dev.scottpierce.html.writer.element

import dev.scottpierce.html.writer.StringHtmlOutput
import dev.scottpierce.html.writer.WriteOptions

fun createWriter(): StringHtmlOutput {
    return StringHtmlOutput(WriteOptions.readable.copy(indent = "    "))
}

infix fun StringHtmlOutput.assertEquals(expected: () -> String) {
    kotlin.test.assertEquals(expected(), this.toString())
}
