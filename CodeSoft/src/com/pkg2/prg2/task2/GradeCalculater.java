package com.pkg2.prg2.task2;

import java.util.Scanner;

public class GradeCalculater {

	public static void main(String[] args) {
		
		        Scanner scanner = new Scanner(System.in);
		        System.out.println("Welcome to Student Grade Calculator");
		        System.out.println("***********************************************");
		        System.out.println("Enter the number of subjects:");		       
		        int numSubjects = scanner.nextInt();
		        System.out.println("................................................");
		        
		        int totalMarks = 0;
		        for (int i = 1; i <= numSubjects; i++) {
		            System.out.println("Enter marks obtained in subject " + i + ":");
		            int marks = scanner.nextInt();
		            System.out.println("--------------------------------------------");
		            totalMarks += marks;
		        }
		        
		        double averagePercentage = (double) totalMarks / numSubjects;
		        
		        char grade;
		        if (averagePercentage >= 90) {
		            grade = 'A';
		        } else if (averagePercentage >= 80) {
		            grade = 'B';
		        } else if (averagePercentage >= 70) {
		            grade = 'C';
		        } else if (averagePercentage >= 60) {
		            grade = 'D';
		        } else if (averagePercentage >= 50) {
		            grade = 'E';
		        } else {
		            grade = 'F';
		        }
		        
		        System.out.println("Total Marks: " + totalMarks);
		        System.out.println("Average Percentage: " + averagePercentage + "%");
		        System.out.println("Grade: " + grade);
		        
		        scanner.close();
		    
	}

}
