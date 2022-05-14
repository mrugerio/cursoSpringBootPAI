package com.curso.v3;

public class Inyector {
	
	static Pc pcWindows = new PcLinux("Ubuntu 18");
	static Pc pcLinux =  new PcWindows("Windows Vista");
	
	static void inyectarPc(Becario b) {
		//b.myPc = new PcLinux("Ubuntu 18");
		//b.myPc =  new PcWindows("Windows Vista");
		b.setMyPc(new PcDummy("Dummy"));
	}

}
