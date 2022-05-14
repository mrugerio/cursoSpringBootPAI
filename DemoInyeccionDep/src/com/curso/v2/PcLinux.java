package com.curso.v2;

public class PcLinux implements Pc {
	
	private String version;

	public PcLinux(String version) {
		this.version = version;
	}
	
	@Override
	public void encenderPc() {
		System.out.println("Encender pc: " +version);
	}
	

}
