package com.xworkz.vtu;

import com.xworkz.vtu.engineer.CIVILEngineer;
import com.xworkz.vtu.engineer.CSEngineer;
import com.xworkz.vtu.engineer.ECEngineer;
import com.xworkz.vtu.engineer.EEEEngineer;
import com.xworkz.vtu.engineer.Engineer;
import com.xworkz.vtu.engineer.ISEngineer;
import com.xworkz.vtu.engineer.MECHEngineer;
import com.xworkz.vtu.engineer.TCEngineer;

public class VTUTester {

	public static void main(String[] args) {

		Engineer engineer = new Engineer();
		System.out.println(engineer.USN);
		System.out.println(engineer.branch);
		engineer.problemSolving();

		CSEngineer csEngineer = new CSEngineer();
		System.out.println(csEngineer.USN);
		System.out.println(csEngineer.getBranch());
		System.out.println(csEngineer.getParentBranch());
		csEngineer.problemSolving();

		Engineer engineer2 = new CSEngineer();
		System.out.println(engineer2.branch);
		
		CSEngineer csEngineer2=(CSEngineer)engineer2;
		System.out.println(csEngineer2.branch);
		engineer2.problemSolving();
		csEngineer2.problemSolving();
		
		TCEngineer tcEngineer=new TCEngineer();
		System.out.println(tcEngineer.branch);
		tcEngineer.problemSolving();
		System.out.println(tcEngineer.branchE);
	
		ECEngineer ecEngineer=new ECEngineer();
		System.out.println(ecEngineer.branch);
		ecEngineer.communicate();
		ecEngineer.current();
		
		ISEngineer isEngineer=new ISEngineer();
		System.out.println(isEngineer.branch);
		isEngineer.info();
		isEngineer.tech();
		
		MECHEngineer mechEngineer=new MECHEngineer();
		System.out.println(mechEngineer.branch);
		mechEngineer.machine();
		mechEngineer.welding();
		
		EEEEngineer eeeEngineer=new EEEEngineer();
		System.out.println(eeeEngineer.branch);
		eeeEngineer.wiring();
		eeeEngineer.connecting();
		
		CIVILEngineer civilEngineer=new CIVILEngineer();
		System.out.println(civilEngineer.branch);
		civilEngineer.planning();
		civilEngineer.construction();
	}

}
