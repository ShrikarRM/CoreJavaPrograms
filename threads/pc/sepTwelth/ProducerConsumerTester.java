package com.account.threads.pc.sepTwelth;

public class ProducerConsumerTester {

	public static void main(String[] args) {
		PlateCR cr = new PlateCR();

		Producer t1 = new Producer(cr);
		Consumer t2 = new Consumer(cr);
		t1.start();
		t2.start();
	}

}
