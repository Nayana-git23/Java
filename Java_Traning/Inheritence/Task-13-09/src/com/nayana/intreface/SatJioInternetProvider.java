package com.nayana.intreface;

import java.time.LocalDate;


public class SatJioInternetProvider extends Provider {
	
	String lanuchDate;
	
	
	public SatJioInternetProvider(String name, String ceo,String lanuchDate) 
	{
		super(name,ceo);
		this.lanuchDate= lanuchDate;
		System.out.println(this.lanuchDate);
	}
	
	@Override
	public  void service()
	{
		System.out.println("running in SatJioInternetProvider");
	}

}
