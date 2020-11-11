package com.xworkz.basics.pocket;

public class CreditTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("JVM invoked main method");
					
		CreditCardEstimator.expenditure(400);
		
		CreditCardEstimator.expenditure(500);
		System.out.println("Total Amount:"+CreditCardEstimator.getTotalAmount());
		
		System.out.println("EXIT :: main");
	}

}
