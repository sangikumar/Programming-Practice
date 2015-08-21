/* f. Write a program  to check an Armstrong number 
 * i.e. whether the if we power up the each individual number to the total number 
 * of digits in the number and add them it should be equal to the number itself. 
 * For example 153 has 3 digits in it and if we do 1^3+5^3+3^3=153.
 * FYI: ^ means is to the power.*/
package com.github.wblPractice;

import java.util.Scanner;

public class Practice1f {
	public static void main(String[] args) {
		System.out.println("Check for Armstrong Number :");
		int number = new Scanner(System.in).nextInt();
		Practice1f checkNumber = new Practice1f();
		int imf = checkNumber.checkForArmstrongNumber(number);
		System.out
				.println("Internal operations of below function returns value : "
						+ imf
						+ ", After comparing it with input, We can conclude that ");
		if (imf == number)
			System.out.println("given number " + number
					+ " is an Armstrong Number");
		else
			System.out.println("given number " + number
					+ " is not an Armstrong Number");
	}

	public int checkForArmstrongNumber(int number) {
		int length = String.valueOf(number).length();
		System.out.println("length is " + length);
		int sum = 0;
		int dummyNumber = number;
		for (int c = 1; c <= length; c++) {
			sum += Math.pow((dummyNumber % 10), length);
			dummyNumber = dummyNumber / 10;
		}
		return sum;

	}
}
