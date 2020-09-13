package com.account.threads.synchronization.sepTwelth;

public class TablesOfNine extends Thread {
	private TablesOfGivenNumber tables; // composition

	public TablesOfNine(TablesOfGivenNumber tables) {
		super();
		this.tables = tables;
	}

	@Override
	public void run() {
		Thread.currentThread().setName("Table of 9 ");
		System.out.println("Creating thread " + Thread.currentThread().getName());

		if (tables != null) {
			// TablesOfGivenNumber tb = new TablesOfGivenNumber();
			tables.multiplesOfNum(9); // lock is required
		} else {
			throw new NullPointerException("Tables resource cannot be null");
		}
		System.out.println("Killing th thread" + Thread.currentThread().getName());
	}

}
