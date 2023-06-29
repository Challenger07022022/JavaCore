package ru.geekbrains.hw5;
/*
Доработайте класс Tree и метод print который мы разработали на семинаре.
Ваш метод должен распечатать полноценное дерево директорий и файлов относительно корневой директории.
 */

import java.io.File;

public class Tree {

    public void print(File file, String indent, boolean isLast) {
        System.out.print(indent); // рисуем отступ
        if (isLast) {
            System.out.print("└─");
            indent += "  ";
        } else {
            System.out.print("├─");
            indent += "│ ";
        }
        System.out.println(file.getName());

        if (!file.isDirectory()) {
            return;
        }

        File[] files = file.listFiles();
        if (files == null)
            return;

        for (int i = 0; i < files.length; i++) {
            boolean isSubDirLast = (i == files.length - 1);
            print(files[i], indent, isSubDirLast);
        }
    }
}
