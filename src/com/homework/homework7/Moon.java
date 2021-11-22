package com.homework.homework7;

public class Moon extends Satelite implements WithDiameter, SpaceObject, Shineable{

    public Moon() {
        super("Луна", false);
    }

    @Override
    public double getDiameter() {
        return 3.4e6;
    }

    @Override
    public double getWeight() {
        return 7.35e22;
    }

    @Override
    public double getShinePower() {
        return 1;
    }

    @Override
    public String toString() {
        return "Название спутника='" + name + '\'' + ", Исскуственный спутник: " + artificial;
    }
}
