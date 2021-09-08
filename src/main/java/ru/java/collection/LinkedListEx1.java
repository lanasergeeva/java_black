package ru.java.collection;

import java.util.LinkedList;

public class LinkedListEx1 {
    public static void main(String[] args) {
        Student st1 = new Student("Ivan", 2);
        Student st2 = new Student("Petr", 1);
        Student st3 = new Student("Oleg", 4);
        Student st4 = new Student("Nikita", 5);
        LinkedList<Student> studentLinkedList = new LinkedList<>();
        studentLinkedList.add(st1);
        studentLinkedList.add(st2);
        studentLinkedList.add(st3);
        studentLinkedList.add(st4);
        System.out.println(studentLinkedList);
        System.out.println(studentLinkedList.get(2));
        Student st5 = new Student("Zaur", 2);
        Student st6 = new Student("Mick", 1);
        studentLinkedList.add(st5);
        System.out.println(studentLinkedList);
        studentLinkedList.add(1, st6);
        System.out.println(studentLinkedList);


    }
}

class Student {
    String name;
    int course;

    public Student(String name, int course) {
        this.name = name;
        this.course = course;
    }

    @Override
    public String toString() {
        return "Student{"
                + "name='" + name + '\''
                + ", course=" + course
                + '}';
    }
}
