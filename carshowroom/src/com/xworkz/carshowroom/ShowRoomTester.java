package com.xworkz.carshowroom;

import com.xworkz.carshowroom.dto.ManagerDTO;
import com.xworkz.carshowroom.showroom.CarShowRoom;

public class ShowRoomTester {

	public static void main(String[] args) {

		CarShowRoom carShowRoom=new CarShowRoom();
	
		carShowRoom.addManager("Varsha", 2573578678l);
		
		carShowRoom.displayManager();
		
		carShowRoom.removeManager();
		
		carShowRoom.displayManager();
		
		ManagerDTO dto=new ManagerDTO("xyz", 67);
		carShowRoom.addManager(dto);
		carShowRoom.displayManager();
		
		carShowRoom.updateManager(4735275768l);
		
		carShowRoom.displayManager();
	}

}
