package ru.java.io.programmer2;

import ru.java.io.programmer1.Employee;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;


public class SerializationEx22 {
    public static void main(String[] args) {
        Employee bestEmployee;
        try (ObjectInputStream in = new ObjectInputStream(
                new FileInputStream("employees2.bin")
        )) {
            bestEmployee = (Employee) in.readObject();
            System.out.println(bestEmployee);
            System.out.println("Done!");
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
