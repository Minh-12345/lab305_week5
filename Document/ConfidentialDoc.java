import java.io.*;
import java.util.zip.*;

public class ConfidentialDoc implements Document {
    String extension = ".zip";
    String encryption = "AES"; 

    public void setExtension() {}
    public void setEncryption() {}

    public void buildDoc() {
        try (FileOutputStream fos = new FileOutputStream("ConfidentialDoc.zip");
             ZipOutputStream zos = new ZipOutputStream(fos)) {
            ZipEntry entry = new ZipEntry("secret.txt");
            zos.putNextEntry(entry);
            zos.write("This is confidential content (simulated encrypted)".getBytes());
            zos.closeEntry();
            System.out.println("Confidential ZIP created: ConfidentialDoc.zip");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
