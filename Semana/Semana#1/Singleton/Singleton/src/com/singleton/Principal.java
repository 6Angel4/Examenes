package com.singleton;

public class Principal {
	public static void main(String[] args) {
		Pokedex pokedex1 = Pokedex.getInstance();
		Pokemon pokemon1 = new Pokemon("Pikachu",pokedex1);
		System.out.println(pokemon1);
		
		Pokedex pokedex2 = Pokedex.getInstance();
		Pokemon pokemon2 = new Pokemon("Raichu",pokedex2);
		System.out.println(pokemon2);
		
		System.out.println(Pokedex.contador);
	}
}
