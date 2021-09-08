package ru.java.io;

import java.io.ByteArrayInputStream;

public class ByteArrayInputStreamDemo {
    public static void main(String[] args) {
        String alphabet = "abcdefghijklmnoprstuvwxyz";
        byte[] b = alphabet.getBytes(); /*абвгдеёжзийклмнопрстуфхцчшщъыьэюя*/
        ByteArrayInputStream in1 = new ByteArrayInputStream(b);
        ByteArrayInputStream in2 = new ByteArrayInputStream(b, 0, 3);
        int i;
        while ((i = in1.read()) != -1) {
            System.out.println((char) i);
        }
        System.out.println("-------");
        while ((i = in2.read()) != -1) {
            System.out.println((char) i);
        }
    }
}
