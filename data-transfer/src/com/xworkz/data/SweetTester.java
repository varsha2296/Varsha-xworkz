package com.xworkz.data;

import java.util.Arrays;

import com.xworkz.data.constants.Shape;
import com.xworkz.data.dto.SweetDTO;

public class SweetTester {

	public static void main(String[] args) {
		String[] ladduColor=new String[4];
		ladduColor[0]="Orange";
		ladduColor[1]="White";
		ladduColor[2]="Yellow";
		SweetDTO dto=new SweetDTO("Laddu", ladduColor, Shape.ROUND);
		dto.setPopularState("Tirupati");
		dto.setPrice(600);
		
		System.out.println(dto.getName());
		System.out.println(Arrays.toString(dto.getColor()));
		System.out.println(dto.getShape());
		System.out.println(dto.getPopularState());
		System.out.println(dto.getPrice());
		
		System.out.println("***********************************");
		
		String[] champakaliColor=new String[3];
		champakaliColor[0]="Yellow";
		champakaliColor[1]="White";
		champakaliColor[2]="Red";
		SweetDTO dto2=new SweetDTO("Champakali", champakaliColor, Shape.CYLINDER);
		dto2.setPopularState("Bengal");
		dto2.setPrice(450);
		
		System.out.println(dto2.getName());
		System.out.println(Arrays.toString(dto2.getColor()));
		System.out.println(dto2.getShape());
		System.out.println(dto2.getPopularState());
		System.out.println(dto2.getPrice());
		
		System.out.println("***********************************");

		String[] mysorePakColor=new String[2];
		mysorePakColor[0]="Orange";
		mysorePakColor[1]="Yellow";
		SweetDTO dto3=new SweetDTO("Kaju Katli", mysorePakColor, Shape.RECTANGLE);
		dto3.setPopularState("Mysore");
		dto3.setPrice(500);
		
		System.out.println(dto3.getName());
		System.out.println(Arrays.toString(dto3.getColor()));
		System.out.println(dto3.getShape());
		System.out.println(dto3.getPopularState());
		System.out.println(dto3.getPrice());
	}

}
