/*
 * a. Write a program that prints a fibonaci series that is a sequence of
 * numbers like 0 1 1 2 3 5 8. You can vary the number of elements to be
 * printed meaning you can print 10 numbers or 15 or 20 or any desired
 * number
 */
package com.git.wblPractice;

import java.util.Scanner;

public class Practice1a {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Getting Fibonacci Sequence for n = ");
		int number = new Scanner(System.in).nextInt();

		// We can use this below code while unblocking it with if Else and can
		// use stand alone while as shown
		/*
		 * if (f==1||f==2) { if(f==1 || f==0) {
		 * System.out.println("fibonacci series for is 0"); f--; } else {
		 * System.out.println("fibonacci series for is 1"); } }
		 * 
		 * else {
		 */
		int fib = 0;
		int x = 1;
		int y = 0;
		while (number >= 1) {
			fib = x + y;
			x = y;
			y = fib;
			System.out.println(+fib + " ");
			number--;
		}

	}

}
// }
