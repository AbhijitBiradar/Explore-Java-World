package com.automation.general;

import java.util.Scanner;

/**
 * Java Program to Check Whether a Number is Prime or Not
 *
 * @author Abhijit Biradar
 * @version 1.0
 * @since 2019-05-21
 */

public class PrimeNumberFinder {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter a number: ");
		int number = scan.nextInt();

		boolean isPrimeNumber = true;
		for (int i = 2; i <= number / 2; i++) {
			if (number % i == 0) {
				isPrimeNumber = false;
			}
		}
		
		if(isPrimeNumber) {
			System.out.println("Given number is a prime Number");
		}else {
			System.out.println("Given number is not a prime number");
		}
		
		scan.close();
	}

}
