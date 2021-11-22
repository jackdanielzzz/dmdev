package com.homework.homework7;

public class Sun extends Star {

    public Sun() {
        super("Солнце", 5800);
    }

    @Override
    public double getDiameter() {
        return 1.392e9;
    }

    @Override
    public double getWeight() {
        return 1.98e30;
    }

    @Override
    public double getShinePower() {
        return 400000;
    }

    @Override
    public String toString() {
        return SpaceUtils.printStarInfo(this);
    }
}
