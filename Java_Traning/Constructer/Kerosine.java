class Kerosine
{
	double price;
	int quantity;
	boolean quality;
public Kerosine()
{
	System.out.println("Running in no parameter constructer");
}
public Kerosine(double price,int quantity,boolean quality)
{
	this.price=price;
	this.quantity=quantity;
	this.quality=quality;
	System.out.println(price);
	System.out.println(quantity);
	System.out.println(quality);
}
public Kerosine(double price)
{
	this.price=price;
	System.out.println(price);
}
public Kerosine(boolean quality)
{
	this.quality=quality;
	System.out.println(quality);
}
}

