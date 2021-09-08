package ru.java.stream;

import java.util.ArrayList;

public class MinMax {
    public static void main(String[] args) {
        StudentS st1 = new StudentS("Ivan", 'm', 22, 3, 8.3);
        StudentS st2 = new StudentS("Pasha", 'm', 27, 2, 6.1);
        StudentS st3 = new StudentS("Masha", 'f', 24, 1, 3.3);
        StudentS st4 = new StudentS("Lena", 'f', 23, 4, 9.5);
        StudentS st5 = new StudentS("Oleg", 'm', 19, 5, 7.6);
        ArrayList<StudentS> students = new ArrayList<>();
        students.add(st1);
        students.add(st2);
        students.add(st3);
        students.add(st4);
        students.add(st5);

        StudentS min = students.stream()
                .min((x, y) -> x.getAge() - y.getAge())
                .get();
        System.out.println(min);

        StudentS max = students.stream()
                .max((x, y) -> x.getAge() - y.getAge())
                .get();
        System.out.println(max);
        students.stream().filter(e -> e.getAge() > 20).limit(2).forEach(System.out::println);

        students.stream().filter(e -> e.getAge() > 20).skip(2).forEach(System.out::println);
    }
}
