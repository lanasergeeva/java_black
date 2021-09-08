package ru.java.generics;

import java.util.ArrayList;
import java.util.List;

public class Test3 {
    public static void main(String[] args) {
        List<Double> list = new ArrayList<>();
        list.add(3.15);
        list.add(8.25);
        showListInfo(list);
        List<String> list2 = new ArrayList<>();
        list2.add("poka");
        list2.add("ok");
        showListInfo(list2);
    }

    List<?> list = new ArrayList<>();

    static void showListInfo(List<?> list) {
        System.out.println(list);
    }

}
