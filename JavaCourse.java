package com.account.inheritance;

public class JavaCourse {

	void study() {
		System.out.println("Study Java programming");
	}
}

class CLanguage {
	void learn() {
		System.out.println("Study .Net");
	}
}

class Student extends JavaCourse,CLanguage
{  //multiple 
}
class Tester{
	public static void main(String[] args) {
	Student s =new Student();
	s.learn();
	}

}
