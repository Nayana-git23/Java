class ExampleTwoRunner
{
public static void main(String[] args)
{
	Matrimony matrimony=new Matrimony();
	matrimony.phoneNo=8197801706l;
	matrimony.email="abc@gmail.com";
     matrimony.MatrimonyName="match maker";
	System.out.println(matrimony.MatrimonyName);
	System.out.println(matrimony.phoneNo);
	System.out.println(matrimony.email);
	System.out.println("--------------------------------------");
	
	Application application=new Application();
	System.out.println(application.AppName);
	System.out.println(application.time);
	System.out.println(application.budget);
	System.out.println("--------------------------------------");
	
	
	Fruit fruit=new Fruit();
	System.out.println(fruit.name);
		System.out.println(fruit.price);
			System.out.println(fruit.quantity);
			System.out.println("--------------------------------------");
			
	Juice juice=new Juice();
	System.out.println(juice.name);
		System.out.println(juice.price);
			System.out.println(juice.quantity);
			System.out.println("--------------------------------------");
			
			Place place=new Place();
	System.out.println(place. placename);
		System.out.println(place.distance);
			System.out.println(place.speciality);
			System.out.println("--------------------------------------");
			
			AlocoholBrand alocoholBrand=new AlocoholBrand();
	System.out.println(alocoholBrand.brandname);
		System.out.println(alocoholBrand.price);
			System.out.println(alocoholBrand.quantity);
			System.out.println("--------------------------------------");
			
			
	Candy candy=new Candy();
	System.out.println(candy.flavour);
		System.out.println(candy.price);
			System.out.println(candy.quantity);
			System.out.println("--------------------------------------");
			
			
			Medicine medicine=new Medicine();
	System.out.println(medicine.name);
		System.out.println(medicine.price);
			System.out.println(medicine.quantity);
			System.out.println("--------------------------------------");
			
			
			Food food=new Food();
	System.out.println(food.item);
		System.out.println(food.price);
			System.out.println(food.veg);
			System.out.println("--------------------------------------");
}
}
