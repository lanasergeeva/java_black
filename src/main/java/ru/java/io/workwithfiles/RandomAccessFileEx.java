package ru.java.io.workwithfiles;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomAccessFileEx {
    public static void main(String[] args) throws IOException {
        try (RandomAccessFile file =
                     new RandomAccessFile("poem.txt", "rw")) {
            int a = file.read();
            System.out.println((char) a);
            int b = file.read();
            System.out.println((char) b);
            String s1 = file.readLine();
            System.out.println(s1);
            file.seek(50);
            String s2 = file.readLine();
            System.out.println(s2);
            long position = file.getFilePointer();
            System.out.println(position);


            file.seek(file.length() - 1);
            file.writeBytes("\n\t\t\t\tSomebody Somebody");

        }
    }
}
