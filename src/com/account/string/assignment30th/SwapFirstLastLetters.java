package com.account.string.assignment30th;

public class SwapFirstLastLetters {

	public static String swap(String str){
		if(str.length()<2)
			return str;
		
		return (str.substring(str.length()-1)
				+str.substring(1,str.length()-1)
			+str.substring(0,1));	
	}
	public static void main(String[] args) {
		String str ="all is well";
		System.out.println(swap(str));
	}

}
