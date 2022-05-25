package interfaces;

@FunctionalInterface
public interface Predicado<T> {
	
	//UN SOLO METODO ABSTRACTO
	boolean probar(T t);
	
	static <T> Predicado<T> negate(Predicado<T> p){
		return x -> !p.probar(x);
	}
	
	static <T> Predicado<T> and(Predicado<T> pre1,Predicado<T> pre2 ){
		return x -> (pre1.probar(x) && pre2.probar(x));
	}
	
	static <T> Predicado<T> or(Predicado<T> pre1,Predicado<T> pre2 ){
		return x -> (pre1.probar(x) || pre2.probar(x));
	}
	
	
	//n metodos default
	default void probarDefault() {
		System.out.println("Probar Default");
	}
	
	//n metodos static
	static void probarStatic() {
		System.out.println("Probar Static");
	}
	
	static <T> Predicado<T> returnPredicado(){
		return x -> true;
	}

}
