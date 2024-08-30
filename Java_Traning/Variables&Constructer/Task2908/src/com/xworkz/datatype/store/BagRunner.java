package com.xworkz.datatype.store;

import com.xworkz.datatype.main.Bag;
import com.xworkz.datatype.runner.Akash;
import com.xworkz.datatype.runner.Bavana;
import com.xworkz.datatype.runner.Priya;
import com.xworkz.datatype.runner.Ranju;

public class BagRunner {
	public static void main(String[] args) {


		Priya priya=new Priya();
		priya.zip();
		System.out.println("-----------------------------");

		Bag bag=new Bag("Super dry",3000,"black");
		Bavana bavana=new Bavana();
		bavana.unzip(bag);
		System.out.println("-----------------------------");

		Ranju ranju=new Ranju(bag);
		ranju.store();
		System.out.println("-----------------------------");

		Bag bag1=new Bag("Daily objects",2000,"black");
		Akash akash=new Akash();
		akash.tear(bag1);

}
}