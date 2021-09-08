package ru.java.nio;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class PathAndFilesEx1 {
    public static void main(String[] args) throws IOException {
        Path pathFile = Paths.get("test15.txt");
        Path directoryPath = Paths.get("C:\\Users\\Лана\\Desktop\\File");

        System.out.println(pathFile.getFileName());
        System.out.println(directoryPath.getFileName());
        System.out.println("-------------------------------");

        System.out.println(pathFile.getParent());
        System.out.println(directoryPath.getParent());
        System.out.println("-------------------------------");

        System.out.println(pathFile.getRoot());
        System.out.println(directoryPath.getRoot());
        System.out.println("-------------------------------");

        System.out.println(pathFile.isAbsolute());
        System.out.println(directoryPath.isAbsolute());
        System.out.println("-------------------------------");

        System.out.println(pathFile.toAbsolutePath());
        System.out.println(directoryPath.toAbsolutePath());
        System.out.println("-------------------------------");

        System.out.println(pathFile.toAbsolutePath().getParent());
        System.out.println(pathFile.toAbsolutePath().getRoot());
        System.out.println("-------------------------------");

        System.out.println("resolve");
        System.out.println(directoryPath.resolve(pathFile));

        System.out.println("relativize");
        Path anotherPath = Paths.get("C:\\Users\\Лана\\Desktop\\File\\K\\l\\test20.txt");
        System.out.println(directoryPath.relativize(anotherPath));

        if (!Files.exists(pathFile)) {
            Files.createFile(pathFile);
        }
        if (!Files.exists(anotherPath)) {
            Files.createDirectories(anotherPath);
        }
        System.out.println("-------------------------------");
        System.out.println(Files.isReadable(pathFile));

        System.out.println("-------------------------------");
        System.out.println(Files.isWritable(pathFile));

        System.out.println("-------------------------------");
        System.out.println(Files.isExecutable(pathFile));

        Path filePath2 = Paths.get("C:\\projects\\Java Black\\test15.txt");
        System.out.println(Files.isSameFile(pathFile, filePath2));

        System.out.println(Files.size(pathFile));

        System.out.println(Files.getAttribute(pathFile, "creationTime"));

        System.out.println("------------------------------- readatri");
        System.out.println(Files.readAttributes(pathFile, "*").toString());


    }
}
