package com.xworkz.datatype.runner;

import com.xworkz.datatype.main.WashingMachine;

public class Lakshmi {


	public void load(WashingMachine washingmachine )
	{
		System.out.println("running load");
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



