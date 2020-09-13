package com.account.threads.sep6th;

public class MultiplesOfFiveTester {

	public static void main(String[] args) {
		System.out.println("This is the main method");
		System.out.println("the name of the thread :" + Thread.currentThread().getName());
		System.out.println("the ID of the thread :" + Thread.currentThread().getId());
		
		Thread.currentThread().setName("My main method");
		System.out.println("the name of the thread :"+Thread.currentThread().getName());

		MultiplesOfFiveT1 t1 = new MultiplesOfFiveT1();
		t1.start(); // creating a thread
		MultiplesOfFiveT2 t2 = new MultiplesOfFiveT2();
		t2.start();
		System.out.println("This is the end of main method");
	}
}
