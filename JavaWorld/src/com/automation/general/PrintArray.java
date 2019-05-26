package com.automation.general;

import java.util.Arrays;

/**
* Java Program to Print arrays
*
* @author  Abhijit Biradar
* @version 1.0
* @since   2019-05-26
*/

public class PrintArray {

	public static void main(String[] args) {
	
		int array1[]= {1,2,3,4,5,6};
		int array2[][]= {{1,2},{3,4},{5,6}};
		
		//Way1: Traditional for loop
		System.out.println("Array 1 elements:");
		for(int index:array1) {
			System.out.print(" "+ index+ " ");
		}
		
		System.out.println();
		
		//Way 2: using standard library Arrays
		System.out.println(Arrays.toString(array1));
		
		//Way3: Print Multidimentionsal array
		System.out.println(Arrays.deepToString(array2));
		
	}
}
