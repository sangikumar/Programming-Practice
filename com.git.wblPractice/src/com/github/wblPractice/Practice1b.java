
/*b. Write a program print "ping" if a number is divisible by 3,"pong" if a number is divisible by 5,
 * and "ping pong" if number is divisible by both, else print the number.*/

package com.github.wblPractice;

import java.util.Scanner;

public class Practice1b {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out
				.println("Enter number which you want to check for its divisiblity by 3: ");

		int number = new Scanner(System.in).nextInt();
		if (number % 5 == 0 && number % 3 == 0)
			System.out.println("ping pong");
		else if (number % 5 == 0)
			System.out.println("pong");
		else if (number % 3 == 0)
			System.out.println("ping");
		else
			System.out.println("This number not divisible by 3 & 5  " + number);
	}

}