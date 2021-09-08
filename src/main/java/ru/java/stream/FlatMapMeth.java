package ru.java.stream;


import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

import ru.java.lambda.Student;

public class FlatMapMeth {
    public static void main(String[] args) {
        ru.java.lambda.Student st1 = new ru.java.lambda.Student("Ivan", 'm', 22, 3, 8.3);
        ru.java.lambda.Student st2 = new ru.java.lambda.Student("Pasha", 'm', 27, 2, 6.1);
        ru.java.lambda.Student st3 = new ru.java.lambda.Student("Masha", 'f', 24, 1, 3.3);
        ru.java.lambda.Student st4 = new ru.java.lambda.Student("Lena", 'f', 23, 4, 9.5);
        ru.java.lambda.Student st5 = new ru.java.lambda.Student("Oleg", 'm', 20, 5, 7.6);

        Faculty f1 = new Faculty("Economics");
        Faculty f2 = new Faculty("Applied maths");
        f1.addStudent(st1);
        f1.addStudent(st2);
        f2.addStudent(st3);
        f2.addStudent(st4);
        f2.addStudent(st5);

        List<Faculty> facultyList = new ArrayList<>();
        facultyList.add(f1);
        facultyList.add(f2);

        facultyList.stream()
                .flatMap(faculty -> faculty.getStudentsOnFaculty()
                        .stream())
                .forEach(s -> System.out.println(s.getName()));


        /*ArrayList<Student> students = new ArrayList<>();
        students.add(st1);
        students.add(st2);
        students.add(st3);
        students.add(st4);
        students.add(st5);*/
    }
}

class Faculty {
    String name;
    List<Student> studentsOnFaculty;

    public Faculty(String name) {
        this.name = name;
    }

    public Faculty(String name, List<Student> studentsOnFaculty) {
        this.name = name;
        this.studentsOnFaculty = new ArrayList<>();
    }

    public List<Student> getStudentsOnFaculty() {
        return studentsOnFaculty;
    }

    public void addStudent(Student st) {
        studentsOnFaculty.add(st);
    }
}