package com.objectorientedprograms;

import java.util.Scanner;

public class AccountTest {
	static double depositAmount;
	static double debitAmount;
	static Scanner input = new Scanner( System.in );
	static Account account1 = new Account (50.00);
	static Account account2 = new Account (20.00);

	public static void main(String[] args) {
		System.out.println("Account1 Balance:"+account1.getBalance());
		System.out.println("Account2 Balance:"+account2.getBalance());
		AccountTest accountTest=new AccountTest();
		
		boolean condition=true;
		while(condition) {
			System.out.println("Enter a Options:"+"\n"+"1.DepositeMoney"+"\n"+"2.DisplayBalanceOfAccount1"+"\n"+"3.DisplayBalanceOfAccount2"+"\n"+"4.Exit");
			int option= input.nextInt();
			switch(option) {
			case 1:
				System.out.println("Enter how much money u want to deposit in account:");
				accountTest.depositMoney();
				break;
			case 2:
				System.out.println("Display the balance of the account1");
				accountTest.displayBalanceOfAccount1();
				break;
			case 3:
				System.out.println("Display the balance of the account2");
				accountTest.displayBalanceOfAccount2();
				break;
			case 4:
				condition=false;
				break;
				default:
					System.out.println("Invalid Option");
			}
		}	
	}
	
	public void depositMoney() {
		System.out.println( "Enter deposit amount for account1:"); 
		depositAmount = input.nextDouble();
		System.out.println("added to account1 balance"+" "+depositAmount);
		account1.credit( depositAmount); // add to account1 balance
		System.out.println("Enter deposit amount for account2:"); // prompt
		depositAmount = input.nextDouble(); // obtain user input
		System.out.println("Added to account2 balance:"+" "+depositAmount);
		account2.credit( depositAmount ); // add to account2 balance
	}
	public void displayBalanceOfAccount1() {
		// display balance
		System.out.println("Account1 balance:"+account1.getBalance());
		System.out.print("Enter debit amount for account1:");
		debitAmount = input.nextDouble();
		System.out.println("Subtracting amount from account1 balance:"+" "+debitAmount);
		if (account1.getBalance()>=debitAmount) {
		account1.debit( debitAmount );
		System.out.println("Account1 balance:"+" "+account1.getBalance());
		System.out.println("Account2 balance:"+" "+account2.getBalance() );
		}
		else {
		System.out.println("Debit amount exceeded account balance");
		}
	}
	public void displayBalanceOfAccount2() {
		// display balances
		System.out.println("Account2 balance:"+" "+account2.getBalance());
		System.out.print("Enter debit amount for account2:");
		debitAmount = input.nextDouble();
		System.out.println("Subtracting amount from account2 balance:"+" "+debitAmount);
		if (account1.getBalance()>=debitAmount) {
		account1.debit( debitAmount );
		System.out.println("Account1 balance:"+" "+account1.getBalance());
		System.out.println( "Account2 balance:"+" "+account2.getBalance() );
		}
		else {
		System.out.println("Debit amount exceeded account balance");
		}
	}
}
