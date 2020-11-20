package com.xworkz.concepts.obj;

public class Mobile {

	public String brand;
	public String color;
	public String price;
	public String camera;
	public static String os;

	public void displayInfo() {
		System.out.println("invoked displayInfo");
		System.out.println(brand);
		System.out.println(color);
		System.out.println(price);
		System.out.println(camera);
		System.out.println(os);
	}

}
