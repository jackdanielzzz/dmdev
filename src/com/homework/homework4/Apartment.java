package com.homework.homework4;

public class Apartment {

    private int flatNumber;
    private Room[] room;

    public Apartment(int aptNumber, Room[] room) {
        this.flatNumber = aptNumber;
        this.room = room;
    }

    public void print() {
        System.out.print("Номер квартиры: " + flatNumber + ", ");
        System.out.println("количество комнат в квартире: " + room.length);
    }

    public int getFlatNumber() {
        return flatNumber;
    }

    public void setFlatNumber(int flatNumber) {
        this.flatNumber = flatNumber;
    }

    public Room[] getRoom() {
        return room;
    }

    public void setRoom(Room[] room) {
        this.room = room;
    }
}
