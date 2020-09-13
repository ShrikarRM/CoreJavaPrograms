package com.account.threads.assignment.sep6th;

import java.util.Arrays;
import java.util.List;

public class CombinationOfThreads implements Runnable{

	@Override
	public void run() {
Integer[] arr={1,2,3,4,5};
List<Integer>intArr=Arrays.asList(arr);

for(Integer i:intArr){
	System.out.println("*"+i);
}

	String[] ar={"wer","sdf"};
	List<String> strAr=Arrays.asList(ar);
	for(String s:strAr){
		System.out.println("**"+s);
	}
	Double[] dblar={20.05,20.45};
	List<Double> dblrAr=Arrays.asList(dblar);
	for(Double db:dblrAr){
		System.out.println("**"+db);
	}	

	}

}
