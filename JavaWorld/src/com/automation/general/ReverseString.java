package com.automation.general;

import java.util.Scanner;

/**
* Java Program to reverse a string
*
* @author  Abhijit Biradar
* @version 1.0
* @since   2019-05-26
*/

public class ReverseString {

	public static void main(String[] args) {
		System.out.println("Enter a sentence: ");
		Scanner scan = new Scanner(System.in);
		String str = scan.next();
		String reverseSentense = "";

		for (int i = str.length()-1; i >= 0; i--) {
			reverseSentense = reverseSentense + str.charAt(i);
		}

		System.out.println("Original String: " + str);
		System.out.println("Reverse String: " + reverseSentense);

		scan.close();
	}
}
