package ru.java.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex1 {
    public static void main(String[] args) {
        String s = "Lana Sergeevna, Russia, Sevastopol, Lenin street, 51, flat 48,"
                + "email: lanas@gmail.com, Postcode: 98311, Phone Number: +79788977776"
                + "Lena ivanova, Russia, Kerch, Kim street, 43, flat 12,"
                + "email: lenusik@gmail.ru, Postcode: 478896, Phone Number: +79785664849";


        // Pattern pattern1 = Pattern.compile("\\b\\d{2}\\b");
        Pattern pattern1 = Pattern.compile("\\w+@\\w+\\.(ru|com)");
        Matcher matcher = pattern1.matcher(s);
        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }
}
