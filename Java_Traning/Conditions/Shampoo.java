class Shampoo
{

public static void buyShampoo(int quantityInMl,double price,String brand,String manfDate)
{
System.out.println("Quantity in ML   :"+quantityInMl);
System.out.println(" Price  :"+price);
System.out.println("Brand :"+brand);
System.out.println(" Manufacture Date :"+manfDate);
if(quantityInMl>=1 && quantityInMl<=1000)
{
	System.out.println("Quantity in ML is valid");
}
else
{
	System.out.println("Quantity in ML is not valid");
}
if(price>=1 && price<=5000)
{
	System.out.println(" Price for Shampoo is valid  ");
}
else{
	
System.out.println("Price for Shampoo is not valid");
}
}
}
