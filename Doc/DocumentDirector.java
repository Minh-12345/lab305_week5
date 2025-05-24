class DocumentDirector {
    DocumentBuilder builder;

    DocumentDirector(DocumentBuilder builder) {
        this.builder = builder;
    }

    Document build(String content) {
        builder.setExtension();
        builder.setContent(content);
        return builder.getDocument();
    }
}