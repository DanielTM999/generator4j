package dtm.generator.html.core;

import java.io.IOException;
import java.util.function.Consumer;
import dtm.generator.html.Body;
import dtm.generator.html.Head;


public interface HtmlGenerator {
    HtmlGenerator head(Consumer<Head> consumer);
    HtmlGenerator body(Consumer<Body> consumer);
    String render();
    void createFile(String path) throws IOException;
}
