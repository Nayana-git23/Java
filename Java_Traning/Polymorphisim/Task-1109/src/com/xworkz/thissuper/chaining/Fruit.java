package com.xworkz.thissuper.chaining;

public class Fruit {
	String fruitName;
	double price;
	int quantity;
	String color;
	
	
	public Fruit(String fruitName) {
		
		this.fruitName = fruitName;
	}
	
	public Fruit(String fruitName,double price,int quantity )
	{
		this(fruitName);
		this.price=price;
		this.quantity=quantity;
	}
	
	public Fruit(String fruitName,double price,int quantity,String color)
	{
		this(fruitName,price,quantity);
		this.color=color;
	}
	
	public void print()
	{
		System.out.println(fruitName);
		System.out.println(price);
		System.out.println(quantity);
		System.out.println(color);
	}

}
