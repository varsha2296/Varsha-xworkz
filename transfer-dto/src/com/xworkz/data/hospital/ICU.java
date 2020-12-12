package com.xworkz.data.hospital;

import com.xworkz.data.dto.ICUAdmissionDTO;
public class ICU {
	
	private boolean ventilatorAvailable;
	private double costPerDay;
	private boolean tvAvailable;
	private ICUAdmissionDTO admissionDTO;
	
	public ICU() {
		System.out.println("created icu");
	}

	public ICU(boolean ventilatorAvailable, double costPerDay, boolean tvAvailable) {
		super();
		this.ventilatorAvailable = ventilatorAvailable;
		this.costPerDay = costPerDay;
		this.tvAvailable = tvAvailable;
	}
	
	public void admissionDetails(String patientName,String severity, String doctorAssigned, String nurseAssigned) {
		if(patientName!=null || severity!=null || doctorAssigned!=null || nurseAssigned!=null)
		{
			System.out.println("details are validated,can create admission");
			this.admissionDTO=new ICUAdmissionDTO(patientName,severity,doctorAssigned,nurseAssigned);
			System.out.println("created admission");
		}
		else {
			System.out.println("cannot create an admission");
			this.admissionDTO=null;
		}
	}
	
	public void updateDoctor(String newDoctorName) {
		this.admissionDTO.setDoctorName(newDoctorName);
	}
	
	public void updateCost(double newCost) {
		this.setCostPerDay(newCost);
	}

	public void updateDoctorAndNurse(String newDoctorName, String newNurseName) {
		this.admissionDTO.setDoctorName(newDoctorName);
		this.admissionDTO.setNurseAssigned(newNurseName);
	}

	
	public boolean isVentilatorAvailable() {
		return ventilatorAvailable;
	}

	public double getCostPerDay() {
		return costPerDay;
	}

	public void setCostPerDay(double costPerDay) {
		this.costPerDay = costPerDay;
	}

	public boolean isTvAvailable() {
		return tvAvailable;
	}

	public ICUAdmissionDTO getAdmissionDTO() {
		return admissionDTO;
	}
}
