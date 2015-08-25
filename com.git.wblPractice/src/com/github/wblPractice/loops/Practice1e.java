/*e. Write a program  to check if a given number is prime or not.*/
package com.github.wblPractice.loops;

import java.util.Scanner;

public class Practice1e {
	public static void main(String[] args) {
		long startTime = System.currentTimeMillis();
		System.out.println("Enter the number for checking whether its prime or not :");
		int number = new Scanner(System.in).nextInt();
		Practice1e testPrime = new Practice1e();
		testPrime.testForPrimeNumber(number);
		System.out.println("Is entered number is Prime ? : "
				+ testPrime.testForPrimeNumber(number));
		long endTime = System.currentTimeMillis();
		System.out.println("It took " + (endTime - startTime) + " milliseconds");
	}

	public boolean testForPrimeNumber(int number) {
		for (int i = 2; i <= number / 2; i++)
			if (number % i == 0) {
				return false;
			}
		return true;

	}

	/*
	 * This program could find max prime number 2,147,483,647 (Assert with
	 * numbers from https://en.wikipedia.org/wiki/Largest_known_prime_number)
	 * Console Enter the number for checking whether its prime or not :
	 * 2,147,483,647 Is entered number is Prime ? : true It took 63962
	 * milliseconds
	 */
}
