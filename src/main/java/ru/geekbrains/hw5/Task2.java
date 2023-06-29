package ru.geekbrains.hw5;

import java.io.File;

/*
Доработайте класс Tree и метод print который мы разработали на семинаре.
Ваш метод должен распечатать полноценное дерево директорий и файлов относительно корневой директории.
 */
public class Task2 {
    public static void main(String[] args) {
        Tree tree = new Tree();
        tree.print(new File("C:\\Users\\Админ\\Desktop\\IT\\JavaCore\\lesson\\src\\main\\java\\ru\\geekbrains"), "", true);
    }
}
