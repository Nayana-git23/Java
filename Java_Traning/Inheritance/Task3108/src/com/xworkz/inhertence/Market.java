package com.xworkz.inhertence;

public class Market {
	private String name;
	private String locatation;
	private int shops;
	private String type;
	
	
	
	public Market(String name, String locatation, int shops, String type) 
	{
		super();
		this.name = name;
		this.locatation = locatation;
		this.shops = shops;
		this.type = type;
	}



	public Market(String name,int shops,String type)  {
		super();
		this.name = name;
		this.type = type;
		this.shops = shops;
	}
	
	
	public void print()
	{
		System.out.println("Name :"+this.name);
		System.out.println("Locatation  :"+this.locatation);
		System.out.println("Shops :"+this.shops);
		System.out.println("Type  :"+this.type);
		System.out.println("---------------------------------------------");
	}
	
	

}
