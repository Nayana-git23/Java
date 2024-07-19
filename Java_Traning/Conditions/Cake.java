class Cake
{
public static void buyCake(char size,String type,String flavour,double cost,int quantity)
{
	System.out.println("Size of cake :"+size);
	System.out.println("Type of cake :"+type);
	System.out.println("Flavour of cake :"+flavour);
	System.out.println("Cost of cake :"+cost);
    System.out.println("Qantity of cake "+quantity);
	
	if(size=='S' || size=='M' || size=='B')
	{
		System.out.println("It's a valid size");
	}
	else{
		System.out.println("It's not a valid size");
}


if(cost>=150 && cost<=100000)
{
	
	System.out.println("Cost is valid");
}
else{
	System.out.println("Cost is not valid");
}


if(quantity>=1 && quantity<=100)
{
	System.out.println("quantity is valid");
}
else
{
	System.out.println("Quantity is not valid");
}
}
}

				
	