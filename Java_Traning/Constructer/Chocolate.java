class Chocolate
{
	String brand="Cadberry";
	double price;
	String flavour;
	int size;
	
	public Chocolate(double price)
	{
		this.price=price;
	}
	public void setFlavour(String flavour)
	{
		this.flavour=flavour;
	}
	public void display()
	{
		System.out.println(this.brand);
		System.out.println(this.price);
		System.out.println(this.flavour);
		System.out.println(this.size);
	}
}