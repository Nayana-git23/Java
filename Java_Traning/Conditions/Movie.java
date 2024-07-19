class Movie
{
public static void bookMovieTicket(String name,String theaterName,int quantity,double price)
{
	System.out.println(" Name :"+name);
	System.out.println("  Theater Name"+theaterName);
	System.out.println("Quantity  "+quantity);
	System.out.println("Price :"+price);
	
	if(quantity>=1 && quantity<=10)
	{
			System.out.println("Qantity is valid  ");
	}
	else
	{
			System.out.println(" Qantity is not valid ");
	}
	if(price>=150 && price<=1000)
	{
			System.out.println("price is a valid  ");
	}
	else
	{
			System.out.println("price is not valid ");
	}
}
}