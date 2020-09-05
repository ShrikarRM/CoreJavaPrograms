package com.account.collectionfw.assignment30th;

import java.util.Collections;
import java.util.Iterator;
import java.util.PriorityQueue;

public class BookPQTester {

	public static void main(String[] args) {
		PriorityQueue<BookPQueue> book = new PriorityQueue<BookPQueue>();
		book.add(new BookPQueue("Mathematics",560,"B.S.K"));
		book.offer(new BookPQueue("Physics",500,"Rao"));
		book.add(new BookPQueue("Mahabharat",4560,"Vyas"));

		System.out.println("Priority Queue "+book);
		//book.forEach(b -> System.out.println(b));
	
		System.out.println();
		
		System.out.println("Priority Queue after sort "+book);
		
		System.out.println();

		book.peek();
		System.out.println("Priority Queue "+book);

		book.poll();  	//It is used to retrieves and removes the 1st element of this queue,
								//or returns null if this queue is empty
		System.out.println("Priority Queue "+book);
		
		book.element(); 	//It is used to retrieves, but does not remove
		System.out.println("Priority Queue "+book);

		Iterator<BookPQueue> itr = book.iterator();
		while(itr.hasNext()){
			BookPQueue bk = itr.next();
			System.out.println("obj is "+bk);
		}	}

}
