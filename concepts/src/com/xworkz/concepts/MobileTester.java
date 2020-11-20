package com.xworkz.concepts;

import com.xworkz.concepts.obj.Mobile;

public class MobileTester {

	public static void main(String[] args) {

		Mobile.os="Android";
		
		Mobile mobile=new Mobile();
		
		mobile.brand="Samsung galaxy A51";
		mobile.color="Blue";
		mobile.price="26500";
		mobile.camera="32MP";
		mobile.displayInfo();
		
		System.out.println("*****************");
		
		Mobile mobile2=new Mobile();
		
		mobile2.brand="Honor 8X";
		mobile2.color="Blue";
		mobile2.price="17000";
		mobile2.camera="16MP";
		mobile2.displayInfo();
		
		System.out.println("*****************");
		
		Mobile mobile3=new Mobile();
		
		mobile3.brand="Sony";
		mobile3.color="Black";
		mobile3.price="25000";
		mobile3.camera="18MP";
		mobile3.displayInfo();
		
		System.out.println("*****************");
		
		Mobile mobile4=new Mobile();
		
		mobile4.brand="Lenovo";
		mobile4.color="White";
		mobile4.price="15000";
		mobile4.camera="8MP";
		mobile4.displayInfo();
		
		System.out.println("*****************");
		
		Mobile mobile5=new Mobile();
		
		mobile5.brand="Mi A1";
		mobile5.color="Black";
		mobile5.price="14499";
		mobile5.camera="5MP";
		mobile5.displayInfo();
		
		System.out.println("*****************");
		
		Mobile mobile6=new Mobile();
		
		mobile6.brand="Oppo";
		mobile6.color="Rose Gold";
		mobile6.price="22499";
		mobile6.camera="24MP";
		mobile6.displayInfo();
		
		System.out.println("*****************");
		
		Mobile mobile7=new Mobile();
		
		mobile7.brand="Vivo";
		mobile7.color="Blue";
		mobile7.price="18990";
		mobile7.camera="32MP";
		mobile7.displayInfo();
		
		System.out.println("*****************");
		
		Mobile mobile8=new Mobile();
		
		mobile8.brand="One plus 8T 5G";
		mobile8.color="Mirror Grey";
		mobile8.price="45990";
		mobile8.camera="48MP";
		mobile8.displayInfo();
		
		System.out.println("*****************");
		
		Mobile mobile9=new Mobile();
		
		mobile9.brand="Redmi Note5 Pro";
		mobile9.color="Blue";
		mobile9.price="17000";
		mobile9.camera="20MP";
		mobile9.displayInfo();
		
		System.out.println("*****************");
		
		Mobile mobile10=new Mobile();
		
		mobile10.brand="Realme 5 Pro";
		mobile10.color="Black";
		mobile10.price="7499";
		mobile10.camera="16MP";
		mobile10.displayInfo();	
		
	}

}
