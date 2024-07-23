package dtm.generator.html.core;


public abstract class HtmlElement implements HtmlContent {
    protected String name;
    protected String content = "";
    protected String attributes = "";

    public HtmlElement(String name) {
        this.name = name;
    }

    public abstract HtmlElement setClass(String className);

    public abstract HtmlElement setId(String id);

    public abstract HtmlElement text(String text);

    @Override
    public String render() {
        return "<" + name + attributes + ">" + content + "</" + name + ">";
    }
}
