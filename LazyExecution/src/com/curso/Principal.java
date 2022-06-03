package com.curso;

import java.util.function.Supplier;

public class Principal {

	public static void main(String[] args) {
		System.out.println(eagerMatch(compute("bb"),compute("aa")));
		//System.out.println(lazyMatch(()->compute("bb"),()->compute("aa")));
		
	}
	
	static boolean compute(String str) {
		System.out.println("String: "+str);
		System.out.println("costo alto de proceso");
		return str.contains("a");
	}
	
	static String eagerMatch(boolean b1, boolean b2) {
		return b1 && b2 ? "match" : "incompatible";
	}
	
	static String lazyMatch(Supplier<Boolean> a, Supplier<Boolean> b) {
		return a.get() && b.get() ? "match" : "incompatible";
	}

}
