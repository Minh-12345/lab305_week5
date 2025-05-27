import java.io.*;

public class NormalDoc implements Document {
    String extension = ".txt";

    public void setExtension() {
        
    }

    public void setEncryption() {
      
    }

    public void buildDoc() {
        try (FileWriter writer = new FileWriter("NormalDoc" + extension)) {
            writer.write("This is a normal document.");
            System.out.println("Normal document created: NormalDoc" + extension);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
