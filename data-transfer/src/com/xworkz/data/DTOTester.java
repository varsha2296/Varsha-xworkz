package com.xworkz.data;

import com.xworkz.data.dto.CustomerDTO;

public class DTOTester {

	public static void main(String[] args) {
		CustomerDTO customerDTO = new CustomerDTO();
		customerDTO.setName("Varsha");
		customerDTO.setContactNo(7795913579l);
		customerDTO.setEmail("varsha.xworkz@gmail.com");
		
		System.out.println(customerDTO.getName());
		System.out.println(customerDTO.getEmail());
		if (customerDTO.getContactNo() > 0) {
			System.out.println(customerDTO.getContactNo());
		} else {
			System.out.println("contact no is not  there");
		}
		
		System.out.println("*********************************");
				
		CustomerDTO customerDTO2=new CustomerDTO();
		customerDTO2.setName("Aish");
		customerDTO2.setCustomerId(7676);
		customerDTO2.setEmail("Aish.xworkz@gmail.com");
		customerDTO2.setContactNo(7829446971l);
		
		System.out.println(customerDTO2.getName());
		System.out.println(customerDTO2.getCustomerId());
		System.out.println(customerDTO2.getEmail());
		System.out.println(customerDTO2.getContactNo());
		
		System.out.println("*********************************");
		
		CustomerDTO customerDTO3=new CustomerDTO();
		customerDTO3.setName("Sushma");
		customerDTO3.setCustomerId(8989);
		customerDTO3.setEmail("sushma.xworkz@gmail.com");
		customerDTO3.setContactNo(7586768756l);
		
		System.out.println(customerDTO3.getName());
		System.out.println(customerDTO3.getCustomerId());
		System.out.println(customerDTO3.getEmail());
		System.out.println(customerDTO3.getContactNo());
		
		
	}
}
