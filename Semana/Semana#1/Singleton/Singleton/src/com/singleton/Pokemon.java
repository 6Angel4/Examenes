package com.singleton;

public class Pokemon {
	String nombre;
	Pokedex pokedex;
	
	public Pokemon(String nombre, Pokedex pokedex) {
		this.nombre = nombre;
		this.pokedex = pokedex;
	}

	@Override
	public String toString() {
	    return "Pokemon [nombre=" + nombre + ", numPokedex=" + pokedex.getNumPokedex() + "]";
	}

	
	
}
