package com.xworkz.equalsmethods;

public class Jeans 
{
	
private String brand;
private int size;
private double price;
private int rating;
private String delivaryAdress;
private String color;


public Jeans(String brand, int size, double price, int rating, String delivaryAdress, String color) {
	super();
	this.brand = brand;
	this.size = size;
	this.price = price;
	this.rating = rating;
	this.delivaryAdress = delivaryAdress;
	this.color = color;
}


@Override
public String toString() {
	return "Jeans [brand=" + brand + ", size=" + size + ", price=" + price + ", rating=" + rating + ", delivaryAdress="
			+ delivaryAdress + ", color=" + color + "]";
}



@Override
	public boolean equals(Object obj) {
		System.out.println("Running in Jeans class");
		if(obj!=null) {
			if(obj instanceof Jeans)
			{
				Jeans cast=(Jeans)obj;
				if(this.size==cast.size && this.price==cast.price) {
					System.out.println("Size and price are equal");
					return true;
				}
				
			}else {
				System.out.println("Obj is not found");
			}
			
		}
		else
		{
			System.out.println("value is Null");
		}
		
		return super.equals(obj);
	}




}
