class Rocket
{
	String country;
	String speed="3L m/s";
	double  fuelCapacity;
	int noOfThruster;
	
	public Rocket(String country)
	{
		this.country=country;
	}
	public void setFuelCapacity(double fuelCapacity)
	{
		this.fuelCapacity=fuelCapacity;
	}
	public void displayAll()
	{
		System.out.println("Country is :"+this.country);
		System.out.println("Speed of Rocket"+this.speed);
		System.out.println("Fuel Capacity Rocket"+this.fuelCapacity);
		System.out.println("No Of Thurster"+this.speed);
	}
}