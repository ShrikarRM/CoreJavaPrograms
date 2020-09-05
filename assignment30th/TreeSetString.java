package com.account.collectionfw.assignment30th;

import java.util.TreeSet;

public class TreeSetString {

	public static void main(String[] args) {
		TreeSet<String> months= new TreeSet<String>();
		months.add("jan");
		months.add("feb");
		months.add("mar");
		months.add("apr");
		System.out.println(months);
		
		System.out.println("Initial Set: "+months);  
        
        System.out.println("Reverse Set: "+months.descendingSet()); 
        
		
		months.removeIf(m->months.contains("feb"));	
		System.out.println(months);
		
		//months.pollFirst();
		//System.out.println(months);  //It is used to retrieve and remove the lowest(first) element

		months.pollLast();
		System.out.println(months);
		
		//months.add(null);	//null is not accepted(nullpt excpn) sorted alphabetically
		TreeSet<String> month= new TreeSet<String>();
		month.add("may");
		month.add("apr");
		month.add("apr");	//no duplicates allowed
		month.addAll(month);
		System.out.println(month);
		
		//month.remove(month);		//ClassCastException
		month.remove("may");		
		System.out.println(month);
		
		//month.removeAll(month);	
		//System.out.println(month);  //[]
		
	
	}
}
