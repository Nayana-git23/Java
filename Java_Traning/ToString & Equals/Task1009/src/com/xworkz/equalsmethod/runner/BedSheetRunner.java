package com.xworkz.equalsmethod.runner;

import com.xworkz.equalsmethods.BedSheet;

public class BedSheetRunner {

	public static void main(String[] args) {
		BedSheet bedSheet=new BedSheet("Cotton",2.5,"Maroon","sleepwell",5,3);
		BedSheet bedSheet1=new BedSheet("wool",2.5,"Maroon","sleepwell",5,3);
		boolean storage=bedSheet.equals(bedSheet1);
		System.out.println(storage);
		
		
		

	}

}
