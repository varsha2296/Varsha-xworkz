package com.xworkz.carshowroom;

import com.xworkz.carshowroom.constants.CarVariant;
import com.xworkz.carshowroom.dto.CarDTO;
import com.xworkz.carshowroom.showroom.CarShowRoom;

public class CarTester {

	public static void main(String[] args) {

		CarShowRoom carShowRoom = new CarShowRoom();

		CarDTO dto = new CarDTO();

		dto.setModel("Tesla");
		dto.setVariant(CarVariant.MID);
		dto.setPrice(2000000);

		carShowRoom.addCar(dto);

		CarDTO dto2 = new CarDTO("Swift", 600000, CarVariant.TOP);

		carShowRoom.addCar(dto2);

		CarDTO dto3 = new CarDTO("Jeep", 280000, CarVariant.TOP);

		carShowRoom.addCar(dto3);

		CarDTO dto4 = new CarDTO("Lamborighini", 3000000, CarVariant.TOP);

		carShowRoom.addCar(dto4);

		CarDTO dto5 = new CarDTO("Muruthi 800", 30000, CarVariant.TOP);

		carShowRoom.addCar(dto5);

		carShowRoom.displayCars();

		carShowRoom.updateCarVariant(CarVariant.BASE, 1);

		carShowRoom.diaplayCarAtIndex(1);

		carShowRoom.displayCarByModel("Ford");
	}

}
