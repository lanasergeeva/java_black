package ru.java.io.workwithfiles;

import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteArrayOutputStreamDemo {
    public static void main(String[] args) throws IOException {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        String s = "I am going to study English";
        byte[] buf = s.getBytes(); //строка в массив байтов
        try {
            out.write(buf); //записали в стрим
        } catch (IOException e) {
            System.out.println(e);
            return;
        }
        System.out.println("В стринг");
        System.out.println(out.toString());
        System.out.println("В массив");
        byte[] b = out.toByteArray();
        for (int i = 0; i < b.length; i++) {
            System.out.print((char) b[i]);
        }
        System.out.println("\nВ OutputStream");
        try (FileOutputStream out2 = new FileOutputStream("testBAOS.txt")) {
            out.writeTo(out2);
        }
        System.out.println("Применяем reset");
        out.reset();
        for (int i = 0; i < 3; i++) {
            out.write('X');
        }
        System.out.println(out.toString());
    }
}

