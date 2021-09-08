package ru.java.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MethodChainigT {
    public static void main(String[] args) {
        Student st1 = new Student("Ivan", 'm', 22, 3, 8.3);
        Student st2 = new Student("Pasha", 'm', 27, 2, 6.1);
        Student st3 = new Student("Masha", 'f', 24, 1, 3.3);
        Student st4 = new Student("Lena", 'f', 19, 4, 9.5);
        Student st5 = new Student("Oleg", 'm', 20, 5, 7.6);
        List<Student> students = new ArrayList<>();
        students.add(st1);
        students.add(st2);
        students.add(st3);
        students.add(st4);
        students.add(st5);
        students.stream().map(element -> {
            element.setName(element.getName().toUpperCase());
            return element;
        })
                .filter(element -> element.getSex() == 'f')
                .sorted((x, y) -> x.getAge() - y.getAge())
                .forEach(element -> System.out.println(element));

        int[] array = {3, 8, 1, 5, 9, 12, 4, 21, 81, 7, 18};
        //нечетные числа, поделим на 3, которые делятся на 3 без остатка и найдем сумму оставшихся
        int result = Arrays.stream(array).filter(e -> e % 2 == 1)
                .map(e -> {
                    if (e % 3 == 0) {
                        e = e / 3;
                    }
                    return e;
                }).reduce((a, e) -> a + e).getAsInt();
        System.out.println(result);
        //1  1 5 3 7 27 7
    }
}
