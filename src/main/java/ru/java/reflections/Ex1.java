package ru.java.reflections;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;

public class Ex1 {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException, NoSuchMethodException {
        Class<?> employeeClass = Class.forName("ru.java.reflections.Employee");

       /* Class employeeClass2 = Employee.class;
        Employee emp = new Employee();
        Class employeeClass3 = emp.getClass();*/

        Field someField = employeeClass.getDeclaredField("id");
        System.out.println("Type of id fiels = " + someField.getType());

        Field[] fields = employeeClass.getDeclaredFields();     // employeeClass.getFields();
        for (Field field : fields) {
            System.out.println("Type of " + field.getName() + " = " + field.getType());
        }

        Method someMethod1 = employeeClass.getDeclaredMethod("increaseSalary");
        System.out.println("Return type of method increaseSalaty is = "
                + someMethod1.getReturnType()
                + " parametr types =" + Arrays.toString(someMethod1.getParameterTypes()));

        Method someMethod2 = employeeClass.getMethod("setSalary", double.class);
        System.out.println("Return type of method setSalary is = "
                + someMethod2.getReturnType()
                + " parametr types "
                + Arrays.toString(someMethod2.getParameterTypes()));

        Method[] allM = employeeClass.getDeclaredMethods();
        for (Method method : allM) {
            System.out.println("Name of method is  = "
                    + method.getName()
                    + " return type " + method.getReturnType()
                    + " paremetrs type "
                    + " return type " + method.getReturnType()
                    + Arrays.toString(method.getParameterTypes()));
        }

        System.out.println("******************************");

        Method[] allM2 = employeeClass.getDeclaredMethods();
        for (Method method : allM2) {
            if (Modifier.isPublic(method.getModifiers())) {
                System.out.println("Name of method is  = "
                        + method.getName()
                        + " return type " + method.getReturnType()
                        + " paremetrs type "
                        + " return type " + method.getReturnType()
                        + Arrays.toString(method.getParameterTypes()));
            }
        }
        System.out.println("******************************");

        Constructor constuctor1 = employeeClass.getConstructor();
        System.out.println("Constructor has " + constuctor1.getParameterCount()
                + " parameters, their types are =  "
                + Arrays.toString(constuctor1.getParameterTypes()));

        Constructor constuctor2 = employeeClass.getConstructor(int.class, String.class);
        System.out.println("Constructor has " + constuctor2.getParameterCount()
                + " parameters, their types are =  "
                + Arrays.toString(constuctor2.getParameterTypes()));
        System.out.println("******************************");

        Constructor[] arrayConstr = employeeClass.getConstructors();
        for (Constructor c : arrayConstr) {
            System.out.println("Constructor has " + c.getParameterCount()
                    + " parameters, their types are =  "
                    + Arrays.toString(c.getParameterTypes()));
        }

    }
}