package com.xworkz.data.dto;

public class MobileDTO {
	private String name;
	private String series;
    private String color;
    private int batteryCapacity;
    private int internalStorage;
    private int price;
    private int mRAM;
    private int frontCamera;
	
    public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSeries() {
		return series;
	}
	public void setSeries(String series) {
		this.series = series;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getBatteryCapacity() {
		return batteryCapacity;
	}
	public void setBatteryCapacity(int batteryCapacity) {
		this.batteryCapacity = batteryCapacity;
	}
	public int getInternalStorage() {
		return internalStorage;
	}
	public void setInternalStorage(int internalStorage) {
		this.internalStorage = internalStorage;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getmRAM() {
		return mRAM;
	}
	public void setmRAM(int mRAM) {
		this.mRAM = mRAM;
	}
	public int getFrontCamera() {
		return frontCamera;
	}
	public void setFrontCamera(int frontCamera) {
		this.frontCamera = frontCamera;
	}
    
}
