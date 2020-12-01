package com.xworkz.weather;

import com.xworkz.weather.season.Season;

public class SeasonTester {

	public static void main(String[] args) {

		Season season = new Season();
		System.out.println(season.name);
		System.out.println(season.startMonth);

		Season season1 = new Season("Summer","March");
		System.out.println(season1.name);
		System.out.println(season1.startMonth);

	}

}
