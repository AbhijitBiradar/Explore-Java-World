package com.automation.general;

/**
* Java Program to Check whether an alphabet is vowel or consonant 
*
* @author  Abhijit Biradar
* @version 1.0
* @since   2019-05-19
*/

public class VowelConsonant {

	public static void main(String[] args) {
		char ch = 'i';

		if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
			System.out.println("Given character is vowel");
		}else {
			System.out.println("Given character is consonant");
		}
	}
}
