package com.automation.general;

import java.util.Scanner;

/**
* Java Program to Find the Largest Among Three Numbers
*
* @author  Abhijit Biradar
* @version 1.0
* @since   2019-05-20
*/

public class LargestNumberFinder {

	public static void main(String[] args) {
		
		Scanner scan =new Scanner(System.in);
		
		System.out.println("Please enter first integer number: ");
		int firstNumber=scan.nextInt();
		
		System.out.println("Please enter second integer number: ");
		int secondNumber=scan.nextInt();
		
		System.out.println("Please enter third integer number: ");
		int thirdNumber=scan.nextInt();
		
		if(firstNumber>=secondNumber && firstNumber>=thirdNumber) {
			System.out.println("first number is greater number");
		}else if (secondNumber>=firstNumber && secondNumber>=thirdNumber) {
			System.out.println("second number is greater number");
		}else {
			System.out.println("third number is greater number");
		}
		
		scan.close();
	}
}
