package com.objectorientedprograms;

public class Account {
	private double balance;
	
	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public Account(double initialBalance) {
		if (initialBalance > 0.0)
			balance = initialBalance;
	}

	public void credit(double amount) {
		balance = balance + amount;
	}

	public void debit(double amount) {
		balance = balance - amount;
	}
}
