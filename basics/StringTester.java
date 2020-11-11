package com.xworkz.basics;

public class StringTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("invoked main by JVM");
		
		// String, String is special in java
		// char ----char[];
		// char primitive ----> methods
		// String----class----> methods and fields
		// two ways to create String . a .literals, new keyword
		// String is an object
		
		String countryName;
		
		countryName="India";
		System.out.println(countryName);

		int sizeOfCountryName=countryName.length();
		System.out.println(sizeOfCountryName);
		
		countryName=countryName.toUpperCase();
		System.out.println(countryName);
		
		countryName=countryName.toLowerCase();
		System.out.println(countryName);

		char alphabet=countryName.charAt(3);
		System.out.println(alphabet);
		
		System.out.println("EXIT :: main");
	}

}
