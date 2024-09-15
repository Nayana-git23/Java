package com.nayana.intreface;

public class AirtelInternetProvider extends Provider {
	
	public AirtelInternetProvider(String name, String ceo) 
	{
		super(name,ceo);
	}
	
	@Override
	public  void service()
	{
		System.out.println("running in AirtelInternetProvider ");
	}

}
