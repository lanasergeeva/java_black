package ru.java.regex;

public class PrintFExample {

    static void employeeInfo(Employee e) {
        System.out.printf("%03d \t Hello, %-12s \t %-12s \t %,.1f \n", e.getId(), e.getName(),
                e.getSurname(), e.getSalary() * (1 + e.getBonus()));
    }

    public static void main(String[] args) {
        Employee employee = new Employee(1, "Lana", "Molodec", 154156, 0.20);
        Employee employee2 = new Employee(2, "Oleg", "Pikalev", 25654, 0.15);
        Employee employee3 = new Employee(3, "Vasiliy", "Igoryan", 84569, 0.50);
        employeeInfo(employee);
        employeeInfo(employee2);
        employeeInfo(employee3);

        String newString = String.format("%03d \t Hello, %-12s \t %-12s \t %,.1f", 1, "Lana", "Molodec", 12545 * (1 + 0.15));
        System.out.println(newString);
    }
}

class Employee {
    private int id;
    private String name;
    private String surname;
    private int salary;
    private double bonus;

    public Employee(int id, String name, String surname, int salary, double bonus) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.salary = salary;
        this.bonus = bonus;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getSalary() {
        return salary;
    }

    public double getBonus() {
        return bonus;
    }
}