package ru.java.io.workwithfiles;

import java.io.*;

public class FileStream {
    public static void main(String[] args) {
       /* try (FileInputStream in =
                     new FileInputStream("C:\\Users\\Лана\\Desktop\\pict.jpg") ;
        FileOutputStream out =
                new FileOutputStream("pict.jpg")) {*/
        try (BufferedInputStream in =
                     new BufferedInputStream(new FileInputStream("C:\\Users\\Лана\\Desktop\\pict.jpg"));
             BufferedOutputStream out =
                     new BufferedOutputStream(new FileOutputStream("pict1.jpg"))) {

            int inf;
            while ((inf = in.read()) != -1) {
                out.write(inf);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

