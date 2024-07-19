class PalaceRunner
{
public static void main(String[] palace)
{
	System.out.println("Start of main method");
	if(palace.length==4)
	{
		String name=palace[0];
		String location=palace[1];
		String builtBy=palace[2];
		String builtYear=palace[3];
		
		System.out.println(name);
		System.out.println(location);
		System.out.println(builtBy);
		System.out.println(builtYear);
	}
	else
	{
		System.out.println("You shoud give 4 arguments");
	}
	System.out.println("End of main method");
}
}