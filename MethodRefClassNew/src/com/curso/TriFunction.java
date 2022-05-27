package com.curso;
@FunctionalInterface
public interface TriFunction<T,U,V,Z> {
	
	Z test(T t, U u, V v);
	

}
