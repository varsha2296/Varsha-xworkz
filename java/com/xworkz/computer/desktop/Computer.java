package com.xworkz.computer.desktop;

public class Computer {

	private String OS;
	private int RAM;
	private int ROM;
	
	public void computerInfo() {
		System.out.println("invoked computerInfo");
	}

	public String getOS() {
		return OS;
	}

	public void setOS(String oS) {
		OS = oS;
	}

	public int getRAM() {
		return RAM;
	}

	public void setRAM(int rAM) {
		RAM = rAM;
	}

	public int getROM() {
		return ROM;
	}

	public void setROM(int rOM) {
		ROM = rOM;
	}
}
