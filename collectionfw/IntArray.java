package com.account.collectionfw;

import java.util.ArrayList;

//import java.util.Arraylist;
public class IntArray {

	
	public static void main(String[] args) {
		ArrayList<Integer> num = new ArrayList<Integer>();
		System.out.println("Is arraylist is Empty?" + num.isEmpty());

		num.add(1);
		num.add(2);
		num.add(3);
		num.add(3,4);
		
		System.out.println(num);
		System.out.println("2nd ele= " + num.get(1));
		num.set(3,5);
		System.out.println("size of arrlist " + num.size());

		for (int i = 0; i < num.size(); i++) {
			System.out.println(num.get(0));
			System.out.println(num.get(1));
		}

		for(Integer i:num){
			System.out.println("---"+i+"--");
		}
	}

}
