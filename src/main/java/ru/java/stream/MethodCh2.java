package ru.java.stream;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MethodCh2 {
    public static void main(String[] args) {
        Stream<Integer> stream1 = Stream.of(1, 2, 3, 4, 5, 1, 2, 3);
        stream1.filter(e -> {
            System.out.println("!!!");
            return e % 2 == 0;
        }).collect(Collectors.toList());
    }
}
