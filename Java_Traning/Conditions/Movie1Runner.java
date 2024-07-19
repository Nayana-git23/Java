class Movie1Runner
{
public static double movieTicket(String name)
{
	if(name=="majali")
	{
		System.out.println("valid  price ");
		return 200; 
	}
	else
	{
		System.out.println("Inalid price ");
		return 250;
		
	}

}

public static void main(String args[])
{
	double price=Movie1.movieTicket("majali");
	System.out.println(price);
		double price1=Movie1.movieTicket("bahubali");
	System.out.println(price1);
	
}
}
	
	
	