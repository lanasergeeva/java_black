package ru.java.comparation;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Test1 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Lana");
        list.add("Ivan");
        list.add("Mariya");
        System.out.println("Pered sort");
        System.out.println(list);
        Collections.sort(list);
        System.out.println("Posle sort");
        System.out.println(list);

    }
}
