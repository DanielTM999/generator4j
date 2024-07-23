package dtm.generator.html;

import dtm.generator.html.core.HtmlElement;

public class Td extends HtmlElement {
    public Td() {
        super("td");
    }

    public Td setClass(String className) {
        attributes += " class=\"" + className + "\"";
        return this;
    }

    public Td setId(String id) {
        attributes += " id=\"" + id + "\"";
        return this;
    }

    public Td text(String text) {
        this.content += text;
        return this;
    }
}
