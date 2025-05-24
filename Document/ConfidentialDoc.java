public class ConfidentialDoc implements Document {
    private String extension;
    private String encryption;

    @Override
    public void setExtension() {
        this.extension = ".zip";
    }

    @Override
    public void setEncryption() {
        this.encryption = "AES Encryption";
    }

    @Override
    public Document buildDoc() {
        System.out.println("Confidential document created.");
        return this;
    }

    @Override
    public String toString() {
        return "ConfidentialDoc {Extension='" + extension + "', Encryption='" + encryption + "'}";
    }
}
