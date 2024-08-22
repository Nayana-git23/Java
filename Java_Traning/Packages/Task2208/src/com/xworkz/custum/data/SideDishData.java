package com.xworkz.custum.data;

public class SideDishData {
	String name;
	double price;
	String type;
	
	public SideDishData(String name, double price, String type) {
		super();
		this.name = name;
		this.price = price;
		this.type = type;
	}
	public void show()
	{
		System.out.println(this.name);
		System.out.println(this.price);
		System.out.println(this.type);
	}

}
