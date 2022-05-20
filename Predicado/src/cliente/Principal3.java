package cliente;

import java.util.*;

import interfaces.PredicadoEmpleado;
import pojo.Empleado;

public class Principal3 {

	public static void main(String[] args) {

		// LAMBDA
		PredicadoEmpleado p = x -> x.getEdad()>18;

		List<Empleado> listaEmpleados = new ArrayList<>();
		listaEmpleados.add(new Empleado("Patrobas", 28, 45.67));
		listaEmpleados.add(new Empleado("Tercio", 35, 56.67));
		listaEmpleados.add(new Empleado("Andronico", 19, 40.50));
		listaEmpleados.add(new Empleado("Rolas", 17, 10.03));

		for (Empleado e : listaEmpleados) {
			if (p.probar(e))
				System.out.println(e);
		}
		System.out.println("------------");
		
		p = z -> z.getSueldo()>25;
		
		for (Empleado e : listaEmpleados) {
			if (p.probar(e))
				System.out.println(e);
		}
		

	}

}
