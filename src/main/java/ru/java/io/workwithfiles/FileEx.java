package ru.java.io.workwithfiles;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;

public class FileEx {
    public static void main(String[] args) throws IOException {
        File file = new File("test2.txt");
        File folder = new File("C:\\Users\\Лана\\Desktop\\File");
        File file2 = new File("C:\\Users\\Лана\\Desktop\\File\\testFile.txt");
        File folder2 = new File("C:\\Users\\Лана\\Desktop\\FileS");
        System.out.println(file.getAbsolutePath());
        System.out.println(folder.getAbsolutePath());

        System.out.println(file.isAbsolute());
        System.out.println(folder.isAbsolute());

        System.out.println(file.isDirectory());
        System.out.println(folder.isDirectory());

        System.out.println(file.exists());
        System.out.println(folder.exists());

        System.out.println(file2.createNewFile());
        System.out.println(folder2.mkdir());

        System.out.println(file2.length());
        System.out.println(folder.length());

        System.out.println(file2.delete());
        System.out.println(folder2.delete());

        File[] files = folder.listFiles();
        System.out.println(Arrays.toString(files));

        System.out.println(file2.isHidden());


    }
}
