package com.account.exceptionhandling;

public class DivisionOperation {

	public static void main(String[] args) {
		System.out.println("Beginning of prog");
		int a = 10, b = 0;
		DivisionOperation divOpr = new DivisionOperation();
		try {
			int result = divOpr.division(a, b);
			System.out.println("Result is: " + result);
		} catch (ArithmeticException e) {
			System.out.println("You have entered zero as divisor, please enter different value");
		}
		System.out.println("End of program");
	}

	int division(int a, int b) throws ArithmeticException {
		int div = 0;
		div = a / b;
		return div;
	}

}
