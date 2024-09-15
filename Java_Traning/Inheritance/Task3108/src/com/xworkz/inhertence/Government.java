package com.xworkz.inhertence;

public class Government {

	
	private String State;
	private int noOfMLAs;
	private String partyHeadName;
	private String HomeMinsiter;
	
	
	public Government(String state, int noOfMLAs, String partyHeadName, String homeMinsiter) {
		super();
		State = state;
		this.noOfMLAs = noOfMLAs;
		this.partyHeadName = partyHeadName;
		HomeMinsiter = homeMinsiter;
	}


	public Government(String state, int noOfMLAs, String partyHeadName) {
		super();
		State = state;
		this.noOfMLAs = noOfMLAs;
		this.partyHeadName = partyHeadName;
	}
	
	public void display()
	{
		System.out.println("State  :"+this.State);
		System.out.println("No Of MLA's  :"+this.noOfMLAs);
		System.out.println("Party Head Name  :"+this.partyHeadName);
		System.out.println("Home Minister  :"+this.HomeMinsiter);
		
		
		
	}
	
	public void display1()
	{
		System.out.println("State  :"+this.State);
		System.out.println("No Of MLA's  :"+this.noOfMLAs);
		System.out.println("Party Head Name  :"+this.partyHeadName);
		System.out.println("---------------------------------------------------");
		
		
	}
	
	
}
