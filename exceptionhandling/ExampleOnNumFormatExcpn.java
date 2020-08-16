package com.account.exceptionhandling;

public class ExampleOnNumFormatExcpn {

	public static void main(String[] args) {
		System.out.println("beginning of prog");
		arrayManipulation();
		System.out.println("End of prog");
	}

	static void arrayManipulation() {
		try {
			try {
				int[] arr = { 1, 2, 3, 4 };
				System.out.println("Fifth element of array " + arr[4]);
			} catch (ArrayIndexOutOfBoundsException m) { // particular excpn type
				System.out.println("Exceeding array length");
			}
			} catch (ArithmeticException e) {
				System.out.println("String can't be converted to string");
			}

			
		int num= Integer.parseInt("ABC");
		System.out.println(num);
	}

}
