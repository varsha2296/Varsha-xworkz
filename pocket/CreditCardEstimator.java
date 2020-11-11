package com.xworkz.basics.pocket;

public class CreditCardEstimator {

	private static double totalAmount=1000;
	
	public static void expenditure(double amount)
	{
		System.out.println("invoked expenditure");
		
		System.out.println("arg 1, amount:"+amount);
		
		totalAmount=totalAmount-amount;
		
		System.out.println("Total amount after expenditure:"+totalAmount);
		System.out.println("EXIT :: expenditure");
	}	
	
	public static double getTotalAmount()
	{
		return totalAmount;
	}
}