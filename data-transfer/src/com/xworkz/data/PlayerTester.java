package com.xworkz.data;

import java.util.Arrays;

import com.xworkz.data.dto.PlayerDTO;

public class PlayerTester {

	public static void main(String[] args) {

		PlayerDTO dto=new PlayerDTO();
		dto.setName("Mary Kom");
		//dto.setCountry("India");
		String countryName="India";
		dto.setCountry(countryName);
		System.out.println(dto.getName());
		System.out.println(dto.getCountry());
		
		//String[] awardsList= {"Arjuna","Drona","Khel Ratna"};
		
		String[] awardsList=new String[3];
		awardsList[0]="Arjuna";
		awardsList[1]="Drona";
		awardsList[2]="Khel Ratna";
		dto.setAwards(awardsList);
		System.out.println(Arrays.toString(dto.getAwards()));
		
		//dto.setAwards(new String[]  {"Arjuna","Drona","Khel Ratna"});
		
		String[] sports=new String[2];
		sports[0]="Boxing";
		sports[1]="Karate";
		dto.setSports(sports);
		System.out.println(Arrays.toString(dto.getSports()));
		
		System.out.println("*********************************");
		
		PlayerDTO dto2=new PlayerDTO();
		dto2.setName("Sachin");
		dto2.setCountry(countryName);
		String[] sachinAwards= {"Bharat Ratna Award","Rajiv Gandhi Khel Ratna Award"};
		dto2.setAwards(sachinAwards);
		System.out.println(dto2.getName());
		System.out.println(dto2.getCountry());
		System.out.println(Arrays.toString(dto2.getAwards()));
		
		System.out.println("*********************************");
		
		PlayerDTO dto3=new PlayerDTO();
		dto3.setName("Rohit Sharma");
		dto3.setCountry("India");
		dto3.setSports(new String[] {"Cricket"});
		dto3.setAwards(new String[] {"Rajiv Gandhi Khel Ratna Award","Padma Shri Award"});
		
		System.out.println(dto3.getName());
		System.out.println(dto3.getCountry());
		System.out.println(Arrays.toString(dto3.getAwards()));
		System.out.println(Arrays.toString(dto3.getSports()));
		
		System.out.println("*********************************");

		PlayerDTO dto4=new PlayerDTO(); 
		dto4.setName("Manika Batra");
		dto4.setCountry("India");
		dto4.setSports(new String[] {"Table Tennis"}); 
		dto4.setAwards(new String[] {"Rajiv Gandhi Khel Ratna Award","Padma Bhushan Award"});
		
		System.out.println(dto4.getName());
		System.out.println(dto4.getCountry());
		System.out.println(Arrays.toString(dto4.getAwards()));
		System.out.println(Arrays.toString(dto4.getSports()));
		
		System.out.println("*********************************");

		PlayerDTO dto5=new PlayerDTO(); 
		dto5.setName("Prashanti Singh");
		dto5.setCountry("India");
		dto5.setSports(new String[] {"Basket Ball"}); 
		dto5.setAwards(new String[] {"Padma Shri Award", "Padma Bhushan Award"});
		
		System.out.println(dto5.getName());
		System.out.println(dto5.getCountry());
		System.out.println(Arrays.toString(dto5.getAwards()));
		System.out.println(Arrays.toString(dto5.getSports()));
	}

}
