package com.xworkz.datatype.runner;

import com.xworkz.datatype.main.Bag;

public class Ranju {
	private Bag bag;
	
	public Ranju(Bag bag)
	{
		this.bag=bag;
	}
	public void store()
	{
		if(bag!=null)
		{
			bag.display();
		}
		else
		{
			System.out.println("bag is null");
		}
	}

}
