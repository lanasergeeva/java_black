package ru.java.io.programmer1;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializationEx11 {
    public static void main(String[] args) {
        Car car = new Car("Nissan Tilda", "white");
        Employee employee = new Employee("Masha", "Ivanova", "IT", "yes", 500, car);
        try (ObjectOutputStream out = new ObjectOutputStream(
                new FileOutputStream("employees2.bin")
        )) {
            out.writeObject(employee);
            System.out.println("Done!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
