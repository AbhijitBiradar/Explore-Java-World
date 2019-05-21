package com.automation.general;

import java.util.Scanner;

/**
* Java Program to Count Number of Digits in an Integer
*
* @author  Abhijit Biradar
* @version 1.0
* @since   2019-05-21
*/

public class DigitCounter {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Please enter a number greater than 0: ");
		int number=scan.nextInt();
		
		int counter=0;	
		
		while(number !=0) {
			number=number/10;
			counter++;			
		}
		
		System.out.println("Number of digits: "+ counter);
		
		scan.close();
	}
}
