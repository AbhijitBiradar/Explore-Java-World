package com.automation.general;

import java.util.Arrays;

/**
* Java Program to concatenate two arrays
*
* @author  Abhijit Biradar
* @version 1.0
* @since   2019-05-26
*/

public class ConcatenateTwoArrays {

	public static void main(String[] args) {

		int array1[] = { 1, 2, 3 };
		int array2[] = { 4, 5, 6 };

		int array1Lenth = array1.length;
		int array2Length = array2.length;

		int array3[] = new int[array1Lenth + array2Length];
		int array4[] = new int[array1Lenth + array2Length];

		// way1
		System.arraycopy(array1, 0, array3, 0, array1Lenth);
		System.arraycopy(array2, 0, array3, array1Lenth, array2Length);

		System.out.println("Third Array: " + Arrays.toString(array3));

		// way2
		int index = 0;

		for (int element : array1) {
			array4[index] = element;
			index++;
		}

		for (int element : array2) {
			array4[index] = element;
			index++;
		}
		System.out.println("Fourth Array: " + Arrays.toString(array4));
	}
}
