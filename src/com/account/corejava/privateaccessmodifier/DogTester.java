package com.account.corejava.privateaccessmodifier;

import com.account.corejava.defaultaccessmodifier.Dog;

public class DogTester {
	public static void main (String[] args){
		
		//cannot access private member outside the class
		//can access default members outside the class
		
	Dog outsideDog =new Dog("Germen Shepherd",4);  ///new Dog()
	outsideDog.breed="Germen Shepherd";
	
	outsideDog.age=3; //Default member of Dog
	outsideDog.color="brown"; //protected member of Dog
	outsideDog.isMale = true;//public member of Dog
	//System.out.println("Dog breed value : "+outsideDog.breed);
System.out.println("Dog's age :"+outsideDog.age );
	//outsideDog.eating();
outsideDog.barking();
	}
}
