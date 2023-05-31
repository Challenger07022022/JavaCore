package ru.geekbrains.hw1.program.regular;

/**
 * Декоратор. Он декорирует, то есть, накладывает на результат декорации.
 * Внешний вид важен, поэтому этот класс существует.
 */
public class Decorator {

    public static String decorate(int a) {
        /*
         * Метод декорирует число, добавляя к нему строку
         * при помощи функции форматирования строк
         */
        return String.format("Here is your number: %d.", a);
    }

}
