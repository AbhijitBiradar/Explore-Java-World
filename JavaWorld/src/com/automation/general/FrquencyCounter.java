package com.automation.general;

import java.util.Scanner;

/**
* Java Program to find frequency of character ina given string
*
* @author  Abhijit Biradar
* @version 1.0
* @since   2019-05-26
*/

public class FrquencyCounter {

	public static void main(String[] args) {
		
		System.out.println("Please enter a string");
		
		Scanner scan=new Scanner(System.in);
		String str=scan.next().toLowerCase();
		
		System.out.println("Enter a character to search: ");
		char ch=scan.next().charAt(0);
		
		int counter=0;
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)==ch) {
				counter++;
			}
		}
		
		scan.close();
		
		System.out.println("Frquency of "+ ch+" character in string :"+ counter );

	}

}
