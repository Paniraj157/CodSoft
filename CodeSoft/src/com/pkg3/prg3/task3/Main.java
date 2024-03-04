package com.pkg3.prg3.task3;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	
		        Scanner scanner = new Scanner(System.in);

		        BankAccount account = new BankAccount(2000);
		        ATM atm = new ATM(account);

		        int choice;
		        do {
		            atm.displayMenu();
		            System.out.print("Enter your choice: ");
		            choice = scanner.nextInt();

		            switch (choice) {
		                case 1:
		                    System.out.print("Enter amount to withdraw: ");
		                    double withdrawAmount = scanner.nextDouble();
		                    atm.withdraw(withdrawAmount);
		                    System.out.println("------------------------------------");
		                    break;
		                case 2:
		                    System.out.print("Enter amount to deposit: ");
		                    double depositAmount = scanner.nextDouble();
		                    atm.deposit(depositAmount);
		                    System.out.println("------------------------------------");
		                    break;
		                case 3:
		                    atm.checkBalance();
		                    break;
		                case 4:
		                    System.out.println("Exiting. Thank you!");
		                    System.out.println("------------------------------------");
		                    break;
		                default:
		                    System.out.println("Invalid choice. Please try again.");
		                    System.out.println("------------------------------------");
		            }
		        } while (choice != 4);
		        System.out.println("------------------------------------");

		        scanner.close();
		    
	}

}
