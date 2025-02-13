package dtm.generator.html;

import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import dtm.generator.html.core.HtmlElement;

public class Ul extends HtmlElement {
    public Ul() {
        super("ul");
    }

    public Ul li(String text) {
        this.content += "<li>" + text + "</li>";
        return this;
    }

    public Ul li(Consumer<Li> liAction) {
        Li li = new Li();
        liAction.accept(li);
        this.content += li.render(); 
        return this;
    }

    public Ul setClass(String className) {
        attributes += " class=\"" + className + "\"";
        return this;
    }

    public Ul setId(String id) {
        attributes += " id=\"" + id + "\"";
        return this;
    }

    public Ul ul(String id, String className){
        return new Ul();
    }

    public Ul text(String text) { 
        return li(text);
    }


    public <T> Ul iterable(List<T> items, BiConsumer<T, Li> consumer) {
        for (T item : items) {
            Li tr = new Li();
            consumer.accept(item, tr);
            this.content += tr.render();
        }
        return this;
    }

    public <T> Ul iterable(T[] items, BiConsumer<T, Li> consumer) {
        for (T item : items) {
            Li tr = new Li();
            consumer.accept(item, tr);
            this.content += tr.render();
        }
        return this;
    }

    @Override
    public Ul setStyle(String styleInline) {
        this.style = styleInline;
        return this;
    }  
}
