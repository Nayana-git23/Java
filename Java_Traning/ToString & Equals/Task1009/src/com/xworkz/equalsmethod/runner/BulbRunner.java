package com.xworkz.equalsmethod.runner;

import com.xworkz.equalsmethods.Bulb;

public class BulbRunner {
	public static void main(String args[])
	{
		Bulb bulb=new Bulb("Havels",475,2,577412,"LED",30);
		Bulb bulb1=new Bulb("Havels",475,2,577412,"LED",30);
		boolean dataStore=bulb.equals(bulb1);
		System.out.println(dataStore);
		
	}

}
