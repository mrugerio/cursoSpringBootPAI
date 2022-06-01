package com.curso;
import java.util.function.*;

public class Principal2 {
	
	public static void main(String[] args) {
		
		Principal2 p = new Principal2();
		
		//BiFunction<Principal2, String,Integer> biFunction = (x,s) -> x.getCantLetras(s);
		
		BiFunction<Principal2, String,Integer> biFunction = Principal2::getCantLetras;
		
		System.out.println(biFunction.apply(p,"Hello"));
		
		TriPredicate<Principal2, Integer,Integer> tp = Principal2::esMayor10;
		System.out.println(tp.test(p, 4, 1));
		
	}
	
	int getCantLetras(String s) {
		return s.length();
	}
	
	boolean esMayor10(int x, int y) {
		return (x+y) >10;
	}
}
