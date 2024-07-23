package dtm.generator.html;

import dtm.generator.html.core.HtmlElement;

public class Th extends HtmlElement {
    public Th() {
        super("th");
    }

    public Th setClass(String className) {
        attributes += " class=\"" + className + "\"";
        return this;
    }

    public Th setId(String id) {
        attributes += " id=\"" + id + "\"";
        return this;
    }

    public Th text(String text) {
        this.content += text;
        return this;
    }
}
