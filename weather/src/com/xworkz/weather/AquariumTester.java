package com.xworkz.weather;

import com.xworkz.weather.season.Aquarium;

public class AquariumTester {

	public static void main(String[] args) {

		Aquarium fish=new Aquarium();
		System.out.println(fish.aquType);
		System.out.println(fish.fishPrice);
		System.out.println(fish.fishType);
		System.out.println(fish.fishSize);
		
		Aquarium fish1=new Aquarium("Kids Tank");
		System.out.println(fish1.aquType);
		
		Aquarium fish2=new Aquarium(250);
		System.out.println(fish2.fishPrice);
		
		Aquarium fish3=new Aquarium("Rainbow Fish",3.5f);
		System.out.println(fish3.fishType);
		System.out.println(fish3.fishSize);
		
		Aquarium fish4=new Aquarium("Gold Fish",15);
		System.out.println(fish4.fishType);
		System.out.println(fish4.fishPrice);
	}

}
