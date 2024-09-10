package com.xworkz.equalsmethods;

public class Kettle {
	public Kettle(String material, String brand, double price, int quantity, int gurrenty, double rating) {
		super();
		this.material = material;
		this.brand = brand;
		this.price = price;
		this.quantity = quantity;
		this.gurrenty = gurrenty;
		this.rating = rating;
	}



	private String material;
	private String brand;
	private double price;
	private int quantity;
	private int gurrenty;
	private double rating;
	
	
	
	
	
	
	@Override
	public String toString() {
		return "Kettle [material=" + material + ", brand=" + brand + ", price=" + price + ", quantity=" + quantity
				+ ", gurrenty=" + gurrenty + ", rating=" + rating + "]";
	}
	
	

	@Override
	public boolean equals(Object obj) {
		if(obj!=null)
		{
			if(obj instanceof Kettle)
			{
				Kettle casted=(Kettle)obj;
				if(this.price==casted.price && this.material.equals(casted.material))
				{
					System.out.println("Price and materials are same");
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
