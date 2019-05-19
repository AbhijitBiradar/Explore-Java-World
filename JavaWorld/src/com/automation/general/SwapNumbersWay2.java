package com.automation.general;

import java.util.Scanner;

/**
* Java Program to Swap two numbers without using temporary variable
*
* @author  Abhijit Biradar
* @version 1.0
* @since   2019-05-19
*/

public class SwapNumbersWay2 {

	public static void main(String[] args) {
		System.out.println("Please enter two numbers.");

		Scanner scan = new Scanner(System.in);

		System.out.println("First Number: ");
		int firstNumber = scan.nextInt();

		System.out.println("Second Number:");
		int secondNumber = scan.nextInt();

		System.out.println("Numbers before swapping");

		System.out.println("First Number: " + firstNumber);
		System.out.println("Second Number:" + secondNumber);

		// logic
		firstNumber = firstNumber - secondNumber;
		secondNumber = firstNumber + secondNumber;
		firstNumber = secondNumber - firstNumber;

		// logic
		// firstNumber=100, secondNumber=50
		// 100-50=50
		// 100+50=150;
		// 150-50=100

		System.out.println("Numbers after swapping");

		System.out.println("First Number: " + firstNumber);
		System.out.println("Second Number:" + secondNumber);

		scan.close();
	}
}
