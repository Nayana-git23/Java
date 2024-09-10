package com.xworkz.equalsmethods;

public class CreditCard {
	
	private String nameOfCard;
	private String issuedBank;
	private String cardHolder;
	private int validityYears;
	private long cardNumber;
	private int cvv;
	
	
	
	public CreditCard(String nameOfCard, String issuedBank, String cardHolder, int validityYears, long cardNumber,
			int cvv) {
		super();
		this.nameOfCard = nameOfCard;
		this.issuedBank = issuedBank;
		this.cardHolder = cardHolder;
		this.validityYears = validityYears;
		this.cardNumber = cardNumber;
		this.cvv = cvv;
	}



	@Override
	public String toString() {
		return "CreditCard [nameOfCard=" + nameOfCard + ", issuedBank=" + issuedBank + ", cardHolder=" + cardHolder
				+ ", validityYears=" + validityYears + ", cardNumber=" + cardNumber + ", cvv=" + cvv + "]";
	}
	
	
	@Override
	public boolean equals(Object obj) {
		if(obj!=null)
		{
			if(obj instanceof CreditCard)
			{
				CreditCard casted=(CreditCard)obj;
				if(this.validityYears==casted.validityYears && this.cvv==casted.cvv )
				{
					System.out.println("Validity years and CVV  are same");
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
