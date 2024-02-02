package com.minecraft;

//Clase abstracta de nombre Cubo
public abstract class Cubo {
	private int dimension;
	private String nombre;
	private String textura;
	
	

	public int getDimension() {
		return dimension;
	}



	public void setDimension(int dimension) {
		this.dimension = dimension;
	}



	public String getNombre() {
		return nombre;
	}



	public void setNombre(String nombre) {
		this.nombre = nombre;
	}



	public String getTextura() {
		return textura;
	}



	public void setTextura(String textura) {
		this.textura = textura;
	}

	

	@Override
	public String toString() {
		return "Cubo [dimension=" + dimension + ", nombre=" + nombre + ", textura=" + textura + "]";
	}



	// abstract = contrato?
	public void destruir() {
		System.out.println("Me rempi, pero no tengo identidad");
	}
}
