package com.account.exceptionhandling;

public class TryWithoutCatch {
	public static int execute() {
		try {
			System.out.println("Try Block without catch");
			return 10;
		} finally {
			System.out.println("Finally Block always executes");
		}
	}

	public static void main(String[] args) {
		System.out.println(execute());
	}
}
