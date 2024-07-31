class Cap
{


	double price;
	String color;
public Cap(double priceLocal,String colorLocal)
{
	System.out.println("Running in Cap");
	System.out.println(priceLocal);
	System.out.println(colorLocal);
}
}

class  Gold
{
	double price;
	double qantity;
	
public Gold(double priceLocal,double qantityLocal)
{
	System.out.println("Running in Gold");
	System.out.println(priceLocal);
	System.out.println(qantityLocal);
}
}

class Board
{
	String color;
	double sizeInFeet;
public Board(String colorLocal,double sizeInFeetLocal)
{
	System.out.println("Rinning in Board");
	System.out.println(colorLocal);
	System.out.println(sizeInFeetLocal);
}
}

class Led
{
	boolean isWorking;
	double price;
public Led(boolean isWorking,double price)
{
	System.out.println("Running in Led");
	System.out.println(isWorking);
	System.out.println(price);
}
}

class SimCard
{
	String provider;
	boolean isActive;
	
SimCard(String providerLocal,boolean isActiveLocal)
{
	System.out.println("Running in simCard");
	System.out.println(providerLocal);
	System.out.println(isActiveLocal);
}
}

	
	
	
	