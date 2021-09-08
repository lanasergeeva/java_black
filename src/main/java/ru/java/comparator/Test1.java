package ru.java.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Test1 {
    public static void main(String[] args) {
        List<Employee> list = new ArrayList<>();
        Employee emp1 = new Employee(150, "Poymanova", "Lana", 50000);
        Employee emp2 = new Employee(120, "Piklz", "Jay", 12455);
        Employee emp3 = new Employee(130, "Kim", "Ping", 1898);
        list.add(emp1);
        list.add(emp2);
        list.add(emp3);
        System.out.println("Before sorting \n" + list);
        Collections.sort(list, new IdComparator());
        //Collections.sort(list, new NameComparator());
        //Collections.sort(list, new SalaryComparator());
        System.out.println("After sorting \n" + list);
    }
}

class IdComparator implements Comparator<Employee> {
    @Override
    public int compare(Employee emp1, Employee emp2) {
        if (emp1.id == emp2.id) {
            return 0;
        } else if (emp1.id < emp2.id) {
            return -1;
        } else {
            return 1;
        }
    }
}

class NameComparator implements Comparator<Employee> {
    @Override
    public int compare(Employee emp1, Employee emp2) {
        return emp1.name.compareTo(emp2.name);
    }
}

class SalaryComparator implements Comparator<Employee> {
    @Override
    public int compare(Employee emp1, Employee emp2) {
        return emp1.salary - emp2.salary;
    }
}

class Employee implements Comparable<Employee> {

    //Integer id;
    int id;
    String surname;
    String name;
    int salary;

    @Override
    public int compareTo(Employee anotherEmp) {
        /*Это все можно записать вот так
        return this.id-anotherEmp.id
        или, если id Integer
        return this.id.compareTo(anotherEmp.id)

        если делаем ретер в зависомости от имени работника
        return this.name.compareTo(anotherEmp.name);

        int rsl = this.name.compareTo(anotherEmp.name);
        if(rsl == 0) {
        res = this.surname.compareTo(anotherEmp.name);

         */
        if (this.id == anotherEmp.id) {
            return 0;
        } else if (this.id < anotherEmp.id) {
            return -1;
        } else {
            return 1;
        }
    }

    @Override
    public String toString() {
        return "Employee{"
                + "id=" + id
                + ", surname='" + surname + '\''
                + ", name='" + name + '\''
                + ", salary=" + salary
                + '}';
    }

    public Employee(int id, String surname, String name, int salary) {
        this.id = id;
        this.surname = surname;
        this.name = name;
        this.salary = salary;
    }
}