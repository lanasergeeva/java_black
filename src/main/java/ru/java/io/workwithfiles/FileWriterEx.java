package ru.java.io.workwithfiles;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterEx {
    public static void main(String[] args) throws IOException {
        String rubai = "Чтоб мудро жизнь прожить, знать надобно немало, \n"
                + "Два важных правила запомни для начала: \n"
                + "Ты лучше голодай, чем что попало есть,\n"
                + "И лучше будь один, чем вместе с кем попало.\n";
        String s = "privet";

        //FileWriter writer = null;
       /* try {
            writer = new FileWriter("test22.txt");
            for(int i=0;i<rubai.length();i++) {
                writer.write(rubai.charAt(i));
            }*/
        try (FileWriter writer = new FileWriter("test22.txt", true)) {
            for (int i = 0; i < rubai.length(); i++) {
                writer.write(rubai.charAt(i));
            }

        } catch (IOException e) {
            e.printStackTrace();
        } /*finally {
            writer.close();
        }*/
    }
}
