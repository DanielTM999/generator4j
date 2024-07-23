package dtm.generator.html;

import java.util.function.Consumer;
import dtm.generator.html.core.HtmlElement;

public class Body extends HtmlElement {
    public Body() {
        super("body");
    }

    public Body div(Consumer<Div> consumer) {
        Div div = new Div();
        consumer.accept(div);
        this.content += div.render();
        return this;
    }

    public Body setClass(String className) {
        attributes += " class=\"" + className + "\"";
        return this;
    }

    public Body setId(String id) {
        attributes += " id=\"" + id + "\"";
        return this;
    }

    public Body text(String text) {
        this.content += text;
        return this;
    }
}
