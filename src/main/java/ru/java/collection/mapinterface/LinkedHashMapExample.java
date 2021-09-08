package ru.java.collection.mapinterface;

import java.util.LinkedHashMap;

public class LinkedHashMapExample {
    public static void main(String[] args) {
        LinkedHashMap<Double, Student> lhm =
                new LinkedHashMap<>(16, 0.75f, true);
        Student st1 = new Student("Zaur", "Tregulov", 3);
        Student st2 = new Student("Masha", "Bober", 1);
        Student st3 = new Student("Igor", "Reznik", 4);
        Student st4 = new Student("Oleg", "Dolbn", 2);

        lhm.put(5.8, st1);
        lhm.put(6.4, st2);
        lhm.put(7.2, st3);
        lhm.put(8.8, st4);
        System.out.println(lhm);


    }
}
