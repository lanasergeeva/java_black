package ru.java.stream;

import com.sun.source.tree.Tree;

import java.util.*;
import java.util.stream.Collectors;

public class Test1 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("privet");
        list.add("poka");
        list.add("ok");
        list.add("kak dela");

        /*for (int i = 0; i <list.size() ; i++) {
            list.set(i, String.valueOf(list.get(i).length()));
        }*/
        // 6 9 2 4
        //list.stream().map(element->element.length());
        List<Integer> list2 = list.stream().map(element -> element.length())
                .collect(Collectors.toList());
        System.out.println(list2);

        int[] array = {5, 9, 3, 8, 1};
        //5, 3, 1, 8, 1
        array = Arrays.stream(array).map(element -> {
            if (element % 3 == 0) {
                element = element / 3;
            }
            return element;
        }).toArray();
        System.out.println(Arrays.toString(array));

        Set<String> set = new TreeSet<>();
        set.add("privet");
        set.add("poka");
        set.add("ok");
        set.add("kak dela");
        Set<Integer> set2 = set.stream().map(e -> e.length()).collect(Collectors.toSet());
        List<Integer> list3 = set.stream().map(e -> e.length()).collect(Collectors.toList());
        System.out.println(list3);
    }
}
