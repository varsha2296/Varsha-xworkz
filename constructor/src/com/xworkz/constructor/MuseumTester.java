package com.xworkz.constructor;

import com.xworkz.constructor.construct.Museum;

public class MuseumTester {

	public static void main(String[] args) {

		Museum museum = new Museum("Archaeological", "Kalaburagi", "Government Museum");
		System.out.println("Type of museum: "+museum.museumType);
		System.out.println("Place of museum: "+museum.city);
		System.out.println("Name of the museum: "+museum.museumName);

	}

}
