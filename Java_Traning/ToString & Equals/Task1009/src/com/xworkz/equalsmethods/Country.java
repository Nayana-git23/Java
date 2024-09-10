package com.xworkz.equalsmethods;

public class Country {
	
	
	private String nameOfCountry;
	private String capitalCity;
	private int gdpInTRillion;
	private int noOfStates;
	private String primeMinister;
	private String popularFor;
	
	
	
	


	public Country(String nameOfCountry, String capitalCity, int gdpInTRillion, int noOfStates, String primeMinister,
			String popularFor) {
		super();
		this.nameOfCountry = nameOfCountry;
		this.capitalCity = capitalCity;
		this.gdpInTRillion = gdpInTRillion;
		this.noOfStates = noOfStates;
		this.primeMinister = primeMinister;
		this.popularFor = popularFor;
	}
	
	@Override
	public String toString() {
		return "Country [nameOfCountry=" + nameOfCountry + ", capitalCity=" + capitalCity + ", gdpInTRillion="
				+ gdpInTRillion + ", noOfStates=" + noOfStates + ", primeMinister=" + primeMinister + ", popularFor="
				+ popularFor + "]";
	}

	
	
	@Override
	public boolean equals(Object obj) {
		if(obj!=null)
		{
			if(obj instanceof Country)
			{
				Country casted=(Country)obj;
				if(this.nameOfCountry.equals(nameOfCountry) && this.capitalCity.equals(casted.capitalCity))
				{
					System.out.println("Name Of Country and Capital City are same");
					return true;
				}
			}
			else
			{
				System.out.println("Object is not same");
			}
		}
		else
		{
			System.out.println("Obj is null");
		}
		return super.equals(obj);
	}
	
	
	

}
