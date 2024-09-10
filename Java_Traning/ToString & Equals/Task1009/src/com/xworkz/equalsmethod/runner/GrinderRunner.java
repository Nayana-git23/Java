package com.xworkz.equalsmethod.runner;

import com.xworkz.equalsmethods.Grinder;

public class GrinderRunner {
	public static void main(String args[])
	{
		Grinder grinder=new Grinder("VGurad",3000,5);
		Grinder grinder1=new Grinder("VGurad",4000,2);
		boolean value=grinder.equals(grinder1);
		System.out.println(value);
		
	}

}
