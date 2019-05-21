package com.automation.general;

import java.util.Scanner;

/**
 * Java Program to Find the Sum of Natural Numbers using Recursion
 *
 * @author Abhijit Biradar
 * @version 1.0
 * @since 2019-05-21
 */

public class NatualNumbersSum {

	public static void main(String[] args) {

		System.out.println("Please enter a positive integer number: ");

		Scanner scan = new Scanner(System.in);
		int number = scan.nextInt();

		int sum = addNumbers(number);

		System.out.println("Sum of natural number upto given number: " + sum);

		scan.close();

	}

	public static int addNumbers(int number) {
		if (number != 0) {
			return (number + addNumbers(number - 1));
		} else {
			return number;
		}
	}

}
