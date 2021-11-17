package com.homework.homework3;

/**
 * Дан одномерный массив целых чисел.
 * Написать функцию, которая принимает этот массив и разбивает на 3 других: с только отрицательными числами, только положительными и только нули.
 * Если для какого-то из массивов не будет значений, то должен быть создан пустой массив.
 * Возвращает функция эти три массива в виде одного двумерного.
 * Пример:
 * [-4, -18]
 * [-4, 0, 1, 9, 0, -18, 3] -> [0, 0]
 * [1, 9, 3]
 */
public class Task3 {

    public static void main(String[] args) {
        int[] numericArray = {-4, 0, 1, 9, 0, -18, 3};
        int[][] separatedArray = separateNumericArray(numericArray);
        for (int[] i : separatedArray) {
            System.out.print("[");
            for (int j : i) {
                System.out.print(j + " ");
            }
            System.out.print("]");
            System.out.println();
        }
    }

    public static int[][] separateNumericArray(int[] values) {
        int[][] result = new int[3][];
        result[0] = extractNegativeNumbers(values);
        result[1] = extractZeros(values);
        result[2] = extractPositiveNumbers(values);

        return result;
    }

    public static int[] extractPositiveNumbers(int[] values) {
        int[] result = new int[Task1.findPositiveCount(values)];
        int counter = 0;
        for (int value : values) {
            if (value > 0) {
                result[counter] = value;
                counter++;
            }
        }
        return result;
    }

    public static int[] extractNegativeNumbers(int[] values) {
        int[] result = new int[Task1.findNegativeCount(values)];
        int counter = 0;
        for (int value : values) {
            if (value < 0) {
                result[counter] = value;
                counter++;
            }
        }
        return result;
    }

    public static int[] extractZeros(int[] values) {
        int[] result = new int[Task1.findZerosCount(values)];
        int counter = 0;
        for (int value : values) {
            if (value == 0) {
                result[counter] = value;
                counter++;
            }
        }

        return result;
    }
}
