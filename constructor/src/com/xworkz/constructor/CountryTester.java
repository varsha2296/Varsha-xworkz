package com.xworkz.constructor;

import com.xworkz.constructor.construct.Country;

public class CountryTester {
	public static void main(String[] args) {
		Country info=new Country("India", "South Asia", "New Delhi", "Narendra Modi", 74.802f, 1387037000, 3166391, 2525);
		System.out.println("Name of the country: "+info.countryName);
		System.out.println("Located region: "+info.cRegion);
		System.out.println("Capital of India: "+info.cCapital);
		System.out.println("Prime Minister of India: "+info.cPrimeMinister);
		System.out.println("Currency exchange rate equal to USD: "+info.cCurrencyExchangeRate);
		System.out.println("Population of India: "+info.cPopulation);
		System.out.println("Total Area of India: "+info.cTotalArea);
		System.out.println("Longest river in India in km: "+info.cLongestRiver);

	}
}
