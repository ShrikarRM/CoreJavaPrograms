package com.account.collectionfw.assignment30th;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListEx {

	public static void main(String[] args) {
		LinkedList<String> ll=new LinkedList<String>();
		ll.add("jan");
		ll.add("feb");
		ll.add("mar");
		ll.add("apr");
		ll.add("may");
		ll.add("june");
		ll.add("july");
		ll.add("aug");
		
		ll.offer("nov");
		
		ll.addFirst(null);
		ll.addLast("dec");
		
		Iterator<String> itr = ll.iterator();
		while(itr.hasNext()){
			String s=itr.next();
			System.out.println(s);
		}
		ListIterator<String>listItr = ll.listIterator();
		while(listItr.hasNext()){
			String s=listItr.next();
			System.out.println("**"+s+" index "+listItr.nextIndex());
			}
		System.out.println("first element = "+ll.peek());
		System.out.println(".. element = "+ll.element());
		System.out.println(" first element... "+ll.getFirst());
		System.out.println(" last element... "+ll.getLast());
		System.out.println(" first element by get... "+ll.get(1));
		System.out.println(" remove jan element... "+ll.remove("jan"));
		System.out.println(ll);
		//System.out.println(" remove all element... "+ll.removeAll(ll));
		//System.out.println(ll);
		System.out.println(" removes first element... "+ll.poll());
		System.out.println(ll);
		/*System.out.println(" remove jan element... "+ll.pollFirst());
		System.out.println(ll);
		System.out.println(" remove last element... "+ll.pollLast());
		System.out.println(ll);*/
	}

}
