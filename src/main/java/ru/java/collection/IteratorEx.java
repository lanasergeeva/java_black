package ru.java.collection;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorEx {
     public static void main(String[] args) {
        ArrayList<String> array1 = new ArrayList<>();
        array1.add("Lana");
        array1.add("Max");
        array1.add("Ivan");
        array1.add("Petr");

        Iterator<String> iterator = array1.iterator();
        while (iterator.hasNext()) {
            iterator.next();
            iterator.remove();
        }
        System.out.println(array1);
    }
}
