package com.company;

public class Locations {

    private int kilometro;
    private String name;

    public Locations(int kilometro, String name) {
        this.kilometro = kilometro;
        this.name = name;
    }

    public int getKilometro() {
        return kilometro;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return name;
    }

    public int calculateDistance(Locations location){
        int distance = location.getKilometro() - this.getKilometro();
        if (distance < 0){
            return distance*(-1);
        }
        return distance;
    }
}
