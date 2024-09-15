package com.nayana.intreface;

public class DellProvider extends Provider {
	private double profit;
	
	public DellProvider(String name, String ceo) 
	{
		super(name,ceo);
	}
	
	@Override
	public  void service()
	{
		System.out.println("running in DellProvider");
	}

}
