package com.curso.v3;

public class PcDummy implements Pc {
	
	private String version;

	public PcDummy(String version) {
		this.version = version;
	}
	
	@Override
	public void encenderPc() {
		System.out.println("Encender pc: " +version);
	}
	

}
