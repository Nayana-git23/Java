package com.xworkz.imports;

public class StaticBlock {
	
	static int bear;
	
	
	static
	{
		bear=19;
		System.out.println("Running in static block");
	}
	
	
	public static void main(String[] args) {
		System.out.println(StaticBlock.bear);
	}

}
