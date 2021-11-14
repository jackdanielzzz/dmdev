package com.exercise;

public class discriminant {

    public static void main(String[] args) {
        int a = 2;
        int b = 7;
        int c = 3;
        int d = calcDiscriminant(a, b, c);

        if (!isPositive(d))
            System.out.println(d + " Нет корней");
        else
        {
            System.out.println((- b + Math.sqrt(d) / 2 * a));
            System.out.println((- b - Math.sqrt(d) / 2 * a));
        }

        if (isZero(d))
            System.out.println(- b / 2 * a);

    }


    public static boolean isPositive(int discriminant) {
        boolean result = false;
        if (discriminant > 0)
            result = true;

        return result;
    }

    public static boolean isZero(int discriminant) {
        boolean result = false;
        if (discriminant == 0)
            result = true;

        return result;
    }

    public static int calcDiscriminant(int a, int b, int c) {
        return b * b - 4 * a * c;
    }
}




