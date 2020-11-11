package com.xworkz.basics.pocket;

public class PocketMoneyEstimator {

	private static double totalAmount;
	
	public static void request(double amount, String day)
	{
		System.out.println("invoked request");
		
		System.out.println("arg 1 , amount:"+amount);
		System.out.println("arg 2 , day:"+day);
		//totalAmount=0.0+amount;
		totalAmount=totalAmount+amount;
		
		System.out.println("Total amount after request:"+totalAmount);
		System.out.println("EXIT :: request");
	}
	
	public static void expenditure(double amount)
	{
		System.out.println("invoked expenditure");
		
		System.out.println("arg 1 , amount:"+amount);
		
		totalAmount=totalAmount-amount;
		
		System.out.println("Total amount after expenditure:"+totalAmount);
		System.out.println("EXIT :: expenditure");
	}	
	
	public static double getTotalAmount()
	{
		return totalAmount;
	}
}