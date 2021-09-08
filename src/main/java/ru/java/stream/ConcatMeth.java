package ru.java.stream;

import java.util.stream.Stream;

public class ConcatMeth {
    public static void main(String[] args) {
        Stream<Integer> stream = Stream.of(1, 2, 3, 4, 5);
        Stream<Integer> stream2 = Stream.of(6, 7, 8, 9, 10);
        Stream<Integer> stream3 = Stream.concat(stream, stream2);
        stream3.forEach(System.out::println);
    }
}

