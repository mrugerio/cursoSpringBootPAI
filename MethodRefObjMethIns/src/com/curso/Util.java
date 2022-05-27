package com.curso;
import java.util.function.UnaryOperator;

public class Util {

	public static String transforma(
			String s, UnaryOperator<String> uo) {
		
		return uo.apply(s);
		
	}
	
}
