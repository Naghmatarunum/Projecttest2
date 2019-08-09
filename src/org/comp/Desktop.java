package org.comp;

public class Desktop implements HardWare,Software {

	@Override
	public void softwareResources() {
System.out.println("SFTWR");		
	}

	@Override
	public void hardwareResources() {
System.out.println("Hdrwre");		
	}
	
	public static void main(String[] args) {
		Desktop D = new Desktop();
		D.hardwareResources();
		D.softwareResources();
	}
	}
