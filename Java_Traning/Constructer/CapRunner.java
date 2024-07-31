class CapRunner
{
public static void main(String args[])
{
	Cap cap=new Cap(50,"black");
	Cap cap1=new Cap(50,"sky blue");
	Cap cap2=new Cap(50,"blue");
	Cap cap3=new Cap(50,"dark green");
	Cap cap4=new Cap(50,"brown");
	Cap cap5=new Cap(50,"red");
	Cap cap6=new Cap(50,"pink");
	Cap cap7=new Cap(50,"maron");
	Cap cap8=new Cap(50,"orange");
	Cap cap9=new Cap(50,"yellow");
	Cap cap10=new Cap(50,"purple");
	
	System.out.println("---------------------------------------");
	
	Gold gold=new Gold(2,6900);
	Gold gold1=new Gold(3,6900);
	Gold gold2=new Gold(5,6900);
	Gold gold3=new Gold(10,6900);
	Gold gold4=new Gold(24,6900);
	Gold gold5=new Gold(25,6900);
	Gold gold6=new Gold(23,6900);
	Gold gold7=new Gold(23,6900);
	Gold gold8=new Gold(22,6900);
	Gold gold9=new Gold(21,6900);
	Gold gold10=new Gold(12,6900);
	
	System.out.println("---------------------------------------");
	
	Board board=new Board("black",45);
	Board board1=new Board("white",67);
	Board board2=new Board("black",66);
	Board board3=new Board("white",42);
	Board board4=new Board("black",48);
	Board board5=new Board("white",49);
	Board board6=new Board("black",78);
	Board board7=new Board("white",45);
	Board board8=new Board("black",45);
	Board board9=new Board("white",49);
	Board board10=new Board("black",89);
	Board board11=new Board("white",45);
	
		System.out.println("---------------------------------------");
	
	Led led=new Led(true,3000);
	Led led1=new Led(false,4500);
	Led led2=new Led(true,3000);
	Led led3=new Led(false,4500);
	Led led4=new Led(true,3000);
	Led led5=new Led(false,4500);
	Led led6=new Led(true,3000);
	Led led7=new Led(false,4500);
	Led led8=new Led(true,3000);
	Led led9=new Led(false,4500);
	Led led10=new Led(true,3000);
	
		System.out.println("---------------------------------------");
		
	SimCard simCard=new SimCard("Airtel",true);
	SimCard simCard1=new SimCard("BSNL",false);
	SimCard simCard2=new SimCard("Airtel",true);
	SimCard simCard3=new SimCard("BSNL",false);
	SimCard simCard4=new SimCard("JIO",true);
	SimCard simCard5=new SimCard("IDEA",false);
	SimCard simCard6=new SimCard("Airtel",true);
	SimCard simCard7=new SimCard("BSNL",false);
	SimCard simCard8=new SimCard("DOCEMO",true);
	SimCard simCard9=new SimCard("TATA",false);
	SimCard simCard10=new SimCard("Jio",false);
	
}
}