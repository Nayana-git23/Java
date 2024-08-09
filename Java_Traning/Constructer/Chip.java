class Chip
{
String name;
int price;
String type;
String flavour;

Chip(String name,int price)//to intialize instance variable during creation --use of constructer
{
	this.name=name;
	this.price=price;
}
public void setFlavour(String flavour)
{
	this.flavour=flavour;
}
public void show()
{
	System.out.println("Name :"+this.name);
	System.out.println("Price :"+this.price);
	System.out.println("Type :"+this.type);
	System.out.println("Flovour :"+this.flavour);
}
}