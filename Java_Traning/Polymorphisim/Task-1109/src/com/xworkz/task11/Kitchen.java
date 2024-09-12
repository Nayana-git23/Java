package com.xworkz.task11;

public class Kitchen extends Home {

	@Override
	
	//Runtime polymorphisim
	public  void display() {
		
		System.out.println("Running in child");
	}

	public static void main(String[] args) {
		
		Kitchen kitchen=new Kitchen();
		kitchen.display();
				
		
		
	
	}

}
