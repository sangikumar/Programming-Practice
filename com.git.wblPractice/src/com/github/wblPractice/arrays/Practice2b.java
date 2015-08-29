/* b. Write a program to find the missing number in a series of sorted numbers stored in an array.
 * Hear We are going to assume that there wud be only one number missing in entire sorted array.
 * so We will sorting given array first and then finding missing number , you can also have any input and 
 * you can find array of missing number*/

package com.github.wblPractice.arrays;

public class Practice2b {
	public int findMissingNumber (int [] givenArr)
	{
		int missingNumber = 0;
		for (int count = 0; count < givenArr.length-1 ; ){
			
			while (givenArr[count+1]-givenArr[count]>1){
				missingNumber = givenArr[count]+1;
					}
			count++;
			}
		return missingNumber;		
	}
}



