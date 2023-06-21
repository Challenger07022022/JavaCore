package ru.geekbrains.hw4;

public class Program {
    public static void main(String[] args) {
        String[][] arr = {{"1", "1", "1", "1"}, {"1", "1", "1", "1"}};
        try {
            int sum = myArray(arr);
            System.out.println("Сумма эмлементов массива равна: " + sum);
        } catch (MyArraySizeException | MyArrayDataException e) {
            System.out.println(e.getMessage());
        }
    }

    public static int myArray(String[][] array) throws MyArraySizeException, MyArrayDataException {
        int size = 4;
        int sumArray = 0;
        if (array.length != size && array[0].length != size) {
            throw new MyArraySizeException("Некорректный размер массива!");
        } else {
            for (int i = 0; i < array.length; i++) {
                for (int j = 0; j < array[0].length; j++) {
                    try {
                        sumArray += Integer.parseInt(array[i][j]);
                    } catch (NumberFormatException e) {
                        throw new MyArrayDataException("Некорректные данные в ячейке [" + i + "][" + j + "]");
                    }
                }
            }
        }
        return sumArray;
    }
}
