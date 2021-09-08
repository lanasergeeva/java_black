package ru.java.io.workwithfiles;

import java.io.*;

public class CopyEx {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(
                new FileReader("test2.txt"));
             BufferedWriter writer = new BufferedWriter(
                     new FileWriter("test4.txt"))) {
           /* int character;
            while ((character = reader.read()) != -1) {
                writer.write(character);
            }*/
            String line;
            while ((line = reader.readLine()) != null) {
                writer.write(line + "\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
//C:\Users\Лана\Desktop\pict.jpg