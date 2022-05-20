package cliente;

import java.util.*;

import interfaces.PredicadoEmpleado;
import pojo.Empleado;

public class Principal {

	public static void main(String[] args) {
		
		List<Empleado> listaEmpleados = new ArrayList<>();
		listaEmpleados.add(new Empleado("Patrobas",28,45.67));
		listaEmpleados.add(new Empleado("Tercio",35,56.67));
		listaEmpleados.add(new Empleado("Andronico",19,40.50));
		listaEmpleados.add(new Empleado("Rolas",17,10.03));
		
		PredicadoEmpleado p = new MayorAveinte();
		
//		boolean res = p.probar(listaEmpleados.get(1));
//		System.out.println(res);
		
		for (Empleado e:listaEmpleados) {
			if (p.probar(e)) 
				System.out.println(e);
		}
		
	}
	
	private static class MayorAveinte implements PredicadoEmpleado {
		@Override
		public boolean probar(Empleado e) {
			return e.getEdad() > 20;
		}
	}

}
