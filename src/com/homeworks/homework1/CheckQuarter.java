//В переменной minutes лежит число от 0 до 59.
//Написать функцию, которая принимает в качестве параметра значение переменной minutes и выводит на консоль в какую четверть часа попадает это число (в первую, вторую, третью или четвертую).
//Протестировать функцию в main.


package com.homeworks.homework1;

public class CheckQuarter {
    public static void main(String[] args) {
        int minutes = 59;
        checkQuarterTime(minutes);
        checkQuarterTime2(minutes);
    }

    public static void checkQuarterTime(int min) {
        if (min < 0 || min >= 60) {
            System.out.println("Неверно заданы минуты!");
        }
        if (min >= 0 && min <= 14) {
            System.out.println("Первая четверть");
        }
        if (min >= 15 && min <= 30) {
            System.out.println("Вторая четверть");
        }
        if (min >= 31 && min <= 45) {
            System.out.println("Третья четверть");
        }
        if (min >= 46 && min <= 59) {
            System.out.println("Четвертая четверть");
        }
    }


    public static void checkQuarterTime2(int min) {
        if (min < 0 || min >= 60) {
            System.out.println("Неверно заданы минуты!");
            return;
        }
        int quater = min / 15 + 1;
        System.out.println(quater + "-я четверть");
    }

}

