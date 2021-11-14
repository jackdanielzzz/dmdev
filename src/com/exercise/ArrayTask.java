package com.exercise;

/**
 * Создать целочисленный массив.
 * Написать функцию, которая суммирует все значения этого массива
 */
public class ArrayTask {

    public static void main(String[] args) {
        int[] values = {3, 6, 9, -1, 0};
        int sum = sumValues(values);
        System.out.println(sum);
    }

    private static int sumValues(int[] inputValues) {
        int result = 0;
        for (int i : inputValues) {
            result += i;
        }
        return result;
    }


}
