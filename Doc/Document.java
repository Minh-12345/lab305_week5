import java.io.FileWriter;
import java.io.FileOutputStream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

class Document {
    String extension;
    String content;

    void save(String fileName) throws Exception {
        if (extension.equals(".txt")) {
            FileWriter writer = new FileWriter(fileName + ".txt");
            writer.write(content);
            writer.close();
            System.out.println("File is created: " + fileName + ".txt");
        } else if (extension.equals(".zip")) {
            FileOutputStream fos = new FileOutputStream(fileName + ".zip");
            ZipOutputStream zipOut = new ZipOutputStream(fos);
            zipOut.putNextEntry(new ZipEntry("confidential.txt"));
            zipOut.write(content.getBytes());
            zipOut.closeEntry();
            zipOut.close();
            fos.close();
            System.out.println("File is created: " + fileName + ".zip");
        }
    }
}