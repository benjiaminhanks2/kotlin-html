// This file was generated using the `kotlin-html-generator` module. Instead of modifying it, modify the
// `html-builder-generator` and run it again.
package dev.scottpierce.html.writer.element

import dev.scottpierce.html.stylebuilder.StyleBuilderLambda
import dev.scottpierce.html.stylebuilder.style
import dev.scottpierce.html.writer.BodyContext
import dev.scottpierce.html.writer.HtmlDsl
import kotlin.Pair
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

@HtmlDsl
inline fun BodyContext.time(
    id: String,
    classes: String? = null,
    noinline styleBuilder: StyleBuilderLambda,
    datetime: String? = null,
    func: BodyContext.() -> Unit = {}
) {
    style("#$id", styleBuilder)
    time(id = id, classes = classes, style = null, datetime = datetime, func = func)
}

@HtmlDsl
inline fun BodyContext.time(
    vararg attrs: Pair<String, String?>,
    id: String,
    classes: String? = null,
    noinline styleBuilder: StyleBuilderLambda,
    datetime: String? = null,
    func: BodyContext.() -> Unit = {}
) {
    style("#$id", styleBuilder)
    time(attrs = *attrs, id = id, classes = classes, style = null, datetime = datetime, func = func)
}

@HtmlDsl
inline fun BodyContext.time(
    attrs: List<Pair<String, String?>>,
    id: String,
    classes: String? = null,
    noinline styleBuilder: StyleBuilderLambda,
    datetime: String? = null,
    func: BodyContext.() -> Unit = {}
) {
    style("#$id", styleBuilder)
    time(attrs = attrs, id = id, classes = classes, style = null, datetime = datetime, func = func)
}
