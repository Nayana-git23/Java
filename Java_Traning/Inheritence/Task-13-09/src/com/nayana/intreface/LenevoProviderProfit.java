package com.nayana.intreface;

public class LenevoProviderProfit extends Provider {
	
	private double profit;

	
	
	
	
	public LenevoProviderProfit(String name, String ceo, double profit) {
		super(name, ceo);
		this.profit = profit;
		System.out.println(this.profit);
	}





	@Override
	public  void service()
	{
		System.out.println("running in LenevoProviderProfit");
	}


}
