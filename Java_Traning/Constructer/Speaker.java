class Speaker
{
String brand;
int size;
double cost;
String output="good"; //using literal method


//using a constructer method
public Speaker(String brand)
{
	this.brand=brand;
}

//using setter method
public void setSize(int size)
{
	this.size=size;
}

//for just printing all vaues using printing method
public void display()
{
	System.out.println("output is :"+this.output);
	System.out.println("Brand is :"+this.brand);
	System.out.println("Size is :"+this.size);
	System.out.println("Cost is :"+this.cost);
}
}
	