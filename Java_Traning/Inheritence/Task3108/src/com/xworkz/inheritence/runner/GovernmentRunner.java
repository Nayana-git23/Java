package com.xworkz.inheritence.runner;

import com.xworkz.inhertence.CentralGovernment;
import com.xworkz.inhertence.Government;
import com.xworkz.inhertence.StateGovernment;

public class GovernmentRunner {

	public static void main(String[] args) {
		CentralGovernment centralGovernment=new CentralGovernment("Tamil Nadu",234," M K Stalin");
		centralGovernment.display1();
		Government sarkara=new StateGovernment("Karnataka",224,"SiddaRammih","G Parameshwar");
		sarkara.display();

	}

}
