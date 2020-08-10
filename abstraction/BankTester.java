package com.account.abstraction;

public class BankTester {

	public static void main(String[] args) {
		SBIBank sbi = new SBIBank();
		RBIBank rbi= new SBIBank();  //inheritence - upcasting
	rbi.openBankAccount();   //runtime polymorphism
	}

}
