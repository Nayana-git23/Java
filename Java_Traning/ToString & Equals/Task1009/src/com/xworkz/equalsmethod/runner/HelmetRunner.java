package com.xworkz.equalsmethod.runner;

import com.xworkz.equalsmethods.Helmet;

public class HelmetRunner {

	public static void main(String[] args) {
		Helmet helmet=new Helmet("HeadSafe","balck","fibre","good",2000,2);
		Helmet helmet1=new Helmet("HeadSafe","balck","fibre","good",2000,2);
		
		boolean bike=helmet.equals(helmet1);
		System.out.println(bike);

	}

}
