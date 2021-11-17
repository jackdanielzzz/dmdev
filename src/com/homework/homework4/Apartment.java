package com.homework.homework4;

public class Apartment {

    private final int flatNumber;
    private final Room[] rooms;

    public Apartment(int aptNumber, Room[] rooms) {
        this.flatNumber = aptNumber;
        this.rooms = rooms;
    }

    public void print() {
        System.out.print("Номер квартиры: " + flatNumber + ", ");
        System.out.println("количество комнат в квартире: " + rooms.length);
    }

    public int getFlatNumber() {
        return flatNumber;
    }

    public Room[] getRooms() {
        return rooms;
    }
}
