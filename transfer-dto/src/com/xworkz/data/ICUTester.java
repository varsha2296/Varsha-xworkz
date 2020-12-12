package com.xworkz.data;

import com.xworkz.data.dto.ICUAdmissionDTO;
import com.xworkz.data.hospital.ICU;

public class ICUTester {
	public static void main(String[] args) {
	
		ICU icu;
		icu=new ICU(true,1000,false);		
		icu.admissionDetails("Anuja", "Eye Sight", "Joshi", "Ganga");
		ICUAdmissionDTO dto=icu.getAdmissionDTO();
		if(dto!=null) {
			System.out.println(dto.getPatientName());
			System.out.println(dto.getSeverity());
			System.out.println(dto.getDoctorName());
			System.out.println(dto.getNurseAssigned());
		}
		else {
			System.out.println("admission is null");
		}
		icu.updateDoctor("Patil");
		System.out.println("new doctor assigned: "+dto.getDoctorName());
		icu.updateCost(2000);
		System.out.println("new cost update: "+icu.getCostPerDay());
		icu.updateDoctorAndNurse("Sushma", "Varsha");
		System.out.println("new doctor name: "+dto.getDoctorName());
		System.out.println("new nurse name: "+dto.getNurseAssigned());
	}
}
