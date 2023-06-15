package ru.geekbrains.hw3;

public class EmployeeWithFixedSalary extends Human {

    public EmployeeWithFixedSalary(String name, double salary) {
        super(name, salary);
    }

    @Override
    public double averageMonthlySalary() {
        return getSalary();
    }
}
