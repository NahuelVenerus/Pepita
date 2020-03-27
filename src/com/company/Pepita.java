package com.company;

import javax.xml.stream.Location;

public class Pepita {

    private static final int FIXED_EXPENSE = 10;

    private int energy;
    private Locations location;

    public Pepita(int energy, Locations location) {
        this.energy = energy;
        this.location = location;
    }

    public Locations getLocation() {
        return location;
    }

    public void setLocation(Locations location) {
        this.location = location;
    }

    @Override
    public String toString() {
        return "Tengo " + energy + " energia, y estoy en " + location;
    }


    public int fly(int distance) {
        this.energy = calculateFinalEnergy(distance, this.energy);
        return energy;
    }

    private int calculateFinalEnergy(int distance, int energy){
        return energy - distance - FIXED_EXPENSE;
    }

    public int eat(int food) {
        energy = energy + food * 4;
        return energy;
    }

    public void goTo(Locations location){
        if (canGo(location)){
            int distance = this.location.calculateDistance(location);
            fly(distance);
            this.setLocation(location);
        }
    }
    private boolean canGo(Locations location){
        int distance = this.location.calculateDistance(location);
        int finalEnergy = calculateFinalEnergy(distance, this.energy);
        return finalEnergy >= 0;
    }

}