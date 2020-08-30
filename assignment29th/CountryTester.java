package com.account.collectionfw.assignment29th;

import java.util.ArrayList;
import java.util.Collections;

public class CountryTester {

	public static void main(String[] args) {
		ArrayList<Country> nation=new ArrayList<Country>();
		nation.add(new Country(50,"USA","USA"));
		nation.add(new Country(28,"India","IND"));
		nation.add(new Country(50,"Afghanistan","AFG"));
		nation.add(new Country(13,"Malaysia","MYS"));
		nation.add(new Country(06,"Australia","AUS"));

		nation.forEach(c -> System.out.println(c));
		System.out.println("Sorted arrayList");
		
		Collections.sort(nation);
		nation.forEach(c -> System.out.println(c));
		
		System.out.println("Reverse order of list");
		Collections.sort(nation,Collections.reverseOrder());
		nation.forEach(c -> System.out.println(c));

	}

}
