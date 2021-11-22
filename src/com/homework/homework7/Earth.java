package com.homework.homework7;

public class Earth extends Planet {

    private Satelite satelite;

    public Earth() {
        super("Земля", 149000000, 1,6371000, true);
        satelite = new Moon();
    }

    @Override
    public double getDiameter() {
        return radius * 2;
    }

    @Override
    public double getWeight() {
        return 6e24;
    }

    public Satelite getMoon() {
        return satelite;
    }

    @Override
    public String toString() {
        return SpaceUtils.printPlanetInfo(this) + satelite.toString() + System.lineSeparator();
    }
}
