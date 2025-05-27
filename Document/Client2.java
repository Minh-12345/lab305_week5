public class Client2 {
    public static void main(String[] args) {
        
        Document normal = new NormalDoc();
        normal.setExtension();
        normal.setEncryption();
        System.out.println("NormalDoc: Extension = .txt, Encryption = None");
        normal.buildDoc();

       
        Document confidential = new ConfidentialDoc();
        confidential.setExtension();
        confidential.setEncryption();
        System.out.println("ConfidentialDoc: Extension = .zip, Encryption = AES");
        confidential.buildDoc();
    }
}
