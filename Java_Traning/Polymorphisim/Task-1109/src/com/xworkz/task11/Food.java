package com.xworkz.task11;

public class Food {
	
	String item;
	double cost;
	boolean isVegetarian;
	
	
	//compile time polymorphisim this just a simple overloading
	//constructer overloading:using same name for constructer change in parameter and datatype arrangement
	
	public Food(String item)
	{
		System.out.println("Overloading a constructer with String parameter");
		this.item=item;
		System.out.println(this.item);
		System.out.println("-----------------------------------------------------------------");
	}
	
	public Food(String item,double cost)
	{
		System.out.println("Overloading a constructer with String,double parameter");
		this.item=item;
		this.cost=cost;
		System.out.println(this.item);
		System.out.println(this.cost);
		System.out.println("-----------------------------------------------------------------");
		
	}

	public Food(String item, double cost, boolean isVegetarian) {
		
		System.out.println("Overloading a constructer with String,double,boolean parameter");
		this.item = item;
		this.cost = cost;
		this.isVegetarian = isVegetarian;
		System.out.println(this.item);
		System.out.println(this.cost);
		System.out.println(this.isVegetarian);
		System.out.println("-----------------------------------------------------------------");
		
	}
	
	///method overloading: just using method with same name change in parameter and datatype
	
	public static void print(String item)
	{
		System.out.println(item);
		System.out.println("Overloading a method with single String parameter");
		System.out.println("-----------------------------------------------------------------");
	}
	
	public  static void print(String item,double cost)
	{
		System.out.println(item);
		System.out.println(cost);
		System.out.println("Overloading a method with String and double parameter");
		System.out.println("-----------------------------------------------------------------");
	}
	
	
	
	
	public static void main(String[] args) {
		Food food=new Food("pulav");
		Food food1=new Food("pulav",50);
		Food food2=new Food("pulav",50,true);
		print("pongal");
		print("dose",2000);
		
	}
	
	

}
