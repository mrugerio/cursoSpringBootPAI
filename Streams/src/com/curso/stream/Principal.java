package com.curso.stream;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Principal {
	
	private static Employee[] arrayOfEmps = {
		    new Employee(0, "Patrobas", 100.0), 
		    new Employee(1, "Tercio", 200.0), 
		    new Employee(2, "Andronico", 300.0),
		    new Employee(3, "Epeneto", 400.0),
		    new Employee(4, "Filologo", 500.0)
		};
	
	private static List<Employee> empList = Arrays.asList(arrayOfEmps);
	
	static Employee getEmpleado(int id) {
		return arrayOfEmps[id];
	}

	public static void main(String[] args) {

		Stream<Employee> streamEmp;
		
		streamEmp = Stream.of(arrayOfEmps);
		//System.out.println(streamEmp);
		
		List<Employee> empList = Arrays.asList(arrayOfEmps);
		streamEmp = empList.stream();
		
		streamEmp = Stream.of(arrayOfEmps[0],arrayOfEmps[1],arrayOfEmps[2]);
		
		empList.stream().forEach(e -> e.salaryIncrement(10.0));
		//empList.forEach(System.out::println);
		
		Integer[] empIds = {0,1,2,3,4};
		
		Stream<Integer> streamInt = Stream.of(empIds);
		List<Employee> listaEmpleados = streamInt
										.map(Principal::getEmpleado)
										.collect(Collectors.toList());
		//System.out.println(listaEmpleados);
		
		
		listaEmpleados = Stream.of(empIds)
							.map(Principal::getEmpleado)
							.filter(e -> e.nombre.endsWith("o"))
							.filter(e -> e.getSalary() >300)
							.collect(Collectors.toList());
		
		//listaEmpleados.forEach(System.out::println);

		
		Employee emp = Stream.of(empIds)
				.map(Principal::getEmpleado)
				.filter(e -> e.nombre.endsWith("o"))
				.filter(e -> e.getSalary() >300)
				.findFirst()
				.orElse(null);
		
		//System.out.println(emp);
		
		List<List<String>> listaDeListas = Arrays.asList(
				Arrays.asList("Patroba","Tercio"),
				Arrays.asList("Andronico","Epeneto"),
				Arrays.asList("Filologo","Trifosa"));
		
		List<String> listaNombres = listaDeListas.stream()
					.flatMap(Collection::stream)
					.collect(Collectors.toList());
		
		//System.out.println(listaNombres);
		
		//List<Employee> listaEmpleado2 = listaEmpleados.stream()
		
		listaEmpleados.stream()
				.peek(e -> e.salaryIncrement(10.0))
				//.peek(System.out::println)
				.collect(Collectors.toList());
		
		listaEmpleados.forEach(System.out::println);
		
		
	}

}
