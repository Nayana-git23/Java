package com.xworkz.thissuper.chaining;

public class Apple extends Fruit 
{

	public Apple(String fruitName,double price,int quantity,String color)
	{
		super(fruitName,price,quantity,color);
	
	}
	
	
		public void display()
		{
			Apple apple=new Apple("Apple",34,1,"red");
			apple.print();
			
		}

}
