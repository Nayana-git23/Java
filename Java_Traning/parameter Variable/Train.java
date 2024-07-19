class Train
{
	
	
public static void book(String source,String destination)
{
System.out.println("booking method is  in Train class with 2 strings of parameter variable type");
System.out.println("Source :"+source +"   "+"Destination :"+destination);
}

public static void book(String source,String destination,int quantity)
{
System.out.println("booking method is  in Train class with 2 strings and one int variable of paramer variable");
System.out.println("Source :"+source +"   "+"Destination :"+destination + "   "+"Quantity  :" +quantity);
}

public static void book(String source,String destination,int quantity,double price)
{
System.out.println("booking method is  in Train class with 2 strings and one int variable of paramer variable");
System.out.println("Source :"+source +"   "+"Destination :"+destination + "   "+"Quantity  :" +quantity +"  "+"price :"+price);
}	

public static void cancel(String ticketNo)
{
	System.out.println("cancel methos is in Train class has 1 parameter of int type which belongs to parameter varaiable type");
	System.out.println("Ticket Number  : "+ticketNo);
	
}

public static void cancel(String source,String destination)
{
	System.out.println("cancel method with 2 String parameter");
	System.out.println("Source :"+source +"    " +"Destination : "+destination);
}
	
}

