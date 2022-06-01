package com.curso;
import java.util.function.*;

public class Principal2 {
	
	public static void main(String[] args) {
		
		Principal2 p = new Principal2();
		
		//Function<String,Integer> f = s -> p.getCantLetras(s);
		
		Function<String,Integer> f = p::getCantLetras;
		//ToIntFunction<String> f = p::getCantLetras;
		
		System.out.println(f.apply("Hola"));
		
		BiPredicate<Integer,Integer> bp = p::esMayor10;
		System.out.println(bp.test(4, 8));
		
	}
	
	int getCantLetras(String s) {
		return s.length();
	}
	
	boolean esMayor10(int x, int y) {
		return (x+y) >10;
	}
}
