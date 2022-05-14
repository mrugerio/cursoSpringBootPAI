package com.curso.v3;

public class Principal {

	public static void main(String[] args) {

		Becario becario1 = new Becario("Andronico");
		
		Inyector.inyectarPc(becario1); //Inyección Dependencias
		
		becario1.endencer();
		
	}

}
