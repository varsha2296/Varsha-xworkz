package com.xworkz.construction;

import com.xworkz.construction.house.House;
import com.xworkz.construction.house.Rooms;

public class ConstructionTester {

	public static void main(String[] args) {
		
		House house=new House();
		house.setFloors(3);
		house.setNoOfPillers(9);
		house.setCementNameUsed("UltraTech");
		System.out.println(house.getFloors());
		System.out.println(house.getNoOfPillers());
		System.out.println(house.getCementNameUsed());
		
		house.parking();
		
		Rooms rooms=new Rooms();
		
		System.out.println(rooms.getFloors());
		System.out.println(rooms.getNoOfPillers());
		System.out.println(rooms.getCementNameUsed());
		System.out.println(rooms.noRooms());
		
		rooms.parking();
	}

}
