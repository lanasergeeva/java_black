package ru.java.io.programmer1;

import java.io.Serializable;

public class Employee implements Serializable {
    static final long serialVersionUID = 1;
    String name;
    String surname;
    String department;
    String vegan;
    //int age;
    transient double salary;
    Car car;

    public Employee(String name, String surname, String department, String vegan, double salary, Car car) {
        this.name = name;
        this.surname = surname;
        this.department = department;
        this.vegan = vegan;
        //this.age = age;
        this.salary = salary;
        this.car = car;
    }

    @Override
    public String toString() {
        return "Employee{"
                + "name='" + name + '\''
                + ", surname='" + surname + '\''
                + ", department='" + department + '\''
                + ", vegan=" + vegan
                //", age=" + age +
                + ", salary=" + salary
                + ", car=" + car
                + '}';
    }
}
