package com.curso.v2;

public class Inyector {
	
	static void inyectarPc(Becario b) {
		//b.myPc = new PcLinux("Ubuntu 18");
		b.myPc =  new PcWindows("Windows Vista");
	}

}
