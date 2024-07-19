class House
{
public static  void watch(String location)
{
	//System.out.println("Running in House class");
	Dog.guarding(location);
	System.out.println("Location :"+location);
}
}