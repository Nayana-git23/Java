package com.xworkz.inheritence.runner;

import com.xworkz.inhertence.MetroTrain;
import com.xworkz.inhertence.SubUrban;
import com.xworkz.inhertence.Train;

public class TrainRunner {
	
	public static void main(String args[])
	{
		MetroTrain metroTrain=new MetroTrain(101,"Banglore","Anandapura");
		metroTrain.print();
		Train details=new SubUrban("Bengaluru","Sagara");
		details.print();
	
	}

}
