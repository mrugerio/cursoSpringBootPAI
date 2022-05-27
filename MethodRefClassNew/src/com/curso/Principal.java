package com.curso;
import java.util.function.*;

public class Principal {
	
	public static void main(String[] args) {
		
		//Supplier<Persona> p01 = () -> new Persona();
		Supplier<Persona> p01 = Persona::new;
		Persona persona = p01.get();
		System.out.println(persona);
		
		//Function<Integer,Persona> f = x -> new Persona(x);
		Function<Integer,Persona> f = Persona::new;
		persona = f.apply(5);
		System.out.println(persona);
		
		
		BiFunction<Integer,String,Persona> bf = Persona::new;
		persona = bf.apply(8,"Patrobas");
		System.out.println(persona);
		
	}

}
