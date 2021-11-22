package com.homework.homework7;

public class HalleyComet implements Shineable, WithSpeed, WithDiameter, SpaceObject{

    String name;

    public HalleyComet() {
        this.name = "Комета Галея";
    }

    @Override
    public double getShinePower() {
        return 0.1;
    }

    @Override
    public double getDiameter() {
        return 11;
    }

    @Override
    public double getSpeed() {
        return 254016;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public double getWeight() {
        return 2.2e14;
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        result.append("Название кометы: " + name + System.lineSeparator());
        result.append("вес: " + getWeight() + System.lineSeparator());
        result.append("диаметр: " + getDiameter() + System.lineSeparator());
        result.append("индекс светимоси: " + getShinePower() + System.lineSeparator());
        result.append("скорость: " + getSpeed() + System.lineSeparator());
        return result.toString();
    }
}
