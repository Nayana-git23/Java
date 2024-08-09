class Paper1
{
double length;
String color;
String manuCompany;
double price=230;


public Paper1()
{
	System.out.println("Rinning in paper1");
}
	
public Paper1(double length)
{
this.length=length;
}
public void setColor(String color)
{
this.color=color;
}
public void show()
{
System.out.println(this.length);
System.out.println(this.color);
System.out.println(this.manuCompany);
System.out.println(this.price);
}
}

