package com.xworkz.data.dto;

public class ICUAdmissionDTO {
	private String patientName;
	private String severity;
	private String doctorName;
	private String nurseAssigned;
	
	public ICUAdmissionDTO() {
		System.out.println("created ICUAdmissionDTO");
	}

	public ICUAdmissionDTO(String patientName, String severity, String doctorName, String nurseAssigned) {
		super();
		this.setPatientName(patientName);
		this.setSeverity(severity);
		this.setDoctorName(doctorName);
		this.setNurseAssigned(nurseAssigned);
	}

	public String getPatientName() {
		return patientName;
	}

	public void setPatientName(String patientName) {
		this.patientName = patientName;
	}

	public String getSeverity() {
		return severity;
	}

	public void setSeverity(String severity) {
		this.severity = severity;
	}

	public String getDoctorName() {
		return doctorName;
	}

	public void setDoctorName(String doctorName) {
		this.doctorName = doctorName;
	}

	public String getNurseAssigned() {
		return nurseAssigned;
	}

	public void setNurseAssigned(String nurseAssigned) {
		this.nurseAssigned = nurseAssigned;
	}
	
}
