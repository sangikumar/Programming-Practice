
/*b. Write a program print "ping" if a number is divisible by 3,"pong" if a number is divisible by 5,
 * and "ping pong" if number is divisible by both, else print the number.*/

package com.github.wblPractice.loops;

import java.util.Scanner;

public class Practice1b {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out
				.println("Enter number which you want to check for its divisiblity by 3: ");

		int number = new Scanner(System.in).nextInt();
		Practice1b div = new Practice1b();
		System.out.println(div.pingPongDivisibility(number));
	}	
	
	public String pingPongDivisibility(int number)
	{
		
		if (number % 5 == 0 && number % 3 == 0)
			return "ping pong : given number is divisible by 3 & 5";
		else if (number % 5 == 0)
			return "pong : given number is divisible by 5";
		else if (number % 3 == 0)
			return "ping : given number is divisible by 3";
		else
			return "This number not divisible by 3 & 5 ";
	}

}