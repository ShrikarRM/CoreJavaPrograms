package com.account.string.assignment30th;

import java.util.Scanner;

public class StringToCharArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the string");
		String s = sc.nextLine();
		char[] c=s.toCharArray();
		
		for(int i=0;i<c.length;i++){
			System.out.println(c[i]);
		}
	}

}
