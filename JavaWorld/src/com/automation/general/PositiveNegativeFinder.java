package com.automation.general;

import java.util.Scanner;

/**
* Java Program to Check Whether a Number is Positive or Negative
*
* @author  Abhijit Biradar
* @version 1.0
* @since   2019-05-19
*/

public class PositiveNegativeFinder {

	public static void main(String[] args) {
		System.out.println("Please, enter an integer number: ");
		
		Scanner scan=new Scanner(System.in);
		int number=scan.nextInt();
		
		if(number>0) {
			System.out.println("Given number is positive");
		}else {
			System.out.println("Given number is negative");
		}
		
		scan.close();
	}
}
