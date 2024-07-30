package dtm.generator.html;

import dtm.generator.html.core.HtmlElement;

public class Li extends HtmlElement {
    public Li() {
        super("li");
    }

    public Li setClass(String className) {
        attributes += " class=\"" + className + "\"";
        return this;
    }

    public Li setId(String id) {
        attributes += " id=\"" + id + "\"";
        return this;
    }

    public Li text(String text) {
        this.content += text;
        return this;
    }

    @Override
    public Li setStyle(String styleInline) {
        this.style = styleInline;
        return this;
    }  

    
}
