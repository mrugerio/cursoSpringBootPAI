package com.curso;

public class Becario {
	
	private String nombre;
	
	//ALTO ACOPLAMIENTO
	PcLinux myPc = new PcLinux("Ubuntu 18.04");
	
	public Becario(String nombre) {
		this.nombre = nombre;
	}
	
	public void endencer() {
		myPc.encenderPc();
	}
	
	

}
