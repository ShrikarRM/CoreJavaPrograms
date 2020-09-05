package com.account.collectionfw.assignment30th;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSetChar {

	public static void main(String[] args) {
		LinkedHashSet<Character> ch=new LinkedHashSet();
		ch.add('a');
		ch.add('b');
		ch.add('c');
		ch.add('d');
		ch.add('e');
		
		ch.forEach(c -> System.out.println(c));

		System.out.println();
		
		Iterator<Character> itr = ch.iterator();
		while(itr.hasNext()){
		Character c=itr.next();
		System.out.println("obj is:"+c);
		}
	}

}
