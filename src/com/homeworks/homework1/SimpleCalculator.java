//Даны 3 переменные:
//        - operand1 (double)
//        - operand2 (double)
//        - operation (char ‘+’, ‘-’, ‘*’, ‘/’, ‘%’)
//        Написать функцию, которая принимает в качестве параметров эти три переменные и возвращает результат операции.
//        Протестировать функцию в main.
//        Например:
//        Параметры: operand1 = 24.4, operand2 = 10.1, operation = ‘+’
//        Результат: 34.5 (24.4 + 10.1)


package com.homeworks.homework1;

public class SimpleCalculator {
    public static void main(String[] args) {
        double operand1 = 24.4;
        double operand2 = 10.1;
        char operand = '+';
        double calcResult = doCalculation(operand1, operand2, operand);
        System.out.println("Результат выполнения операции " + operand+ " : " + calcResult);
    }

    public static double doCalculation(double op1, double op2, char operand) {
        double result = 0;
        switch (operand) {
            case '+' -> result = op1 + op2;
            case '-' -> result = op1 - op2;
            case '*' -> result = op1 * op2;
            case '/' -> result = op1 / op2;
            default -> System.out.println("Данная операция ошибочная или не поддерживается");
        }
        return result;
    }
}

