package com.company;
import java.util.HashMap;

public class Pepita {

    private static final int FIXED_EXPENSE = 10;

    private int energy;
    private int food;
    private int distance;

    private int placeCode;
    public int capital = 1;
    public int rosario = 2;
    public int cordoba = 3;


    HashMap<Integer, String> Map = new HashMap<Integer, String>();

    private void putLocations(){

        Map.put(1, "Capital Federal");
        Map.put(2, "Rosario");
        Map.put(3, "Cordoba");
    }



    public Pepita(int energy, int food, int distance, int placeCode) {
        this.energy = energy;
        this.food = food;
        this.distance = distance;
        this.placeCode = placeCode;
    }

    @Override
    public String toString() {
                return "Comí " + food + " gramos de comida para pajaros! " +
                "Y recorrí " + distance + " kilometros" + "" +
                " Energia final: " + energy +
                " voy a ir a: " + getLocations(placeCode);
    }


    public int fly(){
        energy = energy - distance - FIXED_EXPENSE;
        return energy;
    }
    public int eat(){
        energy = energy + food*4;
        return energy;
    }
    public String getLocations(int placeCode){
        if (placeCode == 1){
            return "Capital Federal";
        }
        if (placeCode == 2){
            return "Rosario!";
        }
        if (placeCode == 3){
            return "Cordoba!";
        }
        return "I can´t fly there!";
    }
    public int getDistance(){
        while (placeCode >= 3){
            if (placeCode == 1){
                return 1000;
            }
            if (placeCode == 2){
                return 2000;
            }
            if (placeCode == 3){
                return 3000;
            }
        }
        return 0;
    }

    public int travel(int travel){
        
    }
}