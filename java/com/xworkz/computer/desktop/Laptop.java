package com.xworkz.computer.desktop;

public class Laptop extends Computer{
	
	private String companyName;
    
	public void usbConnection() {
  	  System.out.println("invoked usbConnection");
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
}
