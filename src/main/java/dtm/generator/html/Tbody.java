package dtm.generator.html;

import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

import dtm.generator.html.core.HtmlElement;

public class Tbody extends HtmlElement {
    public Tbody() {
        super("tbody");
    }

    public Tbody tr(Consumer<Tr> consumer) {
        Tr tr = new Tr();
        consumer.accept(tr);
        this.content += tr.render();
        return this;
    }

    public Tbody setClass(String className) {
        attributes += " class=\"" + className + "\"";
        return this;
    }

    public Tbody setId(String id) {
        attributes += " id=\"" + id + "\"";
        return this;
    }

    public Tbody text(String text) {
        this.content += text;
        return this;
    }

    public <T> Tbody iterable(List<T> items, BiConsumer<T, Tr> consumer) {
        for (T item : items) {
            Tr tr = new Tr();
            consumer.accept(item, tr);
            this.content += tr.render();
        }
        return this;
    }

    public <T> Tbody iterable(T[] items, BiConsumer<T, Tr> consumer) {
        for (T item : items) {
            Tr tr = new Tr();
            consumer.accept(item, tr);
            this.content += tr.render();
        }
        return this;
    }

    @Override
    public Tbody setStyle(String styleInline) {
        this.style = styleInline;
        return this;
    }  
}
