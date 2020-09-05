package com.account.string.assignment30th;

import java.util.Scanner;

public class String_Pangram {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the string");
		String s = sc.nextLine();
		System.out.println(isPangram(s.toLowerCase()));	//Abcdefghijklmnopqrstuvwxyz //The quick brown fox jumps over the lazy dog
	}
	private static boolean isPangram(String s){
		if(s.length()<26){
			return false;
		}
		else{
			for(char ch='a';ch<='z';ch++){
				if(s.indexOf(ch)<0){
					return false;
				}
			}
		}
		return true;
	}

}
