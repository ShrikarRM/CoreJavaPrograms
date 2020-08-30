package com.account.collectionfw.assignment29th;

import java.util.ArrayList;
import java.util.Iterator;

public class ShirtTester {

	public static void main(String[] args) {
		ArrayList<Shirt> formal = new ArrayList<Shirt>();
		formal.add(new Shirt("Raymond", 5, 1500.99));
		formal.add(new Shirt("Lee-Cooper", 6, 1500.99));
		formal.add(new Shirt("Van-huesen", 5, 1300.99));
		formal.add(new Shirt("Ram-Raj", 4, 1000.99));
		formal.add(new Shirt("Kanva", 5, 1590.99));

		for (Shirt s : formal) {
			System.out.println("***" + s);
		}
		formal.forEach(s -> System.out.println(s));

		Iterator<Shirt> sh = formal.iterator();
		// hasnext(), next(), remove()
		while (sh.hasNext()) {
			Shirt s = sh.next();
			System.out.println("The object is :" + s);
		}
		System.out.println(formal);
	}

}
