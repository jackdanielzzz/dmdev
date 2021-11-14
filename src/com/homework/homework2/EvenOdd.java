//Посчитать четные и нечетные цифры целого числа и вывести их на консоль.
//Для решения написать 2 функции, которые будут принимать введенное целое число, а возвращать количество четных цифр (вторая функция - нечетных).
//Например: если введено число 228910, то у него 4 четные цифры (2, 2, 8, 0) и 2 нечетные (9, 1).

package com.homework.homework2;

public class EvenOdd {

    public static void main(String[] args) {
        int inputNumber = 228910;
        int evenCount = EvenCount(inputNumber);
        int oddCount = OddCount(inputNumber);
        System.out.println("В числе " + inputNumber + " количество четных цифр: " + evenCount);
        System.out.println("В числе " + inputNumber + " количество нечетных цифр: " + oddCount);
    }

    public static int OddCount(int inputNum) {
        int result = 0;
        int currentValue = inputNum;
        int currentNumber;
        boolean odd;
        while (currentValue != 0) {
            currentNumber = currentValue % 10;
            odd = currentNumber % 2 == 0;
            if (!odd) {
                result ++;
            }
            currentValue /= 10;
        }
        return result;
    }

    public static int EvenCount(int inputNum) {
        int result = 0;
        int currentValue = inputNum;
        int currentNumber;
        boolean odd;
        while (currentValue != 0) {
            currentNumber = currentValue % 10;
            odd = currentNumber % 2 == 0;
            if (odd) {
                result ++;
            }
            currentValue /= 10;
        }
        return result;
    }
}
