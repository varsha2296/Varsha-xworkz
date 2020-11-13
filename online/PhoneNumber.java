package com.xworkz.online;

public class PhoneNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("jvm invoked main");
		System.out.println("Total number to search:"+PhoneDirectory.totalNumbers());
		PhoneDirectory.search(9327826712l);
		System.out.println("exit main");
	}

}
