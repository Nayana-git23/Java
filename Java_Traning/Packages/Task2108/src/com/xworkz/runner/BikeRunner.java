package com.xworkz.runner;

import com.xworkz.task.Bike;

public class BikeRunner {
	public static void main(String args[]) {
		Bike bike = new Bike();
		bike.store("Apache");
		bike.store("Hero");
		bike.store("Honda");
		bike.store("Tvs");
		bike.store("Spender Plus");
		bike.store("Paltina");
		bike.store("KTM");

		bike.display();
	}

}
