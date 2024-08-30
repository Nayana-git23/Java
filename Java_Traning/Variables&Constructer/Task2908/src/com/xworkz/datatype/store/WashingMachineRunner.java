package com.xworkz.datatype.store;

import com.xworkz.datatype.main.WashingMachine;
import com.xworkz.datatype.runner.Abisheik;
import com.xworkz.datatype.runner.Bhumika;
import com.xworkz.datatype.runner.Lakshmi;
import com.xworkz.datatype.runner.Megha;
import com.xworkz.datatype.runner.Nayana;

public class WashingMachineRunner {
	
public static void main(String[] args) {
		
		Megha megha=new Megha();
		megha.wash();
		System.out.println("-----------------------");
		
		
		WashingMachine washingmachine=new WashingMachine("Onida","top-load",7);
		Lakshmi lakshmi=new Lakshmi();
		lakshmi.load(washingmachine);
		System.out.println("-----------------------");
		
		Nayana nayana=new Nayana();
		nayana.addFabricConditioner();
		System.out.println("-----------------------");
		
		Bhumika bhumika=new Bhumika();
		bhumika.powerOff();
		System.out.println("-----------------------");
		
		Abisheik abhishek=new Abisheik(washingmachine);
		abhishek.powerOn();

		
}
}
