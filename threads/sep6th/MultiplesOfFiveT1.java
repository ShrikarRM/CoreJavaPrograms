package com.account.threads.sep6th;

public class MultiplesOfFiveT1 extends Thread {
	@Override
	public void run() {
		System.out.println("This is from thread 1");
		for (int i = 1; i <= 5; i++) {
			int res = i * 5;
			System.out.println(i + "*" + 5 + "=" + res);
		}
		System.out.println("This thread 1 is ended");

	}
}
