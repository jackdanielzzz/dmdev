//Дано целое число.
//        Написать функцию, которая принимает целое число, а возвращает целое число обратное этому (не строку!).
//        Результат вывести на консоль.
//        Например: 4508 -> 8054, 4700 -> 74, 1234567 -> 7654321
//        Примечание: для решения может понадобится функция возведение числа в степень: Math.pow(число, степень)

package com.homework.homework2;

public class Revert {
    public static void main(String[] args) {
        int inputNumber = 4508;
        System.out.println("Обратное число от " + inputNumber + " будет: " + RevertFunction2(inputNumber));
        System.out.print("Обратное число от " + inputNumber + " будет: ");
        RevertFunction1(inputNumber);

    }

    public static void RevertFunction1(int input){
        int currentValue = input;
        while (currentValue != 0) {
            int currentNumber = currentValue % 10;
            System.out.print(currentNumber);
            currentValue /= 10;
        }
    }

    public static int RevertFunction2 (int input) {
        int num = input;
        int reversed = 0;

        while(num != 0) {
            int digit = num % 10;
            reversed = reversed * 10 + digit;

            num /= 10;
        }
        return reversed;
    }
}
