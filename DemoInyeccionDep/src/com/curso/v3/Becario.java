package com.curso.v3;

public class Becario {
	
	private String nombre;
	
	//Bajo ACOPLAMIENTO
	private Pc myPc;
	
	public Becario(String nombre) {
		this.nombre = nombre;
	}
	
	public void endencer() {
		myPc.encenderPc();
	}
	
	public void setMyPc(Pc myPc) {
		this.myPc = myPc;
	}
	

}
