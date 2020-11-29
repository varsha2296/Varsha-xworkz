package com.xworkz.constructor;

import com.xworkz.constructor.construct.Bike;

public class BikeTester {

	public static void main(String[] args) {

		Bike pleasure = new Bike("White");
		System.out.println(pleasure.color);
		Bike yamaha = new Bike("Green");
		System.out.println(yamaha.color);

	}

}
