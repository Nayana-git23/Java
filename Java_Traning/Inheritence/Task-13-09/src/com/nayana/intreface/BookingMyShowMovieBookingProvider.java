package com.nayana.intreface;

public class BookingMyShowMovieBookingProvider extends BookingProvider {
	
	private int totalHalls;
	
	
	public BookingMyShowMovieBookingProvider(String name, String ceo,int totalHalls) 
	{
		super(name,ceo);
		this.totalHalls=totalHalls;
	}
	@Override
	public void book()
	{
		System.out.println("running in book method in the class BookingMyShowMovieBookingProvider" );
	}
	
	@Override
	public void cancel()
	{
		System.out.println("running in cancel method in the class BookingMyShowMovieBookingProvider" );
	}
	
	@Override
	public  void service()
	{
		System.out.println("running in BookingMyShowMovieBookingProvider ");
	}
		
		
	

}
