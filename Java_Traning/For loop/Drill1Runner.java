class Drill1Runner
{
	public static int nameAge(String name)
	{
		String[] names={"nayana","anusha","chinamyi","kiran","arun"};
		int[] ages={10,20,30,40,50};
		for(int i=0;i<=names.length;i++)
		{
			if(names[i]==name)
			{
				for(int j=0;j<=ages.length;j++)
				{
					if(i==j)
					{
						return ages[j];
					}
				}
			}
		}
		return 0;
	}
	public static void main(String args[])
	{
		int age=nameAge("anusha");
		System.out.println(age);
	}
}