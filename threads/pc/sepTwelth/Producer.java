package com.account.threads.pc.sepTwelth;

public class Producer extends Thread{
PlateCR commonResource;

public Producer(PlateCR commonResource) {
	super();
	this.commonResource = commonResource;
}
@Override
	public void run() {
	Thread.currentThread().setName("Producer thread");	
	System.out.println("The thread "+Thread.currentThread().getName()+" is started");
	//producer data
	for(int i=1;i<=5;i++){
	commonResource.put(i);
	}
	System.out.println("The thread "+Thread.currentThread().getName()+" is ended");

	}
}
