package com.account.threads.pc.sepTwelth;

public class Consumer extends Thread {
	PlateCR commonResource;

	public Consumer(PlateCR commonResource) {
		super();
		this.commonResource = commonResource;
	}

	@Override
	public void run() {

		Thread.currentThread().setName("Consumer Thread");

		System.out.println("The thread " + Thread.currentThread().getName() + " is started");

		for (int i = 1; i <= 5; i++) {
			commonResource.get();
		}
		System.out.println("The thread " + Thread.currentThread().getName() + " is ended");

	}
}
