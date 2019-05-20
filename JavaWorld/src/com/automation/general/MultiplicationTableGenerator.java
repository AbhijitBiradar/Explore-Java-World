package com.automation.general;

import java.util.Scanner;

/**
* Java Program to Generate Multiplication Table
*
* @author  Abhijit Biradar
* @version 1.0
* @since   2019-05-20
*/

public class MultiplicationTableGenerator {

	public static void main(String[] args) {
		
		System.out.println("Please provide a number for multiplication table: ");
		
		Scanner scan=new Scanner(System.in);
		int number=scan.nextInt();
		
		for(int i=1;i<=10;i++) {
			System.out.println(number + " * "+ i+ " = "+ i*number);
		}
		
		scan.close();
	}
}
