package com.homework.homework4;

public class Room {

    private final boolean bypass;

    public Room(boolean bypass) {
        this.bypass = bypass;
    }

    public void print() {
        System.out.println(bypass ? "Комната проходная" : "Комната не проходная");
    }

    public boolean isBypass() {
        return bypass;
    }
}
