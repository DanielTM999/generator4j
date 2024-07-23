package dtm.generator.html;

import dtm.generator.html.core.HtmlElement;

public class Head extends HtmlElement {
    public Head() {
        super("head");
    }

    public Head meta(String meta) {
        this.content += "<meta " + meta + ">";
        return this;
    }

    public Head css(String css) {
        this.content += "<link rel=\"stylesheet\" href=\"" + css + "\">";
        return this;
    }

    public Head style(String style) {
        this.content += "<style>" + style + "</style>";
        return this;
    }

    public Head title(String title) {
        this.content += "<title>" + title + "</title>";
        return this;
    }

    public Head setClass(String className) {
        attributes += " class=\"" + className + "\"";
        return this;
    }

    public Head setId(String id) {
        attributes += " id=\"" + id + "\"";
        return this;
    }

    public Head text(String text) {
        this.content += text;
        return this;
    }
    
    
}