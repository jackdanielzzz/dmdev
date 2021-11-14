package com.homework.homework4;

public class Floor {

    private int floorNumber;
    private Apartment[] apartment;

    public Floor(int floorNumber, Apartment[] apartment) {
        this.floorNumber = floorNumber;
        this.apartment = apartment;
    }

    public void print() {
        System.out.println();
        System.out.print("Номер этажа: " + floorNumber + ", ");
        System.out.println("количество квартир на этаже: " + apartment.length);
    }

    public int getFloorNumber() {
        return floorNumber;
    }

    public void setFloorNumber(int floorNumber) {
        this.floorNumber = floorNumber;
    }

    public Apartment[] getApartment() {
        return apartment;
    }

    public void setApartment(Apartment[] apartment) {
        this.apartment = apartment;
    }
}
