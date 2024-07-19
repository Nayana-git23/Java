class  MethodReturnType
{
public static String country(int code)
{
	//System.out.println("country runnning in MethodReturnType");
	if(code==91)
	{
		return "INDIA";
	}
	if (code==1)
	{
		return "Canada";
	}
	if (code==61)
	{
		return "Australia";
	}
	if (code==44)
	{
		return "United kingdom";
	}
	if(code==977)
	{
		return "Nepal";
	}
	//System.out.println("Country is not available for this Code");
	return "Code is not avilable";
}


public static double price(String item)
{
	if(item=="Mobile")
	{
		return 18000;
	}
	if(item=="Vegetable")
	{
		return 300;
	}
	if(item=="Grociries")
	{
		return 1140;
	}
	if(item=="Shoes")
	{
		return  550;
	}
	if(item=="apple")
	{
		return 200;
	}
	System.out.println("item has no cost");
	return 0;
}


public static String producer(String movie)
{
	if(movie=="Gaalipata")
	{
		return "A M Rathnam";
	}
	if(movie=="3 Idiots")
	{
		return "Vidhu Vinod Chopra";
	}
	if(movie=="Sanam Teri kasam")
	{
		return "Deepak Mukut";
	}
	if(movie=="KGF")
	{
		return "Hombale Films";
	}
	if(movie=="Charlie")
	{
		return "Rakshith Shetty";
	}
	
	return "This Movie has no producer name here";
}
}
		
	