package com.xworkz.datatype.runner;

import com.xworkz.datatype.main.Gun;

public class Police {
	
	public void load(Gun gun)
	{
		System.out.println("running load in police");
		if(gun!=null)
		{
			gun.display();
		}
		else
		{
			System.out.println("gun is null");
		}
	}


}
