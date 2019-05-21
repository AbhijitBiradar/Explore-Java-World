package com.automation.general;

import java.util.Scanner;

/**
 * Java Program to Display Prime Numbers Between Two Intervals
 *
 * @author Abhijit Biradar
 * @version 1.0
 * @since 2019-05-20
 */

public class PrimeNumberRange {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Please enter starting range:");
		int startRange = scan.nextInt();

		System.out.println("Please enter end range:");
		int endRange = scan.nextInt();

		System.out.println("Prime Number List:");

		for (int number = startRange; number <= endRange; number++) {
			boolean isPrimeNumber = true;
			for (int i = 2; i <= number / 2; i++) {
				if (number % i == 0) {
					isPrimeNumber = false;
				}
			}

			if (isPrimeNumber) {
				System.out.print(" "+ number+",");
			} 

			scan.close();

		}

	}

}
