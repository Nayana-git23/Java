class Biryani
{
String type; //ref
double price; //constru
int quantity; //setter
String  resturentName="Donne biriyani";


public Biryani(double price)
{
	this.price=price;
}
public void setQuantty(int quantity)
{
	this.quantity=quantity;
}
public void display()
{
	
	System.out.println("Resturent name :"+this.resturentName);
	System.out.println("Price :"+this.price);
	System.out.println("Quantity :"+this.quantity);
}
}