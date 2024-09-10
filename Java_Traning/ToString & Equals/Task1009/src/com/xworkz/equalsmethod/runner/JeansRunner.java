package com.xworkz.equalsmethod.runner;

import com.xworkz.equalsmethods.Jeans;

public class JeansRunner {
	public static void main(String args[])
	{
		Jeans jeans=new Jeans("levis",28,1200,4,"rajajinagar","blue");
		Jeans jeans1=new Jeans("blackblue",28,1200,4,"sagara","black");
		boolean store=jeans.equals(jeans1);
		System.out.println(store);
	}

}
