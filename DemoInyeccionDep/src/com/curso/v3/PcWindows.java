package com.curso.v3;

public class PcWindows implements Pc {
	
	private String version;

	public PcWindows(String version) {
		this.version = version;
	}
	
	@Override
	public void encenderPc() {
		System.out.println("Encender pc: " +version);
	}
	

}
