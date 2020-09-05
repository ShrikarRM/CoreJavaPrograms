package com.account.collectionfw.assignment30th;

import java.util.Iterator;
import java.util.ListIterator;
import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueDbl {

	public static void main(String[] args) {
		PriorityQueue<Double> dbl = new PriorityQueue<Double>();
		dbl.add(3.4);
		dbl.offer(1.4);
		dbl.offer(1.3);
		dbl.offer(1.6);
		dbl.offer(3.3);
		dbl.add(3.9);
		dbl.add(6.5);
		dbl.add(8.5);
		System.out.println("Priority Queue "+dbl);
		
		System.out.println();
		
		dbl.peek();
		System.out.println("Priority Queue "+dbl);

		dbl.poll();  	//It is used to retrieves and removes the 1st element of this queue,
								//or returns null if this queue is empty
		System.out.println("Priority Queue "+dbl);
		
		dbl.element(); 	//It is used to retrieves, but does not remove
		System.out.println("Priority Queue "+dbl);

		Iterator<Double> itr = dbl.iterator();
		while(itr.hasNext()){
			Double db = itr.next();
			System.out.println("obj is "+db);
		}

	}
}
