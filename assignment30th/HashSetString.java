package com.account.collectionfw.assignment30th;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetString {

	public static void main(String[] args) {
		HashSet<String> str = new HashSet<>();
		str.add("pen");
		str.add("paper");
		str.add("pencil");
		str.add(null);	//null goes to 1st index

		System.out.println(str);
		System.out.println();
		Iterator<String> s=str.iterator();
		
		while(s.hasNext()){
			String st=s.next();
			System.out.println("elements are "+st);
		}
		str.contains("not");
		
		str.forEach(H -> System.out.println(H));
	}

}
