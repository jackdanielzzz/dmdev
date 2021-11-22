package com.homework.homework7;

public abstract class Planet implements WithDiameter, SpaceObject {

    String name;
    long distanceToStar;
    int satellitesCount;
    int radius;
    boolean clockwiseTurn;

    public Planet(String name, long distanceToStar, int satellitesCount, int radius, boolean clockwiseTurn) {
        this.name = name;
        this.distanceToStar = distanceToStar;
        this.satellitesCount = satellitesCount;
        this.radius = radius;
        this.clockwiseTurn = clockwiseTurn;
    }

    public String getName() {
        return name;
    }

    public int getRadius() {
        return radius;
    }

}
