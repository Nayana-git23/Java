class RupeeeRunner
{
	public static void main(String[] args)
	{
		Rupeee rupeee=new Rupeee();
		int rupeeValue=rupeee.rupeeValue;
	
		String features=rupeee.features;

		String manufactureDate=rupeee.manufactureDate;
		System.out.println(rupeeValue);
		System.out.println(features);
		System.out.println(manufactureDate);
		
		
		System.out.println("-----------------------------");
		AirCondition airCondition=new AirCondition();
		System.out.println(airCondition.tempreture);
		System.out.println(airCondition.humidity);
		System.out.println(airCondition.isAirConditionGood);
		
		
		System.out.println("-----------------------------");
		AutoRikshaw autoRikshaw=new AutoRikshaw();
		System.out.println(autoRikshaw.licienceNo);
		System.out.println(autoRikshaw.AutoNo);
		System.out.println(autoRikshaw.autoDriverNsme);
		
		System.out.println("-----------------------------");
		 AutuDriver  autuDriver=new  AutuDriver();
		 System.out.println(autuDriver.driverName);
		 System.out.println(autuDriver.Adharno);
		 System.out.println(autuDriver.autoNo);
		 
		 
		System.out.println("--------------------------------------");
		Rapido rapido=new Rapido();
		System.out.println(rapido.location);
		System.out.println(rapido.bookingNo);
		System.out.println(rapido.paymentDetails);
				
		System.out.println("--------------------------------------");
		CabCompany cabCompany=new CabCompany();
		System.out.println(cabCompany.Company);
		System.out.println(cabCompany.booking);
		System.out.println(cabCompany.bookingNo);
		
		
		System.out.println("--------------------------------------");
		Bmtc bmtc=new Bmtc();
		System.out.println(bmtc.location);
		System.out.println(bmtc.busNo);
		System.out.println(bmtc.ticketPrice);
		
		System.out.println("--------------------------------------");
		 FoodDelivaryCompany  foodDelivaryCompany=new  FoodDelivaryCompany();
		System.out.println(foodDelivaryCompany.company);
		System.out.println(foodDelivaryCompany.id);
		System.out.println(foodDelivaryCompany.location);
		
		
				
		
	}
}
		
	