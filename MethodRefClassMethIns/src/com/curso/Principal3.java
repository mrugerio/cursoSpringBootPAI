package com.curso;

public class Principal3 {

	public static void main(String[] args) {

		String cadena1 = "Hola";
		String cadena2 = " Mundo Java Funcional";
		
		String sResultado = Util.transforma(cadena1, cadena2, String::concat);
		
		System.out.println(sResultado);

		
	}

}
