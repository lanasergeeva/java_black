package ru.java.nio;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class PathAndFilesEx3 {
    public static void main(String[] args) throws IOException {
        Path filepath = Paths.get("test125.txt");


        List<String> list = Files.readAllLines(filepath);
        for (String s : list) {
            System.out.println(s);
        }
    }
}
