class Mask
{
	double cost;
	int size;
	String material;
public Mask()
{
	System.out.println("Running in no parameter constructer");
}
public Mask(double cost)
{
	this.cost=cost;
	System.out.println(cost);
}
public Mask(int size)
{
	this.size=size;
	System.out.println(size);
}
public Mask(String material)
{
	this.material=material;
	System.out.println(material);
}
public Mask(double cost,int size,String material)
{
	this.cost=cost;
	this.size=size;
	this.material=material;
	System.out.println(cost);
	System.out.println(size);
	System.out.println(material);
}
public Mask(double cost ,int size)
{
	this.cost=cost;
	this.size=size;
	System.out.println(cost);
	System.out.println(size);
	
}
}
	