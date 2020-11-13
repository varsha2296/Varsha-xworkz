package com.xworkz.online;

public class BusSearch {

	private static String[] places= {"Kalaburagi", "Bengaluru", "Hubli", "Mysore", "Mangaluru", "Belagavi", "Gadag",
			"Davanagere", "Dharwad", "Hassan", "Raichur", "Shivamogga", "Udupi",
			"Mandya", "Bagalkote", "Chikkamangaluru", "Chitradurga", "Bijapur", "Bidar"};
	
	public static void search(String place) {
		System.out.println("invoked search");
		System.out.println("Total places available:"+places.length);
		System.out.println("arg1:"+place);
		boolean placeFound=false;
		for(int count=0;count<places.length;count++)
		{
			String bus=places[count];
			if(bus.equals(place))
			{
				placeFound=true;
				break;
			}
			else
			{
				placeFound=false;
			}
		}
		if (placeFound) {
			System.out.println("place is found ");
		}
		else
		{
			System.out.println("place is not found");
		}
		System.out.println("exit search");
	}
	public static int totalPlaces() {
		return places.length;
	}
}
