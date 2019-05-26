package com.automation.general;

/**
* Java Program to find largest element in given array
*
* @author  Abhijit Biradar
* @version 1.0
* @since   2019-05-26
*/

public class LargestArrayElement {

	public static void main(String[] args) {
		
		int array1[]= {5,3,2,6,9,10};
		
		int largest=array1[0];
		
		for(int i:array1) {
			if(i>largest) {
				largest=i;
			}
		}		
		System.out.println("Largest elememt in the given array: "+ largest);
	}
}
