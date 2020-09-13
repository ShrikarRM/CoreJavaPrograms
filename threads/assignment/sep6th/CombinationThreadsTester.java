package com.account.threads.assignment.sep6th;

import java.util.Arrays;
import java.util.List;

public class CombinationThreadsTester {

	public static void main(String[] args) {
		System.out.println("the name of the thread :" + Thread.currentThread().getName()
		+", the ID of the thread :" + Thread.currentThread().getId());
		
		CombinationOfThreads ct1 = new CombinationOfThreads();
		Thread t1=new Thread(ct1);
		t1.start(); // creating a thread
		
		//by annonymous class approach
		Runnable runnableT2 = new Runnable() {
			@Override
			public void run() {
				Integer[] intarray = { 1, 2, 3, 4, 5 };
				List<Integer> intA1 = Arrays.asList(intarray);

				for (Integer i : intA1) {
					System.out.println("**" + i);
				}
			}
		};
		
		/*Runnable runnableT2 =() ->{
		Integer[] intarray = { 1, 2, 3, 4, 5 };
		List<Integer> intA1 = Arrays.asList(intarray);

		for (Integer i : intA1) {
			System.out.println("**" + i);
		}*/
		Thread t2=new Thread(runnableT2);
		t2.start();
		
		//by lambda expn
		Runnable runnableT3 = () -> {
			String[] ar={"wer","sdf"};
			List<String> strAr=Arrays.asList(ar);
			for(String s:strAr){
				System.out.println("**"+s);
			}
		};
			Thread t3=new Thread(runnableT3);
			t3.start();
			Runnable runnableT4 = () -> {

			Double[] dblar={20.05,20.45};
			List<Double> dblrAr=Arrays.asList(dblar);
			for(Double db:dblrAr){
				System.out.println("**"+db);
			}
			};
		System.out.println("the name of the thread :" + Thread.currentThread().getName()
				+" the ID of the thread :" + Thread.currentThread().getId());
				
	}

}
