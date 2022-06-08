package com.curso.stream;

import java.util.*;
import java.util.function.BinaryOperator;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Principal {
	
	private static Employee[] arrayOfEmps = {
		    new Employee(0, "aPatrobas", 100.0), 
		    new Employee(1, "bTercio", 200.0), 
		    new Employee(2, "andronico", 300.0),
		    new Employee(3, "aEpeneto", 400.0),
		    new Employee(4, "bFilologo", 500.0)
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
		
		//listaEmpleados.forEach(System.out::println);
		
		Employee empleado = Stream.of(empIds)
				//.map(Principal::getEmpleado)
				//.map(x -> Principal.getEmpleado(x))
				.map((Integer x) -> {
					Employee e = Principal.getEmpleado(x);
					//System.out.println(e);
					return e;
				})
				//.filter(e -> e.nombre.endsWith("o"))
				.filter(e -> {
					//System.out.println(e);
					return e.nombre.endsWith("o");
				})
				.filter(e -> e.getSalary()>400)
				.findFirst()
				.orElse(null);
		
		Employee empleado1 = Stream.of(empIds)
				.map(Principal::getEmpleado)
				.filter(e -> e.nombre.endsWith("o"))
				.filter(e -> e.getSalary()>400)
				.findFirst()
				.orElse(null);
		
		//System.out.println(empleado1);
		
		List<Employee> listaEmpleados2 = Stream.of(empIds)
				.map(Principal::getEmpleado)
				.collect(Collectors.toList());
		
		listaEmpleados2 = listaEmpleados2.stream()
						.sorted((e1, e2) -> e1.getNombre().compareTo(e2.getNombre()))						
						.collect(Collectors.toList());
		
		//listaEmpleados2.forEach(System.out::println);
		
		Employee firstEmp = listaEmpleados2.stream()
				.min((e1,e2)-> (int)(e1.getSalary() - e2.getSalary()))
				.orElseThrow(NoSuchElementException::new);
		
		//System.out.println(firstEmp);
		
		Employee maxSalEmp = empList.stream()
	    	      .max(Comparator.comparing(Employee::getSalary))
	    	      .orElseThrow(NoSuchElementException::new);
		
		//System.out.println(maxSalEmp);

		List<Integer> intList = Arrays.asList(2, 5, 3, 2, 4, 3);
	    List<Integer> distinctIntList = intList
	    					.stream()
	    					.distinct()
	    					.collect(Collectors.toList());
	    
	    //System.out.println(distinctIntList);
	    
	    intList = Arrays.asList(2, 4, 5, 6, 8);

	    boolean allEven = intList.stream().allMatch(i -> i % 2 == 0);
	    System.out.println(allEven);
	    boolean oneEven = intList.stream().anyMatch(i -> i % 2 == 0);
	    System.out.println(oneEven);

	    boolean noneMultipleOfThree = intList.stream().noneMatch(i -> i % 3 == 0);
	    System.out.println(noneMultipleOfThree);
	    
	    Double avgSal = empList.stream()
	    	      .mapToDouble(Employee::getSalary)
	    	      .average()
	    	      .orElseThrow(NoSuchElementException::new);

	    Double sumSal = empList.stream()
	    	      .map(Employee::getSalary)
	    	      .reduce(0.0, Double::sum);
		
	    String empNames = empList.stream()
	    	      .map(Employee::getNombre)
	    	      .collect(Collectors.joining(", "))
	    	      .toString();
	    
	    //System.out.println(empNames);
	    
	    Set<String> empNamesSet = empList.stream()
	            .map(Employee::getNombre)
	            .collect(Collectors.toSet());
	    
	    List<Integer> intLista = Arrays.asList(2, 4, 5,  7, 6, 8);
	    Map<Boolean, List<Integer>> isEven = intLista.stream()
	    		.collect(
	    				Collectors.partitioningBy(i -> i % 2 == 0)
	    		); 
	    
	    //isEven.forEach((x,y)->  System.out.println(x+ ": "+ y));
	    
	    Map<Character, List<Employee>> groupByAlphabet = empList.stream()
	    		.collect(
	    	      Collectors.groupingBy(e -> new Character(e.getNombre().toUpperCase().charAt(0)))
	    	    );
	    
	    //groupByAlphabet.forEach((x,y)->  System.out.println(x+ ": "+ y));
		
	    Map<Character, List<Double>> idGroupedByAlphabet = empList.stream().collect(
	    	      Collectors.groupingBy(e -> new Character(e.getNombre().charAt(0)),
	    	      Collectors.mapping(Employee::getSalary, Collectors.toList())));
	    
	    idGroupedByAlphabet.forEach((x,y)->  System.out.println(x+ ": "+ y));
	    
	    System.out.println("*************");
	    
	    Comparator<Employee> byNameLength = Comparator.comparing(Employee::getNombre);
	    
	    Map<Character, Optional<Employee>> longestNameByAlphabet = empList.stream().collect(
	    	      Collectors.groupingBy(e -> new Character(e.getNombre().charAt(0)),
	    	        Collectors.reducing(BinaryOperator.maxBy(byNameLength))));
	    
	    longestNameByAlphabet.forEach((x,y)->  System.out.println(x+ ": "+ y));
	    
	    System.out.println("*************");

	    empList.stream().parallel().forEach(e -> e.salaryIncrement(10.0));
	    empList.forEach(System.out::println);
	    
		
	}

}
