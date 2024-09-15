package com.nayana.intreface;

public class ExtremeAitelInternetProvider extends Provider {
	
	public ExtremeAitelInternetProvider(String name, String ceo) 
	{
		super(name,ceo);
	}
	
	@Override
	public  void service()
	{
		System.out.println("running in ExtremeAitelInternetProvider ");
	}

}
