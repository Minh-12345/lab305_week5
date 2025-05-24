class ConfidentialDocBuilder implements DocumentBuilder {
    Document doc = new Document();

    public void setExtension() {
        doc.extension = ".zip";
    }

    public void setContent(String content) {
        doc.content = content;
    }

    public Document getDocument() {
        return doc;
    }
}