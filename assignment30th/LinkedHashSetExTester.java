package com.account.collectionfw.assignment30th;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSetExTester {

	public static void main(String[] args) {
		LinkedHashSet<LinkedHashSetEx> ls=new LinkedHashSet<LinkedHashSetEx>();

		ls.add(new LinkedHashSetEx("Sarvodaya school",123,4000.50));
		ls.add(new LinkedHashSetEx("vidyaMandir",350,1200.50));
		ls.add(new LinkedHashSetEx("St.john school",460,2200.50));
		ls.add(new LinkedHashSetEx("Excellent school",235,3000.50));
		ls.add(new LinkedHashSetEx("Govt. high school",23,400.50));
		
		System.out.println(ls);

		//ls.forEach(e -> System.out.println(e));

		for (LinkedHashSetEx lhs : ls) {
			System.out.println(lhs);
		}
		System.out.println();
		
		Iterator<LinkedHashSetEx> itr = ls.iterator();
		while (itr.hasNext()) {
			LinkedHashSetEx s = itr.next();
			System.out.println("element=" + s);
		}
	}

}
