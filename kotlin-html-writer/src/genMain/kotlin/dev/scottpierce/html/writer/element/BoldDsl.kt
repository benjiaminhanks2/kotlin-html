// This file was generated using the `kotlin-html-generator` module. Instead of modifying it, modify the
// `html-builder-generator` and run it again.
package dev.scottpierce.html.writer.element

import dev.scottpierce.html.writer.BodyContext
import dev.scottpierce.html.writer.HtmlDsl
import dev.scottpierce.html.writer.HtmlOutput
import dev.scottpierce.html.writer.writer
import kotlin.Pair
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

@HtmlDsl
fun HtmlOutput.bold(func: BodyContext.() -> Unit = {}) {
    writer {
        this.writeTag("bold")
        this.write('>')
        this.indent()
        BodyContext(this).apply(func)
        this.writeNormalElementEnd("bold")
    }
}

@HtmlDsl
fun HtmlOutput.bold(vararg attrs: Pair<String, String?>, func: BodyContext.() -> Unit = {}) {
    writer {
        this.writeTag("bold")
        this.writeAttributes(attrs)
        this.write('>')
        this.indent()
        BodyContext(this).apply(func)
        this.writeNormalElementEnd("bold")
    }
}

@HtmlDsl
fun HtmlOutput.bold(attrs: List<Pair<String, String?>>, func: BodyContext.() -> Unit = {}) {
    writer {
        this.writeTag("bold")
        this.writeAttributes(attrs)
        this.write('>')
        this.indent()
        BodyContext(this).apply(func)
        this.writeNormalElementEnd("bold")
    }
}

@HtmlDsl
inline fun BodyContext.bold(func: BodyContext.() -> Unit = {}) {
    writer.writeTag("bold")
    writer.write('>')
    writer.indent()
    func()
    writer.writeNormalElementEnd("bold")
}

@HtmlDsl
inline fun BodyContext.bold(vararg attrs: Pair<String, String?>, func: BodyContext.() -> Unit =
        {}) {
    writer.writeTag("bold")
    writer.writeAttributes(attrs)
    writer.write('>')
    writer.indent()
    func()
    writer.writeNormalElementEnd("bold")
}

@HtmlDsl
inline fun BodyContext.bold(attrs: List<Pair<String, String?>>, func: BodyContext.() -> Unit = {}) {
    writer.writeTag("bold")
    writer.writeAttributes(attrs)
    writer.write('>')
    writer.indent()
    func()
    writer.writeNormalElementEnd("bold")
}