package ru.java.reflections;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Ex2 {
    public static void main(String[] args) throws ClassNotFoundException,
            InstantiationException, IllegalAccessException,
            NoSuchMethodException, InvocationTargetException {
        Class employeeClass = Class.forName("ru.java.reflections.Employee");

        Object o = employeeClass.newInstance();
        System.out.println(o);

        Constructor<Employee> constructor1 = employeeClass.getConstructor();
        Object ob1 = constructor1.newInstance();

        Constructor constructor2 = employeeClass.getConstructor(int.class, String.class);
        Object ob2 = constructor2.newInstance(150, "Lana");
        System.out.println(ob2);

        Method method = employeeClass.getMethod("setSalary", double.class);
        method.invoke(ob2, 822.22);
        System.out.println(ob2);

    }
}
