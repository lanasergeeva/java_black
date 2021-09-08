package ru.java.io;

import java.io.ByteArrayInputStream;

public class ByteArrayInputStreamReset {
    public static void main(String[] args) {
        String alphabet = "abcdefghijklmnoprstuvwxyz";
        byte[] b = alphabet.getBytes();
        ByteArrayInputStream in1 = new ByteArrayInputStream(b);
        for (int i = 0; i < 4; i++) {
            int c;
            while ((c = in1.read()) != -1) {
                if (i == 0) {
                    System.out.println((char) c);
                } else {
                    System.out.println(Character.toUpperCase((char) c));
                }
            }
            System.out.println();
            in1.reset();
        }
    }
}
