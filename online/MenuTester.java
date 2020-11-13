package com.xworkz.online;

public class MenuTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("jvm invoked main");
		System.out.println("Total dishes to search:"+HotelMenuSearch.totalDishes());
		HotelMenuSearch.search("Kaju Kurma");
		System.out.println("exit main");
	}

}
