package com.xworkz.equalsmethods;

public class State {

	private String stateName;
	private String capitalCity;
	private String sourceOfIncome;
	private int noOfDistricts;
	private int noOfMp;
	private int populationInCr;

	public State(String stateName, String capitalCity, String sourceOfIncome, int noOfDistricts, int noOfMp,
			int populationInCr) {
		super();
		this.stateName = stateName;
		this.capitalCity = capitalCity;
		this.sourceOfIncome = sourceOfIncome;
		this.noOfDistricts = noOfDistricts;
		this.noOfMp = noOfMp;
		this.populationInCr = populationInCr;
	}

	@Override
	public String toString() {
		return "State [stateName=" + stateName + ", capitalCity=" + capitalCity + ", sourceOfIncome=" + sourceOfIncome
				+ ", noOfDistricts=" + noOfDistricts + ", noOfMp=" + noOfMp + ", populationInCr=" + populationInCr
				+ "]";
	}
	
	
	@Override
	public boolean equals(Object obj) {
		if(obj!=null)
		{
			if(obj instanceof State)
			{
				State casted=(State)obj;
				if(this.noOfMp==casted.noOfMp && this.populationInCr==casted.populationInCr )
				{
					System.out.println("NO of MP and Population  are same");
					return true;
				}
			}
			else
			{
				System.out.println("Object is not same");
			}
		}
		else
		{
			System.out.println("Obj is null");
		}
		return super.equals(obj);
	}

}
