package com.minecraft;

//extends porque hereda la clase cubo
public class CuboCarbon extends Cubo {
	private int xp;

	// Se va a cumplir el contrato que esta en Cubo
	@Override // formalidad o guia se coloca esto
	public void destruir() {
		System.out.println("Me rompi, toma un carbon");
	}
}
