package dtm.generator.html;

import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Predicate;

import dtm.generator.html.core.HtmlElement;

public class Section extends HtmlElement {
    public Section() {
        super("section");
    }

    @Override
    public Section setClass(String className) {
        attributes += " class=\"" + className + "\"";
        return this;
    }

    @Override
    public Section setId(String id) {
        attributes += " id=\"" + id + "\"";
        return this;
    }

    @Override
    public Section text(String text) {
        this.content += text;
        return this;
    }

    public Section section(Consumer<Section> consumer) {
        Section section = new Section();
        consumer.accept(section);
        this.content += section.render();
        return this;
    }

    public Section div(Consumer<Div> consumer) {
        Div div = new Div();
        consumer.accept(div);
        this.content += div.render();
        return this;
    }

    public Section h1(String text) {
        this.content += "<h1>" + text + "</h1>";
        return this;
    }

    public Section h2(String text) {
        this.content += "<h2>" + text + "</h2>";
        return this;
    }

    public Section h3(String text) {
        this.content += "<h3>" + text + "</h3>";
        return this;
    }

    public Section h4(String text) {
        this.content += "<h3>" + text + "</h3>";
        return this;
    }

    public Section h1(String text, String id) {
        this.content += "<h1 id=\"" + id + "\">" + text + "</h1>";
        return this;
    }

    public Section h2(String text, String id) {
        this.content += "<h2 id=\"" + id + "\">" + text + "</h2>";
        return this;
    }
    
    public Section h3(String text, String id) {
        this.content += "<h3 id=\"" + id + "\">" + text + "</h3>";
        return this;
    }
    
    public Section h4(String text, String id) {
        this.content += "<h4 id=\"" + id + "\">" + text + "</h4>";
        return this;
    }
    
    public Section input(String type, String name, String value) {
        this.content += "<input type=\"" + type + "\" name=\"" + name + "\" value=\"" + value + "\">";
        return this;
    }
    
    public Section button(String text, String type) {
        this.content += "<button type=\"" + type + "\">" + text + "</button>";
        return this;
    }
    
    public Section label(String forAttribute, String text) {
        this.content += "<label for=\"" + forAttribute + "\">" + text + "</label>";
        return this;
    }
    
    public Section input(String type, String name, String value, String id) {
        this.content += "<input type=\"" + type + "\" name=\"" + name + "\" value=\"" + value + "\" id=\"" + id + "\">";
        return this;
    }
    
    public Section button(String text, String type, String id) {
        this.content += "<button type=\"" + type + "\" id=\"" + id + "\">" + text + "</button>";
        return this;
    }
    
    public Section label(String forAttribute, String text, String id) {
        this.content += "<label for=\"" + forAttribute + "\" id=\"" + id + "\">" + text + "</label>";
        return this;
    }

    public Section p(String text) {
        this.content += "<p>" + text + "</p>";
        return this;
    }

    public Section span(String text) {
        this.content += "<span>" + text + "</span>";
        return this;
    }

    public Section a(String href, String text) {
        this.content += "<a href=\"" + href + "\">" + text + "</a>";
        return this;
    }

    public Section p(String text, String id) {
        this.content += "<p id=\"" + id + "\">" + text + "</p>";
        return this;
    }
    
    public Section span(String text, String id) {
        this.content += "<span id=\"" + id + "\">" + text + "</span>";
        return this;
    }
    
    public Section a(String href, String text, String id) {
        this.content += "<a href=\"" + href + "\" id=\"" + id + "\">" + text + "</a>";
        return this;
    }
    
    public Section br() {
        this.content += "</br>";
        return this;
    }

    public Section img(String src, String alt) {
        this.content += "<img src=\"" + src + "\" alt=\"" + alt + "\"/>";
        return this;
    }

    public Section img(String src, String alt, String id) {
        this.content += "<img src=\"" + src + "\" alt=\"" + alt + "\" id=\"" + id + "\"/>";
        return this;
    }

    public Section img64(String img64, String alt, String type) {
        this.content += "<img src=\"data:image/"+type+";base64," + img64 + "\" alt=\"" + alt + "\"/>";
        return this;
    }

    public Section img64(String img64, String alt, String id, String type) {
        this.content += "<img src=\"data:image/"+type+";base64," + img64 + "\" alt=\"" + alt + "\" id=\"" + id + "\"/>";
        return this;
    }

    public Section table(Consumer<Table> consumer) {
        Table table = new Table();
        consumer.accept(table);
        this.content += table.render();
        return this;
    }

    public Section ul(Consumer<Ul> consumer) {
        Ul ul = new Ul();
        consumer.accept(ul);
        this.content += ul.render();
        return this;
    }

    public <T> Section iterableDiv(List<T> items, BiConsumer<T, Div> consumer) {
        for (T item : items) {
            Div div = new Div();
            consumer.accept(item, div);
            this.content += div.render();
        }
        return this;
    }

    public <T> Section iterableSection(List<T> items, BiConsumer<T, Section> consumer) {
        for (T item : items) {
            Section section = new Section();
            consumer.accept(item, section);
            this.content += section.render();
        }
        return this;
    }

    public <T> Section iterableThis(List<T> items, BiConsumer<T, Section> consumer) {
        for (T item : items) {
            consumer.accept(item, this);
        }
        return this;
    }

    public Section conditional(Predicate<Section> condition, Consumer<Section> consumer) {
        if (condition.test(this)) {
            consumer.accept(this);
        }
        return this;
    }

    @Override
    public Section setStyle(String styleInline) {
        this.style = styleInline;
        return this;
    }  
}
