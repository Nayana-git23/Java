package com.xworkz.protectedkeyword.internal;

public class Board {
	private String brand;
	private double price;
	
	
	protected Board()
	{
		System.out.println("Running in Board");
	}


	public Board(String brand, double price) {
		super();
		this.brand = brand;
		this.price = price;
	}
	
	public void print()
	{
		System.out.println("Brand  :"+this.brand);
		System.out.println("Price  :"+this.price);
	}
	

}



