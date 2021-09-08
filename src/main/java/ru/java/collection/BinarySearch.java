package ru.java.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class BinarySearch {
    public static void main(String[] args) {
        /*ArrayList<Integer>arrayList = new ArrayList<>();
        arrayList.add(-3);
        arrayList.add(8);
        arrayList.add(12);
        arrayList.add(5);
        arrayList.add(0);
        arrayList.add(10);
        arrayList.add(1);
        arrayList.add(150);
        arrayList.add(19);
        Collections.sort(arrayList);
        int index1 = Collections.binarySearch(arrayList, 12);
        System.out.println(index1);*/

        /*Employee emp1 = new Employee(100, "Lana", 55000);
        Employee emp2 = new Employee(15, "Max", 45000);
        Employee emp3 = new Employee(159, "Tanya", 35000);
        Employee emp4 = new Employee(15, "Masha", 60000);
        Employee emp5 = new Employee(182, "Oleg", 78000);
        Employee emp6 = new Employee(20, "Petr", 15000);
        Employee emp7 = new Employee(100, "Zaur", 12356);
        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(emp1);
        employeeList.add(emp2);
        employeeList.add(emp3);
        employeeList.add(emp4);
        employeeList.add(emp5);
        employeeList.add(emp6);
        employeeList.add(emp7);
        //System.out.println(employeeList);
        Collections.sort(employeeList);
        System.out.println(employeeList);
        int index2 = Collections.binarySearch(employeeList, new Employee(100, "Lana", 55000));
        System.out.println(index2);*/

        int[] array = {-3, 8, 12, -8, 0, 5, 10, -30, 19, 150};
        System.out.println(Arrays.toString(array));
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
        int index3 = Arrays.binarySearch(array, 10);
        System.out.println(index3);

    }
}

class Employee implements Comparable<Employee> {
    int id;
    String surname;
    int salary;

    public Employee(int id, String surname, int dalary) {
        this.id = id;
        this.surname = surname;
        this.salary = dalary;
    }

    @Override
    public String toString() {
        return "Emoployee{"
                + "id=" + id
                + ", surname='" + surname + '\''
                + ", dalary=" + salary
                + '}';
    }

    @Override
    public int compareTo(Employee anotherEmp) {
        int result = this.id - anotherEmp.id; //у кого равны айцди проверяется имя
        if (result == 0) {
            result = this.surname.compareTo(anotherEmp.surname);
        }
        return result;
    }
}
