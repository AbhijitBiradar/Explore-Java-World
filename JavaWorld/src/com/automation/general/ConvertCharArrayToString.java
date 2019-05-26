package com.automation.general;

/**
* Java Program to convert char array to string
*
* @author  Abhijit Biradar
* @version 1.0
* @since   2019-05-26
*/

public class ConvertCharArrayToString {

	public static void main(String[] args) {		
		char array1[]= {'a','b','c','d'};
		
		String str1=new String(array1);
		String str2=String.valueOf(array1);
		
		System.out.println("value of str1: "+ str1);
		System.out.println("value of str2: "+ str2);
	}
}
