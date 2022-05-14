package com.curso;

public class PcLinux {
	
	private String version;

	public PcLinux(String version) {
		this.version = version;
	}
	
	public void encenderPc() {
		System.out.println("Encender pc: " +version);
	}
	

}
