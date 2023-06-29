package ru.geekbrains.hw5;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;

/* 1. Написать функцию, создающую резервную копию всех файлов в директории(без поддиректорий)
во вновь созданную папку ./backup
*/
public class Task1 {
    public static void main(String[] args) {
        String sourceDirectory = "C:\\Users\\Админ\\Desktop\\IT\\JavaCore\\lesson\\src\\main\\java\\ru\\geekbrains\\hw5\\test";
        String backupDirectory = "C:\\Users\\Админ\\Desktop\\IT\\JavaCore\\lesson\\src\\main\\java\\ru\\geekbrains\\hw5\\backup";

        try {
            backupFiles(sourceDirectory, backupDirectory);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void backupFiles(String sourceDirectory, String backupDirectory) throws IOException {
        File sourceDir = new File(sourceDirectory);
        File backupDir = new File(backupDirectory);

        //Создаём папку backup в текущей директории, если она ещё не создана
        if (!backupDir.exists()) {
            backupDir.mkdir();
        }

        //Получаем список всех файлов в директории
        File[] files = sourceDir.listFiles();
        if (files != null) {
            for (File file : files) {
                //Создаём резервную копию каждого файла, заменяет если уже такой существует
                if (file.isFile()) {
                    String fileName = file.getName();
                    File backupFile = new File(backupDir, fileName);
                    Files.copy(file.toPath(), backupFile.toPath(), StandardCopyOption.REPLACE_EXISTING);
                }
            }
            System.out.println("Резервные копии файлов успешно созданы!");
        }
    }
}
