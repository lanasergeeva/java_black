package ru.java.reflections;

import java.lang.reflect.Field;

public class Ex3 {
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
        Employee employee = new Employee(10, "Lana");
        Class employeeClass = employee.getClass();
        Field field = employeeClass.getDeclaredField("salary");
        field.setAccessible(true);
        double salaryVal = (double) field.get(employee);
        System.out.println(salaryVal);

        field.set(employee, 15000);
        System.out.println(employee);

    }
}
