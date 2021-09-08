package ru.java.lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class StudentInfo {

    void testSrudents(ArrayList<Student> al1, Predicate<Student> pr) {
        for (Student s : al1) {
            if (pr.test(s)) {
                System.out.println(s);
            }
        }
    }
}

class Test {
    public static void main(String[] args) {
        Student st1 = new Student("Ivan", 'm', 22, 3, 8.3);
        Student st2 = new Student("Pasha", 'm', 27, 2, 6.1);
        Student st3 = new Student("Masha", 'f', 24, 1, 3.3);
        Student st4 = new Student("Lena", 'f', 23, 4, 9.5);
        Student st5 = new Student("Oleg", 'm', 20, 5, 7.6);
        ArrayList<Student> students = new ArrayList<>();
        students.add(st1);
        students.add(st2);
        students.add(st3);
        students.add(st4);
        students.add(st5);
        StudentInfo info = new StudentInfo();
        Function<Student, Double> f = student -> student.avgGrade;
        double res = avgOgSmth(students, s -> (double) s.age);
        System.out.println(res);



  /*      System.out.println("-------------------------");
        info.testSrudents(students, (Student s) -> {
            return s.age < 24;
        });
        info.testSrudents(students, s -> {
            System.out.println("hello");
            return s.age < 24;
        });*/
/*
        Predicate<Student>  p1 = student -> student.avgGrade > 7.5;
        Predicate<Student>  p2 = student -> student.sex == 'm';
        info.testSrudents(students, p1.or(p2));*/

        //info.testSrudents(students, s -> s.avgGrade > 8); //это короткое написание

        /*System.out.println("-------------------------");
        info.testSrudents(students, (Student s) -> {
            return s.avgGrade > 8;
        });
        System.out.println("-------------------------");
        info.testSrudents(students, (Student s) -> {
            return s.age > 24 && s.avgGrade < 8.5 && s.sex == 'f';
        });*/
    }

    private static double avgOgSmth(List<Student> list, Function<Student, Double> f) {
        double result = 0;
        for (Student s : list) {
            result += f.apply(s);
        }
        result = result / list.size();
        return result;
    }
}

        /*info.prinStudentOverFrade(students, 8);
        System.out.println("-------------------------");
        info.prinStudentUnderAge(students, 22);
        System.out.println("-------------------------");
        info.prinStudentsMixCondition(students, 20, 9.5, 'f');*/

    /*void prinStudentOverFrade(ArrayList<Student> al, double grade) {
        for (Student s : al) {
            if (s.avgGrade > grade) {
                System.out.println(s);
            }
        }
    }

    void prinStudentUnderAge(ArrayList<Student> al, int age) {
        for (Student s : al) {
            if (s.age >age) {
                System.out.println(s);
            }
        }
    }

    void prinStudentsMixCondition(ArrayList<Student> al, int age, double grade, char sex) {
        for (Student s : al) {
            if (s.avgGrade < grade && s.age > age && s.sex == sex) {
                System.out.println(s);
            }
        }
    }*/
/*interface StudentChecks {
    boolean check(Student s);
}*/

/*class CheckOverGrade implements StudentChecks {
    @Override
    public boolean check(Student s) {
        return s.avgGrade > 8;
    }
}*/
/*        Collections.sort(students, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.course-o2.course;
            }
        });
        Collections.sort(students, (stu1, stu2) -> stu1.course-stu2.course);
        System.out.println(students);
        Comparator<Student> comparator = (student1, student2) -> student1.course-student2.course;*/

//info.testSrudents(students, new CheckOverGrade());
//StudentChecks sc = (Student s) -> {return s.avgGrade > 8;};
/*        System.out.println("-------------------------");
        info.testSrudents(students, new StudentChecks() {
            @Override
            public boolean check(Student s) {
                return s.age < 24;
            }
        });*/

