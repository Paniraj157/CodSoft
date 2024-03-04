package com.pkg3.prg3.task3;

public class ATM {
	 private BankAccount bankAccount;

	    public ATM(BankAccount account) {
	        bankAccount = account;
	    }

	    public void displayMenu() {
	    	System.out.println(" ");
	        System.out.println("Welcome to the ATM");
	        System.out.println("*************************");
	        System.out.println("Choose the option below:");
	        System.out.println("1. Withdraw");
	        System.out.println("2. Deposit");
	        System.out.println("3. Check Balance");
	        System.out.println("4. Exit");
	    }

	    public void withdraw(double amount) {
	        if (bankAccount.withdraw(amount)) {
	            System.out.println("Withdrawal successful. Please take your cash.");
	        } else {
	            System.out.println("Insufficient balance. Withdrawal failed.");
	        }
	    }

	    public void deposit(double amount) {
	        bankAccount.deposit(amount);
	        System.out.println("Deposit successful.");
	    }

	    public void checkBalance() {
	        System.out.println("Current Balance: " + bankAccount.getBalance());
	    }
	

}
