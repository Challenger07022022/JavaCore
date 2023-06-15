package ru.geekbrains.hw3;

public class Program {
    public static void main(String[] args) {
        Human[] humans = {new EmployeeWithFixedSalary("Виталий", 120000.22),
                new EmployeeWithFixedSalary("Вероника", 130000.22),
                new EmployeeWithFixedSalary("Егор", 140000.22),
                new EmployeeWithHourlySalary("Дмитрий", 600.0),
                new EmployeeWithHourlySalary("Мария", 700.0),
                new EmployeeWithHourlySalary("Алексей", 800.0),
        };
        for (Human human : humans) {
            System.out.println(human.getName() + " " + human.averageMonthlySalary());
        }
    }

}
