package com.xworkz.inheritence.runner;

import com.xworkz.inhertence.Market;
import com.xworkz.inhertence.OnlineMarket;
import com.xworkz.inhertence.SuperMarket;

public class MarketRunner {
	public static void main(String args[])
	{
		SuperMarket superMarket=new SuperMarket("Vishal Mart","davanagere",10,"Home accries");
		superMarket.print();
		Market angadi=new OnlineMarket("FlipKart",25,"all");
		angadi.print();
	}

}
