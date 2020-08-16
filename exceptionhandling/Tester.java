package com.account.exceptionhandling;

public class Tester {
	public static void main(String[] args) {
		System.out.println("welcome all");
		System.out.println("Beginning of prog");
		int a = 10, b = 20;
		int sum = a + b;
		System.out.println("sum is= " + sum);
		int x = 10, y = 0;
		try {
			int div = x / y; // initially critical statement
			System.out.println("Div is: " + div);
			String name = null;
			int length = name.length();
			System.out.println("End of try");
		} catch (ArithmeticException e) {
			System.out.println("You have entered zero as divisor, please enter different value");
		} catch (NullPointerException e) {
			System.out.println("Please enter the name");
		}
		/*String name = null; // "asds" new String("");
		// scanner
		try {
			int length = name.length();
			System.out.println("Length of the string is " + length);
		} catch (NullPointerException e) {
			System.out.println("enter");
		}*/
		Dog dog= null;
		try{
			dog.running(); // null.running()
		}catch(NullPointerException e){
			System.out.println("Create object dog before using");
		}
		dog =new Dog("German Shepherd");
		dog.barking();
		System.out.println("End of program");
	}
}