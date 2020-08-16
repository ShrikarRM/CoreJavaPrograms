package com.account.interfacetopic;

public class MathOpsTester {

	public static void main(String[] args) {
		MathOpern addition =new MathOpern(){
			@Override
			public int add(int a, int b) {
				return a+b;
			}
	};
						
		MathOpern addition1 =(a,b) ->{
			System.out.println("sum:"+(a+b));
			return a+b;
		};
		
		addition1.add(10, 20);
	}

}
