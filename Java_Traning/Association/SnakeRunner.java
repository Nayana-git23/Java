class SnakeRunner
{
	//ctrl+shift+f
	public static void main(String args[])
	{
	Snake snake=new Snake("king cobra",7,"venemous");
	Snake snake1=new Snake(" cobra",7,"venemous");
	Snake snake2=new Snake("anaconda",7," not venemous");
	
	Snake[] ref=new Snake[3];
	ref[0]=snake;
	ref[1]=snake1;
	ref[3]=snake2;
	for(Snake haavu:ref)
		System.out.println(haavu);
	haavu.print();
}
}

	