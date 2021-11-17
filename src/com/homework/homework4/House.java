package com.homework.homework4;

public class House {

    private final int houseNumber;
    private final Floor[] floors;

    public House(int houseNumber, Floor[] floors) {
        this.houseNumber = houseNumber;
        this.floors = floors;
    }

    public void print() {
        System.out.print("Номер дома: " + houseNumber + ", ");
        System.out.println("количество этажей: " + floors.length);
    }

    public int getHouseNumber() {
        return houseNumber;
    }

    public Floor[] getFloors() {
        return floors;
    }
}
