package com.account.interfacetopic;


public class Children implements Father,Mother {

public static void name(String n){
	System.out.println(n);
	
}
	@Override
public void occupation() {
	System.out.println("Occupation is an inherited method");
}
	public void job(String job){
		System.out.println(job);
	}
}
