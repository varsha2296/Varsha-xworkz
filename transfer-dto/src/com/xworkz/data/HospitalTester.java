package com.xworkz.data;

import com.xworkz.data.dto.AppointmentDTO;
import com.xworkz.data.hospital.Hospital;

public class HospitalTester {

	public static void main(String[] args) {

		Hospital hospital = new Hospital("Appolo", "Bus stand road");

		System.out.println("hospital name: "+hospital.getName());
		System.out.println("hospital location: "+hospital.getLocation());
		
		hospital.appointment("Anjana", 8343656465l, 50, "Liver problem", "Dr.Rani");

		AppointmentDTO appointment = hospital.getAppointmentDTO();
		
		System.out.println("patient name: " + appointment.getPatientName());
		System.out.println("mobile number: " + appointment.getMobileNumber());
		System.out.println("age: "+appointment.getAge());
		System.out.println("reason: "+appointment.getReason());
		System.out.println("doctor name: " + appointment.getDoctorName());

	}

}
