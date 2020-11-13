package com.xworkz.online;

public class PhoneDirectory {
	
	private static long[] numbers= {9327826712l,8293874622l,7129732635l,9238946262l,8327482193l,
									6537892648l,6382037489l,9383746537l,7893654782l,8827691634l};
	
	public static void search(long phone) {
		System.out.println("invoked search");
		System.out.println("Total items available:"+numbers.length);
		System.out.println("arg1:"+phone);
		boolean numberFound=false;
		for(int count=0;count<numbers.length;count++)
		{
			long num=numbers[count];
			if(num==phone)
			{
				numberFound=true;
				break;
			}
			else
			{
				numberFound=false;
			}
		}
		if (numberFound) {
			System.out.println("number is found ");
		}
		else
		{
			System.out.println("number is not found");
		}
		System.out.println("exit search");
	}
	public static int totalNumbers() {
		return numbers.length;
	}
}
