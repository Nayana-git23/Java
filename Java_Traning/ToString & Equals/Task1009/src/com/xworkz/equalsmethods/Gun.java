package com.xworkz.equalsmethods;

public class Gun {
	
	private String material;
	private double price;
	private String manufacturer;
	private int noOfBullets;
	private String CountryUsing;
	private String sectorOfUse;
	
	
	
	@Override
	public String toString() {
		return "Gun [material=" + material + ", price=" + price + ", manufacturer=" + manufacturer + ", noOfBullets="
				+ noOfBullets + ", CountryUsing=" + CountryUsing + ", sectorOfUse=" + sectorOfUse + "]";
	}



	public Gun(String material, double price, String manufacturer, int noOfBullets, String countryUsing,
			String sectorOfUse) {
		super();
		this.material = material;
		this.price = price;
		this.manufacturer = manufacturer;
		this.noOfBullets = noOfBullets;
		CountryUsing = countryUsing;
		this.sectorOfUse = sectorOfUse;
	}
	
	
	@Override
	public boolean equals(Object obj) {
		if(obj!=null)
		{
			if(obj instanceof Gun)
			{
				Gun casted=(Gun)obj;
				if(this.CountryUsing.equals(casted.CountryUsing) && this.material.equals(casted.material))
				{
					System.out.println("CountryUsing and materials are same");
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
