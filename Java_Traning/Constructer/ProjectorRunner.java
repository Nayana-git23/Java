class ProjectorRunner
{
public static void main(String args[])
{
	Projector projector=new Projector("EPSON");
	projector.setColor("Pink");
	projector.type="OLED";
	projector.display();
	
	System.out.println("-----------------------------------");
	
	Projector projector1=new Projector("SAMSUNG");
	projector1.setColor("black");
	projector1.type="LCD";
	projector1.display();
	
	System.out.println("-----------------------------------");
	
	Projector projector2=new Projector("DELL");
	projector2.setColor("black");
	projector2.type="LED";
	projector2.display();
}
}
	