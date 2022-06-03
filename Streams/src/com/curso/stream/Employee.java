package com.curso.stream;

public class Employee {
	
	int id;
	public String nombre;
	public double salary;
	
	public Employee(int id, String nombre, double salary) {
		this.id = id;
		this.nombre = nombre;
		this.salary = salary;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	public void salaryIncrement(double incremento) {
		salary += incremento  ;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", nombre=" + nombre + ", salary=" + salary + "]";
	}

}
