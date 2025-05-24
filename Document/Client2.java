public class Client2 {
    public static void main(String[] args) {
        
        Document normal = new NormalDoc();
        normal.setExtension();
        normal.setEncryption();
        normal.buildDoc();
        System.out.println(normal.toString());

        
        Document confidential = new ConfidentialDoc();
        confidential.setExtension();
        confidential.setEncryption();
        confidential.buildDoc();
        System.out.println(confidential.toString());
    }
}
