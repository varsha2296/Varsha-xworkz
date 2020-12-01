package com.xworkz.weather.season;

public class Aquarium {

	public String aquType;
	public int fishPrice;
	public String fishType;
	public float fishSize;
	
	public Aquarium() {
 	   System.out.println("invoked default");
    }
	
	public Aquarium(String aquType) {
 	   System.out.println("Type of Aquarium");
 	   this.aquType=aquType;
    }
    public Aquarium(int fishPrice) {
 	   System.out.println("Price of Fish");
 	   this.fishPrice=fishPrice;
    }
    public Aquarium(String fishType,float fishSize) {
 	   System.out.println("Type and Size of Fish");
 	   this.fishType=fishType;
 	   this.fishSize=fishSize;
    }
    public Aquarium(String fishType,int fishPrice) {
 	   System.out.println("Type and Price of fish");
 	   this.fishPrice=fishPrice;
 	   this.fishType=fishType;
    }
}
