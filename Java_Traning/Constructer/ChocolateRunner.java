class ChocolateRunner
{
public static  void main(String args[])
{
	Chocolate chocolate=new Chocolate(130);
	chocolate.setFlavour("Orange");
	chocolate.size=2;
	chocolate.display();
	
	System.out.println("-----------------------------------");
	
	
	Chocolate chocolate1=new Chocolate(230);
	chocolate1.setFlavour("chocolate");
	chocolate1.size=3;
	chocolate1.display();
	
	System.out.println("-----------------------------------");
	
	Chocolate chocolate2=new Chocolate(330);
	chocolate2.setFlavour("hassel nut");
	chocolate2.size=4;
	chocolate2.display();
	
	
}
}
	