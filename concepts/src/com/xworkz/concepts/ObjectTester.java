package com.xworkz.concepts;

import com.xworkz.concepts.obj.Vehicle;

public class ObjectTester {

	public static void main(String[] args) {

		Vehicle.yom = "2020";

		Vehicle vehicle = new Vehicle();
		
		vehicle.color = "Black";
		vehicle.owner = "Sahana";
		vehicle.model = "Baleno";
		vehicle.displayInfo();
		
		System.out.println("******************************");
		
		Vehicle vehicle2 = new Vehicle();
		
		vehicle2.color = "Blue";
		vehicle2.model = "Rolls Royce";
		vehicle2.displayInfo();

	}

}
