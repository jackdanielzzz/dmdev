package com.homework.homework7;

public final class SpaceUtils {

    static final double GRAVITY_CONSTANT = 6.67e-11;

    private SpaceUtils() {
    }

    public static boolean isStar(SpaceObject spaceObject) {
        return spaceObject instanceof Star;
    }

    public static double gravityBetweenObjects(SpaceObject spaceObject1, SpaceObject spaceObject2){
        return spaceObject1.getWeight() * spaceObject2.getWeight() * GRAVITY_CONSTANT / 10e40;
    }

    public static String printPlanetInfo(Planet planet){
        StringBuilder result = new StringBuilder();
        result.append("Название планеты: ").append(planet.name).append(System.lineSeparator());
        result.append("вес: ").append(planet.getWeight()).append(System.lineSeparator());
        result.append("диаметр: ").append(planet.getDiameter()).append(System.lineSeparator());
        result.append("расстояние до солнца: ").append(planet.distanceToStar).append(System.lineSeparator());
        result.append("количество спутников: ").append(planet.satellitesCount).append(System.lineSeparator());
        return result.toString();
    }

    public static String printStarInfo(Star star){
        StringBuilder result = new StringBuilder();
        result.append("Название звезды: ").append(star.name).append(System.lineSeparator());
        result.append("Цветовая температура: ").append(star.colorTemperature).append(System.lineSeparator());
        result.append("диаметр: ").append(star.getDiameter()).append(System.lineSeparator());
        result.append("вес: ").append(star.getWeight()).append(System.lineSeparator());
        result.append("Индекс светимости: ").append(star.getShinePower()).append(System.lineSeparator());

        return result.toString();
    }
}
