package com.xworkz.task;

public class River {
	String[] rivers=new String[7];
	int index;
	
	public void riverNames(String riverName)
	{
		this.rivers[this.index]=riverName;
		index++;
	}
	
	public void display()
	{
		for(String nadi:rivers)
		{
			System.out.println(nadi);
		}
	}

}
