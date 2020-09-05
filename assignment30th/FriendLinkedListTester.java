package com.account.collectionfw.assignment30th;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class FriendLinkedListTester {

	public static void main(String[] args) {
		LinkedList<FriendsLinkedList> friend = new LinkedList<FriendsLinkedList>();

		friend.add(new FriendsLinkedList("Ram", 1991, "Engineer"));
		friend.add(new FriendsLinkedList("Sam", 1990, "Doctor"));
		friend.add(new FriendsLinkedList("Nam", 1992, "Architect"));
		friend.add(new FriendsLinkedList("Tam", 1991, "Advocate"));

		friend.forEach(f -> System.out.println(f));
		System.out.println();
		
		Iterator<FriendsLinkedList> itr=friend.iterator();
		while(itr.hasNext()){
			FriendsLinkedList f=itr.next();
			System.out.println("the obj is="+f);
		}
		System.out.println();

		ListIterator<FriendsLinkedList> listItr=friend.listIterator();
		while(listItr.hasNext()){
			FriendsLinkedList f= listItr.next();
			System.out.println("***"+f);
		}
	}

}
