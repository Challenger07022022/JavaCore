package ru.geekbrains.hw3;

public class EmployeeWithHourlySalary extends Human {

    public EmployeeWithHourlySalary(String name, double salary) {
        super(name, salary);
    }

    @Override
    public double averageMonthlySalary() {
        return 20.8 * 8 * getSalary();
    }
}
