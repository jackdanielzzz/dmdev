package com.homework.homework7;

public class Sputnik1 extends Satelite implements SpaceObject {

    public Sputnik1() {
        super("Спутник-1",true);
    }

    @Override
    public double getWeight() {
        return 83;
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        result.append("Название планеты: ").append(name).append(System.lineSeparator());
        result.append("вес: ").append(getWeight()).append(System.lineSeparator());
        result.append(artificial ? "искуственый \n" : "Естессвенного происхождения \n");

        return result.toString();
    }
}
