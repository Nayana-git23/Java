package com.nayana.intreface;

public class JioInternetProvider extends Provider {
	
	public JioInternetProvider(String name, String ceo) 
	{
		super(name,ceo);
	}
	
	@Override
	public  void service()
	{
		System.out.println("running in JioInternetProvider");
	}

}
