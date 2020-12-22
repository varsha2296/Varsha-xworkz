package com.xworkz.construction.house;

public class House {

	private int floors; //encapsulation
	private int noOfPillers;
	private String cementNameUsed;
	
	public boolean parking() {
		System.out.println("invoked parking");
		boolean hasParking=true;
		return hasParking;
	}

	public int getFloors() {
		return floors;
	}

	public void setFloors(int floors) {
		this.floors = floors;
	}

	public int getNoOfPillers() {
		return noOfPillers;
	}

	public void setNoOfPillers(int noOfPillers) {
		this.noOfPillers = noOfPillers;
	}

	public String getCementNameUsed() {
		return cementNameUsed;
	}

	public void setCementNameUsed(String cementNameUsed) {
		this.cementNameUsed = cementNameUsed;
	}
}
