/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.csc325_oop_designreview_lab;

import java.util.Scanner;

/**
 * MainClass is the entry point to test the Student, Freshman, and Senior classes.
 * It demonstrates OOP principles such as inheritance, encapsulation, and polymorphism.
 * The program creates student objects, allows for GPA input, and prints out their details.
 */
public class MainClass {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		// Creating a Freshman student object
		Freshman std1 = new Freshman("James", 20, 12); // name, age, credits
		System.out.print("Enter GPA for " + std1.getName() + ": ");
		double gpa1 = scanner.nextDouble();
		std1.setGpa(gpa1);

		// Creating a Senior student object with a minimum of 85 credits
		Senior std2 = new Senior("John", 30, 3.5, 90); // name, age, gpa, credits
		System.out.print("Enter GPA for " + std2.getName() + ": ");
		double gpa2 = scanner.nextDouble();
		std2.setGpa(gpa2);

		// Printing out the student information
		System.out.println(std1);  // This will call the toString() of Freshman
		System.out.println(std2);  // This will call the toString() of Senior

		// Closing the scanner
		scanner.close();
	}
}






