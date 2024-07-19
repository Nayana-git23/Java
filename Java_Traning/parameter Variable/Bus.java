class Bus
{
public static void standName(String name)
{
System.out.println("Running in method standName and class Bus");
System.out.println("Name : "+name);
}

public static void aboutBus(String busCompany,String busNo,String color )
{
System.out.println("Running in method drivenBy and class Bus");
System.out.println("busComapany : "+busCompany +"  "+"BusNo : "+busNo +"  "+"color : "+color  );
}

public static void ticket(String source,String destination,int cost)
{
	
System.out.println("Running in method ticket and class Bus");
System.out.println("Source "+source +"   " +"Destination : "+destination  +"  " +"Cost : " +cost);
}

public static void seats(int seats)
{
	System.out.println("Running in method seats and class Bus");
	System.out.println("NO of Seats : "+seats);
	
}

public static void engine(String engineNo,Double fuelCapacity,String engineOil,String size,boolean maintence)
{
System.out.println("Running in engine of class Bus");
System.out.println("EngineNo :"+engineNo);
System.out.println("Fuel capacity  :"+fuelCapacity);
System.out.println("Engine Oil :"+engineOil);
System.out.println("Engine Size  :" +size);
System.out.println("Maintaince  :"+maintence);
}

 
} 