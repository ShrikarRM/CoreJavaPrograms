package com.account.collectionfw.assignment16aug;

import java.util.ArrayList;

public class BikeArrayList {

	public static void main(String[] args) {
		// Creating user-defined class objects
		Bike honda = new Bike("Honda", 150, 45.55);
		Bike cbz = new Bike("cbz", 200, 55.55);
		Bike stunner = new Bike("stunner", 250, 65.55);

		ArrayList<Bike> bk = new ArrayList();
		bk.add(honda);
		bk.add(cbz);
		bk.add(stunner);
		
		for (Bike b : bk) {
		System.out.println("brand=" + b.model + " ,cc is " + b.cc + " & its mileage=" + b.mileage);

		}
	}

}
