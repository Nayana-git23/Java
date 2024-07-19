class JuiceRunner
{
public static void main(String[] juice)
{
	if(juice.length==5)
	{
		String name=juice[0];
		String brand=juice[1];
		String flavour=juice[2];
		String price=juice[3];
		String quantity=juice[4];
		
		double convertedPrice=Double.parseDouble(price);
		int convertedQuantity=Integer.parseInt(quantity);
		//Juice.juiceInfo(name,brand,flavour,convertedPrice,convertedQuantity);
		Juice.juiceInfo("maaza","xyz","mango",50,2);
	}
	else
	{
		System.out.println("Required 5 arguments in command prompt only");
	}
}
}
		