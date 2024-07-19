class Country
{
public static void state(String[] statesName)
{
	for(int count=0;count<statesName.length;count++)
	{
		String ref=statesName[count];
		System.out.println(count);
		System.out.println("Name of State is :"+ref);
	}
}



public static void PoliticalParties(String[] partyNames)
{
	for(int number=0;number<partyNames.length;number++)
	{
		String ref=partyNames[number];
		System.out.println(number);
		System.out.println("Political Party name :"+ref);
	}
		
		
}
public static void primeMinister(String[] primeMinister)
{
	for(int number=0;number<primeMinister.length;number++)
	{
		String ref=primeMinister[number];

		System.out.println(number);
		System.out.println("Name of Prime Minister :"+ref);
	}
}

public static void pinCode(int[] pinCode)
{
	for(int count=0;count<pinCode.length;count++)
	{
		int ref=pinCode[count];
		System.out.println(count);
		System.out.println("Pin Code are :"+ref);
	}
}

public static void cabinetMinister(String[] Ministers)
{
	
	for(int count=0;count<Ministers.length;count++)
	{
		String ref=Ministers[count];
		System.out.println(count);
		System.out.println("Cabinet Minister Name :"+ref);
	}
		
}
public static void stateBackward(String[] statesName)
{
	for(int count=statesName.length-1;count>=0;count--)
	{
		String ref=statesName[count];
		System.out.println(count);
		System.out.println("Name of State is :"+ref);
	}
}

public static void PoliticalPartiesBackwards(String[] partyNames)
{
	for(int number=partyNames.length-1;number>=0;number--)
	{
		String ref=partyNames[number];
		System.out.println(number);
		System.out.println("Political Party name :"+ref);
	}
		
		
}

public static void primeMinisterBackward(String[] primeMinister)
{
	for(int number=primeMinister.length-1;number>=0;number--)
	{
		String ref=primeMinister[number];

		System.out.println(number);
		System.out.println("Name of Prime Minister :"+ref);
	}
}

public static void pinCodeBackward(int[] pinCode)
{
	for(int count=pinCode.length-1;count>=0;count--)
	{
		int ref=pinCode[count];
		System.out.println(count);
		System.out.println("Pin Code are :"+ref);
	}
}

public static void cabinetMinisterBackward(String[] ministers)
{
	
	for(int count=ministers.length-1;count>=0;count--)
	{
		String ref=ministers[count];
		System.out.println(count);
		System.out.println("Cabinet Minister Name :"+ref);
	}
		
}

}