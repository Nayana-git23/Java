package com.xworkz.custum.data;

public class SandalData 
{
String brand;
char size;
double cost;
String color;

public SandalData(String brand, char size, double cost, String color) {
	super();
	this.brand = brand;
	this.size = size;
	this.cost = cost;
	this.color = color;
}

public void displayData()
{
	System.out.println(this.brand);
	System.out.println(this.size);
	System.out.println(this.cost);
	System.out.println(this.color);
	
}
}
