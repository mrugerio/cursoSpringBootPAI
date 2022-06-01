package com.curso;
import java.util.function.*;

public class Principal {

	public static void main(String[] args) {
		Mecanico instanciaMecanico = new Mecanico();
		Carro instanciaCarro = new Carro();
		instanciaCarro.id = 5;
		
		//BiConsumer<Mecanico,Carro> biConsumer = (m,c) -> m.arreglar(c);
		
		BiConsumer<Mecanico,Carro> biConsumer = Mecanico::arreglar;
		biConsumer.accept(instanciaMecanico,instanciaCarro);	
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