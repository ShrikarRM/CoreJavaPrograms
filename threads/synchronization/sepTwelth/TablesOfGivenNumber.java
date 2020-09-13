package com.account.threads.synchronization.sepTwelth;

public class TablesOfGivenNumber {
//public synchronized void multiplesOfNum(int number){
	public void multiplesOfNum(int number){
		System.out.println("The thread executing table is "+Thread.currentThread().getName());
		System.out.println("The thread id is "+Thread.currentThread().getId());
System.out.println("The table of the number is "+number+"is ");
synchronized (this){
	for(int i=1;i<=5;i++){
		System.out.println(number+"*"+i+"="+i*number);
	}
}
	System.out.println("The execution of table by thread "+Thread.currentThread().getName()+" is ended here");
	}
}
