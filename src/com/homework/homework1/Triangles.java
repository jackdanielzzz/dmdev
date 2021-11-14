//      Даны два прямоугольных треугольника. Каждый из них задается двумя целочисленными переменными a и b - стороны треугольника.
//      Написать код, в котором вычисляется площадь каждого треугольника и затем эти площади сравниваются друг с другом.
//
//      Для этого понадобится написать 2 функции.
//      Первая: по двум сторонам прямоугольного треугольника возвращает его площадь.
//      Вторая: сравнивает переданные площади двух треугольников и выводит на консоль первый треугольник больше, меньше или равен второму.
//
//      Учитывать, что площадь может быть вещественным числом.


package com.homework.homework1;

public class Triangles {

    public static void main(String[] args) {
        int firstTriangleSideA = 10;
        int firstTriangleSideB = 20;
        int secondTriangleSideA = 30;
        int secondTriangleSideB = 40;

        double firstSquare = calcSquare(firstTriangleSideA, firstTriangleSideB);
        double secondSquare = calcSquare(secondTriangleSideA, secondTriangleSideB);
        compareTriangles(firstSquare, secondSquare);
    }

    public static double calcSquare(int a, int b) {
        return (a * b) >> 1;
    }

    public static void compareTriangles(double firstSquare, double secondSquare) {
        if (firstSquare > secondSquare) {
            System.out.println("Площадь первого треугольника больше");
        } else if (firstSquare < secondSquare) {
            System.out.println("Площадь второго треугольника больше");
        } else {
            System.out.println("Площади треугольников равны");
        }

    }
}

