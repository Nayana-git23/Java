package com.xworkz.inheritence.chaining;

public class Apple extends Fruit {
	

	
		public Apple(String name,int quanitity)
		{
			super(name,quanitity);
			
			System.out.println("Running in Aple");
			
			
			}
//		public void display()
//		{
//			super.eat();
//			System.out.println("Running in Fruit");
//			
//		}
		
		
		//demonstration of Overriding
		
		@Override
		public void eat()
		{
			
			System.out.println("Running in apple class it is child class");
			super.display();
		}
	}



