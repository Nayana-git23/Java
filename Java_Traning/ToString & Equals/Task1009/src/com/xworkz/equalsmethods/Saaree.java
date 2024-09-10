package com.xworkz.equalsmethods;

public class Saaree {
	
	private String material;
	private String color;
	private String review;
	private double price;
	private double rating;
	private String address;
	
	
	


	public Saaree(String material, String color, String review, double price, double rating, String address) {
		super();
		this.material = material;
		this.color = color;
		this.review = review;
		this.price = price;
		this.rating = rating;
		this.address = address;
	}
	
	@Override
	public String toString() {
		return "Saaree [material=" + material + ", color=" + color + ", review=" + review + ", price=" + price
				+ ", rating=" + rating + ", address=" + address + "]";
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj!=null)
		{
			if(obj instanceof Saaree)
			{
				Saaree casted=(Saaree)obj;
				if(this.color.equals(casted.color) && this.material.equals(casted.material))
				{
					System.out.println("Color and materials are same");
					return true;
				}
			}
			else
			{
				System.out.println("Object is not same");
			}
		}
		else
		{
			System.out.println("Obj is null");
		}
		return super.equals(obj);
	}
	
	
	
	

}
