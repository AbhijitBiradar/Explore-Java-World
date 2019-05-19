package com.automation.general;

/**
* Java Program to Compute Quotient and Remainder
*
* @author  Abhijit Biradar
* @version 1.0
* @since   2019-05-19
*/

public class QuotientRemainder {

	public static void main(String[] args) {
		int dividend = 25, divisor = 4;

		int quotient = dividend / divisor;
		int reminder = dividend % divisor;

		System.out.println("Quotient: " + quotient);
		System.out.println("Divisor: " + reminder);
	}
}
