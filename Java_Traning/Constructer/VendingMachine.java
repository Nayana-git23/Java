class VendingMachine
{
	Chip chip;
	//Chip chip=new Chip("Lays",20);
	String brand;
public VendingMachine(String brand,Chip chip)
{
	this.brand=brand;
	
}
public void print()
{
	System.out.println("Running in VendingMachine");
	System.out.println("brand "+this.brand);
	
	
	
}
}
