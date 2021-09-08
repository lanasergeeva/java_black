package ru.java.io.workwithfiles;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.*;

public class DataStreamEx {
    public static void main(String[] args) {
        try (DataOutputStream out =
                     new DataOutputStream(new FileOutputStream("my_test.bin"));
             DataInputStream in = new DataInputStream(
                     new FileInputStream("my_test.bin"));) {

            out.writeBoolean(true);
            out.writeShort(180);
            out.writeByte(100);
            out.writeFloat(1.14F);
            out.writeDouble(3.14);

            System.out.println(in.readBoolean());
            System.out.println(in.readShort());
            System.out.println(in.readByte());
            System.out.println(in.readFloat());
            System.out.println(in.readDouble());

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
