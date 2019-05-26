package com.automation.general;

/**
* Java Program to Remove All Whitespaces from a String
*
* @author  Abhijit Biradar
* @version 1.0
* @since   2019-05-22
*/

public class WhitespaceRemover {

	public static void main(String[] args) {
		String str="Abhijit Abhimanyou Biradar";
		System.out.println("Origitanl String :"+ str);
		
		str=str.replaceAll("\\s", "");
		System.out.println("String After removing of whitespace:  "+ str);
	}
}
