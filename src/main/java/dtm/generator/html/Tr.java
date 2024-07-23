package dtm.generator.html;



import java.util.List;
import java.util.function.BiConsumer;

import dtm.generator.html.core.HtmlElement;

public class Tr extends HtmlElement {
    public Tr() {
        super("tr");
    }

    public Tr th(String text) {
        this.content += "<th>" + text + "</th>";
        return this;
    }

    public Tr td(String text) {
        this.content += "<td>" + text + "</td>";
        return this;
    }

    public Tr setClass(String className) {
        attributes += " class=\"" + className + "\"";
        return this;
    }

    public Tr setId(String id) {
        attributes += " id=\"" + id + "\"";
        return this;
    }

    public Tr text(String text) {
        this.content += text;
        return this;
    }

    public <T> Tr iterable(List<T> items, BiConsumer<T, Tr> consumer) {
        for (T item : items) {
            Tr tr = new Tr();
            consumer.accept(item, tr);
            this.content += tr.render();
        }
        return this;
    }
    
    public <T> Tr iterableTd(List<T> items, BiConsumer<T, Td> consumer) {
        for (T item : items) {
            Td td = new Td();
            consumer.accept(item, td);
            this.content += td.render();
        }
        return this;
    }
    
    public <T> Tr iterableTh(List<T> items, BiConsumer<T, Th> consumer) {
        for (T item : items) {
            Th th = new Th();
            consumer.accept(item, th);
            this.content += th.render();
        }
        return this;
    }
}
