class KeyboardRunner
{
public static void main(String args[])
{
	Key key=new Key(20.2,"keyssmart");
	Keybunch keybunch=new Keybunch("Steel",key);
	keybunch.showcase();
	key. display();
	
	System.out.println("--------------------------------------");
	
	
	
	Key key1=new Key(20.2,"keysscore");
	Keybunch keybunch1=new Keybunch("copper",key);
	keybunch1.showcase();
	key1. display();
}
}