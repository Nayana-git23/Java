package com.xworkz.equalsmethods;

public class Bulb {
	
	private String brand;
	private double price;
	private int warrenty;
	private long delivaryPin;
	private String type;
	private int watt;
	
	
	
	public Bulb(String brand, double price, int warrenty, long delivaryPin, String type, int watt) {
		super();
		this.brand = brand;
		this.price = price;
		this.warrenty = warrenty;
		this.delivaryPin = delivaryPin;
		this.type = type;
		this.watt = watt;
	}



	@Override
	public String toString() {
		return "Bulb [brand=" + brand + ", price=" + price + ", warrenty=" + warrenty + ", delivaryPin=" + delivaryPin
				+ ", type=" + type + ", watt=" + watt + "]";
	}
	
	
	@Override
	public boolean equals(Object obj) {
		if(obj!=null)
		{
			if(obj instanceof Bulb)
			{
				Bulb casted=(Bulb)obj;
				if(this.price==casted.price && this.type.equals(casted.type))
				{
					System.out.println("Price and type are same");
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
