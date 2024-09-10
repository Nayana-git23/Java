package com.xworkz.equalsmethods;

public class BedSheet {
	
	private String materail;
	private double length;
	private String color;
	private String brand;
	private int noOfPieaces;
	private int noOfDaysToDeliver;
	
	
	
	public BedSheet(String materail, double length, String color, String brand, int noOfPieaces,
			int noOfDaysToDeliver) {
		super();
		this.materail = materail;
		this.length = length;
		this.color = color;
		this.brand = brand;
		this.noOfPieaces = noOfPieaces;
		this.noOfDaysToDeliver = noOfDaysToDeliver;
	}



	@Override
	public String toString() {
		return "BedSheet [materail=" + materail + ", length=" + length + ", color=" + color + ", brand=" + brand
				+ ", noOfPieaces=" + noOfPieaces + ", noOfDaysToDeliver=" + noOfDaysToDeliver + "]";
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj!=null)
		{
			if(obj instanceof BedSheet)
			{
				BedSheet casted=(BedSheet)obj;
				if(this.length==casted.length && this.materail.equals(casted.materail))
				{
					System.out.println("Length and materials are same");
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
