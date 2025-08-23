package file_demo;

import java.nio.file.*;

public class CopyPathExample {
    public static void main(String[] args) {
        try {
            Path path = Paths.get("sample12.txt");
            Files.createFile(path);
            System.out.println("File created");
           
            // Copy file
            Path copypath=Paths.get("Samplecopy.txt");
            Files.copy(path, copypath, StandardCopyOption.REPLACE_EXISTING);

            System.out.println("File copied successfully.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

