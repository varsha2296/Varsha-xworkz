package com.xworkz.data;

import com.xworkz.data.dto.CompanyDTO;

public class CompanyTester {

	public static void main(String[] args) {
		CompanyDTO dto=new CompanyDTO();
		dto.setName("Wipro");
		dto.setType("IT");
		dto.setLocation("Bengaluru");
		dto.setcCEO("Thierry Delaporte");;
		
		System.out.println(dto.getName());
		System.out.println(dto.getType());
		System.out.println(dto.getLocation());
		System.out.println(dto.getcCEO());
		
		System.out.println("*********************************");
		
		CompanyDTO dto2=new CompanyDTO();
		dto2.setName("Infosys");
		dto2.setType("IT");
		dto2.setLocation("Bengaluru");
		dto2.setcCEO("Salil Satish Parekh");;
		
		System.out.println(dto2.getName());
		System.out.println(dto2.getType());
		System.out.println(dto2.getLocation());
		System.out.println(dto2.getcCEO());
	}

}
