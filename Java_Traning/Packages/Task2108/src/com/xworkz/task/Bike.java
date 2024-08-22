package com.xworkz.task;

public class Bike {
	String[] bikes = new String[7];
	int index;

	public void store(String bikeNames) {
		
			this.bikes[this.index] = bikeNames;
		index++;
	}

	public void display() {
		for (String bikuu : bikes) {
			System.out.println(bikuu);
		}
	}
}
