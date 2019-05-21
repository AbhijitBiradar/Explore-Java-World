package com.automation.general;

import java.util.Scanner;

/**
 * Java Program to Reverse a Number
 *
 * @author Abhijit Biradar
 * @version 1.0
 * @since 2019-05-21
 */

public class ReverseNumber {

	public static void main(String[] args) {

		System.out.println("Please enter a positive number:");
		Scanner scan = new Scanner(System.in);
		int number = scan.nextInt();

		int reverseNumber = 0;

		while (number != 0) {
			reverseNumber = reverseNumber * 10;
			reverseNumber = reverseNumber + number % 10;
			number = number / 10;
		}		
		System.out.println("Reverse Number: "+ reverseNumber);
		
		scan.close();
	}
}
