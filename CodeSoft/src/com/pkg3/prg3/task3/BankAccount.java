package com.pkg3.prg3.task3;

public class BankAccount {
	 private double balance;

	    public BankAccount(double initialBalance) {
	        balance = initialBalance;
	    }

	    public double getBalance() {
	        return balance;
	    }

	    public void deposit(double amount) {
	        balance += amount;
	    }

	    public boolean withdraw(double amount) {
	        if (amount <= balance) {
	            balance -= amount;
	            return true;
	        } else {
	            return false;
	        }
	    }

}
