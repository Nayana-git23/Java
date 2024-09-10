package com.xworkz.equalsmethods;



public class Helmet {
	private String brand;
	private String color;
	private String meterial;
	private String review;
	private double price;
	private int gurrentyInYears;
	
	
	
	public Helmet(String brand, String color, String meterial, String review, double price, int gurrentyInYears) {
		super();
		this.brand = brand;
		this.color = color;
		this.meterial = meterial;
		this.review = review;
		this.price = price;
		this.gurrentyInYears = gurrentyInYears;
	}



	@Override
	public String toString() {
		return "Helmet [brand=" + brand + ", color=" + color + ", meterial=" + meterial + ", review=" + review
				+ ", price=" + price + ", gurrentyInYears=" + gurrentyInYears + "]";
	}
	
	
	
	@Override
	public boolean equals(Object obj) {
		if(obj!=null)
		{
			if(obj instanceof Helmet)
			{
				Helmet casted=(Helmet)obj;
				if(this.price==casted.price && this.color.equals(casted.color))
				{
					System.out.println("Price and color are same");
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


