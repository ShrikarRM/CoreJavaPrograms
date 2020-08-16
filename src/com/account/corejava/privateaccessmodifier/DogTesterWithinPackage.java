package com.account.corejava.privateaccessmodifier;

import com.account.corejava.defaultaccessmodifier.Dog;

public class DogTesterWithinPackage {

	public static void main(String[] args) {
		// can access all the default & protected members of dog
		//outside the  class but inside the same package
		Dog dog= new Dog("Lab");//
		dog.age =2;
		dog.barking();
	}

}
