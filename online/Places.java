package com.xworkz.online;

public class Places {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("jvm invoked main");
		System.out.println("Total places to search:"+BusSearch.totalPlaces());
		BusSearch.search("Kalaburagi");
		System.out.println("exit main");
	}

}
