package ru.java.reflections;

import ru.java.stream.MethodCh2;

import java.io.*;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Calculator {
    void sum(int a, int b) {
        System.out.println(a + b);
    }

    void substruction(int a, int b) {
        System.out.println(a - b);
    }

    void multiplication(int a, int b) {
        System.out.println(a * b);
    }

    void division(int a, int b) {
        System.out.println(a / b);
    }
}

class TestCalculator {
    public static void main(String[] args) {
        try (BufferedReader reader =
                     new BufferedReader(new FileReader("reflection.txt"))) {
            String methodName = reader.readLine();
            String firstAr = reader.readLine();
            String secondAr = reader.readLine();

            Calculator calculator = new Calculator();
            Class class1 = calculator.getClass();
            Method method = null;

            Method[] methods = class1.getDeclaredMethods();
            for (Method methodFor : methods) {
                if (methodFor.getName().equals(methodName)) {
                    method = methodFor;
                }
            }

            method.invoke(calculator, Integer.parseInt(firstAr), Integer.parseInt(secondAr));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
    }
}
