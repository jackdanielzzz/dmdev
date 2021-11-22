package com.homework.homework7;

public abstract class Star implements WithDiameter, SpaceObject, Shineable {

    String name;
    int colorTemperature;

    public Star(String name, int colorTemperature) {
        this.name = name;
        this.colorTemperature = colorTemperature;
    }

    public String getName() {
        return name;
    }
}
