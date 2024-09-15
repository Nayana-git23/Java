package com.nayana.intreface;

public class BookingProvider extends Provider {
	
	
	
	
	
	
	public BookingProvider(String name, String ceo) 
	{
		super(name,ceo);
		
		
	}
	
	
	@Override
	public  void service()
	{
		System.out.println("running in BookingProvider ");
	}
	
	
	public void book()
	{
		System.out.println("running in book method in the class BookingProvider" );
	}
	
	public void cancel()
	{
		System.out.println("running in cancel method in the class BookingProvider" );
	}
	
	
	
	

}
