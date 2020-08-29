package com.account.string.assignment;

import java.util.Scanner;

public class CountWordsOfString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the string");
		String s = sc.nextLine();
		int count = 1;
		for (int i = 0; i < s.length() - 1; i++) {
			if ((s.charAt(i) == ' ') && (s.charAt(i + 1) != ' ')) {
				count++;
			}
			sc.close();
		}
		System.out.println("num of words=" + count);
	}

}
