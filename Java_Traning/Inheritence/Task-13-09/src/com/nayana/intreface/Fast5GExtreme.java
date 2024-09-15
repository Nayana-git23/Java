package com.nayana.intreface;

public class Fast5GExtreme extends Provider {
	
	public Fast5GExtreme(String name, String ceo) 
	{
		super(name,ceo);
	}
	
	@Override
	public  void service()
	{
		System.out.println("running in Fast5GExtreme");
	}

}
