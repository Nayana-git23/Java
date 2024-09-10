package com.xworkz.equalsmethod.runner;

import com.xworkz.equalsmethods.CreditCard;

public class CreditCardRunner {
	
	public static void main(String args[])
	{
		CreditCard creditCard=new CreditCard("Rupay","Canara bank","harsha",4,12356778l,444);
		CreditCard creditCard1=new CreditCard("Rupay","Canara bank","harsha",5,12356778l,444);
		boolean card=creditCard.equals(creditCard1);
		System.out.println(card);
		
		
	}

}
