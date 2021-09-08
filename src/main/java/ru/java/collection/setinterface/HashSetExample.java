package ru.java.collection.setinterface;

import java.util.Set;
import java.util.HashSet;

public class HashSetExample {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set.add("Zaur");
        set.add("Oleg");
        set.add("Marina");
        set.add("Igor");

        for (String s : set) {
            System.out.println(s);
        }
    }
}
