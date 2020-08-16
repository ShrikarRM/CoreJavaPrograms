package com.account.interfacetopic;

public class CarTester {

	public static void main(String[] args) {

		Car c = new BMW();
		c.applyaccelerator();
		c.applybreak();
		c.turnstearingToLeft();
		c.turnstearingToRight();

		System.out.println();

		Car cr = new Audi();
		cr.turnstearingToRight();
		cr.applyaccelerator();
		cr.applybreak();
		cr.turnstearingToLeft();

	}

}
