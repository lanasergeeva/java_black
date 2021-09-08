package ru.java.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupBy {
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

        /*Map<Integer, List<StudentS>> map = students.stream().map(element -> {
            element.setName(element.getName().toUpperCase());
            return element;
        })
                .collect(Collectors.groupingBy(element -> element.getCourse()));
        for (Map.Entry<Integer, List<StudentS>> entry : map.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue().toString());
        }*/
        Map<Boolean, List<StudentS>> map =
                students.stream()
                        .collect(Collectors.partitioningBy(el1 -> el1.getAvgGrade() > 7));
        for (Map.Entry<Boolean, List<StudentS>> entry : map.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue().toString());
        }


    }
}

class StudentS {
    String name;
    char sex;
    int age;
    int course;
    double avgGrade;

    public StudentS(String name, char sex, int age, int course, double avgGrade) {
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.course = course;
        this.avgGrade = avgGrade;
    }

    public void setName(String name) {
        this.name = name;
    }

    public char getSex() {
        return sex;
    }

    public int getAge() {
        return age;
    }

    public int getCourse() {
        return course;
    }

    public double getAvgGrade() {
        return avgGrade;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public void setAvgGrade(double avgGrade) {
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

