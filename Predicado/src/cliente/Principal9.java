package cliente;

import java.util.*;

import interfaces.PredicadoDefault;
import pojo.Empleado;

public class Principal9 {

	public static void main(String[] args) {
		
		List<Empleado> listaEmpleados = new ArrayList<>();
		listaEmpleados.add(new Empleado("Patrobas", 28, 45.67));
		listaEmpleados.add(new Empleado("Tercio", 35, 6.67));
		listaEmpleados.add(new Empleado("Andronico", 19, 40.50));
		listaEmpleados.add(new Empleado("Rolas", 17, 10.03));
		
		//MOSTRAR EMPLEADOS MAYOR A 20 AÑOS
		PredicadoDefault<Empleado> p01 = x -> x.getEdad() > 20;
		//MOSTRAR EMPLEADOS MENOR O IGUAL A 20 AÑOS
		PredicadoDefault<Empleado> p02 = p01.negate();
		//mostrar(listaEmpleados,p02);
		
		PredicadoDefault<Empleado> p03 = x -> x.getSueldo()>25;
		
		PredicadoDefault<Empleado> p04 = p01.and(p03);
		//mostrar(listaEmpleados,p04);

		PredicadoDefault<Empleado> p05 = p03.or(p01);
		//mostrar(listaEmpleados,p05);
		
		mostrar(listaEmpleados,p01.negate());
		mostrar(listaEmpleados,p01.and(p03));
		mostrar(listaEmpleados,p03.or(p01));

	}
	
	static void mostrar(List<Empleado> lista, PredicadoDefault<Empleado> p) {
		for (Empleado e : lista) {
			if (p.probar(e))
				System.out.println(e);
		}
		System.out.println("--------------------");
	}

}















