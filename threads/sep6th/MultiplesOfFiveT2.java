package com.account.threads.sep6th;

public class MultiplesOfFiveT2 extends Thread{
	@Override
	public void run() {
		System.out.println("This is from thread 2");
		for (int i = 6; i <= 10; i++) {
			int res = i * 5;
			System.out.println(i + "* 5 =" + res);
		}
		System.out.println("This thread 2 is ended");
	}
}
