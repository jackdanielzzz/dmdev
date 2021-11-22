package com.homework.homework7;

public class Venus extends Planet implements WithDiameter, SpaceObject  {

    public Venus() {
        super("Венера", 108000000, 0, 6051000, false);
    }

    @Override
    public double getDiameter() {
        return radius * 2;
    }

    @Override
    public double getWeight() {
        return 4.84e24;
    }

    @Override
    public String toString() {
        return SpaceUtils.printPlanetInfo(this);
    }
}
