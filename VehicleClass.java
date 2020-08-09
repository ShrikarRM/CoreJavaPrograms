package com.account.inheritance;

public class VehicleClass {
int cc;
double price;


	void start() {
		System.out.println("Starting vehicle...");
	}
}

class Bike extends VehicleClass {
	void riding() {
		System.out.println("biking..");
	}
}

class Yamaha extends Bike {
	void launching() {
		System.out.println("Yamaha launching new model");
	}
}

