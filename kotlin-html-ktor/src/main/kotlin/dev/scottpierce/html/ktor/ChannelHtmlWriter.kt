package dev.scottpierce.html.ktor

import dev.scottpierce.html.write.HtmlWriter
import dev.scottpierce.html.write.WriteOptions
import java.io.BufferedWriter

class ChannelHtmlWriter(
    private val writer: BufferedWriter,
    override val options: WriteOptions = WriteOptions.default
) : HtmlWriter {
    private var indent = 0

    override var isEmpty: Boolean = true
        private set

    override fun newLine() {
        isEmpty = false
        writer.append('\n')
        for (i in 1..indent) {
            writer.append(options.indent)
        }
    }

    override fun indent() {
        indent++
    }

    override fun deindent() {
        indent--
    }

    override fun write(c: Char): HtmlWriter {
        isEmpty = false
        writer.append(c)
        return this
    }

    override fun write(code: CharSequence): HtmlWriter {
        isEmpty = false
        writer.append(code)
        return this
    }
}