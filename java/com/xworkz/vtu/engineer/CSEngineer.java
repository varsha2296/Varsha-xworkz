package com.xworkz.vtu.engineer;

import com.xworkz.vtu.constants.Branch;

public class CSEngineer extends Engineer {

	public Branch branch = Branch.CS;

	public void problemSolving() {
		super.problemSolving();
		System.out.println("invoked problemSolving in CSEngineer");
		System.out.println("problem solved by: " + this.branch);
	}
	public void coding() {
		System.out.println("invoked coding in CS");
	}
	
	public Branch getBranch() {
		return branch;
	}

	public Branch getParentBranch() {
		return super.branch;
	}
}
