package com.xworkz.sports.award;

public class Ceremony {
	
	private String name;// const
	private String[] foods;// setter

	public Ceremony() {
		System.out.println("Created Ceremony");
	}

	public void distributeAward(String personName, String award) {
		System.out.println("invoked distributeAward");
		System.out.println("arg1: " + personName);
		System.out.println("arg2: " + award);
	}

	public void displayFoods() {
		System.out.println("invoked displayFoods");
		System.out.println(this.foods);
		if (this.foods != null) {
			for (int z = 0; z < this.foods.length; z++) {
				String food = this.foods[z];
				System.out.println(food);
			}
		}
	}

	public void displayCeremoryNameAndFoods() {
		System.out.println(this.name);
		this.displayFoods();
	}

	public void accessParentMembers() {
		// in cons, methods
		int hCode = super.hashCode();
		System.out.println(hCode);
		String string = super.toString();
		System.out.println(string);

	}

	public Ceremony(String name) {
		this.name = name;
	}

	public void setFoods(String[] foods) {
		this.foods = foods;
	}
}
