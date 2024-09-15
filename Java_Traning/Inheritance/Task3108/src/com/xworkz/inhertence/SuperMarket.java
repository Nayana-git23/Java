package com.xworkz.inhertence;

public class SuperMarket extends Market{
	
	public SuperMarket(String name, String locatation, int shops, String type) 
	{
		super(name,locatation,shops,type);
		System.out.println("Running in SuperMarket");
	}
	
	

}
