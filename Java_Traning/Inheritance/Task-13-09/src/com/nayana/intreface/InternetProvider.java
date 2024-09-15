package com.nayana.intreface;

public class InternetProvider extends Provider {
	
	public InternetProvider(String name, String ceo) 
	{
		super(name,ceo);
	}
	
	@Override
	public  void service()
	{
		System.out.println("running in InternetProvider ");
	}

}
