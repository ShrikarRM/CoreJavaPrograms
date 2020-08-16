package com.account.corejava.defaultaccessmodifier.tester;

public class TestDefaultModifiers {

	public static void main(String[] args) {
		
		// cannot access all the default or protected members of dog outside the class
 		//and inside the different package
		//but can access public members
		Dog dog= new Dog("Lab",0);//new Dog("Lab");
		//dog.age =2;
		dog.isMale= false;
		//dog.barking();  //default modifier

	}

}
