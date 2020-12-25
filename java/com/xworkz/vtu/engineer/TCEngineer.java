package com.xworkz.vtu.engineer;

import com.xworkz.vtu.constants.Branch;

public class TCEngineer extends Engineer {

	public Branch branch = Branch.TC;
	public final Branch branchE = Branch.EEE;

	public void problemSolving() {
		super.problemSolving();
		System.out.println("invoked problemSolving in CSEngineer");
		System.out.println("problem solved by: " + this.branch);
	}

}