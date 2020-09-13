package com.account.threads.synchronization.sepTwelth;

public class TablesTester {

	public static void main(String[] args) {
		System.out.println("Started the thread" + Thread.currentThread().getName());
		TablesOfGivenNumber tables = new TablesOfGivenNumber();

		TablesOfNine t1 = new TablesOfNine(tables);
		t1.start();

		TablesOfFifteen t2 = new TablesOfFifteen(tables);
		t2.start();
		// or new TablesOfFifteen().start();

		System.out.println("Ending main()");
	}

}
