package ru.geekbrains.hw3;

public abstract class Human {
    private String name;
    private double salary;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public Human(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }

    public abstract double averageMonthlySalary();
}
