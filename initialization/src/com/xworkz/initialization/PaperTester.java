package com.xworkz.initialization;

import com.xworkz.initialization.init.Paper;

public class PaperTester {

	public static void main(String[] args) {

		Paper paper=new Paper("White",10,20);
		paper.setColor("Red");
		String brand=paper.getBrand();
		String color=paper.getColor();
		String width=paper.getWidth();
		String height=paper.getHeight();
		
		System.out.println(brand);
		System.out.println(color);
		System.out.println(width);
		System.out.println(height);
	}

}
