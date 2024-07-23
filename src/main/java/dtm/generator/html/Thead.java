package dtm.generator.html;

import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

import dtm.generator.html.core.HtmlElement;

public class Thead extends HtmlElement {
    public Thead() {
        super("thead");
    }

    public Thead tr(Consumer<Tr> consumer) {
        Tr tr = new Tr();
        consumer.accept(tr);
        this.content += tr.render();
        return this;
    }

    public Thead setClass(String className) {
        attributes += " class=\"" + className + "\"";
        return this;
    }

    public Thead setId(String id) {
        attributes += " id=\"" + id + "\"";
        return this;
    }

    public Thead text(String text) {
        this.content += text;
        return this;
    }

    public <T> Thead iterable(List<T> items, BiConsumer<T, Tr> consumer) {
        for (T item : items) {
            Tr tr = new Tr();
            consumer.accept(item, tr);
            this.content += tr.render();
        }
        return this;
    }

    public <T> Thead iterable(T[] items, BiConsumer<T, Tr> consumer) {
        for (T item : items) {
            Tr tr = new Tr();
            consumer.accept(item, tr);
            this.content += tr.render();
        }
        return this;
    }
}
