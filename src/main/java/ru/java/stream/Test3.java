package ru.java.stream;

import java.util.Arrays;

public class Test3 {
    public static void main(String[] args) {
        int[] array = {5, 9, 3, 8, 1};
        Arrays.stream(array).forEach(el -> {
            el *= 2;
            System.out.println(el);
        });
        Arrays.stream(array).forEach(el -> System.out.println(el));
        Arrays.stream(array).forEach(Ulitls::myMethod);
        Arrays.stream(array).forEach(el -> Ulitls.myMethod(el));

    }
}

class Ulitls {
    public static void myMethod(int a) {
        a = a + 5;
        System.out.println("Elment =" + a);
    }
}
