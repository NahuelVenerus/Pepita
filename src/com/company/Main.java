package com.company;

public class Main {

    public static void main(String[] args) {

        // Ejercicio 1.a
        Locations caba = new Locations(100, "Capital Federal");
        Locations mendoza = new Locations(1500, "Mendoza");
        Locations cordoba = new Locations(800, "Cordoba");
        Locations rosario = new Locations(300, "Rosario");
        Pepita pepita = new Pepita(400, caba);
        System.out.println(pepita);
        pepita.fly(10);
        System.out.println(pepita);
        pepita.eat(8);
        System.out.println(pepita);

        // Ejercicio 1.b

        System.out.println(caba);
        System.out.println(mendoza);
        System.out.println(cordoba);
        System.out.println(rosario);

        pepita.goTo(rosario);
        System.out.println(pepita);
        pepita.goTo(mendoza);
        System.out.println(pepita);

    }
}
