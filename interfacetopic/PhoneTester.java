package com.account.interfacetopic;

public class PhoneTester {

	public static void main(String[] args) {
		SmartPhone mi=new SmartPhone();
		mi.calling();
		mi.gaming();
		
		Phone plus=new SmartPhone();
		plus.calling();
		plus.gaming();
		
		Phone ph= new Phone(){
			@Override
			public void calling() {
				System.out.println("Calling by keypad phone");
			}
			@Override
			public void gaming() {
				System.out.println("playing game in keypad phone");
			}
		};
		ph.calling();
		ph.gaming();
	}
	
}
