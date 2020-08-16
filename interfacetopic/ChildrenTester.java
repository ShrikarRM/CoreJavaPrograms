package com.account.interfacetopic;

import java.util.function.Consumer;

public class ChildrenTester {

	public static void main(String[] args) {
		Children kid = new Children();
		kid.occupation();
		
		Father f = new Children();
		f.occupation();
		
		Mother m = new Children();
		m.occupation();
		
		Consumer<String> consumer1 = ChildrenTester::job;
		consumer1.accept("Shrinidhi");
		
	}
	
	public static void job(String job){
		System.out.println(job);
	}

}
