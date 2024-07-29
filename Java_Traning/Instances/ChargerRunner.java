class ChargerRunner
{
public static void main(String args[])
{
	Charger charger=new Charger();
	charger.price=400;
	charger.watt=45;
	System.out.println(charger.price);
	System.out.println(charger.watt);
	System.out.println(charger.company);
	
	
	Crow crow=new Crow();
	crow.groupCows=50;
	crow.weight=500.50;
	System.out.println(crow.groupCows);
	System.out.println(crow.weight);
	System.out.println(crow.color);
	
	Clock clock=new Clock();
	clock.shape="Circle";
	clock.price=570;
	System.out.println(clock.shape);
	System.out.println(clock.price);
    System.out.println(clock.warrenty);
	
	
	Lollipop lollipop=new Lollipop();
	lollipop.price=3;
	lollipop.quantity=10;
	System.out.println(lollipop.price);
	System.out.println(lollipop.quantity);
	System.out.println(lollipop.flavour);
	
	
	Jeans jeans=new Jeans();
	jeans.color="blue";
	jeans.type="Cargo";
	System.out.println(jeans.color);
	System.out.println(jeans.type);
	System.out.println(jeans.brand);
	
	Mounatain mounatain=new Mounatain();
	mounatain.height=1110;
	mounatain.location="Himalaya";
	System.out.println(mounatain.height);
	System.out.println(mounatain.location);
	System.out.println(mounatain.mountainName);
	
	Keyboard keyboard=new Keyboard();
	keyboard.price=1200;
	keyboard.warrenty="1";
	System.out.println(keyboard.price);
	System.out.println(keyboard.warrenty);
	System.out.println(keyboard.company);
	
	Stadium stadium=new Stadium();
	stadium.seats=45000;
	stadium.location="bengaluru";
	System.out.println(stadium.seats);
	System.out.println(stadium.location);
	System.out.println(stadium.name);
	
	Spray spray=new Spray();
	spray.brand="collan";
	spray.price=34;
	System.out.println(spray.brand);
	System.out.println(spray.price);
	System.out.println(spray.name);
	
	Claw claw=new Claw();
	claw.nails=3;
	claw.weight=200;
	System.out.println(claw.nails);
	System.out.println(claw.weight);
	System.out.println(claw.species);
	
	
	
}
}
	