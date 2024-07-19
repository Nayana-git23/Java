class ReturnType
{
	public static double price(String medicineName)
	{
		if(medicineName=="Paracetemol")
		{
			return 23.5;
		}
		if(medicineName=="zocor")
		{
			return 88.88;
		}
		if(medicineName=="zestril")
		{
			return 78.99;
		}
		System.out.println("No price is entered");
		return 0;
	}
	
	public static String medicineName(String symptom)
	{
		if(symptom=="cold")
		{
			return "Paracetmeol";
		}
		if(symptom=="fever")
		{
			return "zocor";
			}
		if(symptom=="headache")
		{
			return "zocor";
			}
			return "No medicine Found";
	}
	
	public static String availability(String doctor)
	{
		if(doctor=="Aishwarya kalyan")
		{
			return "Morning";
		}
		
		if(doctor=="Rashmi C")
		{
			return "Evening";
		}
		if(doctor=="Ashwini")
		{
			return "Midnight";
		}
		return "No slot avaliable";
	}
		
}
			