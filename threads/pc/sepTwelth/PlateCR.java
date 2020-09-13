package com.account.threads.pc.sepTwelth;

public class PlateCR {
	int value;
	boolean flag = false;

	public synchronized void put(int num) {
		if (flag == true) {
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		this.value = num;
		System.out.println("Produced value:" + num);
		flag=true;
		notify();
	}

	public synchronized int get() {
		if (flag == false) {
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("Value received is:" + value);
		flag=false;
		notify();
		return value;
	}
}
