package com.account.collectionfw.assignment29th;

import java.util.ArrayList;
import java.util.Collections;

public class DoubleArray {
	public static void main(String[] args) {
		ArrayList<Double> dbl = new ArrayList();
		dbl.add(1.2);
		dbl.add(2.4);
		dbl.add(3.6);
		dbl.add(4.8);
		dbl.add(6.00);
		dbl.add(7.2);
		dbl.add(5.2);
		dbl.add(8.2);
		dbl.add(3.2);
		dbl.add(7.5);
		dbl.add(7.9);
		System.out.println("Original arraylist is "+dbl);
	System.out.println();
		Collections.sort(dbl);
		System.out.println("Sorted arraylist is "+dbl);
		
		Collections.sort(dbl,Collections.reverseOrder());
		System.out.println("Sorted arraylist in descending order is "+dbl);


	}
}
