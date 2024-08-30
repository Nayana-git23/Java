package com.xworkz.datatype.runner;

import com.xworkz.datatype.main.WashingMachine;

public class Abisheik {
	private WashingMachine washingmachine;
	
	public Abisheik( WashingMachine washingmachine) {
		this.washingmachine=washingmachine;
	}
	public void powerOn()
	{
		System.out.println("running powerOn");
		if(washingmachine!=null)
		{
			washingmachine.show();
		}
		else
		{
			System.out.println("washingmachine is null");
		}
	}

}
