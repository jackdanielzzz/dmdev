package com.homework.homework3;

/**
 * Дан одномерный массив символов.
 * Преобразовать его в одномерный массив чисел, где число - это код символа (любой символ - это число в памяти компьютера).
 * Например: [‘a’, ‘6’, ‘y’, ‘P’, ‘T’, ‘q’, ‘9’, ‘+’] -> [97, 54, 121, 80, 84, 113, 57, 43]
 * Далее определить среднее арифметическое всех элементов целочисленного массива и вывести на консоль только те элементы,
 * которые больше этого среднего арифметического.
 */
public class Task2 {

    public static void main(String[] args) {
        char[] symbolArray = {'a', '6', 'y', 'P', 'T', 'q', '9', '+'};
        int[] numericArray = convertCharToNum(symbolArray);
        showAboveAverageNumber(numericArray);
    }

    private static void showAboveAverageNumber(int[] numericArray) {
        double averageNum = 0;
        for (int symbolCode : numericArray) {
            averageNum += symbolCode;
        }

        averageNum = averageNum / numericArray.length;
        for (int symbolCode : numericArray) {
            if (symbolCode > averageNum) {
                System.out.print(symbolCode + " ");
            }
        }
    }

    private static int[] convertCharToNum(char[] symbolArray) {
        int[] numericArray = new int[symbolArray.length];
        for (int i = 0; i < symbolArray.length; i++) {
            numericArray[i] = (int) symbolArray[i];
        }

        return numericArray;
    }

}
