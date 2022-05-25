package cliente;

import java.util.*;

import interfaces.PredicadoEmpleado;
import pojo.Empleado;

public class Principal4 {

	public static void main(String[] args) {

		// LAMBDA
		//PredicadoEmpleado p01 = x -> x.getEdad()>18;
		//PredicadoEmpleado p02 = z -> z.getSueldo()>25;

		List<Empleado> listaEmpleados = new ArrayList<>();
		listaEmpleados.add(new Empleado("Patrobas", 28, 45.67));
		listaEmpleados.add(new Empleado("Tercio", 35, 6.67));
		listaEmpleados.add(new Empleado("Andronico", 19, 40.50));
		listaEmpleados.add(new Empleado("Rolas", 17, 10.03));

		mostrar(listaEmpleados,x -> x.getEdad()>18);
		mostrar(listaEmpleados,z -> z.getSueldo()>25);
		mostrar(listaEmpleados,y -> y.getNombre().length()>6);
		
	}
	
	static void mostrar(List<Empleado> lista, PredicadoEmpleado p) {
		for (Empleado e : lista) {
			if (p.probar(e))
				System.out.println(e);
		}
		System.out.println("--------------------");
	}

}















