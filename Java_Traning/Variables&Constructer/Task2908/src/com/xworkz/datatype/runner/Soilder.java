package com.xworkz.datatype.runner;

import com.xworkz.datatype.main.Gun;

public class Soilder {
	public void shoot()
	{
		System.out.println("running shoot in soldier");
		Gun gun=new Gun("Assault","India","Rifle");
		gun.fire();
		gun.display();
	}

}
