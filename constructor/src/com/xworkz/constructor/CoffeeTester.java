package com.xworkz.constructor;

import com.xworkz.constructor.construct.Coffee;

public class CoffeeTester {

	public static void main(String[] args) {

		Coffee bru = new Coffee("BRU", 50);
		System.out.println("Name of coffee company: "+bru.company);
		System.out.println("Total net grams: "+bru.grams);
	}

}
