package dtm.generator.html;

import java.util.function.Consumer;
import dtm.generator.html.core.HtmlElement;

public class Body extends HtmlElement {
    public Body() {
        super("body");
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

    public Body div(Consumer<Div> consumer) {
        Div div = new Div();
        consumer.accept(div);
        this.content += div.render();
        return this;
    }

    public Body h1(String text) {
        this.content += "<h1>" + text + "</h1>";
        return this;
    }

    public Body h2(String text) {
        this.content += "<h2>" + text + "</h2>";
        return this;
    }

    public Body h3(String text) {
        this.content += "<h3>" + text + "</h3>";
        return this;
    }

    public Body h4(String text) {
        this.content += "<h3>" + text + "</h3>";
        return this;
    }

    public Body h1(String text, String id) {
        this.content += "<h1 id=\"" + id + "\">" + text + "</h1>";
        return this;
    }

    public Body h2(String text, String id) {
        this.content += "<h2 id=\"" + id + "\">" + text + "</h2>";
        return this;
    }
    
    public Body h3(String text, String id) {
        this.content += "<h3 id=\"" + id + "\">" + text + "</h3>";
        return this;
    }
    
    public Body h4(String text, String id) {
        this.content += "<h4 id=\"" + id + "\">" + text + "</h4>";
        return this;
    }
    
    public Body input(String type, String name, String value) {
        this.content += "<input type=\"" + type + "\" name=\"" + name + "\" value=\"" + value + "\">";
        return this;
    }
    
    public Body button(String text, String type) {
        this.content += "<button type=\"" + type + "\">" + text + "</button>";
        return this;
    }
    
    public Body label(String forAttribute, String text) {
        this.content += "<label for=\"" + forAttribute + "\">" + text + "</label>";
        return this;
    }
    
    public Body input(String type, String name, String value, String id) {
        this.content += "<input type=\"" + type + "\" name=\"" + name + "\" value=\"" + value + "\" id=\"" + id + "\">";
        return this;
    }
    
    public Body button(String text, String type, String id) {
        this.content += "<button type=\"" + type + "\" id=\"" + id + "\">" + text + "</button>";
        return this;
    }
    
    public Body label(String forAttribute, String text, String id) {
        this.content += "<label for=\"" + forAttribute + "\" id=\"" + id + "\">" + text + "</label>";
        return this;
    }

    public Body p(String text) {
        this.content += "<p>" + text + "</p>";
        return this;
    }

    public Body span(String text) {
        this.content += "<span>" + text + "</span>";
        return this;
    }

    public Body a(String href, String text) {
        this.content += "<a href=\"" + href + "\">" + text + "</a>";
        return this;
    }

    public Body p(String text, String id) {
        this.content += "<p id=\"" + id + "\">" + text + "</p>";
        return this;
    }
    
    public Body span(String text, String id) {
        this.content += "<span id=\"" + id + "\">" + text + "</span>";
        return this;
    }
    
    public Body a(String href, String text, String id) {
        this.content += "<a href=\"" + href + "\" id=\"" + id + "\">" + text + "</a>";
        return this;
    }
    
    public Body br() {
        this.content += "<br>";
        return this;
    }

    public Body img(String src, String alt) {
        this.content += "<img src=\"" + src + "\" alt=\"" + alt + "\">";
        return this;
    }

    public Body img(String src, String alt, String id) {
        this.content += "<img src=\"" + src + "\" alt=\"" + alt + "\" id=\"" + id + "\">";
        return this;
    }

    public Body table(Consumer<Table> consumer) {
        Table table = new Table();
        consumer.accept(table);
        this.content += table.render();
        return this;
    }

    public Body ul(Consumer<Ul> consumer) {
        Ul ul = new Ul();
        consumer.accept(ul);
        this.content += ul.render();
        return this;
    }
}
