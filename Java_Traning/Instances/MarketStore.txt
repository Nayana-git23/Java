package com.xworkz.custum.dataRunner;

import com.xworkz.custum.data.MarketData;

public class MarketStore {
	
	MarketData[] marketData=new MarketData[5];
	int index;
	
	public void store(MarketData marketName)
	{
		this.marketData[this.index]=marketName;
		this.index++;
	}
	public void show()
	{
		for(MarketData ref:marketData)
		{
			if(ref!=null)
			{
				ref.display();
				System.out.println("----------------------------------");
			}
			else
			{
				System.out.println("Data is null");
			}
		}
	}

}
