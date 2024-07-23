package dtm.generator.html;

import java.io.FileWriter;
import java.io.IOException;
import java.util.function.Consumer;
import dtm.generator.html.core.HtmlGenerator;

public class Html implements HtmlGenerator{
    private Head head;
    private Body body;

    @Override
    public Html head(Consumer<Head> consumer) {
        head = new Head();
        consumer.accept(head);
        return this;
    }

    @Override
    public Html body(Consumer<Body> consumer) {
        body = new Body();
        consumer.accept(body);
        return this;
    }

    @Override
    public String render() {
        return "<html>" + head.render() + body.render() + "</html>";
    }

    @Override
    public void createFile(String path) throws IOException{
        String htmlCode = render();    
        try (FileWriter fileWriter = new FileWriter(path)) {
            fileWriter.write(htmlCode);
        } catch (IOException e) {
            throw e;
        }
    }
}
