/*
 * a. Write a program to find the largest number in a given array.
 */
package com.github.wblPractice.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Practice2a {

	public int findMaxFromArray(int[] givenArr) {
		int max = givenArr[0];
		for (int count = 0; count < givenArr.length; count++) {
			while (givenArr[count] > max) {
				max = givenArr[count];
			}
		}
		return max;
	}
}
