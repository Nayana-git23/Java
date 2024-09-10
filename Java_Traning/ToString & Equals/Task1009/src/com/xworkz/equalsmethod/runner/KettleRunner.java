package com.xworkz.equalsmethod.runner;

import com.xworkz.equalsmethods.Kettle;

public class KettleRunner {
	public static void main(String args[])
	{
		Kettle kettle=new Kettle("Stainless steel","butterfly",1000,2,2,4.5);
		Kettle kettle1=new Kettle("Stainless steel","butterfly",1000,2,2,4.5);
		
		boolean container=kettle1.equals(kettle);
		System.out.println(container);
		
		
	}

}
