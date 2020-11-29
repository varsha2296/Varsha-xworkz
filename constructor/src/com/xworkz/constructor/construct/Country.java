package com.xworkz.constructor.construct;

public class Country {

	public String countryName;
	public String cRegion;
	public String cCapital;
	public String cPrimeMinister;
	public float cCurrencyExchangeRate;
	public int cPopulation;
	public int cTotalArea;
	public int cLongestRiver;

	public Country(String name, String region, String capital, String primeMinister, float currencyRate, int population,
			int totalArea, int longestRiver) {
		countryName = name;
		cRegion = region;
		cCapital = capital;
		cPrimeMinister = primeMinister;
		cCurrencyExchangeRate = currencyRate;
		cPopulation = population;
		cTotalArea = totalArea;
		cLongestRiver = longestRiver;
	}

}
