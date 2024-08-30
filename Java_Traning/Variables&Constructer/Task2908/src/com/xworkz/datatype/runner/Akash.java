package com.xworkz.datatype.runner;

import com.xworkz.datatype.main.Bag;

public class Akash {
	public Bag tear(Bag bag)
	{
		if(bag!=null)
		{
			bag.carry();
			bag.display();
		}
		else
		{
			System.out.println("bag is null");
		}
		return bag;
	}

}
