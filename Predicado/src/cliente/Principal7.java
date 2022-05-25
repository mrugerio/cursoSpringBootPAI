package cliente;

import java.util.*;

import interfaces.Predicado;
import pojo.Empleado;

public class Principal7 {

	public static void main(String[] args) {
		
		Predicado.probarStatic();
		//Predicado.probarDefault(); //NO SE PUEDE
		Predicado<StringBuilder> resultadoLambda = Predicado.returnPredicado();
		
		boolean res = resultadoLambda.probar(new StringBuilder("Hola"));
		System.out.println("res: "+res);

		// LAMBDA
		Predicado<Empleado> p01 = x -> x.getEdad()>18;
		Predicado<Empleado> p02 = z -> z.getSueldo()>25;
		Predicado<String> p03 = w -> w.isEmpty();
		
		p01.probarDefault();

		List<Empleado> listaEmpleados = new ArrayList<>();
		listaEmpleados.add(new Empleado("Patrobas", 28, 45.67));
		listaEmpleados.add(new Empleado("Tercio", 35, 6.67));
		listaEmpleados.add(new Empleado("Andronico", 19, 40.50));
		listaEmpleados.add(new Empleado("Rolas", 17, 10.03));

		mostrar(listaEmpleados,x -> x.getEdad()>18);
		mostrar(listaEmpleados,z -> z.getSueldo()>25);
		mostrar(listaEmpleados,y -> y.getNombre().length()>6);
		
	}
	
	static void mostrar(List<Empleado> lista, Predicado<Empleado> p) {
		for (Empleado e : lista) {
			if (p.probar(e))
				System.out.println(e);
		}
		System.out.println("--------------------");
	}

}















