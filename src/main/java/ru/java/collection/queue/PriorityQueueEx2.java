package ru.java.collection.queue;

import java.util.PriorityQueue;

public class PriorityQueueEx2 {
    public static void main(String[] args) {
        StudentW st1 = new StudentW("Ivan", 2);
        StudentW st2 = new StudentW("Petr", 1);
        StudentW st3 = new StudentW("Oleg", 4);
        StudentW st4 = new StudentW("Nikita", 5);

        PriorityQueue<StudentW> pq = new PriorityQueue<>();
        pq.add(st1);
        pq.add(st2);
        pq.add(st3);
        pq.add(st4);
        System.out.println(pq);
        pq.poll();
        System.out.println(pq);
    }
}

class StudentW implements Comparable<StudentW> {
    String name;
    int course;

    public StudentW(String name, int course) {
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

    @Override
    public int compareTo(StudentW o) {
        return this.course - o.course;
    }
}