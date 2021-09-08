package ru.java.lambda;

public class Student {
    String name;
    char sex;
    int age;
    int course;
    double avgGrade;

    public Student(String name, char sex, int age, int course, double avgGrade) {
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.course = course;
        this.avgGrade = avgGrade;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Student{"
                + "name='" + name + '\''
                + ", sex=" + sex
                + ", age=" + age
                + ", course=" + course
                + ", avgGrade=" + avgGrade
                + '}';
    }
}
