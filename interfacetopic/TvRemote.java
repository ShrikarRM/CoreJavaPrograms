package com.account.interfacetopic;

public class TvRemote implements Remote {
	public void switchOnMachine() {
		System.out.println("Television get switched on");
	}

	public void switchOffMachine() {
		System.out.println("Television get switched off");
	}
	public void changeChannel() {
		System.out.println("Television channel changed");
	}
}
