package com.xworkz.online;

public class HotelMenuSearch {

	private static String[] dishes= {"Hara Bhara Kabab","French Fries","Gobi Manchurian","Tomato Soup","Spring Roll",
									"Paneer Butter Masala", "Matar Paneer", "Malai Kofta", "Palak Paneer", "Kaju Kurma",
									"Naan", "Butter Naan", "Kulcha", "Butter Kulcha", "Aaloo Paratha",
									"Fried Rice", "Veg Pulao", "Jeera Rice", "Veg Biryani", "Dal Khichdi",};
	
	public static void search(String food) {
		System.out.println("invoked search");
		System.out.println("Total dishes available:"+dishes.length);
		System.out.println("arg1:"+food);
		boolean dishFound=false;
		for(int count=0;count<dishes.length;count++)
		{
			String dish=dishes[count];
			if(dish.equals(food))
			{
				dishFound=true;
				break;
			}
			else
			{
				dishFound=false;
			}
		}
		if (dishFound) {
			System.out.println("dish is found ");
		}
		else
		{
			System.out.println("dish is not found");
		}
		System.out.println("exit search");
	}
	public static int totalDishes() {
		return dishes.length;
	}
}
