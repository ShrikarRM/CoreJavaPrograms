package com.account.exceptionhandling;

public class ExampleOnRunTimeExcpn {
	public static void main(String[] args) {

		System.out.println("beginning of prog");
		arrayManipulation();
		System.out.println("End of prog");
	}

	static void arrayManipulation() {
		try {
			try {
				int num = Integer.parseInt("abc");
				System.out.println(num);
			} catch (ArithmeticException e) {
				System.out.println("String can't be converted to string");
			}

			int[] arr = { 1, 2, 3, 4 };
			System.out.println("Fifth element of array " + arr[4]);
		} catch (ArrayIndexOutOfBoundsException m) { // particular excpn type
			System.out.println("Exceeding array length");
		} catch (NumberFormatException n) {
			System.out.println("Number format exception occured");
		} catch (RuntimeException e) { // runtime excepn //-next level in
										// hierarchy
			System.out.println("Encountered with runtime exception");
		} catch (Exception e) { // further hgher level in hierarchy
			System.out.println("Exception occured");
		}
	}
}
