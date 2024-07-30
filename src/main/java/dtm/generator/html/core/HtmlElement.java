package dtm.generator.html.core;


public abstract class HtmlElement implements HtmlContent {
    protected String name;
    protected String style = "";
    protected String content = "";
    protected String attributes = "";

    public HtmlElement(String name) {
        this.name = name;
    }

    public abstract HtmlElement setClass(String className);

    public abstract HtmlElement setId(String id);

    public abstract HtmlElement setStyle(String styleInline);

    public abstract HtmlElement text(String text);

    @Override
    public String render() {
        String styleAttribute = style.isEmpty() ? "" : " style=\"" + style + "\"";
        return "<" + name + attributes + styleAttribute + ">" + content + "</" + name + ">";
    }
}
