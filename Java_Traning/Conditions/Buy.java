class Buy
{
	
	//One
public static void product(String brand,double price)
{
	System.out.println("Brand :"+brand);
	System.out.println("Price :"+price);
	
if(price>10 && price<=10000)
{
	
System.out.println("Product price is valid");
}
else
{
	System.out.println("Product price is not valid");
}
}

//Two
public static void product(String name,int quantity,String quantityy,double price)
{
	System.out.println("Name :"+name);
	System.out.println("Quantity :"+quantity);
	System.out.println("Quantity :"+quantityy);
	System.out.println("Price :"+price);
	
	if(quantity>=1 && quantity<=50)
	{
		System.out.println("Qantity is valid");
	}
	else
	{
	System.out.println("Qantity is not valid");
	}
	if(price>=1 && price<=1000)
	{
		System.out.println("price is valid");
	}
	else
	{
		System.out.println("price is not valid");
	}
}
		
		
}