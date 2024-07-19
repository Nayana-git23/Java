class VegetableRunner
{
public static double price(String veggieName)
{
	if(veggieName=="Onion")
	{
		return 30;
	}
	else if (veggieName=="Potato")
	{
		return 42;
	}
	else if (veggieName=="Cocumber")
	{
		return 40;
	}
	else if (veggieName=="Garlic")
	{
		return 100;
	}
	else if(veggieName=="Carrort")
	{
		return 30;
	}
	return 0;
}
public static void main(String args[])
{
	 System.out.println(price("Onion"));
	 System.out.println(price("Potato"));
	 System.out.println(price("Cocumber"));
	 System.out.println(price("Garlic"));
	 System.out.println(price("Carrort"));
}
}
	 
	