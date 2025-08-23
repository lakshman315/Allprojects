package file_demo;

import java.nio.file.Path;
import java.nio.file.Paths;

public class PathExample {
    public static void main(String[] args) {
        Path path = Paths.get("C:/Users/Public/Documents/sample.txt");

        System.out.println("File Name: " + path.getFileName());
        System.out.println("Parent: " + path.getParent());
        System.out.println("Root: " + path.getRoot());
        System.out.println("Is Absolute: " + path.isAbsolute());
        System.out.println("Absolute Path: " + path.toAbsolutePath());
        System.out.println("Name Count: " + path.getNameCount());
        System.out.println("First Name: " + path.getName(0));
    }
}

	