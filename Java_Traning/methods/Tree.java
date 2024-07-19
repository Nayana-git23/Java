class Tree
{
	public static void main(String args[])
	{
		System.out.println("This is main method");
		fruit();
		green();
	}
		
		
		public static void green()
		{
			System.out.println("Tree are in green color");
			fruit();
		}
		public static void fruit()
		{
			System.out.println("Tree will gives us fruit ");
			green();
		}
	}
