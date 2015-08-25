/*
 * a. Write a program that prints a fibonaci series that is a sequence of
 * numbers like 0 1 1 2 3 5 8. You can vary the number of elements to be
 * printed meaning you can print 10 numbers or 15 or 20 or any desired
 * number
 */
package com.github.wblPractice.loops;

import java.util.Scanner;

public class Practice1a {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Getting Fibonacci Sequence for n = ");
		int number = new Scanner(System.in).nextInt();
		Practice1a fib = new Practice1a();
		fib.fibonacciSequence(number);
		//System.out.println("final integer of fibonacci seq for " +number+ " is " +fib.fibonacciSequence(number));
	}
		// We can use this below code while unblocking it with if Else and can
		// use stand alone while as shown
		/*
		 * if (f==1||f==2) 
		 * 	{ if(f==1 || f==0){
		 * 			System.out.println("fibonacci series for is 0"); 
		 * 			f--; 
		 * 		} 
		 * else {
		 * System.out.println("fibonacci series for is 1");
		 * 		 } }
		 * else {
		 */
		
		public int fibonacciSequence(int number)
		{
		int fib = 0 , x = 1;
		int y = 0;
		int i = 0;
			
		if (number==1 || number == 0)
			System.out.println("fibonacci seq for "+ i +" is "+ fib);
		else if (number > 1) {
			for(i=1;i<=number;i++){
			fib = x + y;
			x = y;
			y = fib;
			System.out.println("fibonacci seq for "+ i +" is "+ fib );
			}
		}
		else 
			System.out.println("invalid input");
		return fib;
		
		
	}

}
// }
