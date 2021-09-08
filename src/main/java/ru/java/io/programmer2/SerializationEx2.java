package ru.java.io.programmer2;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class SerializationEx2 {
    public static void main(String[] args) {
        List<String> employees;
        try (ObjectInputStream in = new ObjectInputStream(
                new FileInputStream("employees1.bin")
        )) {
            employees = (ArrayList) in.readObject();
            System.out.println(employees.toString());
            System.out.println("Done!");
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}

