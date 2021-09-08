package ru.java.stream;

import java.util.Arrays;

public class SortedTest {
    public static void main(String[] args) {
        int[] array = {3, 8, 1, 5, 9, 12, 80, 25, 34};
        array = Arrays.stream(array).sorted().toArray();
        System.out.println(Arrays.toString(array));
    }
}
