package dev.scottpierce.html.element

import dev.scottpierce.html.write.HtmlWriter

fun HtmlWriter.docType(docType: DocType) {
    write("<!DOCTYPE ").write(docType.type!!).write('>')
}

fun FileContext.docType(docType: DocType) {
    writer.docType(docType)
}

sealed class DocType(val type: String?) {
    object Html : DocType("html")
    class Custom(type: String) : DocType(type)
}