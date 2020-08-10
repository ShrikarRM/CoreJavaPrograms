package com.account.abstraction;

public abstract class RBIBank {

	abstract void openBankAccount();

	void deposit(int amount) {
		System.out.println("Depositing amount " + amount);
	}

	void withdraw(int amount) {
		System.out.println("Withdrawing amount " + amount);

	}

}
