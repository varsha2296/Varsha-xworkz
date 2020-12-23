package com.xworkz.computer;

import com.xworkz.computer.desktop.Computer;
import com.xworkz.computer.desktop.Desktop;
import com.xworkz.computer.desktop.Laptop;

public class ComputerTester {

	public static void main(String[] args) {

		Computer computer = new Desktop();

		Desktop desktop = (Desktop) computer;

		desktop.computerInfo();
		desktop.setOS("WINDOWS 8");
		System.out.println(desktop.getOS());
		desktop.setRAM(8);
		System.out.println(desktop.getRAM());
		desktop.setROM(900);
		System.out.println(desktop.getROM());
		desktop.setColor("BLACK");
		System.out.println(desktop.getColor());

		Computer computer2 = new Laptop();

		Laptop laptop = (Laptop) computer2;
		
		laptop.usbConnection();
		laptop.setCompanyName("HP");
		System.out.println(laptop.getCompanyName());
		laptop.setOS("WINDOWS 10");
		System.out.println(laptop.getOS());

	}

}
