package com.xworkz.coffeeday;

import com.xworkz.coffeeday.appliances.CoffeeMachine;
import com.xworkz.coffeeday.appliances.Power;

public class CoffeeMachineTester {

	public static void main(String[] args) {
		CoffeeMachine machine = new CoffeeMachine(new Power());

		boolean success = machine.grind("Civet");
		if (success) {
			System.out.println("I know grinding was done");

		} else {
			System.out.println("Griding not done");

		}
	}

}
