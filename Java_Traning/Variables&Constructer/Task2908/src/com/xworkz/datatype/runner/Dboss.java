package com.xworkz.datatype.runner;

import com.xworkz.datatype.main.Gun;

public class Dboss {
private Gun gun;
	
	public Dboss(Gun gun) {
		super();
		this.gun = gun;
	}

	

	public void killed()
	{
		System.out.println("running killed in Dboss");
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
