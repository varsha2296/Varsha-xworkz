package com.xworkz.copies;

import com.xworkz.copies.camera.Speaker;

public class SpeakerTester {

	public static void main(String[] args) {

		tester();

	}

	public static void tester() {

		Speaker speaker = new Speaker();
		System.out.println("Details of Speaker");
		System.out.println("speaker brand is:"+speaker.brand);
		System.out.println("Speaker color is:"+speaker.color);
		System.out.println("Speaker price is:"+speaker.price);
		System.out.println("Speaker compatible to:"+speaker.compatible);

	}

}
