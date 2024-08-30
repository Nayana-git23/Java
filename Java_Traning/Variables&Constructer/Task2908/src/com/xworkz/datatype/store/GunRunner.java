package com.xworkz.datatype.store;

import com.xworkz.datatype.main.Gun;
import com.xworkz.datatype.runner.Dboss;
import com.xworkz.datatype.runner.Godse;
import com.xworkz.datatype.runner.Police;
import com.xworkz.datatype.runner.Soilder;

public class GunRunner {
	
	public static void main(String[] args) {
		
		Soilder soldier=new Soilder();
		soldier.shoot();
		System.out.println("------------------------------");
		
		
		Police police=new Police();
		police.load(new Gun("AMT","India","Pistol"));
		System.out.println("------------------------------");
		
		Gun gun=new Gun("Armsel","India","shotgun");
		Dboss dboss=new Dboss(gun);
		dboss.killed();
		System.out.println("------------------------------");
		
		Godse godse=new Godse();
		godse.fire(gun);


	}


}
