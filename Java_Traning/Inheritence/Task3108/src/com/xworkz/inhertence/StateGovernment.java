package com.xworkz.inhertence;

public class StateGovernment extends Government{
	
	public StateGovernment(String state, int noOfMLAs, String partyHeadName, String homeMinsiter)
	{
		super(state,noOfMLAs,partyHeadName,homeMinsiter);
		System.out.println("Running in StateGovernment");
		
	}

}
