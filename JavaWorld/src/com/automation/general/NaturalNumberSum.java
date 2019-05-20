package com.automation.general;

import java.util.Scanner;

/**
* Java Program to Calculate the Sum of Natural Numbers
*
* @author  Abhijit Biradar
* @version 1.0
* @since   2019-05-20
*/

public class NaturalNumberSum {

	public static void main(String[] args) {
		
		System.out.println("Please provide range for sum of natural numbers:");
		
		Scanner scan=new Scanner(System.in);
		int range=scan.nextInt();
		int sum=0;
		for(int i=0;i<=range;i++) {
			sum=sum+i;
		}
		
		System.out.println("Sum of natural number : "+ sum);
		
		scan.close();	
	}
}
