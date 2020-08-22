package com.account.collectionfw.assignment16aug;

import java.util.ArrayList;

public class CharArrayList {

	public static void main(String[] args) {
		ArrayList<Character> chr= new ArrayList();
		chr.add('A');
		chr.add('E');
		chr.add('I');
		chr.add('o');
		chr.add('U');

		System.out.println(chr);
		
		for(int i=0;i<chr.size();i++){
			System.out.println(chr.get(0));
			System.out.println(chr.get(1));
			System.out.println(chr.get(2));
			System.out.println(chr.get(3));
		}
		
		for(char c:chr){
			System.out.println("--"+c+"--");
		}
		chr.set(0, 'Z');
		
		System.out.println(chr);
		System.out.println(chr.get(4));
		
		chr.remove(2);
		System.out.println(chr);
		System.out.println("Contains Z ?"+chr.contains('Z'));

		System.out.println("last index="+chr.lastIndexOf(chr));
		//chr.remove('Z');
		System.out.println(chr);
		chr.containsAll(chr);
		chr.remove(new Character('Z'));
		System.out.println(chr);

	}

}
