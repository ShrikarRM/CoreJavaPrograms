package com.account.collectionfw.assignment30th;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetExTester {

	public static void main(String[] args) {

		HashSet<HashSetEx> emp = new HashSet<HashSetEx>();
		emp.add(new HashSetEx("raj",123,34500.50));
		emp.add(new HashSetEx("ram",124,44500.50));
		emp.add(new HashSetEx("raj",125,32500.50));	 
		emp.add(new HashSetEx("rani",126,14500.50));
		emp.add(new HashSetEx("rama",127,31500.50));
		emp.add(new HashSetEx("rajesh",128,34500.50));

		System.out.println(emp);

		//emp.forEach(e -> System.out.println(e));

		for (HashSetEx name : emp) {
			System.out.println(name);
		}
		System.out.println();
		
		Iterator<HashSetEx> itr = emp.iterator();
		while (itr.hasNext()) {
			HashSetEx name = itr.next();
			System.out.println("element=" + name);
		}
	}
}
