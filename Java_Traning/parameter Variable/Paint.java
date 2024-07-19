class Paint
{
public static void wall(String brand)
{
System.out.println("wall methos is  in paint class");
System.out.println("Brand :"+brand);
}

public static void wall(String brand,String color)
{
System.out.println("wall methods with two parameter is  in paint class");
System.out.println("Brand :" +brand +"    "+ "Color : "+color);

}
public static void wall(String brand,double price)
{
System.out.println("wall methods with two parameter one  is String and another one is int  in paint class");
System.out.println("Brand :" +brand +"    "+ "Price : "+price);

}
public static void wall(String color,String type,double price)
{
System.out.println("wall methods with three parameter 2  is String and another one is double  in paint class");
System.out.println("color :" +color +"    "+"type :"+type +"    "+ "Price : "+price );

}
}