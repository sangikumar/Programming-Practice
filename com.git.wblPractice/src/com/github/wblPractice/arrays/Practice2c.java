/* Write a program to find the common number in any given two arrays.*/
package com.github.wblPractice.arrays;

public class Practice2c {
	public int commonElementFromGivenTwoArrays(int[] givenArr1, int[] givenArr2) {
		int commonElement = 0;
		for (int count1 = 0; count1 < givenArr1.length; count1++) {
			for (int count2 = 0; count2 < givenArr2.length; count2++) {
				if (givenArr1[count1] == givenArr2[count2]) {
					commonElement = givenArr2[count2];
				}
			}
		}
		return commonElement;
	}

}
