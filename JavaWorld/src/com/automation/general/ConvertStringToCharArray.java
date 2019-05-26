package com.automation.general;

/**
* Java Program to convert string to char array
*
* @author  Abhijit Biradar
* @version 1.0
* @since   2019-05-26
*/

public class ConvertStringToCharArray {

	public static void main(String[] args) {
		String str="Abhijit Biradar";
		
		char array1[]=str.toCharArray();
		
		System.out.println("value of char array: ");
		for(char ch:array1) {
			System.out.print(" "+ch+" ");
		}		
	}
}
