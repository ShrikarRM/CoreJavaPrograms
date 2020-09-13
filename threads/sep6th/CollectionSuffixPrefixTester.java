package com.account.threads.sep6th;

import java.util.Arrays;
import java.util.List;

public class CollectionSuffixPrefixTester {

	public static void main(String[] args) {
		System.out.println("The thread name is " + Thread.currentThread().getName() 
				+ " The thread id is "+ Thread.currentThread().getId());

		CollectionSuffixPrefixT1 collT1 = new CollectionSuffixPrefixT1();
		Thread t1 = new Thread(collT1);
		t1.start();

		Runnable runnableT2 = new Runnable() {
			@Override
			public void run() {
				Integer[] intarray = { 1, 2, 3, 4, 5 };
				List<Integer> intA1 = Arrays.asList(intarray);

				for (Integer i : intA1) {
					System.out.println("**" + i);
				}
			}
		};
		
		Thread T2 = new Thread(runnableT2);
		T2.start();

		Runnable runnableT3 = () -> {
			Integer[] intarray = { 1, 2, 3, 4, 5 };
			List<Integer> intA1 = Arrays.asList(intarray);

			for (Integer i : intA1) {
				System.out.println("***" + i);
			}
		};
		
		Thread T3 = new Thread(runnableT3);
		T3.start();

		System.out.println(
				"End of thread " + Thread.currentThread().getName() 
				+ "The id :" + Thread.currentThread().getId());
	}
}
