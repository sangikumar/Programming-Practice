/*Write a program  that prints a pattern like below.
 *
 **
 ***
 ****
 *****
 ******		   
 */
package com.github.wblPractice.loops;

import java.util.Scanner;

public class Practice1g {
	public static void main(String[] args) {
		System.out.println("Enter number of lines of pattern you want : ");
		int n = new Scanner(System.in).nextInt();
		// Practice1g pattern = new Practice1g();
		// pattern.drawPattern(numberOfLines);
		int vLn, hLn;
		for (vLn = 1; vLn <= n; vLn++) {
			for (hLn = 1; hLn <= vLn; hLn++) {
				System.out.print("*");
				// Can also print numbers using below line of code
				// System.out.print(hLn+ " ");
			}
			System.out.println(" ");
		}

	}
}
/* Output on console
Enter number of lines of pattern you want : 
6
* 
** 
*** 
**** 
***** 
******    */

