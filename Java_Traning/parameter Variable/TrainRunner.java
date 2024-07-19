class TrainRunner
{
public static void main(String args[])
{
	System.out.println("running in main method");
	Train.book("Bangaluru","Sagara");
	Train.book("Bangaluru","Davanagere",2);
	Train.book("Bangaluru","Davanagere",2,550.50);
	Train.cancel("BT202");
	Train.cancel("Benagluru","Talaguppa");
	//Bus.standName("old police station");
}
}
