class NormalDocBuilder implements DocumentBuilder {
    Document doc = new Document();

    public void setExtension() {
        doc.extension = ".txt";
    }

    public void setContent(String content) {
        doc.content = content;
    }

    public Document getDocument() {
        return doc;
    }
}