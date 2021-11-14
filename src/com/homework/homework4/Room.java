package com.homework.homework4;

public class Room {

    private boolean bypass;

    public Room(boolean bypass) {
        this.bypass = bypass;
    }

    public void print() {
        if (bypass) {
            System.out.println("Комната проходная");
        }
        else System.out.println("Комната не проходная");
    }

    public boolean isBypass() {
        return bypass;
    }

    public void setBypass(boolean bypass) {
        this.bypass = bypass;
    }
}
