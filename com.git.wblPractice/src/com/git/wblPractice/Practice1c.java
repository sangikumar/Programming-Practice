/*c. Write a program that swaps 2 given numbers. You need to have 2 separate functions in the program.
 * --> One Function should swap the numbers without any third new variable.
 * --> Second function should swap the numbers using a third variable. */

package com.git.wblPractice;

import java.util.Scanner;

public class Practice1c {

	public static void main(String[] args) {
		// Input first value
		System.out.println("Enter Number1 :");
		int number1 = new Scanner(System.in).nextInt();
		// Input Second value
		System.out.println("Enter Number2 :");
		int number2 = new Scanner(System.in).nextInt();
		// Calling method
		Practice1c with = new Practice1c();
		with.swapWithThirdVariable(number1, number2);
		Practice1c withOut = new Practice1c();
		withOut.swapWithOutThirdVariable(number1, number2);
	}

	// swapping of numbers using third variable
	public void swapWithThirdVariable(int number1, int number2) {
		int thirdVariable = 0;
		thirdVariable = number2;
		number2 = number1;
		number1 = thirdVariable;
		System.out
				.println("New Swapping value of number1 & number2 resp with third variable  "
						+ number1 + number2);
	}

	// swapping of numbers without using third variable
	public void swapWithOutThirdVariable(int number1, int number2) {
		number1 = number2 - number1;
		number2 = number2 - number1;
		number1 = number1 + number2;
		System.out
				.println("New Swapping value of number1 & number2 resp without third variable  "
						+ number1 + number2);
	}

}
