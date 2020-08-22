package com.account.collectionfw.assignment16aug;

import java.util.ArrayList;

public class DoubleArrayList {

	public static void main(String[] args) {
		ArrayList<Double> dbl = new ArrayList();
		dbl.add(1.2);
		dbl.add(2.4);
		dbl.add(3.6);
		dbl.add(4.8);
		dbl.add(6.00);
		dbl.add(7.2);
		System.out.println(dbl);
		System.out.println(dbl.size());
		for (int i = 0; i < dbl.size(); i++) {
			System.out.println(dbl.get(0));
			System.out.println(dbl.get(1));
			System.out.println(dbl.get(2));
			System.out.println(dbl.get(3));
			System.out.println(dbl.get(4));
			System.out.println(dbl.get(5));

		}
		for (double i : dbl) {
			System.out.println("--" + i + "--");
		}
		dbl.set(2, 56.23);
		System.out.println("after adding 3rd element as 56.23 is " + (dbl));
		System.out.println("Last element is " + (dbl.get(5)));
		
		dbl.remove(0);
		System.out.println("after remoiving 1st element " + (dbl));
		
		dbl.remove(56.23);
		System.out.println("after remoiving 56.23 is " + (dbl));

	}

}
