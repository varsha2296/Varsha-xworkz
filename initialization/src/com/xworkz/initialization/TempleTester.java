package com.xworkz.initialization;

import com.xworkz.initialization.init.Temple;

public class TempleTester {
	
	public static void main(String[] args) {
		
		Temple temple;
		temple=new Temple("Sai Baba", "Shirdi", 6.00f, "laadu", 10.00f);
		String name=temple.getName();
		String place=temple.getLocation();
		String prasad=temple.getPrasada();
	
		System.out.println(name);
		System.out.println(place);
		System.out.println(prasad);
		prasad="seera";
		temple.setPrasada(prasad);
	}
}
