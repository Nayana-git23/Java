package com.xworkz.custum.data;

public class MarketData {
	String name;
	String location;

	public MarketData(String name, String location) {
		super();
		this.name = name;
		this.location = location;
	}

	public void display() {
		System.out.println(this.name);
		System.out.println(this.location);
	}

}
