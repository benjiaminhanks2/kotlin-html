package dev.scottpierce.html.writer

import dev.scottpierce.html.writer.element.DocType
import dev.scottpierce.html.writer.element.body
import dev.scottpierce.html.writer.element.div
import dev.scottpierce.html.writer.element.docType
import dev.scottpierce.html.writer.element.head
import dev.scottpierce.html.writer.element.html
import dev.scottpierce.html.writer.util.assertEquals
import dev.scottpierce.html.writer.util.writeFile
import dev.scottpierce.html.writer.util.writeHtml
import kotlin.test.Test

class HtmlTest {
    @Test
    fun emptyHtmlTest() {
        writeFile(options = WriteOptions.minified) {
            html()
        } assertEquals {
            "<html></html>"
        }
    }

    @Test
    fun docTypeHtmlTest() {
        writeFile(options = WriteOptions.minified) {
            docType(DocType.Html)
            html()
        } assertEquals {
            """
            <!DOCTYPE html><html></html>
            """.trimIndent()
        }
    }

    @Test
    fun docTypeCustomTest() {
        StringHtmlOutput().html(docType = DocType.Custom("custom")) {  }
        writeHtml(options = WriteOptions.minified) {
            html()
        } assertEquals {
            """
            <!DOCTYPE custom><html></html>
            """.trimIndent()
        }
    }

    @Test
    fun debugTest() {
        writeHtml {
        } assertEquals {
            """
            <html>
            </html>
            """.trimIndent()
        }
    }

    @Test
    fun debugWithChildTest() {
        writeHtml {
            head()
            body {
                div()
            }
        } assertEquals {
            """
            <html>
                <head>
                </head>
                <body>
                    <div>
                    </div>
                </body>
            </html>
            """.trimIndent()
        }
    }
}
