class Ele
{
public static int price(String electronic)
{
String[ ] eleItem={"Tv","Refregerator","mobile","Laptop","tablet","Washing achine","Radio","ac","stove","charger"};
for(int i=0;i<10;i++)
{
	if(electronic == eleItem[i] && eleItem[i]=="Tv")
	{
		return 23000;
	}
	else if(electronic == eleItem[i] && eleItem[i]=="mobile")
	{
		return 40000;
	}
	else if(electronic == eleItem[i] && eleItem[i]=="Refregerator")
	{
		return 90000;
	}
	else if(electronic == eleItem[i] && eleItem[i]=="Laptop")
	{
		return 34000;
	}
	else if(electronic == eleItem[i] && eleItem[i]=="tablet")
	{
		return 45000;
	}
	else if(electronic == eleItem[i] && eleItem[i]=="Washing achine")
	{
		return 75000;
	}
	else if(electronic == eleItem[i] && eleItem[i]=="Radio")
	{
		return 70000;
	}
	else if(electronic == eleItem[i] && eleItem[i]=="ac")
	{
		return 560000;
	}
	else if(electronic == eleItem[i] && eleItem[i]=="stove")
	{
		return 50000;
	}
	else if(electronic == eleItem[i] && eleItem[i]=="charger")
	{
		return 45000;
	}
	else
	{
		System.out.println("Not found");
	}
			
	
			
		
	
}
return 0;
}
public static void main(String args[])
{
	int price=price("Refregerator");
	System.out.println(price);
}
}

	