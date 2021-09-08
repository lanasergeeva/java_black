package ru.java.io;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributes;

public class DirList {
    public static void main(String[] args) throws IOException {
        String dirname = "C:\\projects\\Java Black\\Black\\src\\io";
        try (DirectoryStream<Path> dir = Files.newDirectoryStream(Paths.get(dirname))) {
            System.out.println("Directory of " + dir);
            for (Path path : dir) {
                BasicFileAttributes attributes = Files.readAttributes(path, BasicFileAttributes.class);
                if (attributes.isDirectory()) {
                    System.out.print("<DIR> ");
                } else {
                    System.out.print("     ");
                }
                System.out.println(path.getName(1));
            }
        }
    }
}
