package com.account.threads.assignment.sep6th;

import java.util.ArrayList;
import java.util.Iterator;

public class stringDelay extends Thread {
	@Override
	public void run() {
		ArrayList<String> str = new ArrayList<String>();
		str.add("mon");
		str.add("tue");
		str.add("wed");
		str.add("mon");
		for (Iterator iterator = str.iterator(); iterator.hasNext();) {
			String string = (String) iterator.next();
			System.out.println(string);
			try{
				Thread.sleep(5000);
			}
			catch(InterruptedException e){
			e.printStackTrace();
			}
		}

	}

}
