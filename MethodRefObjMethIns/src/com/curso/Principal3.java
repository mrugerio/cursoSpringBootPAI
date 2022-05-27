package com.curso;
import java.util.function.UnaryOperator;

public class Principal3 {

	public static void main(String[] args) {

		String cadena1 = "Hola";
		String cadena2 = " Mundo Java";
		
		//UnaryOperator<String> uo = x -> cadena1.concat(x);
		//UnaryOperator<String> uo = cadena1::concat;
		
		String sResultado = Util.transforma(cadena2, cadena1::concat);
		
		System.out.println(sResultado);

		
	}

}
