package dtm.generator.html;

import dtm.generator.html.core.HtmlElement;
import java.util.function.Consumer;

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

    public Li ul(Consumer<Ul> ulConsumer) {
        Ul ul = new Ul();
        ulConsumer.accept(ul);
        this.content += ul.render(); 
        return this;
    }

    @Override
    public Li setStyle(String styleInline) {
        this.style = styleInline;
        return this;
    }  

    
}
