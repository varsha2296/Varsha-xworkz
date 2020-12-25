package com.xworkz.vtu.engineer;

import com.xworkz.vtu.constants.Branch;

public class Engineer {
	public String USN;
	public Branch branch = Branch.MECH;

	public void problemSolving() {
		System.out.println("invoked problemSolving");
		System.out.println("problem solved by: " + this.branch);
	}

	public final void bunking() {
		System.out.println("engineer bunked");
	}
}
