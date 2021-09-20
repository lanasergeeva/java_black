package ru.java.regex;

public class Regex3 {
    public static void main(String[] args) {
        String s = "Lana Sergeevna, Russia, Sevastopol, Lenin street, 51, flat 48,"
                + "email: lanas@gmail.com, Postcode: 98311, Phone Number: +79788977776"
                + "Lena ivanova, Russia, Kerch, Kim street, 43, flat 12,"
                + "email: lenusik@gmail.ru, Postcode: 478896, Phone Number: +79785664849";

        String s2 = "lenusik@gmail.ru";
        boolean result = s2.matches("\\w+@\\w+\\.(com|ru)");
        System.out.println(result);

        String[] array = s.split("\\w+@\\w+\\.(com|ru)");
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
