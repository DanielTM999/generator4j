package dtm.generator.html;

import java.util.function.Consumer;
import dtm.generator.html.core.HtmlElement;

public class Table extends HtmlElement {
    public Table() {
        super("table");
    }

    public Table thead(Consumer<Thead> consumer) {
        Thead thead = new Thead();
        consumer.accept(thead);
        this.content += thead.render();
        return this;
    }

    public Table tbody(Consumer<Tbody> consumer) {
        Tbody tbody = new Tbody();
        consumer.accept(tbody);
        this.content += tbody.render();
        return this;
    }

    public Table setClass(String className) {
        attributes += " class=\"" + className + "\"";
        return this;
    }

    public Table setId(String id) {
        attributes += " id=\"" + id + "\"";
        return this;
    }

    public Table text(String text) {
        this.content += text;
        return this;
    }

    @Override
    public Table setStyle(String styleInline) {
        this.style = styleInline;
        return this;
    }  
}
