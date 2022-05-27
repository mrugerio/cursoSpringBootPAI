package com.curso;

import java.util.function.*;

public class Principal {
	
	public static void main(String[] args) {
		
		//BiPredicate<Integer,Integer> esMas10 = (x,y) -> Numeros.esMayorDiez(x, y);
		BiPredicate<Integer,Integer> esMas10 = Numeros::esMayorDiez;
		boolean res = esMas10.test(4, 9);
		System.out.println(res);
		
		//UnaryOperator<String> uo = z -> Util.hacerExcitante(z);
		UnaryOperator<String> uo = Util::hacerExcitante;
		System.out.println(uo.apply("Hello"));
		
		//Supplier<String> s = ()-> Principal.getParadigma();
		Supplier<String> s = Principal::getParadigma;
		System.out.println(s.get());
		
		BinaryOperator<String> bo = Principal::concatenar;
		System.out.println(bo.apply("Hello ", "World"));
			
	}
	
	static String getParadigma() {
		return "Java Functional";
	}
	
	static String concatenar(String s1, String s2) {
		return s1+s2;
	}
	
	

}
