package com.xworkz.equalsmethod.runner;

import com.xworkz.equalsmethods.Gun;

public class GunRunner {
	public static void main(String args[])
	{
		Gun gun=new Gun("carbon Steel",24000,"India",45,"India","Indian Army");
		Gun gun1=new Gun("carbon Steel",24000,"India",45,"India","Indian Army");
		
		boolean storage=gun.equals(gun1);
		System.out.println(storage);
		
	}

}
