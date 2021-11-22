package com.homework.homework7;

public abstract class Satelite {

    String name;
    boolean artificial;

    public Satelite(String name, boolean artificial) {
        this.name = name;
        this.artificial = artificial;
    }

    public String getName() {
        return name;
    }
}
