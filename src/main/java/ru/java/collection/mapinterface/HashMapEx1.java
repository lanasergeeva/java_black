package ru.java.collection.mapinterface;

import java.util.HashMap;
import java.util.Map;

public class HashMapEx1 {
    public static void main(String[] args) {
        Map<Integer, String> map1 = new HashMap<>();
        map1.put(178988, "Zaur Tregulov");
        map1.put(789445, "Max Korg");
        map1.put(174988, "Oleg Pikolin");
        map1.put(178987, "Anrea Poreo");
        map1.putIfAbsent(178988, "Zaur");
        System.out.println(map1);
        System.out.println(map1.get(174988));
        map1.remove(789445);
        System.out.println(map1);
        System.out.println(map1.containsValue("Zaur Tregulov"));
        System.out.println(map1.keySet());
        System.out.println(map1.values());

    }
}
