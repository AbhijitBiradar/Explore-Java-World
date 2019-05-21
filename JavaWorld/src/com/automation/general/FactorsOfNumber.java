package com.automation.general;

import java.util.Scanner;

/**
* Java Program to Display Factors of a Number
*
* @author  Abhijit Biradar
* @version 1.0
* @since   2019-05-21
*/

public class FactorsOfNumber {

	public static void main(String[] args) {
		System.out.println("Please enter a number: ");
		
		Scanner scan=new Scanner(System.in);
		int number=scan.nextInt();
		
		System.out.println("Factors of given numbers are: ");
		
		for(int i=1;i<=number;i++) {
			if(number%i==0) {
				System.out.print(" "+i+",");
			}
		}
		
		scan.close();

	}

}
