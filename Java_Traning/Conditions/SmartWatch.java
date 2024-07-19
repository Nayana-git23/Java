class SmartWatch
{
public static void buySmartWatch(String brand,double price,int color,char type,int mode)
{
	System.out.println("Brand :"+brand);
	System.out.println("Price :"+price);
	System.out.println("Color :"+color);
	System.out.println("Type :"+type);
	System.out.println("Mode :"+mode);
	if(price>=299 && price<=99999)
	{
		System.out.println("Valid price");
	}
	else
	{
		System.out.println("Not avalid price");
	}
	if(color>=1 && color<=7)
	{
		System.out.println("Valid color");
	}
	else
	{
		System.out.println("Not a valid color");
	}
	if(type=='L' || type=='M' || type=='H')
	{
		System.out.println("Valid type");
	}
	else
	{
		System.out.println("Not a valid type");
	}
	if(mode>=1 && mode<=3)
	{
		System.out.println("VAlid mode");
	}
	else
	{
		System.out.println("Not a valid name");
	}
}
}
		
	
	
	