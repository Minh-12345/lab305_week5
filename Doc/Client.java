public class Client {
    public static void main(String[] args) throws Exception {
        String content ="This is the document content.";

        // Normal document
        DocumentBuilder normalBuilder = new NormalDocBuilder();
        DocumentDirector director = new DocumentDirector(normalBuilder);
        Document normalDoc = director.build(content);
        normalDoc.save("normal_document");

        // Confidential document
        DocumentBuilder confidentialBuilder = new ConfidentialDocBuilder();
        director = new DocumentDirector(confidentialBuilder);
        Document confidentialDoc = director.build(content);
        confidentialDoc.save("confidential_document");
    }
}