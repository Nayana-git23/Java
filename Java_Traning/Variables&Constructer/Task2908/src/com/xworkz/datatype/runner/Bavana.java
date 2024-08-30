package com.xworkz.datatype.runner;

import com.xworkz.datatype.main.Bag;

public class Bavana {
	public void unzip(Bag bag)
	{
		System.out.println("running unzip");
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
