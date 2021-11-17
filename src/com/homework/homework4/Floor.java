package com.homework.homework4;

public class Floor {

    private final int floorNumber;
    private final Apartment[] apartments;

    public Floor(int floorNumber, Apartment[] apartments) {
        this.floorNumber = floorNumber;
        this.apartments = apartments;
    }

    public void print() {
        System.out.println();
        System.out.print("Номер этажа: " + floorNumber + ", ");
        System.out.println("количество квартир на этаже: " + apartments.length);
    }

    public int getFloorNumber() {
        return floorNumber;
    }

    public Apartment[] getApartments() {
        return apartments;
    }
}
