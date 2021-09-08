package ru.java.collection.mapinterface;

import java.util.TreeMap;

public class TreeMapExample {
    public static void main(String[] args) {
        TreeMap<Double, Student> treeMap = new TreeMap<>();
        Student st1 = new Student("Zaur", "Tregulov", 3);
        Student st2 = new Student("Masha", "Bober", 1);
        Student st3 = new Student("Igor", "Reznik", 4);
        Student st4 = new Student("Oleg", "Dolbn", 2);
        Student st5 = new Student("Alex", "Romash", 4);
        treeMap.put(9.8, st1);
        treeMap.put(6.4, st2);
        treeMap.put(7.7, st3);
        treeMap.put(8.9, st4);
        treeMap.put(5.1, st5);

        //System.out.println(treeMap);
       /* treeMap.descendingMap();
        System.out.println(treeMap.descendingMap());*/

       /* treeMap.put(st2,6.4);
        treeMap.put(st3, 7.7);
        treeMap.put(st1, 9.8);
        treeMap.put(st5, 5.5);
        treeMap.put(st4, 8.9);
        System.out.println(treeMap);*/
    }
}
