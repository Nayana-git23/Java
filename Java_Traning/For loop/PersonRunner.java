class PersonRunner
{
public static void main(String[] person)
{
	System.out.println("Start of main method");
	if(person.length==4)
	{
		
	
		String name=person[0];
		String email=person[1];
		String age=person[2];
		String password=person[3];
		System.out.println(name);
		System.out.println(email);
		System.out.println(age);
		System.out.println(password);
	}
		
		else
		{
			System.out.println("Not valid");
		}
	
		
	System.out.println("end of main method");
}
	
}
