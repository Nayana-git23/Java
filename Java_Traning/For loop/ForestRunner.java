class ForestRunner
{
public static void main(String[] forest)
{
	System.out.println("Start of main method");
	if(forest.length==4)
	{
		String name=forest[0];
		String area=forest[1];
		String esthablishedYear=forest[2];
		String state=forest[3];
		
		System.out.println(name);
		System.out.println(area);
		System.out.println(esthablishedYear);
		System.out.println(state);
	}
	else
	{
		System.out.println("You shoud give 4 arguments");
	}
	System.out.println("End of main method");
}
}
	
