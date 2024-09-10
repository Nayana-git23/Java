package com.xworkz.equalsmethod.runner;

import com.xworkz.equalsmethods.Saaree;

public class SaareeRunner {

	public static void main(String[] args) {
		Saaree saaree=new Saaree("cotton","blue","Good",600,4.6,"Sagara");
		Saaree saaree1=new Saaree("cotton","blue","Good",600,4.6,"Sagara");
		boolean data=saaree.equals(saaree1);
		System.out.println(data);
		

	}

}
