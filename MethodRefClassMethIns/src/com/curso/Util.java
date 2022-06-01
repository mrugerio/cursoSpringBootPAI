package com.curso;
import java.util.function.BinaryOperator;

public class Util {

	public static String transforma(
			String s1, String s2, BinaryOperator<String> bo) {
		
		return bo.apply(s1,s2);
		
	}
	
}
