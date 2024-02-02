package com.minecraft;

public class Principal {

	public static void main(String[] args) {
		
		CuboCarbon carbon = new CuboCarbon();
		carbon.destruir();
		carbon.setNombre("Carbon01");
		System.out.println(carbon.getNombre());
		System.out.println("----------------");
		CuboDiamante diamante = new CuboDiamante();
		diamante.destruir();
	}

}
