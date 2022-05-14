package com.curso.v2;

public class Becario {
	
	private String nombre;
	
	//Bajo ACOPLAMIENTO
	Pc myPc;
	
	public Becario(String nombre) {
		this.nombre = nombre;
	}
	
	public void endencer() {
		myPc.encenderPc();
	}
	
	

}
