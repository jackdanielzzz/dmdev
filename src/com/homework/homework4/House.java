package com.homework.homework4;

public class House {

    private int houseNumber;
    private Floor[] floor;

    public House(int houseNumber, Floor[] floor) {
        this.houseNumber = houseNumber;
        this.floor = floor;
    }

    public void print() {
        System.out.print("Номер дома: " + houseNumber + ", ");
        System.out.println("количество этажей: " + floor.length);
    }

    public int getHouseNumber() {
        return houseNumber;
    }

    public void setHouseNumber(int houseNumber) {
        this.houseNumber = houseNumber;
    }

    public Floor[] getFloor() {
        return floor;
    }

    public void setFloor(Floor[] floor) {
        this.floor = floor;
    }
}
