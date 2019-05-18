package com.automation.general;

import java.util.Scanner;

/**
* This Java Program to Print an Integer (Entered by the User)
*
* @author  Abhijit Biradar
* @version 1.0
* @since   2019-05-19
*/

public class PrintInteger {

	public static void main(String[] args) {
		Scanner console=new Scanner(System.in);
		System.out.println("Please, Enter a Number");
		
		int number=console.nextInt();
		
		System.out.println("You have entered number :"+ number);
		
		console.close();
	}

}
 