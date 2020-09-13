package com.account.threads.sep6th;

import java.util.Arrays;
import java.util.List;

public class CollectionSuffixPrefixT1 implements Runnable {

	@Override
	public void run() {
		Integer[] intarray = { 1, 2, 3, 4, 5 };
		List<Integer> intA1 = Arrays.asList(intarray);

		for (Integer i : intA1) {
			System.out.println("*" + i);
		}
	}
};
