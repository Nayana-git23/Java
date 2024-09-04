package com.xworkz.inheritence.chaining;

public class Fruit {
	
	private String name;
	private  int quanitity;
	private double price;
	
	
	//demonstration of this keyword
	
	public Fruit(String name,int quanitity)
	{
		this.name=name;
		this.quanitity=quanitity;
		System.out.println("Running in Fruit");
		
		
		}
	
	public Fruit(double price,String name,int quanitity)
	{
		this(name,quanitity);
		this.price=price;
		
	}
	
	public void eat()
	{
		System.out.println("Running in fruit class it is parent class");
		
	}
	public void display()
	{
		System.out.println(this.name);
		System.out.println(this.price);
		System.out.println(this.quanitity);
	}
	

}
