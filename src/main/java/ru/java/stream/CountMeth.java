package ru.java.stream;

import java.util.stream.Stream;

public class CountMeth {
    public static void main(String[] args) {
        Stream<Integer> stream = Stream.of(1, 2, 3, 4, 5, 1, 2, 3);

        // System.out.println(stream.count());
        System.out.println(stream.distinct().count());
    }
}
