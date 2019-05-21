package com.automation.general;

import java.util.Scanner;

/**
 * Java Program to Make a Simple Calculator Using switch...case
 *
 * @author Abhijit Biradar
 * @version 1.0
 * @since 2019-05-21
 */

public class SimpleCalculator {

	public static void main(String[] args) {

		System.out.println("This is simple calculator program.");

		Scanner scan = new Scanner(System.in);

		System.out.println("Enter first integer number: ");
		int firstNumber = scan.nextInt();

		System.out.println("Enter second number: ");
		int secondNumber = scan.nextInt();

		System.out.println("Please one of below operator from keyboard");
		System.out.println("Options:");
		System.out.println("1. +");
		System.out.println("2. -");
		System.out.println("3. *");
		System.out.println("4. /");
		System.out.println("5. %");

		char operator = scan.next().charAt(0);
		int result = 0;

		switch (operator) {
		case '+':
			result = firstNumber + secondNumber;
			break;

		case '-':
			result = firstNumber - secondNumber;
			break;

		case '*':
			result = firstNumber * secondNumber;
			break;
		case '/':
			result = firstNumber / secondNumber;
			break;
		case '%':
			result = firstNumber % secondNumber;
			break;
		default:
			System.out.println("Error: incorrect operator.");
		}

		System.out.println("Result: " + result);

		scan.close();
	}

}
