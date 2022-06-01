package com.list;

import java.util.*;

import com.pojo.Empleado;

public class Principal {

	public static void main(String[] args) {
		
		List<Empleado> listaEmpleados = new ArrayList<>();
		listaEmpleados.add(new Empleado("Patrobas",28,45.67));
		listaEmpleados.add(new Empleado("Tercio",35,56.67));
		listaEmpleados.add(new Empleado("Andronico",19,40.50));
		listaEmpleados.add(new Empleado("Epeneto",17,90.03));
		
		//listaEmpleados.forEach(x -> System.out.println(x));
		
		//listaEmpleados.removeIf(x -> x.getSueldo()<50);
		
		listaEmpleados.forEach(System.out::println);

//		listaEmpleados.replaceAll(x -> {
//			x.setSueldo(x.getSueldo()+10);
//			return x;
//		});
		
		listaEmpleados.replaceAll(x -> x.addSueldo(10));
		
		System.out.println("-------------");
		
		//listaEmpleados.sort((e1,e2)-> e1.getEdad()-e2.getEdad());
		
		//listaEmpleados.sort((e1,e2)-> e2.getNombre().compareTo(e1.getNombre()));
		
		listaEmpleados.sort((e1,e2)->  (int)((e1.getSueldo()*100)-(e2.getSueldo()*100)));
		
		listaEmpleados.forEach(System.out::println);
		
		//Empleado[] arrayEmpleado = listaEmpleados.toArray(size -> new Empleado[size]);
		
		Empleado[] arrayEmpleado = listaEmpleados.toArray(Empleado[]::new);
		System.out.println("------Array-------");

		System.out.println(Arrays.toString(arrayEmpleado));
		
		

		
	}

}
