package com.xworkz.hirechyinheritence;

public class AnimalRunner {

	public static void main(String[] args) {
		Animal animal=new Animal();
		animal.print();
		Elephant elephant=new Elephant();
		elephant.trumpet();
		Cat cat=new Cat();
		cat.mewow();
		Dog dog=new Dog();
		dog.bark();
		

	}

}
