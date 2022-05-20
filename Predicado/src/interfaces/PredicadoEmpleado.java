package interfaces;

import pojo.Empleado;

@FunctionalInterface
public interface PredicadoEmpleado {
	
	//UN SOLO METODO ABSTRACTO
	boolean probar(Empleado e);
	
	//n metodos default
	//n metodos static

}
