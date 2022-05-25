package cliente;

import java.util.*;

import interfaces.Predicado;
import pojo.Empleado;

public class Principal8 {

	public static void main(String[] args) {
		
		List<Empleado> listaEmpleados = new ArrayList<>();
		listaEmpleados.add(new Empleado("Patrobas", 28, 45.67));
		listaEmpleados.add(new Empleado("Tercio", 35, 6.67));
		listaEmpleados.add(new Empleado("Andronico", 19, 40.50));
		listaEmpleados.add(new Empleado("Rolas", 17, 10.03));
		
		//MOSTRAR EMPLEADOS MAYOR A 20 AÑOS
		Predicado<Empleado> p01 = x -> x.getEdad() > 20;
		//MOSTRAR EMPLEADOS MENOR O IGUAL A 20 AÑOS
		Predicado<Empleado> p02 = Predicado.negate(p01);
		//mostrar(listaEmpleados,p02);
		
		Predicado<Empleado> p03 = x -> x.getSueldo()>25;
		
		Predicado<Empleado> p04 = Predicado.and(p01, p03);
		//mostrar(listaEmpleados,p04);

		Predicado<Empleado> p05 = Predicado.or(p01, p03);
		mostrar(listaEmpleados,p05);

		
	}
	
	static void mostrar(List<Empleado> lista, Predicado<Empleado> p) {
		for (Empleado e : lista) {
			if (p.probar(e))
				System.out.println(e);
		}
		System.out.println("--------------------");
	}

}















