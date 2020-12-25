package com.xworkz.vtu.engineer;

import com.xworkz.vtu.constants.Branch;

public class ECEngineer extends Engineer {

	public Branch branch = Branch.EC;

	public void communicate() {
		System.out.println("invoked communicate in EC");
	}

	public void current() {
		System.out.println("invoked current in EC");
	}

}
