package com.xworkz.basics.pocket;

public class PocketTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("JVM invoked main method");
		
		PocketMoneyEstimator.request(25, "Monday");
		PocketMoneyEstimator.request(100, "Tuesday");
		
		PocketMoneyEstimator.expenditure(40);
		
		PocketMoneyEstimator.request(50, "Wednesday");
		PocketMoneyEstimator.request(150, "Thursday");
		
		PocketMoneyEstimator.expenditure(50);
		System.out.println("Total Amount:"+PocketMoneyEstimator.getTotalAmount());
		
		System.out.println("EXIT :: main");
	}

}
