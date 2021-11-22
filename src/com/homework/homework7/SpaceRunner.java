package com.homework.homework7;

/**
 * Создать иерархию классов, описывающих объекты в космосе.
 * Например, планета, спутник, звезда, астероид и т.д. У каждого есть набор методов и характеристик-свойств,
 * как общих (масса), так и присущих только этому типу космического объекта.
 * Необходимо учесть следующее:
 * В иерархии должно быть минимум 10 классов/интерфейсов
 * Обязательно использовать наследование (достаточно 1-2 уровней)
 * Использовать полиморфизм и продемонстрировать переопределение методов в иерархии
 * Продемонстрировать добавление собственных методов в классах-наследниках (можно с помощью интерфейсов)
 * При разработке иерархии держать в уме принцип инкапсуляции, выбирать корректные имена классов, их полей и методов, пользоваться преимуществами полиморфизма
 * Отдавайте предпочтение интерфейсам, а не абстрактным классам
 * При переопределении методов обязательно использовать аннотацию @Override
 * Не создавать лишних классов в системе (полностью дублирующих или не содержащих назначения)
 * Каждый класс должен выполнять своё назначение
 * Для каждого не абстрактного класса переопределить метод toString() класса для представления информации о классах в строковой форме
 * Создать общие методы:
 * - Рассчитывающие диаметр космического объекта
 * - Сравнивающий массы 2 космических объектов (метод не статический!)
 * <p>
 * Создать утилитный класс* SpaceUtils со следующими статическими методами:
 * - Принимающий 2 космический объекта и определяющий силу гравитации между ними (можно придумать любую формула на основании расстоянии между объектами и т.д.)
 * - Принимающий космический объект и определяющий, является ли он звездой или нет
 * Создать класс SpaceRunner, где протестировать написанный функционал
 * В этом задании нет одного правильного решения, подойдите к нему творчески.
 * Утилитный класс* - это такой класс, который:
 * - помечен ключевым словом final, чтобы запретить наследоваться от него
 * - имеет private конструктор, чтобы нельзя было создать объект этого класса
 * - имеет только статические методы и константы
 */
public class SpaceRunner {

    public static void main(String[] args) {
        SpaceObject sun = new Sun();
        SpaceObject earth = new Earth();
        SpaceObject venus = new Venus();
        SpaceObject sputnik1 = new Sputnik1();
        SpaceObject haleyComet = new HalleyComet();

        System.out.println(sun);
        System.out.println(earth);
        System.out.println(venus);
        System.out.println(sputnik1);
        System.out.println(haleyComet);

        System.out.println(SpaceUtils.isStar(sun) ? "Космический объект " + sun.getName() + " является звездой" : "Объект не является звездой");
        System.out.println(SpaceUtils.isStar(haleyComet) ? "Космический объект " + haleyComet.getName() + " является звездой" : "Космический объект " + haleyComet.getName() + " не является звездой");
        double gravityBetweenObjects = SpaceUtils.gravityBetweenObjects(sun, earth);
        System.out.println("Гравитация между Cолнцем и Землей: " + gravityBetweenObjects);

    }
}
