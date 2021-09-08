package ru.java.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class MaptoInt {
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

        List<Integer> courses = students.stream()
                .mapToInt(el -> el.getCourse())
                .boxed()
                .collect(Collectors.toList());

        System.out.println(courses);

        int sum = students.stream().mapToInt(el -> el.getCourse()).sum();
        System.out.println(sum);

        double average = students.stream().mapToInt(el -> el.getCourse()).average().getAsDouble();
        System.out.println(sum);

        int min = students.stream().mapToInt(el -> el.getCourse()).min().getAsInt();
        System.out.println(sum);

        int max = students.stream().mapToInt(el -> el.getCourse()).max().getAsInt();
        System.out.println(sum);

    }
}
