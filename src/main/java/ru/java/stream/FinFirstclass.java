package ru.java.stream;

import java.util.ArrayList;

public class FinFirstclass {
    public static void main(String[] args) {
        StudentS st1 = new StudentS("Ivan", 'm', 22, 3, 8.3);
        StudentS st2 = new StudentS("Pasha", 'm', 27, 2, 6.1);
        StudentS st3 = new StudentS("Masha", 'f', 24, 1, 3.3);
        StudentS st4 = new StudentS("Lena", 'f', 23, 4, 9.5);
        StudentS st5 = new StudentS("Oleg", 'm', 20, 5, 7.6);
        ArrayList<StudentS> students = new ArrayList<>();
        students.add(st1);
        students.add(st2);
        students.add(st3);
        students.add(st4);
        students.add(st5);
        StudentS first = students.stream().map(el -> {
            el.setName(el.getName().toUpperCase());
            return el;
        })
                .filter(el -> el.getSex() == 'f')
                .sorted((x, y) -> x.getAge() - y.getAge())
                .findFirst()
                .get();

        System.out.println(first);
    }
}
