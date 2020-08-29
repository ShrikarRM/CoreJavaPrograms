package com.account.string.assignment;

public class ReversingWordOfString {

	public static void main(String[] args) {
		String str = "My name is ...";
		String st = "";
		String a[] = str.split(" ");

		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.println();
		System.out.println(str.length());
		//String to char array
		char ch[] = str.toCharArray();
		/*  //For each loop
		 * for (char c:ch){ System.out.print(c); }
		 */
		for (int i = 0; i < ch.length; i++) {
			System.out.print(ch[i] + ",");
		}
		// System.out.println(str.);
		System.out.println();
		for (int i = a.length - 1; i >= 0; i--) {
			System.out.print(a[i] + " "); // or { st= st +a[i]+" ";}
											// System.out.print(st);
		}
		System.out.println();

		// reversing entire string
		StringBuffer stb = new StringBuffer();
		 stb.append(str);
		 stb=stb.reverse();
		System.out.println(stb);
	}

}
