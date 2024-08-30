package com.xworkz.datatype.runner;

import com.xworkz.datatype.main.WashingMachine;

public class Nayana {
	public void addFabricConditioner()
	{
		System.out.println("running addFabricConditioner");
		WashingMachine washingmachine=new WashingMachine("Haier","front load",12);
		washingmachine.rinse();
		washingmachine.show();
		
	}

}
