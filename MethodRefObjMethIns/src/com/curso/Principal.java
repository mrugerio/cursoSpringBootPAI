package com.curso;
import java.util.function.*;

public class Principal {

	public static void main(String[] args) {
		Mecanico instanciaMecanico = new Mecanico();
		Carro instanciaCarro = new Carro();
		instanciaCarro.id = 5;
		
		//Consumer<Carro> c = x -> instanciaMecanico.arreglar(x);
		
		Consumer<Carro> c = instanciaMecanico::arreglar;
		c.accept(instanciaCarro);
		
		
	}

	
}

class Carro{
	int id;
	String color;
}

class Mecanico {
	void arreglar(Carro c) {
		System.out.println("Arreglando carro id: "+c.id);
	}
}