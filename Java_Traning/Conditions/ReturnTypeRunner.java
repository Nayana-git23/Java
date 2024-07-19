class ReturnTypeRunner
{
	public static void main(String args[])
	{
		System.out.println("Price is :" +ReturnType.price("Paracetemol"));
		System.out.println("Price is :" +ReturnType.price("zocor"));
		System.out.println("Price is :" +ReturnType.price("zestril"));
		System.out.println(ReturnType.price("Lipitor"));
		
		System.out.println("------------------------------------------------");
		System.out.println("cold :"+ReturnType.medicineName("cold"));
		System.out.println("fever :"+ReturnType.medicineName("fever"));
		System.out.println("headache: "+ReturnType.medicineName("headache"));
		System.out.println(ReturnType.medicineName("bodyache"));
		
		
		System.out.println("------------------------------------------------");
		System.out.println("Aishwarya kalyan: "+ReturnType.availability("Aishwarya kalyan"));
		System.out.println("Rashmi C  :" +ReturnType.availability("Rashmi C"));
		System.out.println("Ashwini :"+ReturnType.availability("Ashwini"));
		System.out.println(ReturnType.availability("Guru prasad"));
		
		
		
		
		
	
	}
	
	
}