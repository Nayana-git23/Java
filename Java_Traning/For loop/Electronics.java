class Electronics
{
	public static int price(String electronicsItem)
	{
		String[] electronics={"Tv","Refregerator","mobile","Laptop","tablet","Washing achine","Radio","ac","stove","charger"};
		
		int[] price={1222,123,345,543,123,57,654,456,789,987};
		
		for(int i=0;i<=electronics.length;i++)
		{
			if(electronics[i] == electronicsItem)
			{
				for(int j=0;j<=price.length;j++)
				{
					if(i==j)
					{
						return price[j];
					}
				}
			}
		}
		return 0;
	}
	
					
		public static void main(String args[])
		{
			int price=price("mobile");
			System.out.println(price);
		}
}
		