package com.xworkz.constructor.construct;

public class Bike {

	public String color;

	public Bike(String bikeColor) {
		System.out.println("arg1:" + bikeColor);
		System.out.println("value before assigning");
		System.out.println("value is:" + color);
		System.out.println("assigning argument");
		color = bikeColor;
		System.out.println("value is:" + color);
	}
}
