package com.xworkz.inhertence;

public class CentralGovernment extends Government{
	
	public CentralGovernment(String state, int noOfMLAs, String partyHeadName)
	{
		super(state,noOfMLAs,partyHeadName);
		System.out.println("Running in Central Government");
	}

	
	
}
