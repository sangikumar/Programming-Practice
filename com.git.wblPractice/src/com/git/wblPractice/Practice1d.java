/*d. Write a program  to calculate factorial of a given number. 
 * You need to compute the factorial with one logic that uses recursion and another logic without recursion.*/

package com.git.wblPractice;

import java.util.Scanner;

public class Practice1d {
	public static void main(String[] args) {
		System.out.println("Enter number of which you need factorial : ");
		int number = new Scanner(System.in).nextInt();
		Practice1d factOfNumber = new Practice1d();

		// Calling Methods - with option , which method to be called

		System.out.println("Enter '999' for perform without recursion : ");
		int option = new Scanner(System.in).nextInt();
		if (option == 999) {
			factOfNumber.factorialWithoutRecursion(number);
			System.out.println("WithoutRecursion : "
					+ factOfNumber.factorialWithoutRecursion(number));
		} else {
			factOfNumber.factorialWithRecursion(number);
			System.out.println("WithRecursion : "
					+ factOfNumber.factorialWithRecursion(number));
		}
	}

	// Function without recursion

	public double factorialWithoutRecursion(int number) {
		double fact = 1;
		for (int c = 1; c <= number; c++) {
			fact *= c;
		}
		return fact;
	}

	// Function with recursion
	public double factorialWithRecursion(int number) {
		double factR = 1;
		if (number == 0 || number == 1)
			return 1;

		factR = factorialWithRecursion(number - 1) * number;
		return factR;
	}
}