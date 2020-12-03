package com.xworkz.initialization;

import com.xworkz.initialization.init.Vehicle;

public class VehicleTester {

	public static void main(String[] args) {

		Vehicle vehicle=new Vehicle("2Dec2020","Yamaha",8124);
		String mfgDate=vehicle.getMfgDate();
		String company=vehicle.getCompany();
		int chasisNo=vehicle.getChasisNo();
		System.out.println(mfgDate);
		System.out.println(company);
		System.out.println(chasisNo);
		
		String color="black";
		vehicle.setColor(color);
		
		String owner="Yamaha Corporation";
		vehicle.setOwnerName(owner);

	}

}
