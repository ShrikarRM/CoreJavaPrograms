package com.account.interfacetopic;

public abstract class Laptop implements ElectronicDevice {
	public abstract void calculation();

	public void display() {
		System.out.println("Displaying required output");
	}
}
