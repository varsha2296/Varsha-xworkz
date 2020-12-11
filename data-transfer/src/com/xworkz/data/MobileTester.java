package com.xworkz.data;

import com.xworkz.data.dto.MobileDTO;

public class MobileTester {

	public static void main(String[] args) {
		MobileDTO dto=new MobileDTO();
		dto.setName("Samsung");
		dto.setSeries("A51");
		dto.setColor("Blue");
		dto.setBatteryCapacity(4000);
		dto.setInternalStorage(128);
		dto.setPrice(26500);
		dto.setmRAM(8);
		dto.setFrontCamera(32);
		
		System.out.println(dto.getName());
		System.out.println(dto.getSeries());
		System.out.println(dto.getColor());
		System.out.println(dto.getBatteryCapacity());
		System.out.println(dto.getInternalStorage());
		System.out.println(dto.getPrice());
		System.out.println(dto.getmRAM());
		System.out.println(dto.getFrontCamera());
		
		System.out.println("*********************************");
		
		MobileDTO dto2=new MobileDTO();
		dto2.setName("Redmi");
		dto2.setSeries("Note 5 pro");
		dto2.setColor("Blue");
		dto2.setBatteryCapacity(4000);
		dto2.setInternalStorage(64);
		dto2.setPrice(17000);
		dto2.setmRAM(6);
		dto2.setFrontCamera(20);
		
		System.out.println(dto2.getName());
		System.out.println(dto2.getSeries());
		System.out.println(dto2.getColor());
		System.out.println(dto2.getBatteryCapacity());
		System.out.println(dto2.getInternalStorage());
		System.out.println(dto2.getPrice());
		System.out.println(dto2.getmRAM());
		System.out.println(dto2.getFrontCamera());
	}

}
