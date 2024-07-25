class JeansRunner
{
public static void main(String args[])
{
	Jeans jeans=new Jeans();
	double priceJeans=jeans.price;
	System.out.println("Price is  :"+priceJeans);
	jeans.size=30;
	System.out.println("Size is  :"+jeans.size);
	jeans.type="tone jeans";
	System.out.println("Jeans type is  :"+jeans.type);
	System.out.println("--------------------------------------");
	Jeans jeans1=new Jeans();
	
	System.out.println("Price is  :"+jeans1.price);
	jeans.size=28;
	System.out.println("Size is  :"+jeans1.size);
	jeans.type="cargo jeans";
	System.out.println("Jeans type is  :"+jeans1.type);
}
}
