class RocketRunner
{
public static void main(String args[])
{
	Rocket rocket=new Rocket("INDIA");
	rocket.setFuelCapacity(1550.50);
	rocket.noOfThruster=4;
	rocket.displayAll();
	
	System.out.println("-----------------------------------");
	
	
	Rocket rocket1=new Rocket("Japan");
	rocket1.setFuelCapacity(1650.50);
	rocket1.noOfThruster=4;
	rocket1.displayAll();
	
	
	System.out.println("-----------------------------------");
	
	
	Rocket rocket2=new Rocket("INDIA");
	rocket2.setFuelCapacity(1560.50);
	rocket2.noOfThruster=3;
	rocket2.displayAll();
}
}