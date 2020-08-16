package com.account.exceptionhandling;

public class Dog { //public & default
	
	private String breed;
	int age;   //default modifier
	protected String color;
	public boolean isMale;
	 //constructor
	private Dog(){
		System.out.println("Creating obj of Dog");
		
	}
	Dog(String inBreed){
		System.out.println("Creating obj of Dog using 1 param constructor");

	}
	
	public Dog(String inBreed,int inAge){
		System.out.println("Creating obj of Dog using 2 param constructor");

	}
	private void eating(){
		System.out.println("Dog is eating ");

	}
	 void barking(){
		breed="julie";
		System.out.println("Dog is barking ");

	}
	public void running(){
			System.out.println("Dog is running ");

		}

public static void main (String[] args){
	//can access  all private members within the class
	Dog inhouseDog =new Dog();
	inhouseDog.breed="julie";
	inhouseDog.age=4;
	
	inhouseDog.eating();
	inhouseDog.barking();
	
	
	
}


}

