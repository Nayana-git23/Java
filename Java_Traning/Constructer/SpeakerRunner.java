class SpeakerRunner
{
public static void main(String args[])
{
	Speaker speaker=new Speaker("BOAT");
	//using refrence method
	speaker.cost=23000;
	System.out.println("Using a refrerence method");

	
	System.out.println("using constructer calling method");
	
	speaker.setSize(2);
	System.out.println("using a setter method");
	speaker.display();
	
	
	Speaker speaker1=new Speaker("Samsung");
	speaker1.setSize(3);
	speaker1.cost=24000;
	speaker1.display();
	
	
	Speaker speaker2=new Speaker("Samsung");
	speaker2.setSize(3);
	speaker2.cost=24000;
	speaker2.display();
	
}
}
	