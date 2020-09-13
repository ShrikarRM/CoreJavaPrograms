package com.account.threads.synchronization.sepTwelth;

public class TablesOfFifteen extends Thread {
	private TablesOfGivenNumber tables;

	public TablesOfFifteen(TablesOfGivenNumber tables) {
		super();
		this.tables = tables;
	}

	@Override
	public void run() {
		Thread.currentThread().setName("Table of fifteen");
		System.out.println("Creating thread " + Thread.currentThread().getName());

		TablesOfGivenNumber tb = new TablesOfGivenNumber();
		tb.multiplesOfNum(15);
		System.out.println("killing thread " + Thread.currentThread().getName());

	}
}
