package com.xworkz.equalsmethods;

public class Grinder {
	
	
	private String brand;
	private double price;
	private int jars;
	private double powerConsumptionInVolts;
	private long adressPinCode;
	private boolean isOfferThere;
	
	
	public Grinder(double powerConsumptionInVolts, long adressPinCode, boolean isOfferThere) {
		super();
		this.powerConsumptionInVolts = powerConsumptionInVolts;
		this.adressPinCode = adressPinCode;
		this.isOfferThere = isOfferThere;
	}


	public Grinder(String brand, double price, int jars) {
		super();
		this.brand = brand;
		this.price = price;
		this.jars = jars;
	}


	@Override
	public String toString() {
		return "Grinder [brand=" + brand + ", price=" + price + ", jars=" + jars + ", powerConsumptionInVolts="
				+ powerConsumptionInVolts + ", adressPinCode=" + adressPinCode + ", isOfferThere=" + isOfferThere + "]";
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj!=null)
		{
			if(obj instanceof Grinder)
			{
				Grinder casted=(Grinder)obj;
				if(this.price==casted.price && this.brand.equals(casted.brand))
				{
					System.out.println("Price and brand are same");
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
