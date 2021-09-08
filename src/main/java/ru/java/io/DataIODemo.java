package ru.java.io;

import java.io.*;

public class DataIODemo {
    public static void main(String[] args) throws IOException {
        try (DataOutputStream out = new DataOutputStream(new FileOutputStream("dataio.txt"))) {
            out.writeDouble(100.14);
            out.writeInt(325);
            out.writeBoolean(true);
        }
        try (DataInputStream in = new DataInputStream(new FileInputStream("dataio.txt"))) {
            double d = in.readDouble();
            int i = in.readInt();
            boolean b = in.readBoolean();
            System.out.println(d + " " + i + " " + b);
        }
    }
}
