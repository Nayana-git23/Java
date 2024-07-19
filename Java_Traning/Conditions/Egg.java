class Egg
{
public static void buyEgg(int total,double pricePerEgg)
{
	System.out.println("Total No of Eggs :"+total);
	System.out.println("Price Per Egg :"+pricePerEgg);
	if(total>=1 && total<=1000)
	{
		System.out.println("Total count is valid");
	}
	else
	{
		System.out.println("Total count is not valid");
	}
	if(pricePerEgg>=8 && pricePerEgg<=25)
	{
		System.out.println("Price per Egg is valid");
	}
	else{
		System.out.println("Price per egg not valid");
	}
}
}
	