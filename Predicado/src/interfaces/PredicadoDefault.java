package interfaces;

@FunctionalInterface
public interface PredicadoDefault<T> {
	
	//UN SOLO METODO ABSTRACTO
	boolean probar(T t);
	
	default PredicadoDefault<T> negate(){
		return x -> !this.probar(x);
	}
	
	default PredicadoDefault<T> and(PredicadoDefault<T> pre1){
		return x -> (pre1.probar(x) && this.probar(x));
	}
	
	default PredicadoDefault<T> or(PredicadoDefault<T> pre2 ){
		return x -> (this.probar(x) || pre2.probar(x));
	}
	

}
