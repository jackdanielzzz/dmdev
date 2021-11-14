package com.homework.homework3;

/**
 * Дан одномерный массив целых чисел.
 * Написать функцию, удаляющую из него все отрицательные элементы (удалить - значит создать новый массив с только положительными элементами).
 * После удаления - умножить каждый элемент массива на его длину.
 * Например: [3, 5, -6, 3, 2, -9, 0, -123] -> [15, 25, 15, 10, 0]
 */
public class Task1 {

    public static void main(String[] args) {
        int[] values = {3, 5, - 6, 3, 2, - 9, 0, - 123};
        int[] positiveElements = deleteNegativeElements(values);
        for (int positiveElement : positiveElements) {
            System.out.print(positiveElement + " ");
        }

    }

    public static int[] deleteNegativeElements(int[] values) {
        int positiveCount = findPositiveAndZerosCount(values);
        int[] positiveElements = new int[positiveCount];

        int counter = 0;
        for (int value : values) {
            if (value >= 0) {
                positiveElements[counter++] = value * positiveCount;
            }
        }
        return positiveElements;
    }

    public static int findPositiveAndZerosCount(int[] values) {
        int elementsCount = 0;
        for (int value : values) {
            if (value >= 0) {
                elementsCount++;
            }
        }
        return elementsCount;
    }

    public static int findPositiveCount(int[] values) {
        int elementsCount = 0;
        for (int value : values) {
            if (value > 0) {
                elementsCount++;
            }
        }
        return elementsCount;
    }

    public static int findNegativeCount(int[] values) {
        int elementsCount = 0;
        for (int value : values) {
            if (value < 0) {
                elementsCount++;
            }
        }
        return elementsCount;
    }

    public static int findZerosCount(int[] values) {
        int elementsCount = 0;
        for (int value : values) {
            if (value == 0) {
                elementsCount++;
            }
        }
        return elementsCount;
    }
}
