package com.xworkz.equalsmethod.runner;

import com.xworkz.equalsmethods.Country;

public class CountryRunner {
	public static void main(String args[])
	{
		Country country=new Country("Nepal","katmandu",1,3,"K P Sharma oli","Hindu Temples");
		
		Country country1=new Country("Nepal","katmandu",1,3,"K P Sharma oli","Hindu Temples");
		
		boolean data=country.equals(country1);
		System.out.println(data);
	}

}
