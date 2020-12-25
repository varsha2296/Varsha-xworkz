package com.xworkz.vtu.engineer;

import com.xworkz.vtu.constants.Branch;

public class ISEngineer extends Engineer{

	public Branch branch = Branch.IS;

	public void info() {
		System.out.println("invoked info in IS");
	}
	
	public void tech() {
		System.out.println("invoked tech in IS");
	}
}
