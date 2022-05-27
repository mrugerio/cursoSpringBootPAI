package com.curso;

public class Persona {
	
	private int id;
	private String nombre;

	Persona(){
		nombre="Sin nombre";
		System.out.println("Paso por constructor default");
	}
	
	public Persona(int id) {
		this.id = id;
		System.out.println("Paso por constructor con un parámetro");
	}
	
	

	public Persona(int id, String nombre) {
		this.id = id;
		this.nombre = nombre;
		System.out.println("Paso por constructor con dos parámetros");

	}

	@Override
	public String toString() {
		return "Persona [id=" + id + ", nombre=" + nombre + "]";
	}
}
