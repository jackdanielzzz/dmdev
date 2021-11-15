package com.homework.homework5;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Дана строка с текстом, в котором есть цифры от 0 до 9.
 * Написать 2 метода:
 * - возвращающий массив цифр из переданной строки
 * - возвращающий сумму цифр из переданного целочисленного массива
 * Посчитать сумму всех чисел из строки
 * Например:
 * “Привет 8, как 1 2 твои дела? Может4, сделать 3 дело?” -> 18 (8+1+2+4+3)
 */
public class StringTask2 {

    public static void main(String[] args) {
        String value = "Привет 8, как 1 2 твои дела? Может4, сделать 3 дело?";

        int[] numbers = extractNumbers(value);
        int sum = sumNumbers(numbers);
        System.out.println("Сумма чисел из заданой строки: " + sum);
    }

    private static int sumNumbers(int[] numbers) {
        int result = 0;
        for (int number : numbers) {
            result += number;
        }
        return result;
    }

    public static int numbersCount(String s) {
        int result = 0;
        Pattern pattern = Pattern.compile("[0-9]+");
        Matcher matcher = pattern.matcher(s);
        while (matcher.find()) {
            result++;
        }
        return result;
    }

    public static int[] extractNumbers(String stringValue) {
        int[] numbers = new int[numbersCount(stringValue)];
        int index = 0;
        Pattern pattern = Pattern.compile("[0-9]+");
        Matcher matcher = pattern.matcher(stringValue);
        while (matcher.find()) {
            numbers[index] = Integer.parseInt(matcher.group());
            index++;
        }
        return numbers;
    }
}
