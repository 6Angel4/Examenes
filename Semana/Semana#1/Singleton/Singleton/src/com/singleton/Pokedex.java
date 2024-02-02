package com.singleton;

import java.util.Random;

public class Pokedex {

    private static Pokedex pokedex;
    private int numPokedex;
    static int contador;

    private Pokedex(int numPokedex) {
        this.numPokedex = numPokedex;
        contador++;
    }

    public static Pokedex getInstance() {
        if (pokedex == null) {
            pokedex = new Pokedex(generarNumeroAleatorio());
        }
        return pokedex;
    }

    private static int generarNumeroAleatorio() {
        Random random = new Random();
        return random.nextInt(151) + 1;
    }

    public int getNumPokedex() {
        return numPokedex;
    }
}
