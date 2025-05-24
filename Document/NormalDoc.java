public class NormalDoc implements Document {
    private String extension;
    private String encryption;

    @Override
    public void setExtension() {
        this.extension = ".txt";
    }

    @Override
    public void setEncryption() {
        this.encryption = "None";
    }

    @Override
    public Document buildDoc() {
        System.out.println("Normal document created.");
        return this;
    }

    @Override
    public String toString() {
        return "NormalDoc {Extension='" + extension + "', Encryption='" + encryption + "'}";
    }
}
