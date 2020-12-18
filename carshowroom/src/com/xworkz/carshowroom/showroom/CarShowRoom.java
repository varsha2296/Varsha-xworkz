package com.xworkz.carshowroom.showroom;

import com.xworkz.carshowroom.constants.CarVariant;
import com.xworkz.carshowroom.dto.CarDTO;
import com.xworkz.carshowroom.dto.ManagerDTO;

public class CarShowRoom {

	private String name;
	private String location;
	private ManagerDTO managerDTO;
	private CarDTO[] cars = new CarDTO[5];
	private int currentIndex = 0;

	public CarShowRoom() {
		System.out.println("CarShowRoom default constructor");
	}

	public CarShowRoom(String name, String location) {
		super();
		this.name = name;
		this.location = location;
	}

	public void addManager(String name, long contactNo) {
		if (name != null && contactNo > 0) {
			this.managerDTO = new ManagerDTO(name, contactNo);
			System.out.println("manager added, data is valid");
		} else {
			System.out.println("provide proper details,data is invalid");
			this.managerDTO = null;
		}
	}

	public void addManager(ManagerDTO dto) {
		if (dto != null) {
			this.managerDTO = dto;
			System.out.println("manager added");
		} else {
			System.out.println("manager not added, data is invalid");
		}
	}

	public void displayManager() {
		if (this.managerDTO != null) {
			System.out.println(this.managerDTO.getName());
			System.out.println(this.managerDTO.getContactNo());
		} else {
			System.out.println("manager is not there :: null");
		}
	}

	public void removeManager() {
		this.managerDTO = null;
	}

	public void updateManager(long contactNo) {
		if (contactNo > 0) {
			this.managerDTO.setContactNo(contactNo);
			System.out.println("details are valid, updated contact number");
		} else {
			System.out.println("cannot update contact number,data is invalid");
		}
	}

	public void addCar(CarDTO dto) {
		if (dto != null && this.currentIndex < 5) {
			System.out.println("we can add car");
			System.out.println("current index:" + this.currentIndex);
			this.cars[currentIndex] = dto;
			this.currentIndex++;
		} else {
			if (dto == null) {
				System.out.println("we cannot add an empty or null");
			}
			if (dto != null) {
				System.out.println("cannot add more car,total: " + this.currentIndex);
			}
			System.out.println("current index:" + this.currentIndex);
		}
	}

	public void displayCars() {
		CarDTO[] tempCars = this.cars;
		for (int i = 0; i < tempCars.length; i++) {
			CarDTO dto = tempCars[i];
			System.out.println(dto);
			System.out.println(dto.getModel());
			System.out.println(dto.getPrice());
			System.out.println(dto.getVariant());
		}
	}

	public void updateCarVariant(CarVariant newVariant, int indexToUpdate) {
		if (newVariant != null && indexToUpdate >= 0 && indexToUpdate < 5) {
			System.out.println("car is found at index: " + indexToUpdate);
			System.out.println("updating variant: " + newVariant);

			CarDTO carDTO = this.cars[indexToUpdate];
			carDTO.setVariant(newVariant);
		}
	}

	public void diaplayCarAtIndex(int indexToDisplay) {
		if (indexToDisplay >= 0 && indexToDisplay < 5) {
			System.out.println("can diaplay car at index: " + indexToDisplay);
			CarDTO refOfCar = cars[indexToDisplay];
			System.out.println(refOfCar.getModel());
			System.out.println(refOfCar.getPrice());
			System.out.println(refOfCar.getVariant());
		}
	}

	public void displayCarByModel(String model) {
		if (model != null) {
			System.out.println("searching for " + model);
			boolean carFound = false;
			for (int index = 0; index < this.cars.length; index++) {
				CarDTO refOfCarDTO = this.cars[index];
				String localModel = refOfCarDTO.getModel();
				if (localModel.contentEquals(model)) {
					System.out.println("car is found");
					System.out.println(refOfCarDTO.getPrice());
					System.out.println(refOfCarDTO.getVariant());
					carFound = true;
					break;
				}
			}
			if (carFound == false) {
				System.out.println("car is not found");
			}
		}
	}

	public void deleteBtIndex(int index) {
		if (index >= 0 && index < 5) {
			System.out.println("index is valid");
			this.cars[index] = null;
		} else {
			System.out.println("index is not found, car cannot be deleted");
		}
	}

	public void deleteByModel(String model) {
		boolean carFound = false;
		if (model != null) {
			for (int index = 0; index < cars.length; index++) {
				CarDTO carDTO = this.cars[index];
				if (carDTO != null) {
					String ref = carDTO.getModel();
					if (ref.equals(model)) {
						this.cars[index] = null;
						System.out.println("car is deleted");
						carFound = true;
						break;
					}
				}
			}
		}
		if(carFound==false) {
			System.out.println("car is not deleted");
		}
	}

	public String getName() {
		return name;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}
}
