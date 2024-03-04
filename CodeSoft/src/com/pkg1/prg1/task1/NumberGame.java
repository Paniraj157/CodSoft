package com.pkg1.prg1.task1;

import java.util.Random;
import java.util.Scanner;

public class NumberGame {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        
        System.out.println("Welcome to the Number Game!");
        
        int maxAttempts = 3; // Limit the number of attempts
        int rounds = 0;
        int totalAttempts = 0;
        
        String playAgain = "yes";
        while (playAgain.equalsIgnoreCase("yes")) {
            int secretNum = random.nextInt(100) + 1;
            int attempts = 0;
            System.out.println("Guess the number (between 1 and 100) ");
            System.out.println("Let's see your number is matching or not :");
            System.out.println("*******************************************");
            
            while (attempts < maxAttempts) {
                int guess = scanner.nextInt();
                attempts++;
                totalAttempts++;

                if (guess == secretNum) {
                    System.out.println("Congratulations! You guessed the number " + secretNum + " correctly in " + attempts + " attempts!");
                    System.out.println("--------------------------------------------------------------");
                    break;
                } else if (guess < secretNum) {
                    System.out.println("Number is low. So Try again!");
                    System.out.println("- - - - - - - - - - - -");
                } else {
                    System.out.println("Number is high. So Try again!");
                    System.out.println("- - - - - - - - - - - -");
                }
            }
            
            if (attempts == maxAttempts) {
                System.out.println("Sorry, you've run out of attempts");
                System.out.println("The correct number was : " + secretNum + ".");		
            }
            
            rounds++;
            System.out.println("Do you want to play again?  ");
            System.out.println("(yes/no):");
            playAgain = scanner.next();
        }
        
        System.out.println("Thanks for playing!");
        System.out.println("Total rounds played: " + rounds);
        System.out.println("Total attempts made: " + totalAttempts);
        
        scanner.close();
    }
	}


